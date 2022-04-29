/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.bean.Cliente;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ClienteDAO {
    
    public void create(Cliente c){       
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO cadastro (nome, cpf, rg, orgao_emissor, uf, data_emissao, data_nascimento ,naturalidade, sexo, nome_pai, nome_mae, estado_civil, end_corresp, email, endereco, bairro, cidade, cep, telefone, celular, empresa, cnpj, data_admissao, renda_mensal, cargo, renda_adicional, origem, telefone_de_comprovacao, endereco_comercial, porte_da_empresa, bairro_empresa, cidade_empresa, cep_empresa, uf_empresa, telefone_empresa, ramal, banco, agencia, n_conta, cliente_desde, valor_do_emprestimo, plano)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
     
                stmt.setString(1,c.getNome());
                stmt.setString(2,c.getCpf());
                stmt.setString(3,c.getRg());
                stmt.setString(4,c.getOrgao_emissor());
                stmt.setString(5,c.getUf());
                stmt.setString(6,c.getData_emissao());
                stmt.setString(7,c.getData_nascimento());
                stmt.setString(8,c.getNaturalidade());
                stmt.setString(9,c.getSexo());
                stmt.setString(10,c.getNome_pai());
                stmt.setString(11,c.getNome_mae());
                stmt.setString(12,c.getEstado_civil());
                stmt.setString(13,c.getEnd_corresp());
                stmt.setString(14,c.getEmail());
                stmt.setString(15,c.getEndereco());
                stmt.setString(16,c.getBairro());
                stmt.setString(17,c.getCidade());
                stmt.setString(18,c.getCep());
                stmt.setString(19,c.getTelefone());
                stmt.setString(20,c.getCelular());
                stmt.setString(21,c.getEmpresa());
                stmt.setString(22,c.getCnpj());
                stmt.setString(23,c.getData_admissao());
                stmt.setString(24,c.getRenda_mensal());
                stmt.setString(25,c.getCargo());
                stmt.setString(26,c.getRenda_adicional());
                stmt.setString(27,c.getOrigem());
                stmt.setString(28,c.getTelefone_de_comprovacao());
                stmt.setString(29,c.getEndereco_comercial());
                stmt.setString(30,c.getPorte_da_empresa());
                stmt.setString(31,c.getBairro_empresa());
                stmt.setString(32,c.getCidade_empresa());
                stmt.setString(33,c.getCep_empresa());
                stmt.setString(34,c.getUf_empresa());
                stmt.setString(35,c.getTelefone_empresa());
                stmt.setString(36,c.getRamal());
                stmt.setString(37,c.getBanco());
                stmt.setString(38,c.getAgencia());
                stmt.setString(39,c.getN_conta());
                stmt.setString(40,c.getCliente_desde());
                stmt.setString(41,c.getValor_do_emprestimo());
                stmt.setString(42,c.getPlano());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
            
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        
    }

    
    public List<Cliente> read() {
    
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM cadastro");
            rs = stmt.executeQuery();
            
                while(rs.next()){

                    Cliente cliente = new Cliente();

                    cliente.setId(rs.getInt("id"));
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCpf(rs.getString("cpf"));
                    cliente.setRg(rs.getString("rg"));
                    cliente.setOrgao_emissor(rs.getString("orgao_emissor"));
                    cliente.setUf(rs.getString("uf"));
                    cliente.setData_emissao(rs.getString("data_emissao"));
                    cliente.setData_nascimento(rs.getString("data_nascimento"));
                    cliente.setNaturalidade(rs.getString("naturalidade"));
                    cliente.setSexo(rs.getString("sexo"));
                    cliente.setNome_pai(rs.getString("nome_pai"));
                    cliente.setNome_mae(rs.getString("nome_mae"));
                    cliente.setEstado_civil(rs.getString("estado_civil"));
                    cliente.setEnd_corresp(rs.getString("end_corresp"));
                    cliente.setEmail(rs.getString("email"));
                    cliente.setEndereco(rs.getString("endereco"));
                    cliente.setBairro(rs.getString("bairro"));
                    cliente.setCidade(rs.getString("cidade"));
                    cliente.setCep(rs.getString("cep"));
                    cliente.setTelefone(rs.getString("telefone"));
                    cliente.setCelular(rs.getString("celular"));
                    cliente.setEmpresa(rs.getString("empresa"));
                    cliente.setCnpj(rs.getString("cnpj"));
                    cliente.setData_admissao(rs.getString("data_admissao"));
                    cliente.setRenda_mensal(rs.getString("renda_mensal"));
                    cliente.setCargo(rs.getString("cargo"));
                    cliente.setRenda_adicional(rs.getString("renda_adicional"));
                    cliente.setOrigem(rs.getString("origem"));
                    cliente.setTelefone_de_comprovacao(rs.getString("telefone_de_comprovacao"));
                    cliente.setEndereco_comercial(rs.getString("endereco_comercial"));
                    cliente.setPorte_da_empresa(rs.getString("porte_da_empresa"));
                    cliente.setBairro_empresa(rs.getString("bairro_empresa"));
                    cliente.setCidade_empresa(rs.getString("cidade_empresa"));
                    cliente.setCep_empresa(rs.getString("cep_empresa"));
                    cliente.setUf_empresa(rs.getString("uf_empresa"));
                    cliente.setTelefone_empresa(rs.getString("telefone_empresa"));
                    cliente.setRamal(rs.getString("ramal"));
                    cliente.setBanco(rs.getString("banco"));
                    cliente.setAgencia(rs.getString("agencia"));
                    cliente.setN_conta(rs.getString("n°conta"));
                    cliente.setCliente_desde(rs.getString("cliente_desde"));
                    cliente.setValor_do_emprestimo(rs.getString("valor_do_emprestimo"));
                    cliente.setPlano(rs.getString("plano"));
                    clientes.add(cliente);

                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return clientes;
        
        }
    
        public void update(Cliente c){       
        
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;

            try {
                stmt = con.prepareStatement("UPDATE cadastro SET nome = ?, cpf = ?, rg = ?, orgao_emissor = ?, uf = ?, data_emissao = ?, data_nascimento = ?, naturalidade = ?, sexo = ?, nome_pai = ?, nome_mae = ?, estado_civil = ?, end_corresp = ?, email = ?, endereco = ?, bairro = ?, cidade = ?, cep = ?, telefone = ?, celular = ?, empresa = ?, cnpj = ?, data_admissao = ?, renda_mensal = ?, cargo = ?, renda_adicional = ?, origem = ?, telefone_de_comprovacao = ?, endereco_comercial = ?, porte_da_empresa = ?, bairro_empresa = ?, cidade_empresa = ?, cep_empresa = ?, uf_empresa = ?, telefone_empresa = ?, ramal = ?, banco = ?, agencia = ?, n°conta = ?, cliente_desde = ?, valor_do_emprestimo = ?, plano = ? WHERE id = ?");

                stmt.setString(1,c.getNome());
                stmt.setString(2,c.getCpf());
                stmt.setString(3,c.getRg());
                stmt.setString(4,c.getOrgao_emissor());
                stmt.setString(5,c.getUf());
                stmt.setString(6,c.getData_emissao());
                stmt.setString(7,c.getData_nascimento());
                stmt.setString(8,c.getNaturalidade());
                stmt.setString(9,c.getSexo());
                stmt.setString(10,c.getNome_pai());
                stmt.setString(11,c.getNome_mae());
                stmt.setString(12,c.getEstado_civil());
                stmt.setString(13,c.getEnd_corresp());
                stmt.setString(14,c.getEmail());
                stmt.setString(15,c.getEndereco());
                stmt.setString(16,c.getBairro());
                stmt.setString(17,c.getCidade());
                stmt.setString(18,c.getCep());
                stmt.setString(19,c.getTelefone());
                stmt.setString(20,c.getCelular());
                stmt.setString(21,c.getEmpresa());
                stmt.setString(22,c.getCnpj());
                stmt.setString(23,c.getData_admissao());
                stmt.setString(24,c.getRenda_mensal());
                stmt.setString(25,c.getCargo());
                stmt.setString(26,c.getRenda_adicional());
                stmt.setString(27,c.getOrigem());
                stmt.setString(28,c.getTelefone_de_comprovacao());
                stmt.setString(29,c.getEndereco_comercial());
                stmt.setString(30,c.getPorte_da_empresa());
                stmt.setString(31,c.getBairro_empresa());
                stmt.setString(32,c.getCidade_empresa());
                stmt.setString(33,c.getCep_empresa());
                stmt.setString(34,c.getUf_empresa());
                stmt.setString(35,c.getTelefone_empresa());
                stmt.setString(36,c.getRamal());
                stmt.setString(37,c.getBanco());
                stmt.setString(38,c.getAgencia());
                stmt.setString(39,c.getN_conta());
                stmt.setString(40,c.getCliente_desde());
                stmt.setString(41,c.getValor_do_emprestimo());
                stmt.setString(42,c.getPlano());
                stmt.setInt(43,c.getId());

                stmt.executeUpdate();

                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);

            }finally{
                ConnectionFactory.closeConnection(con, stmt);
            }

        }
        public List<Cliente> readForCpf(String cpf) {
    
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;

            List<Cliente> clientes = new ArrayList<>();

                try {
                    stmt = con.prepareStatement("SELECT * FROM cadastro WHERE cpf LIKE ?");
                    stmt.setString(1, "%" + cpf + "%");
                    
                    rs = stmt.executeQuery();

                        while(rs.next()){

                            Cliente cliente = new Cliente();

                            cliente.setId(rs.getInt("id"));
                            cliente.setNome(rs.getString("nome"));
                            cliente.setCpf(rs.getString("cpf"));
                            cliente.setRg(rs.getString("rg"));
                            cliente.setOrgao_emissor(rs.getString("orgao_emissor"));
                            cliente.setUf(rs.getString("uf"));
                            cliente.setData_emissao(rs.getString("data_emissao"));
                            cliente.setData_nascimento(rs.getString("data_nascimento"));
                            cliente.setNaturalidade(rs.getString("naturalidade"));
                            cliente.setSexo(rs.getString("sexo"));
                            cliente.setNome_pai(rs.getString("nome_pai"));
                            cliente.setNome_mae(rs.getString("nome_mae"));
                            cliente.setEstado_civil(rs.getString("estado_civil"));
                            cliente.setEnd_corresp(rs.getString("end_corresp"));
                            cliente.setEmail(rs.getString("email"));
                            cliente.setEndereco(rs.getString("endereco"));
                            cliente.setBairro(rs.getString("bairro"));
                            cliente.setCidade(rs.getString("cidade"));
                            cliente.setCep(rs.getString("cep"));
                            cliente.setTelefone(rs.getString("telefone"));
                            cliente.setCelular(rs.getString("celular"));
                            cliente.setEmpresa(rs.getString("empresa"));
                            cliente.setCnpj(rs.getString("cnpj"));
                            cliente.setData_admissao(rs.getString("data_admissao"));
                            cliente.setRenda_mensal(rs.getString("renda_mensal"));
                            cliente.setCargo(rs.getString("cargo"));
                            cliente.setRenda_adicional(rs.getString("renda_adicional"));
                            cliente.setOrigem(rs.getString("origem"));
                            cliente.setTelefone_de_comprovacao(rs.getString("telefone_de_comprovacao"));
                            cliente.setEndereco_comercial(rs.getString("endereco_comercial"));
                            cliente.setPorte_da_empresa(rs.getString("porte_da_empresa"));
                            cliente.setCep_empresa(rs.getString("cep_empresa"));
                            cliente.setBairro_empresa(rs.getString("bairro_empresa"));
                            cliente.setCidade_empresa(rs.getString("cidade_empresa"));
                            cliente.setUf_empresa(rs.getString("cep_empresa"));
                            cliente.setTelefone_empresa(rs.getString("telefone_empresa"));
                            cliente.setRamal(rs.getString("ramal"));
                            cliente.setBanco(rs.getString("banco"));
                            cliente.setAgencia(rs.getString("agencia"));
                            cliente.setN_conta(rs.getString("n°conta"));
                            cliente.setCliente_desde(rs.getString("cliente_desde"));
                            cliente.setValor_do_emprestimo(rs.getString("valor_do_emprestimo"));
                            cliente.setPlano(rs.getString("plano"));
                            clientes.add(cliente);

                        }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado");
                }finally{
                    ConnectionFactory.closeConnection(con, stmt, rs);
                }

            return clientes;

            }    
}