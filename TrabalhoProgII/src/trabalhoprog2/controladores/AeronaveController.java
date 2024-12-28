package trabalhoprog2.controladores;

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
import trabalhoprog2.modelos.Aeronave;
import trabalhoprog2.modelos.Aeroporto;

public class AeronaveController implements ICrud<Aeronave>{
    
    private Connection con = ConectaBD.conectar();
    
    @Override
    public void salvar (Aeronave t) {
        try {
        String sql = "Insert into tb_aeronaves (companhia, capacidade, modelo, codigo)values(?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, t.getCompanhia());
        pstm.setInt(2, t.getCapacidade());
        pstm.setString(3, t.getModelo());
        pstm.setInt(4, t.getCodigo());
        
        pstm.execute();
        
        } catch (SQLException ex) {
            throw new RuntimeException("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
    }
    }
    
    @Override
    public List<Aeronave> consultarTodos() {
        List<Aeronave> aeronaves = new ArrayList();
        
        try {
            PreparedStatement pstm = con.prepareStatement("Select * from tb_aeronaves");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                aeronaves.add (new Aeronave(
                        rs.getString("Companhia"),
                        rs.getInt("Capacidade"),
                        rs.getString("Modelo"),
                        rs.getInt("Codigo"),
                        rs.getInt("ID")
                ));
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
        return aeronaves;
    }
    
    @Override
    public Aeronave consultarPorId (int id){
        Aeronave aeronave = null;
        
        try {
            PreparedStatement pstm = con.prepareStatement("Select * from tb_aeronaves where id = ?");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                aeronave = new Aeronave(
                        rs.getString("Companhia"),
                        rs.getInt("Capacidade"),
                        rs.getString("Modelo"),
                        rs.getInt("Código"),
                        rs.getInt("ID")
                );
            }
        
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
            return aeronave;
    }
    
    @Override
    public void excluir (int id){
        Connection con = ConectaBD.conectar();
        
        try {
            PreparedStatement pstm = con.prepareStatement("delete from tb_aeronaves where id = ?");
            pstm.setInt(1, id);
            pstm.execute();
        
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
    }
    
    @Override
    public void update (Aeronave t){
        try {
        String sql = ("UPDATE tb_aeronaves SET companhia = ?, capacidade = ?, modelo = ?, codigo = ? where id = ?");
        PreparedStatement pstm = con.prepareCall(sql);
        pstm.setString(1, t.getCompanhia());
        pstm.setInt(2, t.getCapacidade());
        pstm.setString(3, t.getModelo());
        pstm.setInt(4, t.getCodigo());
        pstm.setInt(5, t.getId());
        
        pstm.execute();
        
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
        finally{
            ConectaBD.fecharConexao();
        }
        
    }   
}    
