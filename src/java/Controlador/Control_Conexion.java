/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author maxim
 */
public class Control_Conexion {
        private static Connection conexion;
    private static String url="jdbc:mysql://localhost:3306/systemmedico"+"?useTimezone=true&serverTimezone=UTC";
    private static String user="root";
    private static String clave="";
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(url,user,clave);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conexion;
    }
    public Connection getConexion(){
        return this.conexion;
    }
    public void setConexion(Connection conexion){
        this.conexion=conexion;
    }
    public boolean ejecutar(String sql){ //INSERT, UPDATE, DELETE
        boolean a;
        try{
            Statement st = conexion.createStatement();
            st.executeUpdate(sql);
            st.close();
            a=true;
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            a= false;
        }
        return a;
    }
    public ResultSet consultar(String sql) {//consultas sql (SELECT)
        ResultSet resultado;
        try {
            Statement st = conexion.createStatement();
            resultado = st.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }        return resultado;
    }
}
