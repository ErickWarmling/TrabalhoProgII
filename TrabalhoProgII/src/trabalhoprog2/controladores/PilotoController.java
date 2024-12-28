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
import trabalhoprog2.modelos.Piloto;

public class PilotoController implements ICrud<Piloto>{
    
    private Connection con = ConectaBD.conectar();
    
    @Override
    public void salvar(Piloto t){
        try {
            String sql = "insert into tb_pilotos (nome, idade, cpf, voo, destino, licenca)values(?,?,?,?,?,?)";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, t.getNome());
            pstm.setInt(2, t.getIdade());
            pstm.setString(3, t.getCpf());
            pstm.setString(4, t.getVoo());
            pstm.setString(5, t.getDestino());
            pstm.setString(6, t.getLicenca());
            
            pstm.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException (ex.getMessage());
        }
        
        finally{
            ConectaBD.fecharConexao();
        }  
    }
    
    @Override
    public List<Piloto> consultarTodos(){
        List<Piloto> pilotos = new ArrayList();
        
        try{
        PreparedStatement pstm = con.prepareStatement("select * from tb_pilotos");
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            pilotos.add (new Piloto(
                    rs.getString("Nome"),
                    rs.getInt("Idade"),
                    rs.getString("CPF"),
                    rs.getString("Voo"),
                    rs.getString("Destino"),
                    rs.getString("Licenca"),
                    rs.getInt("ID")
            ));
        }
        }catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
        
        return pilotos;
    }
    
    @Override
    public Piloto consultarPorId (int id){
        Piloto piloto = null;
        try {
            PreparedStatement pstm = con.prepareStatement("Select * tb_pilotos where id = ?");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                piloto = new Piloto (
                    rs.getString("Nome"),
                    rs.getInt("Idade"),
                    rs.getString("CPF"),
                    rs.getString("Voo"),
                    rs.getString("Destino"),
                    rs.getString("Licença"),
                    rs.getInt("ID")
                );
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
        
        return piloto;
        
    }
    
    @Override
    public void excluir (int id){
        Connection con = ConectaBD.conectar();
        
        try {
            PreparedStatement pstm = con.prepareStatement("delete from tb_pilotos where id = ?");
            pstm.setInt(1, id);
            pstm.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
        finally{
            ConectaBD.fecharConexao();
        }
        
    }
    
    @Override
    public void update (Piloto t){
        
        try {
            String sql = "UPDATE tb_pilotos SET nome = ?, idade = ?, cpf = ?, voo = ?, destino = ?, licenca = ? where id = ?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, t.getNome());
            pstm.setInt(2, t.getIdade());
            pstm.setString(3, t.getCpf());
            pstm.setString(4, t.getVoo());
            pstm.setString(5, t.getDestino());
            pstm.setString(6, t.getLicenca());
            pstm.setInt(7, t.getId());
            
            pstm.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
        finally{
            ConectaBD.fecharConexao();
        }
    }
    
    public List<Piloto> consultarPilotosPorNome(String nome) {
        List<Piloto> pilotos = new ArrayList();
        
        try {
            PreparedStatement pstm = con.prepareStatement("select * from tb_pilotos where nome = ?");
            pstm.setString(1, nome);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                pilotos.add (new Piloto(
                        rs.getString("Nome"),
                        rs.getInt("Idade"),
                        rs.getString("CPF"),
                        rs.getString("Voo"),
                        rs.getString("Destino"),
                        rs.getString("Licenca"),
                        rs.getInt("ID")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
        
        return pilotos;
    }
    
}
