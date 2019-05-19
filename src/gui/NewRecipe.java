/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Hyunsun
 */
public class NewRecipe extends javax.swing.JDialog {

    /**
     * Creates new form NewRecipe
     */
    public NewRecipe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRecipeName = new javax.swing.JTextField();
        txtRecipeIngredients = new javax.swing.JTextField();
        txtRecipeDescription = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbDietFilter = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        recipeCreateButton = new javax.swing.JButton();
        RecipeCloseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(239, 240, 234));

        jLabel1.setBackground(new java.awt.Color(239, 240, 234));
        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(75, 68, 41));
        jLabel1.setText("NEW R E C I P E");

        jLabel4.setBackground(new java.awt.Color(239, 240, 234));
        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 167, 167));
        jLabel4.setText("Apple");

        jLabel5.setBackground(new java.awt.Color(239, 240, 234));
        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(139, 191, 166));
        jLabel5.setText("Tea");

        jLabel3.setBackground(new java.awt.Color(239, 240, 234));
        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(139, 191, 166));
        jLabel3.setText("Bone");

        txtRecipeName.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtRecipeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecipeNameActionPerformed(evt);
            }
        });

        txtRecipeIngredients.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtRecipeIngredients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecipeIngredientsActionPerformed(evt);
            }
        });

        txtRecipeDescription.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        txtRecipeDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecipeDescriptionActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(239, 240, 234));
        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(56, 133, 96));
        jLabel6.setText("Name:");

        jLabel7.setBackground(new java.awt.Color(239, 240, 234));
        jLabel7.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(56, 133, 96));
        jLabel7.setText("Ingredients:");

        jLabel8.setBackground(new java.awt.Color(239, 240, 234));
        jLabel8.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(56, 133, 96));
        jLabel8.setText("Description:");

        cmbDietFilter.setBackground(new java.awt.Color(239, 240, 234));
        cmbDietFilter.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        cmbDietFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbDietFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDietFilterActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(239, 240, 234));
        jLabel9.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(56, 133, 96));
        jLabel9.setText("Diet:");

        recipeCreateButton.setBackground(new java.awt.Color(75, 68, 41));
        recipeCreateButton.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        recipeCreateButton.setForeground(new java.awt.Color(255, 255, 255));
        recipeCreateButton.setText("CREATE");
        recipeCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recipeCreateButtonActionPerformed(evt);
            }
        });

        RecipeCloseButton.setBackground(new java.awt.Color(75, 68, 41));
        RecipeCloseButton.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        RecipeCloseButton.setForeground(new java.awt.Color(255, 255, 255));
        RecipeCloseButton.setText("CLOSE");
        RecipeCloseButton.setActionCommand("CLOSE");
        RecipeCloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipeCloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)))
                .addGap(145, 145, 145))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecipeDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRecipeIngredients, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRecipeName)
                            .addComponent(cmbDietFilter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(recipeCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecipeCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRecipeIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtRecipeDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cmbDietFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecipeCloseButton)
                    .addComponent(recipeCreateButton))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRecipeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecipeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecipeNameActionPerformed

    private void txtRecipeIngredientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecipeIngredientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecipeIngredientsActionPerformed

    private void txtRecipeDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecipeDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecipeDescriptionActionPerformed

    private void cmbDietFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDietFilterActionPerformed
        myModel.updateItems(dao.filterByCategory((String) cmbDietFilter.getSelectedItem()));
    }//GEN-LAST:event_cmbDietFilterActionPerformed

    private void recipeCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recipeCreateButtonActionPerformed
        ProductReport report = new ProductReport(this, true, dao);
        report.setLocationRelativeTo(this);
        report.setVisible(true);
    }//GEN-LAST:event_recipeCreateButtonActionPerformed

    private void RecipeCloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipeCloseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecipeCloseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRecipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewRecipe dialog = new NewRecipe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RecipeCloseButton;
    private javax.swing.JComboBox<String> cmbDietFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton recipeCreateButton;
    private javax.swing.JTextField txtRecipeDescription;
    private javax.swing.JTextField txtRecipeIngredients;
    private javax.swing.JTextField txtRecipeName;
    // End of variables declaration//GEN-END:variables
}
