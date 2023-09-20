/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author diego
 */
public class ConexionDB {
    Connection conexion;
    private String host = "127.0.0.1";
    private String port = "3306";
    private String dbName = "retailer";
    private String userName = "root";
    private String userPass = "Molina2609";
    
    public ConexionDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://" + this.host + ":" + this.port + "/" + this.dbName;
            conexion = DriverManager.getConnection(url, this.userName, this.userPass);
            System.out.println("Conexion Exitosa");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error, no se conecto");
        }
    }
    public void desconectar(){
        try{
            conexion.close();
        }catch (SQLException e){
        }
    }
}
