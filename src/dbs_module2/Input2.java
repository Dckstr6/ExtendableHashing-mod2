/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbs_module2;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyAdapter;

/**
 *
 * @author StylishDheeru
 */
public class Input2 extends javax.swing.JFrame {

    /**
     * Creates new form Input2
     */
    //int bfr;
    public Input2() {
        initComponents();
        //String bf = JOptionPane.showInputDialog(rootPane, "Input BFR: ");
       // bfr = Integer.parseInt(bf);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inp_jlbl = new javax.swing.JLabel();
        inp_jtxt = new javax.swing.JTextField();
        addjbtn = new javax.swing.JButton();
        searchjbtn = new javax.swing.JButton();
        reslbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayfld = new javax.swing.JTextArea();
        outfld = new javax.swing.JTextField();
        Headlbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extendible Hasher");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Calisto MT", 0, 10)); // NOI18N

        inp_jlbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        inp_jlbl.setForeground(new java.awt.Color(255, 255, 255));
        inp_jlbl.setText("Enter number  :");

        inp_jtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inp_jtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inp_jtxtActionPerformed(evt);
            }
        });
        inp_jtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inp_jtxtKeyTyped(evt);
            }
        });

        addjbtn.setBackground(new java.awt.Color(255, 255, 0));
        addjbtn.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        addjbtn.setText("Add");
        addjbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjbtnActionPerformed(evt);
            }
        });

        searchjbtn.setBackground(new java.awt.Color(255, 255, 0));
        searchjbtn.setFont(new java.awt.Font("Footlight MT Light", 1, 14)); // NOI18N
        searchjbtn.setText("Search");
        searchjbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjbtnActionPerformed(evt);
            }
        });

        reslbl.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        reslbl.setForeground(new java.awt.Color(51, 51, 51));
        reslbl.setText("Result :");

        jScrollPane1.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        displayfld.setEditable(false);
        displayfld.setBackground(new java.awt.Color(51, 51, 51));
        displayfld.setColumns(20);
        displayfld.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        displayfld.setForeground(new java.awt.Color(255, 255, 255));
        displayfld.setLineWrap(true);
        displayfld.setRows(5);
        displayfld.setText("\n\n\n\n\n\n\n\n  YOUR OUTPUT APPEARS HERE");
        displayfld.setWrapStyleWord(true);
        jScrollPane1.setViewportView(displayfld);

        outfld.setEditable(false);
        outfld.setBackground(new java.awt.Color(51, 51, 51));
        outfld.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        outfld.setForeground(new java.awt.Color(255, 255, 255));
        outfld.setBorder(null);

        Headlbl.setBackground(new java.awt.Color(51, 51, 51));
        Headlbl.setFont(new java.awt.Font("Times New Roman", 0, 40)); // NOI18N
        Headlbl.setForeground(new java.awt.Color(255, 255, 0));
        Headlbl.setText("Extendible Hashing Tool");

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(reslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outfld, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(Headlbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inp_jlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addjbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inp_jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(searchjbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Headlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inp_jlbl)
                    .addComponent(inp_jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchjbtn)
                    .addComponent(addjbtn))
                .addGap(41, 41, 41)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(outfld, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reslbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   
    int bfr = 3;
    
    int global_depth = 1;
    Table t= new Table(global_depth,bfr);
    private void addjbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjbtnActionPerformed
        // TODO add your handling code here:
        if(inp_jtxt.getText().equals("") == true){
            JOptionPane.showMessageDialog(rootPane,"Please give appropriate input");
            return;
        }
        String inp = inp_jtxt.getText();
        inp_jtxt.setText("");
        outfld.setText("");
       // outfld.setVisible(false);
        reslbl.setForeground(new Color(51,51,51));
        int key = Integer.parseInt(inp);
        t.insert(key,false);
        if(!t.exists.equals("")){
            JOptionPane.showMessageDialog(rootPane,t.exists);
        }
        Table.sho = "";
        t.show_table(false);
        displayfld.setText("");
        displayfld.setText(Table.sho);
        System.out.println(Table.sho);
        
    }//GEN-LAST:event_addjbtnActionPerformed

    private void searchjbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjbtnActionPerformed
        // TODO add your handling code here:
        if(inp_jtxt.getText().equals("") == true){
            JOptionPane.showMessageDialog(rootPane,"Invalid Input");
            return;
        }
        String inp = inp_jtxt.getText();
        //StatusDisplayer.getDefault.setStatusText(" ");
       /// outfld.setVisible(true);
        outfld.setText("");
        inp_jtxt.setText("");
        reslbl.setForeground(new Color(255,255,255));
        int key = Integer.parseInt(inp);
        t.search(key);
        outfld.setText(t.result);
       // outfld.setText("Sup punk");
        System.out.println("out: "+ t.result);
        if(t.result.equals("") == true){
            outfld.setText("Key: "+inp+": Not Found");
        }
    }//GEN-LAST:event_searchjbtnActionPerformed

    private void inp_jtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inp_jtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inp_jtxtActionPerformed

    private void inp_jtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inp_jtxtKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        int s = c;
        if(!(Character.isDigit(c) || c==8)){
            evt.consume();
        }
    }//GEN-LAST:event_inp_jtxtKeyTyped

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
            java.util.logging.Logger.getLogger(Input2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Input2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Input2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Input2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Input2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Headlbl;
    private javax.swing.JButton addjbtn;
    private javax.swing.JTextArea displayfld;
    private javax.swing.JLabel inp_jlbl;
    private javax.swing.JTextField inp_jtxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField outfld;
    private javax.swing.JLabel reslbl;
    private javax.swing.JButton searchjbtn;
    // End of variables declaration//GEN-END:variables
}
