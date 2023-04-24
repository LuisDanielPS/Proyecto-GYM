/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import CONEXION.conexion_Oracle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test1 {

    public static void main(String[] args) {

        String sSQL = "";
        conexion_Oracle conexion = new conexion_Oracle();

        
        
        try{
    sSQL = "SELECT * FROM CLIENTES";
        Connection con = conexion.conectar();
        Statement cn = con.createStatement();
        ResultSet res = cn.executeQuery(sSQL);

        while (res.next()) {
            System.out.println("-----------------");
            System.out.println(res.getInt("IDCLIENTE"));
            System.out.println(res.getString("NOMBRE"));
            System.out.println(res.getString("APELLIDO"));
        }

    }
    catch (SQLException e
    
        ){
    System.out.println(e);
    }
    }

    

}
