/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usopreferenceswindows;

import java.time.LocalDateTime;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

/**
 *
 * @author Christian
 */
public class CadastroEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEmpresa
     */
    private final Preferences PREFERENCIA;

    public CadastroEmpresa() {
        initComponents();
        // Repositório das preferências do windows (regedit -> HKEY_CURRENT_USER\SOFTWARE\JavaSoft\Prefs\)
        // Isto irá definir um nó no qual as preferências podem ser armazenadas
        PREFERENCIA = Preferences.userRoot().node("/preferences/empresa");

        // Carrega a empresa que já está armazenada no Preferences (Se houver)
        CarregaEmpresa();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelAdicionarUsuario = new javax.swing.JPanel();
        labelCNPJ = new javax.swing.JLabel();
        labelNomeRazaoSocial = new javax.swing.JLabel();
        textoNomeRazaoSocial = new javax.swing.JTextField();
        textoCNPJ = new javax.swing.JTextField();
        botaoConfirmar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaTexto = new javax.swing.JTextArea();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Empresas - Preferences do Windows");

        labelCNPJ.setText("CNPJ:");

        labelNomeRazaoSocial.setText("Nome / Razão Social:");

        textoNomeRazaoSocial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        textoCNPJ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoCNPJ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textoCNPJKeyReleased(evt);
            }
        });

        botaoConfirmar.setText("Incluir");
        botaoConfirmar.setPreferredSize(new java.awt.Dimension(80, 25));
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        areaTexto.setEditable(false);
        areaTexto.setColumns(20);
        areaTexto.setLineWrap(true);
        areaTexto.setRows(5);
        jScrollPane1.setViewportView(areaTexto);

        botaoLimpar.setText("Limpar Registros");
        botaoLimpar.setPreferredSize(new java.awt.Dimension(111, 25));
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAdicionarUsuarioLayout = new javax.swing.GroupLayout(painelAdicionarUsuario);
        painelAdicionarUsuario.setLayout(painelAdicionarUsuarioLayout);
        painelAdicionarUsuarioLayout.setHorizontalGroup(
            painelAdicionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAdicionarUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCNPJ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelNomeRazaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
        );
        painelAdicionarUsuarioLayout.setVerticalGroup(
            painelAdicionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAdicionarUsuarioLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(painelAdicionarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(botaoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoNomeRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeRazaoSocial)
                    .addComponent(textoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelAdicionarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(painelAdicionarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoCNPJKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoCNPJKeyReleased
        String t = textoCNPJ.getText();
        if (t.length() > 14) { // Aceita até 14 digitos
            evt.consume();
            textoCNPJ.setText(t.substring(0, 14));
            JOptionPane.showMessageDialog(this, "Número máximo de 14 dígitos foi atingido!");
        }
    }//GEN-LAST:event_textoCNPJKeyReleased

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        String cnpjEmpresa = textoCNPJ.getText();
        String nomeEmpresa = textoNomeRazaoSocial.getText();
        LocalDateTime dataHoje = LocalDateTime.now();

        if (cnpjEmpresa.trim().isEmpty() || nomeEmpresa.trim().isEmpty()) {
            System.out.println("Entre com todos os campos");
            JOptionPane.showMessageDialog(null, "Informe os Campos", "Erro nos campos", JOptionPane.WARNING_MESSAGE);
        } else {

            PREFERENCIA.put("CNPJ", cnpjEmpresa.trim());
            PREFERENCIA.put("NOMEEMPRESA", nomeEmpresa.trim());
            PREFERENCIA.put("DATACADASTRO", dataHoje.toString());

            //Recarrega a empresa cadastrada
            CarregaEmpresa();

            textoCNPJ.setText("");
            textoNomeRazaoSocial.setText("");

        }
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        String msg = "Você realmente deseja limpar todo o registro?";

        int avaliador = JOptionPane.showOptionDialog(this, msg, "Apagar Empresas", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
        if (avaliador == JOptionPane.YES_OPTION) {

            try {
                PREFERENCIA.clear();
            } catch (BackingStoreException ex) {
                System.err.println("Erro ao limpar o resgistro do windows");
            }
            CarregaEmpresa();
        }
    }//GEN-LAST:event_botaoLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaTexto;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCNPJ;
    private javax.swing.JLabel labelNomeRazaoSocial;
    private javax.swing.JPanel painelAdicionarUsuario;
    private javax.swing.JTextField textoCNPJ;
    private javax.swing.JTextField textoNomeRazaoSocial;
    // End of variables declaration//GEN-END:variables

    private void CarregaEmpresa() {

        areaTexto.setText("");
        areaTexto.setText("___Consta no Preferences do Windows___\n");
        // Definir uma string com o padrão
        String retornoCNPJ = PREFERENCIA.get("CNPJ", "--.---.---/------");
        String retornoNOMEEMPRESA = PREFERENCIA.get("NOMEEMPRESA", "Não Cadastrado");
        String retornoDATACADASTRO = PREFERENCIA.get("DATACADASTRO", "Não Cadastrado");

        System.out.println("1> " + retornoCNPJ);
        System.out.println("2> " + retornoNOMEEMPRESA);
        System.out.println("3> " + retornoDATACADASTRO);

        areaTexto.append("CNPJ: " + retornoCNPJ + "\n");
        areaTexto.append("Nome da Empresa: " +retornoNOMEEMPRESA+ "\n");
        areaTexto.append("Data do Cadastro: " +retornoDATACADASTRO+ "\n");

    }
}
