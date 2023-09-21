/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

import java.sql.*;
/**
 *
 * @author diego
 */
public class ConexionDB {
    Connection conexion;
    private String host = "retailerdb.c97ylrd8k5vq.us-east-1.rds.amazonaws.com";
    private String port = "3306";
    private String dbName = "retailer";
    private String userName = "admin";
    private String userPass = "admin123";

        
    
    public ConexionDB(){
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://" + this.host +":" + this.port + "/" + this.dbName;
            conexion = DriverManager.getConnection(url, this.userName, this.userPass);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    public void desconectar(){
        try{
            conexion.close();
        }catch (SQLException e){
        }
    }
}
