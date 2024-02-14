/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layered.view;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import layered.controller.CustomerController;
import layered.dto.CustomerDto;

/**
 *
 * @author Sanjaya
 */
public class CustomerView extends javax.swing.JFrame {

    final private CustomerController CUSTOMER_CONTROLLER;

    public CustomerView() {
        CUSTOMER_CONTROLLER = new CustomerController();
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitle = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtProvince = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        btbUpdate = new javax.swing.JButton();
        lblProvince = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblCustId = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtZip = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblZip.setText("Zip :");

        lblDOB.setText("DOB");

        lblCity.setText("City :");

        lblAddress.setText("Address :");

        btbUpdate.setText("Update");
        btbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbUpdateActionPerformed(evt);
            }
        });

        lblProvince.setText("Province :");

        lblTitle.setText("Title");

        txtSalary.setToolTipText("");

        lblName.setText("Name");

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCustId.setText("Cust ID :");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customer");

        lblSalary.setText("Salary");

        tblCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCustomer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(lblCustId))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAddress)
                                    .addComponent(lblCity))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCity)
                                    .addComponent(txtAddress)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProvince)
                                    .addComponent(lblZip))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProvince)
                                    .addComponent(txtZip)))
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btbUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(lblDOB)
                                    .addComponent(lblSalary))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtDOB))))
                        .addGap(20, 20, 20)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitle)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSalary))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtProvince, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblProvince))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblZip)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btbUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        saveCustomer();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbUpdateActionPerformed
        updateCustomer();
    }//GEN-LAST:event_btbUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        searchCustomer();
    }//GEN-LAST:event_tblCustomerMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbUpdate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCustId;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProvince;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtProvince;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer() {
        try {
            CustomerDto customerDto = new CustomerDto(
                    txtId.getText(),
                    txtTitle.getText(),
                    txtName.getText(),
                    txtDOB.getText(),
                    Double.parseDouble(txtSalary.getText()),
                    txtAddress.getText(),
                    txtCity.getText(),
                    txtProvince.getText(),
                    txtZip.getText());
            String response = CUSTOMER_CONTROLLER.saveCustomer(customerDto);
            JOptionPane.showMessageDialog(this, response);
            clear();
            loadTable();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void updateCustomer() {
        try {
            CustomerDto customerDto = new CustomerDto(
                    txtId.getText(),
                    txtTitle.getText(),
                    txtName.getText(),
                    txtDOB.getText(),
                    Double.parseDouble(txtSalary.getText()),
                    txtAddress.getText(),
                    txtCity.getText(),
                    txtProvince.getText(),
                    txtZip.getText());

            String reponse = CUSTOMER_CONTROLLER.updateCustomer(customerDto);
            JOptionPane.showMessageDialog(this, reponse);
            clear();
            loadTable();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteCustomer() {
        try {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustID(txtId.getText());
            String response = CUSTOMER_CONTROLLER.deleteCustomer(customerDto);
            JOptionPane.showMessageDialog(this, response);
            clear();
            loadTable();
        } catch (Exception ex) {
            Logger.getLogger(ItemView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void searchCustomer() {
        try {
            String id = (String) tblCustomer.getValueAt(tblCustomer.getSelectedRow(), 0);

            CustomerDto customerDto = CUSTOMER_CONTROLLER.searchCustomer(id);

            if (customerDto != null) {
                txtId.setText(customerDto.getCustID());
                txtTitle.setText(customerDto.getCustTitle());
                txtName.setText(customerDto.getCustName());
                txtDOB.setText(customerDto.getDOB());
                txtSalary.setText(customerDto.getSalary().toString());
                txtAddress.setText(customerDto.getCustAddress());
                txtCity.setText(customerDto.getCity());
                txtProvince.setText(customerDto.getProvince());
                txtZip.setText(customerDto.getPostalCode());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not found");

            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void loadTable() {
        try {
            String[] colums = {"Customer ID", "Name", "Salary", "Address"};
            DefaultTableModel defaultTableModel = new DefaultTableModel(colums, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            tblCustomer.setModel(defaultTableModel);
            List<CustomerDto> customerDtos = CUSTOMER_CONTROLLER.getAll();

            for (CustomerDto customerDto : customerDtos) {
                Object rows[] = {
                    customerDto.getCustID(),
                    customerDto.getCustTitle() + " " + customerDto.getCustName(),
                    customerDto.getSalary(),
                    customerDto.getCustAddress()
                };
                defaultTableModel.addRow(rows);
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    public void clear() {
        txtId.setText("");
        txtTitle.setText("");
        txtName.setText("");
        txtDOB.setText("");
        txtSalary.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtProvince.setText("");
        txtZip.setText("");
    }
}
