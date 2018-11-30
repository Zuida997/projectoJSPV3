/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author xzur
 */
public class Conexion {
    public String driver = "com.mysql.jdbc.Driver";
    public String database = "bd_proyectojsp2";
    public String hostname= "localhost:3306";
    public String url = "jdbc:mysql://" + hostname + "/" + database + "?useSSL=false";
    public String user = "root";
    public String password = "";
    
    
    public Connection Conexion(){
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        return conn;
    }
    
}
