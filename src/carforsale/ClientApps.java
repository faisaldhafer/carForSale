// FAISAL ALZAHRANI 35110059
package carforsale;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author FAISAL ALZAHRANI
 */
public class ClientApps extends javax.swing.JFrame {

    private Socket socket;
    private Car cInfo;
    private ObjectOutputStream outputServer;
    private ObjectInputStream inputServer;

    public ClientApps() {
        this.setTitle("Car selling form");
        initComponents();
        suvRadioButton.setSelected(true);
        typeComboBox.setSelectedIndex(-1);
        this.setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);

        try {
            socket = new Socket("localhost", 4000);
            outputServer = new ObjectOutputStream(socket.getOutputStream());
            inputServer = new ObjectInputStream(socket.getInputStream());
        } catch (IOException ex) {
            outputTextArea.append("\nConnection to the server Failed");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        styleButtonGroup = new javax.swing.ButtonGroup();
        driveTypebuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        carIdTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        makerTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        minPriceSpinner = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        maxPriceSpinner = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        suvRadioButton = new javax.swing.JRadioButton();
        sedanRadioButton = new javax.swing.JRadioButton();
        hatchbackRadioButton = new javax.swing.JRadioButton();
        minivanRadioButton = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        frontWheelCheckBox = new javax.swing.JCheckBox();
        allWheelCheckBox = new javax.swing.JCheckBox();
        backWheelCheckBox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        manufactureYearComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        engineSizeTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new java.awt.GridLayout(2, 4));

        jLabel2.setText("Car ID");
        jPanel1.add(jLabel2);
        jPanel1.add(carIdTextField);

