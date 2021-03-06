/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Parceiro;
import model.dao.ParceiroDAO;


/**
 *
 * @author User
 */
public class PesquisarParceiro extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesquisarParceiro
     */
    public PesquisarParceiro() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTParceiro.getModel();
        jTParceiro.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    
      public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTParceiro.getModel();
        modelo.setNumRows(0);
        ParceiroDAO pdao = new ParceiroDAO();
        
        for(Parceiro p: pdao.read()){
        
            modelo.addRow(new Object[]{
                p.getId(),
                p.getRazao_social(),
                p.getNome_fantasia(),
                p.getEndereco(),
                p.getCep(),
                p.getCidade(),
                p.getEstado(),
                p.getTelefone(),
                p.getCnpj(),
                p.getInscricao(),
                p.getSite(),
                p.getEmail(),
                p.getResponsavel(),
                p.getCpf(),
                p.getRg(),
                p.getOrgao_emissor(),
                p.getUf(),
                p.getCelular(),
                p.getEmail_responsavel(),
                p.getBanco(),
                p.getAg(),
                p.getCc(),
                p.getNome(),
                p.getCpf_banco(),
                p.getPix()
            });
            
        }
        
    }
      public void readJTableForCpf(String cpf){
        DefaultTableModel modelo = (DefaultTableModel) jTParceiro.getModel();
        modelo.setNumRows(0);
        ParceiroDAO pdao = new ParceiroDAO();
        
        for(Parceiro p: pdao.readForCpf(cpf)){
        
            modelo.addRow(new Object[]{
                p.getId(),
                p.getRazao_social(),
                p.getNome_fantasia(),
                p.getEndereco(),
                p.getCep(),
                p.getCidade(),
                p.getEstado(),
                p.getTelefone(),
                p.getCnpj(),
                p.getInscricao(),
                p.getSite(),
                p.getEmail(),
                p.getResponsavel(),
                p.getCpf(),
                p.getRg(),
                p.getOrgao_emissor(),
                p.getUf(),
                p.getCelular(),
                p.getEmail_responsavel(),
                p.getBanco(),
                p.getAg(),
                p.getCc(),
                p.getNome(),
                p.getCpf_banco(),
                p.getPix()
            });
            
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPesquisar5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtRazao = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTParceiro = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtCep = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JTextField();
        txtInscricao = new javax.swing.JTextField();
        txtSite = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtResponsavel = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtOrgaoEmissor = new javax.swing.JTextField();
        txtUf = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmailResp = new javax.swing.JTextField();
        txtBanco = new javax.swing.JTextField();
        txtAgencia = new javax.swing.JTextField();
        txtConta = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpfBanco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPix = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jButtonRelatorio = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPesquisar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 140, -1));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pesquisar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 90, 20));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CPF:");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, -1));
        jPanel7.add(txtRazao, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 163, 30));

        txtNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeFantasiaActionPerformed(evt);
            }
        });
        jPanel7.add(txtNomeFantasia, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 160, 30));

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        jPanel7.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 80, 260, 30));

        jTParceiro.setBackground(new java.awt.Color(153, 153, 153));
        jTParceiro.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jTParceiro.setForeground(new java.awt.Color(255, 255, 255));
        jTParceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Razao Social", "Nome Fantasia", "Endere??o", "Cep", "Cidade", "Estado", "Telefone", "Cnpj", "Incri????o", "Site", "Email", "Respons??vel", "Cpf", "Rg", "OrgaoEmissor", "Uf", "Celular", "EmailRespresentante", "Banco", "Agencia", "Conta", "Nome", "CpfBanco", "Chave PIX"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTParceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTParceiroMouseClicked(evt);
            }
        });
        jTParceiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTParceiroKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTParceiro);
        if (jTParceiro.getColumnModel().getColumnCount() > 0) {
            jTParceiro.getColumnModel().getColumn(0).setMinWidth(30);
            jTParceiro.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTParceiro.getColumnModel().getColumn(1).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(1).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(3).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(3).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(4).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(4).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(5).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(5).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(6).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(6).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(7).setMinWidth(100);
            jTParceiro.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTParceiro.getColumnModel().getColumn(8).setMinWidth(100);
            jTParceiro.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTParceiro.getColumnModel().getColumn(9).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(9).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(10).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(10).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(11).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(11).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(12).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(12).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(13).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(13).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(14).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(14).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(15).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(15).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(16).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(16).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(17).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(17).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(18).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(18).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(19).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(19).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(20).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(20).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(21).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(21).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(22).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(22).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(23).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(23).setPreferredWidth(0);
            jTParceiro.getColumnModel().getColumn(24).setMinWidth(0);
            jTParceiro.getColumnModel().getColumn(24).setPreferredWidth(0);
        }

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 690));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Raz??o Social:");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nome Fantasia:");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Endere??o:");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, -1, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Atualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, 20));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, 20));
        jPanel7.add(txtCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 80, 110, 30));
        jPanel7.add(txtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 79, 90, 30));
        jPanel7.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 79, 90, 30));
        jPanel7.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 79, 120, 30));
        jPanel7.add(txtCnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 110, 30));
        jPanel7.add(txtInscricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 159, 130, 30));
        jPanel7.add(txtSite, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 159, 200, 30));
        jPanel7.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 159, 190, 30));
        jPanel7.add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 159, 150, 30));
        jPanel7.add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 159, 140, 30));
        jPanel7.add(txtRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 159, 100, 30));
        jPanel7.add(txtOrgaoEmissor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 80, 30));
        jPanel7.add(txtUf, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 239, 50, 30));
        jPanel7.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 239, 100, 30));
        jPanel7.add(txtEmailResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 239, 200, 30));
        jPanel7.add(txtBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 80, 30));
        jPanel7.add(txtAgencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 369, 70, 30));
        jPanel7.add(txtConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 369, 80, 30));
        jPanel7.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 369, 170, 30));
        jPanel7.add(txtCpfBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 369, 140, 30));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CEP:");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cidade:");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado:");
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CNPJ:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inscri????o estadual:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Site:");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Respons??vel:");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CPF:");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 140, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("RG:");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Org??o emissor:");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("UF:");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Celular:");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Email do Respons??vel:");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 220, -1, -1));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Banco:");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Ag??ncia:");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Conta:");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nome:");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("CPF:");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 350, -1, -1));
        jPanel7.add(txtPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 369, 240, 30));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Chave PIX:");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 350, -1, -1));

        jButtonRelatorio.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButtonRelatorio.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRelatorio.setText("Emitir Relat??rio");
        jButtonRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRelatorioActionPerformed(evt);
            }
        });
        jPanel7.add(jButtonRelatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 650, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 1778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

       readJTableForCpf(jPesquisar5.getText());
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeFantasiaActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void jTParceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTParceiroMouseClicked

        if(jTParceiro.getSelectedRow() != -1){
            txtRazao.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 1).toString());
            txtNomeFantasia.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 2).toString());
            txtEndereco.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 3).toString());
            txtCep.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 4).toString());
            txtCidade.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 5).toString());
            txtEstado.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 6).toString());
            txtTelefone.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 7).toString());
            txtCnpj.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 8).toString());
            txtInscricao.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 9).toString());
            txtSite.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 10).toString());
            txtEmail.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 11).toString());
            txtResponsavel.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 12).toString());
            txtCpf.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 13).toString());
            txtRg.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 14).toString());
            txtOrgaoEmissor.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 15).toString());
            txtUf.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 16).toString());
            txtCelular.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 17).toString());
            txtEmailResp.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 18).toString());
            txtBanco.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 19).toString());
            txtAgencia.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 20).toString());
            txtConta.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 21).toString());
            txtNome.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 22).toString());
            txtCpfBanco.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 23).toString());
            txtPix.setText(jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 24).toString());
        }
    }//GEN-LAST:event_jTParceiroMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jTParceiro.getSelectedRow()!= -1){
            
            Parceiro p = new Parceiro();
            ParceiroDAO dao = new ParceiroDAO();

            p.setRazao_social(txtRazao.getText());
            p.setNome_fantasia(txtNomeFantasia.getText());
            p.setEndereco(txtEndereco.getText());
            p.setCep(txtCep.getText());
            p.setCidade(txtCidade.getText());
            p.setEstado(txtEstado.getText());
            p.setTelefone(txtTelefone.getText());
            p.setCnpj(txtCnpj.getText());
            p.setInscricao(txtInscricao.getText());
            p.setSite(txtSite.getText());
            p.setEmail(txtEmail.getText());
            p.setResponsavel(txtResponsavel.getText());
            p.setCpf(txtCpf.getText());
            p.setRg(txtRg.getText());
            p.setOrgao_emissor(txtOrgaoEmissor.getText());
            p.setUf(txtUf.getText());
            p.setCelular(txtCelular.getText());
            p.setEmail_responsavel(txtEmailResp.getText());
            p.setBanco(txtBanco.getText());
            p.setAg(txtAgencia.getText());
            p.setCc(txtConta.getText());
            p.setNome(txtNome.getText());
            p.setCpf_banco(txtCpfBanco.getText());
            p.setPix(txtPix.getText());
            p.setId((int) jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 0));
            dao.update(p);
            
            txtRazao.setText("");
            txtNomeFantasia.setText("");
            txtEndereco.setText("");
            txtCep.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtTelefone.setText("");
            txtCnpj.setText("");
            txtInscricao.setText("");
            txtSite.setText("");
            txtEmail.setText("");
            txtResponsavel.setText("");
            txtCpf.setText("");
            txtRg.setText("");
            txtOrgaoEmissor.setText("");
            txtUf.setText("");
            txtCelular.setText("");
            txtEmailResp.setText("");
            txtBanco.setText("");
            txtAgencia.setText("");
            txtConta.setText("");
            txtNome.setText("");
            txtCpfBanco.setText("");
            txtPix.setText("");

            readJTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTParceiroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTParceiroKeyReleased

    }//GEN-LAST:event_jTParceiroKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if(jTParceiro.getSelectedRow() != -1){
            Parceiro p = new Parceiro();
            ParceiroDAO dao = new ParceiroDAO();

            p.setId((int)jTParceiro.getValueAt(jTParceiro.getSelectedRow(), 0));

            dao.delete(p);
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um parceiro para excluir");
        }
        
        readJTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRelatorioActionPerformed

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(jTParceiro.getPrintable(JTable.PrintMode.FIT_WIDTH, null, null));
        job.setJobName("Nome do Trabalho de impress??o");
        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(PesquisaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButtonRelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jPesquisar5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTParceiro;
    private javax.swing.JTextField txtAgencia;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtConta;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpfBanco;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmailResp;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtInscricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtOrgaoEmissor;
    private javax.swing.JTextField txtPix;
    private javax.swing.JTextField txtRazao;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtSite;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
