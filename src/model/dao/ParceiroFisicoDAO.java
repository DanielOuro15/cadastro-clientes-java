/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.ParceiroFisico;

/**
 *
 * @author User
 */
public class ParceiroFisicoDAO {
    
        public void create (ParceiroFisico p) {
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
        try {
            stmt = con.prepareStatement("INSERT INTO parceiros_fisico (Nome, cpf, rg, orgao_emissor, uf, celular, email, endereco, cep, cidade, estado, telefone, site, banco, ag, cc, nome_banco, cpf_banco, pix)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

    
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getCpf());
            stmt.setString(3,p.getRg());
            stmt.setString(4,p.getOrgao_emissor());
            stmt.setString(5,p.getUf());
            stmt.setString(6,p.getCelular());
            stmt.setString(7,p.getEmail());
            stmt.setString(8,p.getEndereco());
            stmt.setString(9,p.getCep());
            stmt.setString(10,p.getCidade());
            stmt.setString(11,p.getEstado());
            stmt.setString(12,p.getTelefone());
            stmt.setString(13,p.getSite());
            stmt.setString(14,p.getBanco());
            stmt.setString(15,p.getAg());
            stmt.setString(16,p.getCc());
            stmt.setString(17,p.getNome_banco());
            stmt.setString(18,p.getCpf_banco());
            stmt.setString(19,p.getPix());


            stmt.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
    }finally{
        ConnectionFactory.closeConnection(con,stmt);
        }
    }
    public List<ParceiroFisico> read() {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ParceiroFisico> parceiros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM parceiros_fisico");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                ParceiroFisico parceiro = new ParceiroFisico();

                parceiro.setId(rs.getInt("id"));
                parceiro.setNome(rs.getString("Nome"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setOrgao_emissor(rs.getString("orgao_emissor"));
                parceiro.setUf(rs.getString("uf"));
                parceiro.setCelular(rs.getString("celular"));
                parceiro.setEmail(rs.getString("email"));
                parceiro.setEndereco(rs.getString("endereco"));
                parceiro.setCep(rs.getString("cep"));
                parceiro.setCidade(rs.getString("cidade"));
                parceiro.setEstado(rs.getString("estado"));
                parceiro.setTelefone(rs.getString("telefone"));
                parceiro.setSite(rs.getString("site"));
                parceiro.setBanco(rs.getString("banco"));
                parceiro.setAg(rs.getString("ag"));
                parceiro.setCc(rs.getString("cc"));
                parceiro.setNome_banco(rs.getString("nome_banco"));
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
    
    public void update (ParceiroFisico p) {
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
    try {
        stmt = con.prepareStatement("UPDATE parceiros_fisico SET Nome = ?, cpf = ?, rg = ?, orgao_emissor = ?, uf = ?, celular = ?, email = ?, endereco = ?, cep = ?, cidade = ?, estado = ?, telefone = ?, site = ?, banco = ?, ag = ?, cc = ?, nome_banco = ?, cpf_banco = ?, pix = ? WHERE id = ?");

    
            stmt.setString(1,p.getNome());
            stmt.setString(2,p.getCpf());
            stmt.setString(3,p.getRg());
            stmt.setString(4,p.getOrgao_emissor());
            stmt.setString(5,p.getUf());
            stmt.setString(6,p.getCelular());
            stmt.setString(7,p.getEmail());
            stmt.setString(8,p.getEndereco());
            stmt.setString(9,p.getCep());
            stmt.setString(10,p.getCidade());
            stmt.setString(11,p.getEstado());
            stmt.setString(12,p.getTelefone());
            stmt.setString(13,p.getSite());
            stmt.setString(14,p.getBanco());
            stmt.setString(15,p.getAg());
            stmt.setString(16,p.getCc());
            stmt.setString(17,p.getNome_banco());
            stmt.setString(18,p.getCpf_banco());
            stmt.setString(19,p.getPix());
            stmt.setInt(20,p.getId());


            stmt.executeUpdate();
    
    JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
    }finally{
        ConnectionFactory.closeConnection(con,stmt);
        }
    }
            public void delete(ParceiroFisico p){       
        
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("DELETE FROM parceiros_fisico WHERE id = ?");

                stmt.setInt(1,p.getId());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);

            }finally{
                ConnectionFactory.closeConnection(con, stmt);
            }
        
        }
        public List<ParceiroFisico> readForCpf(String cpf) {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<ParceiroFisico> parceiros = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM parceiros_fisico WHERE cpf LIKE ?");
            stmt.setString(1, "%" + cpf + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
            
                ParceiroFisico parceiro = new ParceiroFisico();

                parceiro.setId(rs.getInt("id"));
                parceiro.setNome(rs.getString("Nome"));
                parceiro.setCpf(rs.getString("cpf"));
                parceiro.setRg(rs.getString("rg"));
                parceiro.setOrgao_emissor(rs.getString("orgao_emissor"));
                parceiro.setUf(rs.getString("uf"));
                parceiro.setCelular(rs.getString("celular"));
                parceiro.setEmail(rs.getString("email"));
                parceiro.setEndereco(rs.getString("endereco"));
                parceiro.setCep(rs.getString("cep"));
                parceiro.setCidade(rs.getString("cidade"));
                parceiro.setEstado(rs.getString("estado"));
                parceiro.setTelefone(rs.getString("telefone"));
                parceiro.setSite(rs.getString("site"));
                parceiro.setBanco(rs.getString("banco"));
                parceiro.setAg(rs.getString("ag"));
                parceiro.setCc(rs.getString("cc"));
                parceiro.setNome_banco(rs.getString("nome_banco"));
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
