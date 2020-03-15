// FAISAL ALZAHRANI 35110059
package carforsale;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author FAISAL ALZAHRANI
 */
public class ServerApps extends javax.swing.JFrame {

    private Socket socket;
    private ServerSocket serverSocket;
    private int clientno = 0;
    private Connection conn;
    private String dbName;
    private String userID;
    private String password;

    public ServerApps() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        serverTextArea.append("Server started ");

        dbName = "carsellingsystemdb";
        userID = "root";
        password = "";
        createAConnectionObject();

        try {
            
            serverSocket = new ServerSocket(4000);

            while (true) {
                
                Socket socket = serverSocket.accept();
                clientno++;
                serverTextArea.append("\nClient #" + clientno + " Connected");
                ThreeTierDatabaseApplicationHandleClient task = new ThreeTierDatabaseApplicationHandleClient(socket, clientno);
                Thread thread = new Thread(task);
                thread.start();
            }

        } catch (IOException ex) {
            System.out.print("\n" + ex.getMessage());
        }

    }

    private class ThreeTierDatabaseApplicationHandleClient implements Runnable {

        private Socket socket;
        private ObjectInputStream inputClient;
        private ObjectOutputStream outputToClient;
        private int clinetNo;

        ThreeTierDatabaseApplicationHandleClient(Socket socket, int clientNo) {
            this.socket = socket;
            this.clinetNo = clientNo;
        }

        @Override
        public void run() {

            try {
                
                inputClient = new ObjectInputStream(socket.getInputStream());

                
                outputToClient = new ObjectOutputStream(socket.getOutputStream());
                while (true) {
                    
                    Car car = (Car) inputClient.readObject();
                    String operation = inputClient.readUTF();
                    if (operation.equals("Insert")) {
                        insertCarInformation(car);
                    } else if (operation.equals("Update")) {
                        updateCarInfo(car);
                    } else if (operation.equals("Search")) {
                        searchCarInformation(car);
                    }
                }
            } catch (ClassNotFoundException ex) {
                System.out.print(ex.getMessage());
            } catch (IOException ex) {
                System.out.print(ex.getMessage());
            } finally {
                try {
                    outputToClient.close();
                    inputClient.close();
                    socket.close();
                } catch (IOException ex) {
                }

            }

        }

        private void updateCarInfo(Car car) {
            String msg = "";
            if (conn != null) {
                String SQL = "UPDATE carinfo SET cartype = '" + car.getCarType() + "', "
                        + "carmaker = '" + car.getCarMaker() + "', "
                        + "carmodel = '" + car.getCarModel() + "', "
                        + "minprice = '" + car.getMinPrice() + "', "
                        + "maxprice = '" + car.getMaxPrice() + "', "
                        + "carstyle = '" + car.getStyle() + "', "
                        + "drivetype = '" + car.getDriveType() + "', "
                        + "manufacturingyear = '" + car.getManufacturingYear() + "', "
                        + "enginesize = '" + car.getEngineSize() + "' "
                        + "where carid = '" + car.getCarId() + "'";
                serverTextArea.append("\n" + SQL);
                Statement statement;
                try {
                    statement = conn.createStatement();
                    statement.executeUpdate(SQL);
                    msg = "\nClinet#" + clinetNo + ": Data updated Succesfully";

                } catch (SQLException ex) {
                    msg = "\nClinet#" + clinetNo + ": Error Occured in updating to database";
                }
                serverTextArea.append("\n" + msg);
                try {
                    outputToClient.writeUTF("\n" + msg);
                    outputToClient.flush();
                } catch (IOException ex) {
                    serverTextArea.append("\nClinet#" + clinetNo + ": " + ex.getMessage());
                }
            } else {
                serverTextArea.append("\nClinet#" + clinetNo + ": Database Connection Failed");
            }
        }

        private void searchCarInformation(Car car) {
            if (conn != null) {
                String SQL = "SELECT * FROM carinfo WHERE carid = '" + car.getCarId() + "'";
                Statement statement;
                System.out.println(SQL);
                try {
                    statement = conn.createStatement();
                    ResultSet rs = statement.executeQuery(SQL);
                    boolean found = false;
                    while (rs.next()) {
                        found = true;
                        car.setCarId(rs.getString(1));
                        car.setCarType(rs.getString(2));
                        car.setCarMaker(rs.getString(3));
                        car.setCarModel(rs.getString(4));
                        car.setMinPrice(rs.getDouble(5));
                        car.setMaxPrice(rs.getDouble(6));
                        car.setStyle(rs.getString(7));
                        car.setDriveType(rs.getString(8));
                        car.setManufacturingYear(rs.getString(9));
                        car.setEngineSize(rs.getString(10));

                        
                        outputToClient.writeObject(car);
                        outputToClient.writeUTF("Car id found successfully");
                        outputToClient.flush();
                        serverTextArea.append("\nClinet#" + clinetNo + ": Car id found successfully");

                    }
                    if (!found) {
                        outputToClient.writeObject(car);
                        outputToClient.writeUTF("\nCar id not found");
                        outputToClient.flush();
                        serverTextArea.append("\nClinet#" + clinetNo + ": No Car id found");
                    }
                } catch (SQLException ex) {
                    serverTextArea.append("\nClinet#" + clinetNo + ": No Record found");
                } catch (IOException ex) {
                    serverTextArea.append("\nClinet#" + clinetNo + ": Unable to send data to client");
                }
            } else {
                serverTextArea.append("\nClinet#" + clinetNo + ": Database Connection Failed");
            }
        }

        private void insertCarInformation(Car car) {
            String msg = "";
            if (conn != null) {
                String SQL = "INSERT INTO carinfo  VALUES ('"
                        + car.getCarId() + "','"
                        + car.getCarType() + "','"
                        + car.getCarMaker() + "','"
                        + car.getCarModel() + "','"
                        + car.getMinPrice() + "','"
                        + car.getMaxPrice() + "','"
                        + car.getStyle() + "','"
                        + car.getDriveType() + "','"
                        + car.getManufacturingYear() + "','"
                        + car.getEngineSize() + "')";
                System.out.println(SQL);
                Statement statement;
                try {
                    statement = conn.createStatement();
                    statement.executeUpdate(SQL);
                    msg = "\nClinet#" + clinetNo + ": Data Inserted Succesfully";
                } catch (SQLException ex) {
                    msg = "\nClinet#" + clinetNo + ": Data Inserted UnSuccesfully";
                }
                serverTextArea.append(msg);
                try {
                    outputToClient.writeUTF(msg);
                    outputToClient.flush();
                } catch (IOException ex) {
                    serverTextArea.append("\nClinet#" + clinetNo + ": n" + ex.getMessage());
                }
            } else {
                serverTextArea.append("\nClinet#" + clinetNo + ": Database Connection Failed");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        serverTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        serverTextArea.setColumns(20);
        serverTextArea.setRows(5);
        jScrollPane1.setViewportView(serverTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAConnectionObject() {
        try {
            String URL = "jdbc:mysql://localhost:3306/" + dbName;
            Class.forName("com.mysql.jdbc.Driver"); // Load ODBC driver
            conn = DriverManager.getConnection(URL, userID, password);
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFound: " + ex.getMessage());
        }
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
            java.util.logging.Logger.getLogger(ServerApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServerApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServerApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerApps.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new ServerApps();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea serverTextArea;
    // End of variables declaration//GEN-END:variables
}