        jLabel1.setText("Type");
        jPanel1.add(jLabel1);

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "Used" }));
        jPanel1.add(typeComboBox);

        jLabel3.setText("Maker");
        jPanel1.add(jLabel3);
        jPanel1.add(makerTextField);

        jLabel4.setText("Model");
        jPanel1.add(jLabel4);
        jPanel1.add(modelTextField);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Price"));
        jPanel2.setLayout(new java.awt.GridLayout(1, 4));

        jLabel5.setText("Minimum Price");
        jPanel2.add(jLabel5);

        minPriceSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1000.0d));
        jPanel2.add(minPriceSpinner);

        jLabel6.setText("Maximum Price");
        jPanel2.add(jLabel6);

        maxPriceSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, null, null, 1000.0d));
        jPanel2.add(maxPriceSpinner);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("Car Style");

        styleButtonGroup.add(suvRadioButton);
        suvRadioButton.setText("SUV");

        styleButtonGroup.add(sedanRadioButton);
        sedanRadioButton.setText("Sedan");

        styleButtonGroup.add(hatchbackRadioButton);
        hatchbackRadioButton.setText("Hatchback");

        styleButtonGroup.add(minivanRadioButton);
        minivanRadioButton.setText("Minivan");

        jLabel8.setText("Drive Type");

        driveTypebuttonGroup.add(frontWheelCheckBox);
        frontWheelCheckBox.setText("Front Wheel Drive");

        driveTypebuttonGroup.add(allWheelCheckBox);
        allWheelCheckBox.setText("All Wheel Drive");

        driveTypebuttonGroup.add(backWheelCheckBox);
        backWheelCheckBox.setText("Back Wheel Drive");

        jLabel9.setText("Manufacturing Year");

        manufactureYearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));

        jLabel10.setText("Engine Size");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(suvRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(sedanRadioButton))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(manufactureYearComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(frontWheelCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(allWheelCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(backWheelCheckBox))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(hatchbackRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(minivanRadioButton))))
                    .addComponent(engineSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suvRadioButton)
                    .addComponent(jLabel7)
                    .addComponent(sedanRadioButton)
                    .addComponent(hatchbackRadioButton)
                    .addComponent(minivanRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(frontWheelCheckBox)
                    .addComponent(allWheelCheckBox)
                    .addComponent(backWheelCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(manufactureYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(engineSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane1.setViewportView(outputTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new java.awt.GridLayout(5, 0));

        insertButton.setText("Insert");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });
        jPanel5.add(insertButton);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel5.add(searchButton);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel5.add(updateButton);

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        jPanel5.add(resetButton);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel5.add(exitButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        resetAllComponents();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        if (validateInputForm()) {
            loadCarInfoIntoObject();
            try {
                outputServer.writeObject(cInfo);
                outputTextArea.append(cInfo.toString());
                outputServer.writeUTF("Insert");
                outputServer.flush();

                String message = inputServer.readUTF();

                outputTextArea.append("\n" + message);

                resetAllComponents();
            } catch (IOException ex) {
                outputTextArea.append("\n" + ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (!carIdTextField.getText().trim().equals("")) {
            cInfo = new Car();
            cInfo.setCarId(carIdTextField.getText().trim());
            try {
                outputServer.writeObject(cInfo);
                outputServer.writeUTF("Search");
                outputServer.flush();

                Car car = (Car) inputServer.readObject();
                String message = inputServer.readUTF();

                if (!message.equals("\nCar id not found")) {
                    // Load into the form
                    carIdTextField.setText(car.getCarId());
                    if (car.getCarType().equals("New")) {
                        typeComboBox.setSelectedIndex(0);
                    } else if (car.getCarType().equals("Used")) {
                        typeComboBox.setSelectedIndex(1);
                    }
                    makerTextField.setText(car.getCarMaker());
                    modelTextField.setText(car.getCarModel());
                    minPriceSpinner.setValue(car.getMinPrice());
                    maxPriceSpinner.setValue(car.getMaxPrice());
                    if (car.getStyle().equals("Suv")) {
                        suvRadioButton.setSelected(true);
                    } else if (car.getStyle().equals("Sedan")) {
                        sedanRadioButton.setSelected(true);
                    } else if (car.getStyle().equals("Hatchback")) {
                        hatchbackRadioButton.setSelected(true);
                    } else if (car.getStyle().equals("Minivan")) {
                        minivanRadioButton.setSelected(true);
                    }
                    if (car.getManufacturingYear().equals("1981")) {
                        manufactureYearComboBox.setSelectedIndex(0);
                    } else if (car.getManufacturingYear().equals("1982")) {
                        manufactureYearComboBox.setSelectedIndex(1);
                    } else if (car.getManufacturingYear().equals("1983")) {
                        manufactureYearComboBox.setSelectedIndex(2);
                    } else if (car.getManufacturingYear().equals("1984")) {
                        manufactureYearComboBox.setSelectedIndex(3);
                    } else if (car.getManufacturingYear().equals("1985")) {
                        manufactureYearComboBox.setSelectedIndex(4);
                    } else if (car.getManufacturingYear().equals("1986")) {
                        manufactureYearComboBox.setSelectedIndex(5);
                    } else if (car.getManufacturingYear().equals("1987")) {
                        manufactureYearComboBox.setSelectedIndex(6);
                    } else if (car.getManufacturingYear().equals("1988")) {
                        manufactureYearComboBox.setSelectedIndex(7);
                    } else if (car.getManufacturingYear().equals("1989")) {
                        manufactureYearComboBox.setSelectedIndex(8);
                    } else if (car.getManufacturingYear().equals("1990")) {
                        manufactureYearComboBox.setSelectedIndex(9);
                    } else if (car.getManufacturingYear().equals("1991")) {
                        manufactureYearComboBox.setSelectedIndex(10);
                    } else if (car.getManufacturingYear().equals("1992")) {
                        manufactureYearComboBox.setSelectedIndex(11);
                    } else if (car.getManufacturingYear().equals("1993")) {
                        manufactureYearComboBox.setSelectedIndex(12);
                    } else if (car.getManufacturingYear().equals("1994")) {
                        manufactureYearComboBox.setSelectedIndex(13);
                    } else if (car.getManufacturingYear().equals("1995")) {
                        manufactureYearComboBox.setSelectedIndex(14);
                    } else if (car.getManufacturingYear().equals("1996")) {
                        manufactureYearComboBox.setSelectedIndex(15);
                    } else if (car.getManufacturingYear().equals("1997")) {
                        manufactureYearComboBox.setSelectedIndex(16);
                    } else if (car.getManufacturingYear().equals("1998")) {
                        manufactureYearComboBox.setSelectedIndex(17);
                    } else if (car.getManufacturingYear().equals("1999")) {
                        manufactureYearComboBox.setSelectedIndex(18);
                    } else if (car.getManufacturingYear().equals("2000")) {
                        manufactureYearComboBox.setSelectedIndex(19);
                    } else if (car.getManufacturingYear().equals("2001")) {
                        manufactureYearComboBox.setSelectedIndex(20);
                    } else if (car.getManufacturingYear().equals("2002")) {
                        manufactureYearComboBox.setSelectedIndex(21);
                    } else if (car.getManufacturingYear().equals("2003")) {
                        manufactureYearComboBox.setSelectedIndex(22);
                    } else if (car.getManufacturingYear().equals("2004")) {
                        manufactureYearComboBox.setSelectedIndex(23);
                    } else if (car.getManufacturingYear().equals("2005")) {
                        manufactureYearComboBox.setSelectedIndex(24);
                    } else if (car.getManufacturingYear().equals("2006")) {
                        manufactureYearComboBox.setSelectedIndex(25);
                    } else if (car.getManufacturingYear().equals("2007")) {
                        manufactureYearComboBox.setSelectedIndex(26);
                    } else if (car.getManufacturingYear().equals("2008")) {
                        manufactureYearComboBox.setSelectedIndex(27);
                    } else if (car.getManufacturingYear().equals("2009")) {
                        manufactureYearComboBox.setSelectedIndex(28);
                    } else if (car.getManufacturingYear().equals("2010")) {
                        manufactureYearComboBox.setSelectedIndex(29);
                    } else if (car.getManufacturingYear().equals("2011")) {
                        manufactureYearComboBox.setSelectedIndex(30);
                    } else if (car.getManufacturingYear().equals("2012")) {
                        manufactureYearComboBox.setSelectedIndex(31);
                    } else if (car.getManufacturingYear().equals("2013")) {
                        manufactureYearComboBox.setSelectedIndex(32);
                    } else if (car.getManufacturingYear().equals("2014")) {
                        manufactureYearComboBox.setSelectedIndex(33);
                    } else if (car.getManufacturingYear().equals("2015")) {
                        manufactureYearComboBox.setSelectedIndex(34);
                    } else if (car.getManufacturingYear().equals("2016")) {
                        manufactureYearComboBox.setSelectedIndex(35);
                    } else if (car.getManufacturingYear().equals("2017")) {
                        manufactureYearComboBox.setSelectedIndex(36);
                    } else if (car.getManufacturingYear().equals("2018")) {
                        manufactureYearComboBox.setSelectedIndex(37);
                    }
                    engineSizeTextField.setText(car.getEngineSize());
                    insertButton.setEnabled(false);
                    searchButton.setEnabled(false);
                }
                outputTextArea.append("\n" + message);
            } catch (IOException ex) {

            } catch (ClassNotFoundException ex) {

            }
        } else {
            outputTextArea.append("\nPlease enter car id to search");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (validateInputForm()) {
            loadCarInfoIntoObject();
            try {
                outputServer.writeObject(cInfo);
                outputTextArea.append("\n" + cInfo.toString());
                outputServer.writeUTF("Update");
                outputServer.flush();
                String message = inputServer.readUTF();

                outputTextArea.append("\n" + message);
                resetAllComponents();
            } catch (IOException ex) {
                outputTextArea.append("\n" + ex.getMessage());;
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed
    private boolean validateInputForm() {
        if (carIdTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Car ID", "Car ID missing", JOptionPane.ERROR_MESSAGE);
            carIdTextField.requestFocus();
            return false;
        } else if (!carIdTextField.getText().matches("[0-9]{10}")) {
            JOptionPane.showMessageDialog(this, "Car ID must be 10 digits", "Wrong Car ID", JOptionPane.ERROR_MESSAGE);
            carIdTextField.setText("");
            carIdTextField.requestFocus();
            return false;
        } else if (typeComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select Type", "Type missing", JOptionPane.ERROR_MESSAGE);
            typeComboBox.requestFocus();
            return false;
        } else if (makerTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Car Maker", "Car Maker missing", JOptionPane.ERROR_MESSAGE);
            makerTextField.requestFocus();
            return false;
        } else if (!makerTextField.getText().matches("[A-Z][a-zA-Z]+\\.?")) {
            JOptionPane.showMessageDialog(this, "Car maker must start with uppercase letter and  contain letter and space", "Wrong Car maker", JOptionPane.ERROR_MESSAGE);
            makerTextField.setText("");
            makerTextField.requestFocus();
            return false;
        } else if (modelTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter Car model", "Car model missing", JOptionPane.ERROR_MESSAGE);
            modelTextField.requestFocus(); 
            return false;
        } else if (!modelTextField.getText().matches("[0-9a-zA-Z]+\\.?")) {
            JOptionPane.showMessageDialog(this, "Car model must contain letter, digit and space only", "Wrong Car model", JOptionPane.ERROR_MESSAGE);
            modelTextField.setText("");
            modelTextField.requestFocus();
            return false;
        } else if (Double.parseDouble(minPriceSpinner.getValue().toString()) > 1000000 || Double.parseDouble(minPriceSpinner.getValue().toString()) < 1000) {
            JOptionPane.showMessageDialog(this, "Minimum Price should be between 1000 and 1000000", "Wrong Value", JOptionPane.ERROR_MESSAGE);
            minPriceSpinner.setValue(new Integer(0));
            minPriceSpinner.requestFocus(); 
            return false;
        } else if (Double.parseDouble(maxPriceSpinner.getValue().toString()) > 1000000 || Double.parseDouble(maxPriceSpinner.getValue().toString()) < 1000) {
            JOptionPane.showMessageDialog(this, "Maximum Price should be between 1000 and 1000000", "Wrong Value", JOptionPane.ERROR_MESSAGE);
            maxPriceSpinner.setValue(new Integer(0));
            maxPriceSpinner.requestFocus();
            return false;
        } else if (!suvRadioButton.isSelected()) {
            if (!sedanRadioButton.isSelected()) {
                if (!hatchbackRadioButton.isSelected()) {
                    if (!minivanRadioButton.isSelected()) {
                        JOptionPane.showMessageDialog(this, "Car style should not be null", "style missing", JOptionPane.ERROR_MESSAGE);
                        suvRadioButton.requestFocus();
                        return false;
                    }
                }
            }
        } else if (!frontWheelCheckBox.isSelected()) {
            if (!backWheelCheckBox.isSelected()) {
                if (!allWheelCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Drive type should not be null", "Drive type missing", JOptionPane.ERROR_MESSAGE);
                    frontWheelCheckBox.requestFocus();
                    return false;
                }
            }

        } else if (manufactureYearComboBox.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Please select manufacturing year", "manufacturing year missing", JOptionPane.ERROR_MESSAGE);
            manufactureYearComboBox.requestFocus();
            return false;
        }
        if (engineSizeTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter engine size", "engine size missing", JOptionPane.ERROR_MESSAGE);
            engineSizeTextField.requestFocus();
            return false;
        } else if (!engineSizeTextField.getText().matches("[0-9][.][0-9]+")) {
            JOptionPane.showMessageDialog(this, "engine size must be double", "Wrong engine size", JOptionPane.ERROR_MESSAGE);
            engineSizeTextField.setText("");
            engineSizeTextField.requestFocus();
            return false;
        }

        return true;
    }

    private void loadCarInfoIntoObject() {

        cInfo = new Car();
        cInfo.setCarId(carIdTextField.getText().trim());
        cInfo.setCarType(typeComboBox.getSelectedItem().toString());
        cInfo.setCarMaker(makerTextField.getText().trim());
        cInfo.setCarModel(modelTextField.getText().trim());
        cInfo.setMinPrice(Double.parseDouble(minPriceSpinner.getValue().toString()));
        cInfo.setMaxPrice(Double.parseDouble(maxPriceSpinner.getValue().toString()));
        if (suvRadioButton.isSelected()) {
            cInfo.setStyle("SUV");
        } else if (sedanRadioButton.isSelected()) {
            cInfo.setStyle("Sedan");
        } else if (hatchbackRadioButton.isSelected()) {
            cInfo.setStyle("Hatchback");
        } else if (minivanRadioButton.isSelected()) {
            cInfo.setStyle("Minivan");
        }
        if (frontWheelCheckBox.isSelected()) {
            cInfo.setDriveType("Front Wheel Drive");
        } else if (backWheelCheckBox.isSelected()) {
            cInfo.setDriveType("Back Wheel Drive");
        } else if (allWheelCheckBox.isSelected()) {
            cInfo.setDriveType("All Wheel Drive");
        }
        cInfo.setManufacturingYear(manufactureYearComboBox.getSelectedItem().toString());
        cInfo.setEngineSize(engineSizeTextField.getText().trim());

    }

    private void resetAllComponents() {
        carIdTextField.setText("");
        makerTextField.setText("");
        modelTextField.setText("");
        typeComboBox.setSelectedIndex(-1);
        frontWheelCheckBox.setSelected(true);
        suvRadioButton.setSelected(true);
        minPriceSpinner.setValue(new Integer(0));
        maxPriceSpinner.setValue(new Integer(0));
        manufactureYearComboBox.setSelectedIndex(-1);
        engineSizeTextField.setText("");

        insertButton.setEnabled(true);
        searchButton.setEnabled(true);
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
            java.util.logging.Logger.getLogger(ClientApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientApps().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allWheelCheckBox;
    private javax.swing.JCheckBox backWheelCheckBox;
    private javax.swing.JTextField carIdTextField;
    private javax.swing.ButtonGroup driveTypebuttonGroup;
    private javax.swing.JTextField engineSizeTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JCheckBox frontWheelCheckBox;
    private javax.swing.JRadioButton hatchbackRadioButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField makerTextField;
    private javax.swing.JComboBox<String> manufactureYearComboBox;
    private javax.swing.JSpinner maxPriceSpinner;
    private javax.swing.JSpinner minPriceSpinner;
    private javax.swing.JRadioButton minivanRadioButton;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JRadioButton sedanRadioButton;
    private javax.swing.ButtonGroup styleButtonGroup;
    private javax.swing.JRadioButton suvRadioButton;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
