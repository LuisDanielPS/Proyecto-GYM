/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXION;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import javax.swing.JOptionPane; 

public class conexion_Oracle {
    
    private final String DRIVER = "oracle.jdbc.OracleDriver";
    private final String URL =  "jdbc:oracle:thin:@localhost:1521:orcl";                              //"jdbc:oracle:thin:@//localhost:1521:orcl";
    private final String USER = "GYM";
    private final String PASSWORD = "123";
    public Connection cadena;

    public conexion_Oracle() {
        this.cadena = null;
    }
    
      public Connection conectar() {
        try {
            Class.forName(DRIVER);
            this.cadena = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
        return this.cadena;
    }

        public void desconectar() {
        try {
            this.cadena.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

}
 






   

  
  

