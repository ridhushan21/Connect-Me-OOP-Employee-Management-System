package UIPackage;

import java.io.IOException;
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;


public class AddDepartmentsDesignations extends javax.swing.JFrame {
       
    /**
     * Creates new form AddDepartmentsDesignations
     */
    public AddDepartmentsDesignations() {
        initComponents();
        loadDepartDesigToTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDepartDesigName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbCategorySearch = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDepartDesigID = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDepartDesig = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Add Departments & Designations");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Category");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Department / Designation ID");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Department / Designation Name");

        txtDepartDesigName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartDesigNameActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 255, 204));
        btnDelete.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 255, 204));
        btnAdd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Search Department / Designation");

        cmbCategorySearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cmbCategorySearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Category", "Operations", "Quality Assurance", "Training", "Supervisor", "Team Captain", "Quality Manager", "Quality Monitor ", "Training Manager" }));
        cmbCategorySearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategorySearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(204, 255, 204));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Connect Me");

        txtDepartDesigID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartDesigIDActionPerformed(evt);
            }
        });

        cmbCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department", "Designation" }));

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\Screenshot 2025-04-03 191130.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(btnAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(cmbCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSearch)))
                        .addGap(79, 79, 79))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(btnDelete)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDepartDesigName)
                            .addComponent(txtDepartDesigID, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDepartDesigID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDepartDesigName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategorySearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(34, 34, 34))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        tableDepartDesig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tableDepartDesig.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Category", "Depart / Desig ID ", "Depart / Desig Name "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableDepartDesig);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Department , Designation List");

        btnBack.setBackground(new java.awt.Color(204, 255, 204));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBack))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void loadDepartDesigToTable() {
        DefaultTableModel model = (DefaultTableModel) tableDepartDesig.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] DepartDesigDetails = line.split(" /");
                model.addRow(DepartDesigDetails); // Add each product to the table
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading DepartDesig data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String txtDepartDesigID = JOptionPane.showInputDialog(this, "Enter DepartDesig ID to delete:", "Delete DepartDesig", JOptionPane.QUESTION_MESSAGE);

// Check if input is valid
if (txtDepartDesigID == null || txtDepartDesigID.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "No ID entered! Please enter a valid ID.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    File inputFile = new File("C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig.txt");
    File tempFile = new File("C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig_temp.txt");

    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

    String currentLine;
    boolean found = false;

    while ((currentLine = reader.readLine()) != null) {
        String[] details = currentLine.split("\\s*/\\s*");  // Fix split format
        if (!details[0].trim().equals(txtDepartDesigID.trim())) {
            writer.write(currentLine);
            writer.newLine();
        } else {
            found = true;
        }
    }

    writer.close();
    reader.close();

    if (found) {
        if (inputFile.delete() && tempFile.renameTo(inputFile)) {
            JOptionPane.showMessageDialog(this, "DepartDesig deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Error deleting DepartDesig!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "DepartDesig ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
    }

    loadDepartDesigToTable();  // Refresh the table

} catch (IOException ex) {
    JOptionPane.showMessageDialog(this, "Error deleting DepartDesig: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtDepartDesigID.getText().isEmpty() || txtDepartDesigName.getText().isEmpty()) {
              JOptionPane.showMessageDialog(rootPane, "No fields can be left blank!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
}

    // Check if a valid category is selected
        if (cmbCategory.getSelectedItem().toString().equals("Select Category")) {
              JOptionPane.showMessageDialog(rootPane, "Please select a category", "Error", JOptionPane.ERROR_MESSAGE);
            return;
}

            int DepartDesigID = -1;
        try {
               DepartDesigID = Integer.parseInt(txtDepartDesigID.getText()); // Ensure ID is a valid integer
}           catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(rootPane, "ID should be an Integer Value", "Error", JOptionPane.ERROR_MESSAGE);
             return;
}

// Check for duplicate DepartDesigID
            boolean isDuplicate = false;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig.txt"))) {
             String line;
            while ((line = br.readLine()) != null) {
        // Split the line correctly
             String[] DepartDesigDetails = line.split("\\s*/\\s*");  // Split by '/' with optional spaces
        if (DepartDesigDetails.length < 2) {
            continue; // Skip invalid lines
        }

        try {
            int existingDepartDesigID = Integer.parseInt(DepartDesigDetails[0].trim()); // Parse ID from file

            if (existingDepartDesigID == DepartDesigID) {
                isDuplicate = true;
                break;
            }
        } catch (NumberFormatException e) {
            // Skip lines with invalid ID
            continue;
        }
    }
} catch (IOException e) {
    JOptionPane.showMessageDialog(rootPane, "Error reading DepartDesig file.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

if (isDuplicate) {
    JOptionPane.showMessageDialog(rootPane, "DepartDesig ID already exists. Please use a unique ID.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Fetch the product details
    String DepartDesigCategory = cmbCategory.getSelectedItem().toString();
    String DepartDesigName = txtDepartDesigName.getText();

try {
    // Prepare the line to save
    String DepartDesigDetails = DepartDesigCategory + " / " + DepartDesigID + " / " + DepartDesigName;

    // Save to the products file
    String DepartDesigFile = "C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig.txt";
    File file = new File(DepartDesigFile);
    try (FileWriter writer = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(writer)) {
        bw.write(DepartDesigDetails);  // Write new data to the file
        bw.newLine();  // Add a new line after each entry
    }

    JOptionPane.showMessageDialog(rootPane, "DepartDesig added successfully.");

    // Clear the input fields
    cmbCategory.setSelectedItem("Select Category");
    txtDepartDesigID.setText("");
    txtDepartDesigName.setText("");

    // Reload the table if needed
    loadDepartDesigToTable();

} catch (IOException e) {
    JOptionPane.showMessageDialog(rootPane, "Error while adding product.", "Error", JOptionPane.ERROR_MESSAGE);
}


    }//GEN-LAST:event_btnAddActionPerformed

    private void cmbCategorySearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategorySearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategorySearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String DepartDesigFile = "C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig.txt";
        File file = new File(DepartDesigFile);

        String selectedCategory = cmbCategorySearch.getSelectedItem().toString().trim();

        DefaultTableModel model = (DefaultTableModel) tableDepartDesig.getModel();
        model.setRowCount(0);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split(" /");

                // Ensure there are enough fields to avoid ArrayIndexOutOfBoundsException
                if (dataRow.length >= 5) {
                    String category = dataRow[4].trim(); // Assuming category is at the fifth position in file structure

                    if (selectedCategory.equals("Select Category") || category.equalsIgnoreCase(selectedCategory)) {
                        model.addRow(dataRow);
                    }

                }
                if (cmbCategorySearch.getSelectedItem().toString().equals("All Category")) {
                    loadProductsToTable();
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "Error while reading DepartDesig", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        ResponseManager Back = new ResponseManager();
        this.dispose();
        Back.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed
    private void loadProductsToTable() {
        DefaultTableModel model = (DefaultTableModel) tableDepartDesig.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Admin\\Dropbox\\My PC (DESKTOP-69KKKVL)\\Desktop\\DepartDesig.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] productDetails = line.split(" /");
                model.addRow(productDetails); // Add each product to the table
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading product data.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void txtDepartDesigNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartDesigNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartDesigNameActionPerformed

    private void txtDepartDesigIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartDesigIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartDesigIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentsDesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentsDesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentsDesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentsDesignations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddDepartmentsDesignations().setVisible(true);
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbCategorySearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableDepartDesig;
    private javax.swing.JTextField txtDepartDesigID;
    private javax.swing.JTextField txtDepartDesigName;
    // End of variables declaration//GEN-END:variables
}
