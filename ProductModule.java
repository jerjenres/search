
package specialactivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ProductModule extends javax.swing.JFrame {
    Connection con;
    Statement st;
    ArrayList<Products> product = new ArrayList<>();
    
    public ProductModule() {
        initComponents();
        fetch();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblProductPane = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        lblProductId = new javax.swing.JLabel();
        lblProductName = new javax.swing.JLabel();
        lblProductDes = new javax.swing.JLabel();
        lblProductPrice = new javax.swing.JLabel();
        lblProductDate = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtProductDes = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        txtProductDate = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Product Desciption", "Product Price", "Product Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.getTableHeader().setReorderingAllowed(false);
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        tblProductPane.setViewportView(tblProducts);
        if (tblProducts.getColumnModel().getColumnCount() > 0) {
            tblProducts.getColumnModel().getColumn(0).setResizable(false);
            tblProducts.getColumnModel().getColumn(1).setResizable(false);
            tblProducts.getColumnModel().getColumn(2).setResizable(false);
            tblProducts.getColumnModel().getColumn(3).setResizable(false);
            tblProducts.getColumnModel().getColumn(4).setResizable(false);
        }

        lblProductId.setText("Product ID");

        lblProductName.setText("Product Name");

        lblProductDes.setText("Product Description ");

        lblProductPrice.setText("Product Price");

        lblProductDate.setText("Prodcut Date");

        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnRefresh.setText("REFRESH");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tblProductPane, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProductName)
                            .addComponent(lblProductId)
                            .addComponent(lblProductDes)
                            .addComponent(lblProductPrice)
                            .addComponent(lblProductDate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProductDate, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtProductPrice)
                            .addComponent(txtProductDes)
                            .addComponent(txtProductId)
                            .addComponent(txtProductName)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnSearch)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(27, 27, 27)
                            .addComponent(btnUpdate)
                            .addGap(18, 18, 18)
                            .addComponent(btnDelete)
                            .addGap(18, 18, 18)
                            .addComponent(btnClear))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductId)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductName)
                            .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductDes)
                            .addComponent(txtProductDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductPrice)
                            .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProductDate)
                            .addComponent(txtProductDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnClear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tblProductPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnRefresh)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        // TODO add your handling code here:
        int i = tblProducts.getSelectedRow();
        TableModel model = tblProducts.getModel();
        txtProductId.setText(model.getValueAt(i,0).toString());
        txtProductName.setText(model.getValueAt(i, 1).toString());
        txtProductDes.setText(model.getValueAt(i, 2).toString());
        txtProductPrice.setText(model.getValueAt(i, 3).toString());
        txtProductDate.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_tblProductsMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int i = tblProducts.getSelectedRow();
        
        if (i >= 0) {
            int option = JOptionPane.showConfirmDialog(rootPane,
        "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                TableModel model = tblProducts.getModel();
                String id = model.getValueAt(i, 0).toString();
                if (tblProducts.getSelectedRows().length == 1) {
                    delete(id);
                    DefaultTableModel model1 = (DefaultTableModel) tblProducts.getModel();
                    model1.setRowCount(0);
                    fetch();
                    clear();
                }
            }
        } else {
            alert("Please select a row to delete");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String id = txtProductId.getText().trim(); //trim() method removes whitespace from both ends of a string.
        String name = txtProductName.getText().trim();
        String des = txtProductDes.getText().trim();
        String price = txtProductPrice.getText().trim();
        String date = txtProductDate.getText().trim();
        
        if (!name.isEmpty()) {
            try { //try catch to check if database in connected
                Class.forName("com.mysql.cj.jdbc.Driver"); //jdbc connector
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", ""); //localhost mysql port, database name, username and password
                String sql = "select * from product where product_name='" + name + "'"; //query to check last name to the database records
                st = con.createStatement(); //create connection
                ResultSet rs = st.executeQuery(sql); //executes the sql
                
                if(rs.next()==true){ //checks if the last name already exist in the database table
                    alert("This product record already exist", "Insert error");
                }
                else{
                    addProduct(id, name, des, price, date); //calls saveUser method to save new record to the database
                    fetch(); //calls fetch method to update the GUI table
                    alert("Record has been successfully added.");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
                }
        } else {
            alert("There is nothing to update :(","No row selected");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String id = txtProductId.getText().trim(); //trim() method removes whitespace from both ends of a string.
        String name = txtProductName.getText().trim();
        String des = txtProductDes.getText().trim();
        String price = txtProductPrice.getText().trim();
        String date = txtProductDate.getText().trim();
        
        if (!name.isEmpty() && !id.isEmpty()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", "");
                String sql = "select * from product where product_id='" + id + "'";
                st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                
                if(rs.next()==true){
                    update(id, name, des, price, date);
                    DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
                    model.setRowCount(0);
                    fetch();
                    alert("Update was successful");
                } else {
                    alert("There is no such student", "Update error");
                    clear();
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
        alert("There is nothing to update :(","No row selected");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_btnRefreshActionPerformed
      
    public void update(String id, String name, String des, String price, String date) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", "");
            String sql = "UPDATE `product` SET product_name='" + name + "', product_description='" + des + "', product_price ='" + price + "', product_date='" + date + "' WHERE product_id='" + id + "'";
            st = con.createStatement();
            st.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        fetch();
    }
    
    public void addProduct(String id, String name, String des, String price, String date) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", "");
            String sql = "INSERT INTO `product`(`product_id`, `product_name`, `product_description`, `product_price`, `product_date`) "
            + "VALUES ('" + id + "','" + name + "','" + des + "', '" + price + "', '" + date + "')";
            st = con.createStatement();
            st.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
        }
        fetch();
    }
    
    
    
    
    
    //method to show an info alert
    public void alert(String msg) {
        JOptionPane.showMessageDialog(rootPane, msg);
    }
    //method to show an error alert
    public void alert(String msg, String title) {
        JOptionPane.showMessageDialog(rootPane, msg, title, JOptionPane.ERROR_MESSAGE);
    }
    
    public void clear(){
        txtProductId.setText("");
        txtProductName.setText("");
        txtProductDes.setText("");
        txtProductPrice.setText("");
        txtProductDate.setText("");
    }
    
    public void delete(String id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", "");
            String sql = "DELETE FROM `product` WHERE product_id = '" + id + "'";
            st = con.createStatement();
            st.execute(sql);
            } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
            //allows you to get an instance of a logger and then log a message with the given Level (severe) containing the exception's (ex) stacktrace.
            }
            fetch();
    }
    
    private void fetch() {
        product.clear();
        DefaultTableModel model1 = (DefaultTableModel) tblProducts.getModel();
        model1.setRowCount(0);
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", ""); //localhost port, databasename, username, password
                String sql = "select * from product";
                st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Products products = new Products(rs.getString("product_id"), rs.getString("product_name"), rs.getString("product_description"), rs.getString("product_price"), rs.getString("product_date")); 
                product.add(products);
                }
            DefaultTableModel model2 = (DefaultTableModel) tblProducts.getModel();
            for ( Products user : product) { //
                Object[] row = new Object[5];
                row[0] = user.getProductId();
                row[1] = user.getProductName();
                row[2] = user.getProductDes();
                row[3] = user.getProductPrice();
                row[4] = user.getProductDate();
                model2.addRow(row);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search(){
        product.clear();
        String searchName = txtSearch.getText();
        DefaultTableModel model1 = (DefaultTableModel) tblProducts.getModel();
        model1.setRowCount(0);
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/oop", "root", "");
            String sql = "SELECT * FROM `product`  WHERE product_name='" + searchName + "'";
            st = con.createStatement();
            st.execute(sql);
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                Products products = new Products(rs.getString("product_id"), rs.getString("product_name"), rs.getString("product_description"), rs.getString("product_price"), rs.getString("product_date")); 
                product.add(products);
            }
            
            DefaultTableModel model2 = (DefaultTableModel) tblProducts.getModel();
                for ( Products user : product) { //
                    Object[] row = new Object[5];
                    row[0] = user.getProductId();
                    row[1] = user.getProductName();
                    row[2] = user.getProductDes();
                    row[3] = user.getProductPrice();
                    row[4] = user.getProductDate();
                    model2.addRow(row);
                }
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "not found");
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ProductModule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void refresh(){
        fetch();
    }
    

    
    
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
            java.util.logging.Logger.getLogger(ProductModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblProductDate;
    private javax.swing.JLabel lblProductDes;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblProductPrice;
    private javax.swing.JScrollPane tblProductPane;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtProductDate;
    private javax.swing.JTextField txtProductDes;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
