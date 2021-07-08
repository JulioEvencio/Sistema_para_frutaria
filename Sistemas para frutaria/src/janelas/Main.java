/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janelas;

import produto.Produto;
import sistema.Sistema;
import janelas.produtos.AdicionarProduto;
import janelas.produtos.AlterarProduto;
import janelas.produtos.RemoverProduto;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author julio
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();

        this.atualizarTabela();
    }

    // Meus metodos
    private void atualizarTabela() {

        DefaultTableModel tabela = (DefaultTableModel) tabelaProdutos.getModel();
        tabela.setRowCount(0);

        Produto[] produtos = Sistema.getProdutos();

        if (produtos == null) return;

        Object[] dados = new Object[3];

        for (Produto produto: produtos) {
            dados[0] = produto.getNome();
            dados[1] = produto.getQuantidade();
            dados[2] = produto.getPreco();

            tabela.addRow(dados);
        }

    }
    // Meus metodos

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        menuProdutos = new javax.swing.JMenu();
        menuProdutosAdicionar = new javax.swing.JMenuItem();
        menuProdutosAlterar = new javax.swing.JMenuItem();
        menuProdutosRemover = new javax.swing.JMenuItem();
        menuVendas = new javax.swing.JMenu();
        menuVendasVender = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();
        menuSobreInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Frutaria Java");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaProdutos);
        if (tabelaProdutos.getColumnModel().getColumnCount() > 0) {
            tabelaProdutos.getColumnModel().getColumn(0).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(1).setResizable(false);
            tabelaProdutos.getColumnModel().getColumn(2).setResizable(false);
        }

        menuProdutos.setText("Produtos");

        menuProdutosAdicionar.setText("Adicionar");
        menuProdutosAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosAdicionarActionPerformed(evt);
            }
        });
        menuProdutos.add(menuProdutosAdicionar);

        menuProdutosAlterar.setText("Alterar");
        menuProdutosAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosAlterarActionPerformed(evt);
            }
        });
        menuProdutos.add(menuProdutosAlterar);

        menuProdutosRemover.setText("Remover");
        menuProdutosRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProdutosRemoverActionPerformed(evt);
            }
        });
        menuProdutos.add(menuProdutosRemover);

        menu.add(menuProdutos);

        menuVendas.setText("Vendas");

        menuVendasVender.setText("Vender");
        menuVendasVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVendasVenderActionPerformed(evt);
            }
        });
        menuVendas.add(menuVendasVender);

        menu.add(menuVendas);

        menuSobre.setText("Sobre");

        menuSobreInfo.setText("Info");
        menuSobreInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreInfoActionPerformed(evt);
            }
        });
        menuSobre.add(menuSobreInfo);

        menu.add(menuSobre);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuProdutosAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosAdicionarActionPerformed
        new AdicionarProduto(this, true).setVisible(true);

        this.atualizarTabela();
    }//GEN-LAST:event_menuProdutosAdicionarActionPerformed

    private void menuProdutosAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosAlterarActionPerformed
        new AlterarProduto(this, true).setVisible(true);

        this.atualizarTabela();
    }//GEN-LAST:event_menuProdutosAlterarActionPerformed

    private void menuProdutosRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProdutosRemoverActionPerformed
        new RemoverProduto(this, true).setVisible(true);

        this.atualizarTabela();
    }//GEN-LAST:event_menuProdutosRemoverActionPerformed

    private void menuVendasVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVendasVenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuVendasVenderActionPerformed

    private void menuSobreInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreInfoActionPerformed
        String info = "Frutaria Java - versão 1.0";

        JOptionPane.showMessageDialog(rootPane, info, "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuSobreInfoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuProdutosAdicionar;
    private javax.swing.JMenuItem menuProdutosAlterar;
    private javax.swing.JMenuItem menuProdutosRemover;
    private javax.swing.JMenu menuSobre;
    private javax.swing.JMenuItem menuSobreInfo;
    private javax.swing.JMenu menuVendas;
    private javax.swing.JMenuItem menuVendasVender;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}
