
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Parceiro;


public class ParceiroDAO {
    
    public void create (Parceiro p) {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("INSERT INTO parceiros (razao_social, nome_fantasia, endereco, cep, cidade, estado, telefone, cnpj, inscricao_estadual, site, email, responsavel, cpf, rg, orgao_emissor, uf, celular, email_responsavel, banco, ag, cc, nome, cpf_banco, pix)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");


                stmt.setString(1,p.getRazao_social());
                stmt.setString(2,p.getNome_fantasia());
                stmt.setString(3,p.getEndereco());
                stmt.setString(4,p.getCep());
                stmt.setString(5,p.getCidade());
                stmt.setString(6,p.getEstado());
                stmt.setString(7,p.getTelefone());
                stmt.setString(8,p.getCnpj());
                stmt.setString(9,p.getInscricao());
                stmt.setString(10,p.getSite());
                stmt.setString(11,p.getEmail());
                stmt.setString(12,p.getResponsavel());
                stmt.setString(13,p.getCpf());
                stmt.setString(14,p.getRg());
                stmt.setString(15,p.getOrgao_emissor());
                stmt.setString(16,p.getUf());
                stmt.setString(17,p.getCelular());
                stmt.setString(18,p.getEmail_responsavel());
                stmt.setString(19,p.getBanco());
                stmt.setString(20,p.getAg());
                stmt.setString(21,p.getCc());
                stmt.setString(22,p.getNome());
                stmt.setString(23,p.getCpf_banco());
                stmt.setString(24,p.getPix());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
                }finally{
                    ConnectionFactory.closeConnection(con,stmt);
                    }
                }
    public List<Parceiro> read() {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Parceiro> parceiros = new ArrayList<>();
        
            try {
                stmt = con.prepareStatement("SELECT * FROM parceiros");
                rs = stmt.executeQuery();

                while(rs.next()){

                Parceiro parceiro = new Parceiro();

                parceiro.setId(rs.getInt("id"));
                parceiro.setRazao_social(rs.getString("razao_social"));
                parceiro.setNome_fantasia(rs.getString("nome_fantasia"));
                parceiro.setEndereco(rs.getString("endereco"));
                parceiro.setCep(rs.getString("cep"));
                parceiro.setCidade(rs.getString("cidade"));
                parceiro.setEstado(rs.getString("estado"));
                parceiro.setTelefone(rs.getString("telefone"));
                parceiro.setCnpj(rs.getString("cnpj"));
                parceiro.setInscricao(rs.getString("inscricao_estadual"));
                parceiro.setSite(rs.getString("site"));
                parceiro.setEmail(rs.getString("email"));
                parceiro.setResponsavel(rs.getString("responsavel"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setOrgao_emissor(rs.getString("orgao_emissor"));
                parceiro.setUf(rs.getString("uf"));
                parceiro.setCelular(rs.getString("celular"));
                parceiro.setEmail_responsavel(rs.getString("email_responsavel"));
                parceiro.setBanco(rs.getString("banco"));
                parceiro.setAg(rs.getString("ag"));
                parceiro.setCc(rs.getString("cc"));
                parceiro.setNome(rs.getString("nome"));
                parceiro.setCpf_banco(rs.getString("cpf_banco"));
                parceiro.setPix(rs.getString("pix"));

                parceiros.add(parceiro);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Parceiro não encontrado");
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }

            return parceiros;
        }
    
    public void update (Parceiro p) {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("UPDATE parceiros SET razao_social = ?, nome_fantasia = ?, endereco = ?, cep = ?, cidade = ?, estado = ?, telefone = ?, cnpj = ?, inscricao_estadual = ?, site = ?, email = ?, responsavel = ?, cpf = ?, rg = ?, orgao_emissor = ?, uf = ?, celular = ?, email_responsavel = ?, banco = ?, ag = ?, cc = ?, nome = ?, cpf_banco = ?, pix = ? WHERE id = ?");


                stmt.setString(1,p.getRazao_social());
                stmt.setString(2,p.getNome_fantasia());
                stmt.setString(3,p.getEndereco());
                stmt.setString(4,p.getCep());
                stmt.setString(5,p.getCidade());
                stmt.setString(6,p.getEstado());
                stmt.setString(7,p.getTelefone());
                stmt.setString(8,p.getCnpj());
                stmt.setString(9,p.getInscricao());
                stmt.setString(10,p.getSite());
                stmt.setString(11,p.getEmail());
                stmt.setString(12,p.getResponsavel());
                stmt.setString(13,p.getCpf());
                stmt.setString(14,p.getRg());
                stmt.setString(15,p.getOrgao_emissor());
                stmt.setString(16,p.getUf());
                stmt.setString(17,p.getCelular());
                stmt.setString(18,p.getEmail_responsavel());
                stmt.setString(19,p.getBanco());
                stmt.setString(20,p.getAg());
                stmt.setString(21,p.getCc());
                stmt.setString(22,p.getNome());
                stmt.setString(23,p.getCpf_banco());
                stmt.setString(24,p.getPix());
                stmt.setInt(25,p.getId());

                stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
            }finally{
                ConnectionFactory.closeConnection(con,stmt);
                }
            }
    public void delete(Parceiro p){       
        
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;

                try {
                    stmt = con.prepareStatement("DELETE FROM parceiros WHERE id = ?");

                    stmt.setInt(1,p.getId());

                    stmt.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);

                }finally{
                    ConnectionFactory.closeConnection(con, stmt);
                }

            }
    public List<Parceiro> readForCpf(String cpf) {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Parceiro> parceiros = new ArrayList<>();
        
            try {
                stmt = con.prepareStatement("SELECT * FROM parceiros WHERE cpf LIKE ?");
                stmt.setString(1, "%" + cpf + "%");
                rs = stmt.executeQuery();

                while(rs.next()){

                Parceiro parceiro = new Parceiro();

                parceiro.setId(rs.getInt("id"));
                parceiro.setRazao_social(rs.getString("razao_social"));
                parceiro.setNome_fantasia(rs.getString("nome_fantasia"));
                parceiro.setEndereco(rs.getString("endereco"));
                parceiro.setCep(rs.getString("cep"));
                parceiro.setCidade(rs.getString("cidade"));
                parceiro.setEstado(rs.getString("estado"));
                parceiro.setTelefone(rs.getString("telefone"));
                parceiro.setCnpj(rs.getString("cnpj"));
                parceiro.setInscricao(rs.getString("inscricao_estadual"));
                parceiro.setSite(rs.getString("site"));
                parceiro.setEmail(rs.getString("email"));
                parceiro.setResponsavel(rs.getString("responsavel"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setOrgao_emissor(rs.getString("orgao_emissor"));
                parceiro.setUf(rs.getString("uf"));
                parceiro.setCelular(rs.getString("celular"));
                parceiro.setEmail_responsavel(rs.getString("email_responsavel"));
                parceiro.setBanco(rs.getString("banco"));
                parceiro.setAg(rs.getString("ag"));
                parceiro.setCc(rs.getString("cc"));
                parceiro.setNome(rs.getString("nome"));
                parceiro.setCpf_banco(rs.getString("cpf_banco"));
                parceiro.setPix(rs.getString("pix"));

                parceiros.add(parceiro);

                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Parceiro não encontrado");
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }

            return parceiros;
        }
}
