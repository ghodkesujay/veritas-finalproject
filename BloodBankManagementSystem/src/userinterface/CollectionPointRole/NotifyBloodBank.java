/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CollectionPointRole;

import Business.Donor.Donor;
import Business.BloodBank.BloodBank;
import Business.EcoSystem;
import Business.DonationRequest.DonationRequest;
import static Business.Organization.Type.DeliveryMan;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujayghodke
 */
public class NotifyBloodBank extends javax.swing.JPanel {

    /**
     * Creates new form NotifyBloodBank
     */
    
    private JPanel userProcessContainer;
    private UserAccount account;
    DonationRequest order;
    EcoSystem system;

    public NotifyBloodBank(JPanel userProcessContainer, UserAccount account, DonationRequest order, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.system = system;
        initComponents();
        populateNetworkTable();
    }
    private void populateNetworkTable() {
        jLabel1.setText("Donation Request ID: "+order.getOrder_id());
        DefaultTableModel model = (DefaultTableModel) DeliveryManJTable.getModel();
        
        model.setRowCount(0);
        
        for(BloodBank deliveryMan1:system.getDeliveryManDirectory().getDeliveryManList()){
               Object[] row = new Object[1];
               
                row[0] = deliveryMan1;
                
                
                model.addRow(row);
            }
       /* 
       // for()
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
            System.out.println(user.getRole().getClass().getName());
            if ("Business.Role.DeliverManRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[1];
               
                row[0] = user.getName();
                
                
                model.addRow(row);
            }
            
        }*/
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryManJTable = new javax.swing.JTable();
        AssignOrderBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(178, 141, 117));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeliveryManJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(DeliveryManJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 540, 160));

        AssignOrderBtn.setText("Notify status of collection");
        AssignOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignOrderBtnActionPerformed(evt);
            }
        });
        add(AssignOrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        BackBtn.setText("<< Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose a Blood Bank from below list");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 280, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("This will notify selected Blood Bank that the blood is collected ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void AssignOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignOrderBtnActionPerformed
        int selectedRow = DeliveryManJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to proceed ahead.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            BloodBank deliveryMan  = (BloodBank)DeliveryManJTable.getValueAt(selectedRow, 0);   
            deliveryMan.getOrderList().add(order);
            order.setStatus("Notified to Blood Bank.");
            
            for(Donor cust:system.getCustomerDirectory().getCustList()){
            if(order.getDonorName().equals(cust.getUserName())){
                for(DonationRequest order : cust.getOrderList()){
                    order.setStatus("Notified to Blood Bank");
                }
            }
        }
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
            
        }
    }//GEN-LAST:event_AssignOrderBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignOrderBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTable DeliveryManJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
