package trabalhoprog2.controladores; 

import trabalhoprog2.modelos.Passageiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import trabalhoprog.ConectaBD;
import trabalhoprog2.interfaces.ICrud;

public class PassageiroController implements ICrud<Passageiro>{
    
    private Connection con = ConectaBD.conectar();
    
    @Override
    public void salvar (Passageiro t) {
        
        try {
        String sql = "insert into tb_passageiros (nome, idade, cpf, voo, destino, classe, poltrona)values(?,?,?,?,?,?,?)";
        PreparedStatement pstm = con.prepareStatement(sql);
        pstm.setString(1, t.getNome());
        pstm.setInt(2, t.getIdade());
        pstm.setString(3, t.getCpf());
        pstm.setString(4, t.getVoo());
        pstm.setString(5, t.getDestino());
        pstm.setString(6, t.getClasse());
        pstm.setInt(7, t.getPoltrona());
        
        pstm.execute();
        
        } catch (SQLException ex) {
                throw new RuntimeException("Erro: " + ex.getMessage());
        }
         
        finally {
            ConectaBD.fecharConexao();
    }
}
    
    @Override
    public List<Passageiro> consultarTodos() {
        List<Passageiro> passageiros = new ArrayList();
        
        try {
            PreparedStatement pstm = con.prepareStatement("select * from tb_passageiros");
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                passageiros.add (new Passageiro(
                        rs.getString("Nome"),
                        rs.getInt("Idade"),
                        rs.getString("CPF"),
                        rs.getString("Voo"),
                        rs.getString("Destino"),
                        rs.getString("Classe"),
                        rs.getInt("Poltrona"),
                        rs.getInt("ID")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
        
        return passageiros;
    }
    
    @Override
    public Passageiro consultarPorId(int id) {
        Passageiro passageiro = null;
        
        try {
            PreparedStatement pstm = con.prepareStatement("select * from tb_passageiros where id = ?");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                passageiro = new Passageiro (
                        rs.getString("Nome"),
                        rs.getInt("Idade"),
                        rs.getString("CPF"),
                        rs.getString("Voo"),
                        rs.getString("Destino"),
                        rs.getString("Classe"),
                        rs.getInt("Poltrona"),
                        rs.getInt("ID")
                );
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally{
            ConectaBD.fecharConexao();
        }   
        
        return passageiro;
    }
    
    @Override
    public void excluir(int id) {
        Connection con = ConectaBD.conectar();
        
        try {
            PreparedStatement pstm = con.prepareStatement("delete from tb_passageiros where id = ?");
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
    public void update(Passageiro t) {        
        try {
            String sql = "UPDATE tb_passageiros SET nome = ?, idade = ?, cpf = ?, voo = ?, destino = ?, classe = ?, poltrona = ? where id = ?";
            PreparedStatement pstm; pstm = con.prepareStatement(sql);
            pstm.setString(1, t.getNome());
            pstm.setInt(2, t.getIdade());
            pstm.setString(3, t.getCpf());
            pstm.setString(4, t.getVoo());
            pstm.setString(5, t.getDestino());
            pstm.setString(6, t.getClasse());
            pstm.setInt(7, t.getPoltrona());
            pstm.setInt(8, t.getId());
            
            pstm.execute();
            
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
    }
    
    public List<Passageiro> consultarPassageiroPorVoo(String numeroVoo) {
        List<Passageiro> passageiros = new ArrayList();
        
        try {
            PreparedStatement pstm = con.prepareStatement("select * from tb_passageiros where voo = ?");
            pstm.setString(1, numeroVoo);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()) {
                passageiros.add (new Passageiro(
                        rs.getString("Nome"),
                        rs.getInt("Idade"),
                        rs.getString("CPF"),
                        rs.getString("Voo"),
                        rs.getString("Destino"),
                        rs.getString("Classe"),
                        rs.getInt("Poltrona"),
                        rs.getInt("ID")
                ));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
        finally {
            ConectaBD.fecharConexao();
        }
        
        return passageiros;
    }
}


