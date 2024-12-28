package trabalhoprog2.controladores;

import trabalhoprog2.modelos.Aeroporto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabalhoprog.ConectaBD; 
import trabalhoprog2.interfaces.ICrud;


public class AeroportoController implements ICrud<Aeroporto>{
    
    private Connection con = ConectaBD.conectar(); 
    
    @Override
    public void salvar (Aeroporto t){
        try {
        String sql = "insert into tb_aeroportos (nome, cidade, estado, pais)values(?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, t.getNome());
        pstm.setString(2, t.getCidade());
        pstm.setString(3, t.getEstado());
        pstm.setString(4, t.getPais());
        
        pstm.execute();
     
        }catch (SQLException ex){
            throw new RuntimeException(ex.getMessage());
            
    }
        
        finally{
            ConectaBD.fecharConexao();
        }
  }
    
    @Override
    public List<Aeroporto> consultarTodos(){
        List<Aeroporto> aeroportos = new ArrayList();
        
        try {
            PreparedStatement pstm = con.prepareStatement("select * from tb_aeroportos");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                aeroportos.add (new Aeroporto(
                        rs.getString("Nome"),
                        rs.getString("Cidade"),
                        rs.getString("Estado"),
                        rs.getString("Pais"),
                        rs.getInt ("ID")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
            finally {
            ConectaBD.fecharConexao();
        }
            return aeroportos;
        }
    
    @Override
    public Aeroporto consultarPorId(int id) {
        Aeroporto aeroporto = null;
        try {
            PreparedStatement pstm = con.prepareStatement("Select * tb_aeroportos where id = ?");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                 aeroporto = new Aeroporto (
                        rs.getString("Nome"),
                        rs.getString ("Cidade"),
                        rs.getString("Estado"),
                        rs.getString("País"),
                        rs.getInt("ID")
                );
            }
            
        
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
            finally {
                ConectaBD.fecharConexao();
    }
            return aeroporto;
    }
            
    @Override
    public void excluir (int id){
        Connection con = ConectaBD.conectar();
        
        try {
            PreparedStatement pstm = con.prepareStatement("delete from tb_aeroportos where id = ?");
            pstm.setInt(1, id);
            pstm.execute();
        
        } catch (SQLException ex) {
            throw new RuntimeException (ex.getMessage());
        }
        
            finally {
                ConectaBD.fecharConexao();
        }
    }
    
    @Override
    public void update(Aeroporto t) {
        try {
            String sql = "UPDATE tb_aeroportos SET nome = ?, cidade = ?, estado = ?, pais = ? where id = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,t.getNome());
            pstm.setString (2, t.getCidade());
            pstm.setString (3, t.getEstado());
            pstm.setString( 4, t.getPais());
            pstm.setInt (5, t.getId());
            
            pstm.execute();
        
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
            finally {
            ConectaBD.fecharConexao();
        }
    }
}
    
    

