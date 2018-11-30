/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author xzur
 */
@WebServlet(name = "Control_Registro", urlPatterns = {"/Control_Registro"})
public class Control_Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            if(request.getParameter("btnRegistrar") != null){
                String rut = request.getParameter("rut");
                String dv = request.getParameter("dv");
                Modulo11 modulo = new Modulo11();
                String Rut = rut + dv;
                if(modulo.validarRut(Rut)==true){
                    Conexion conexion = new Conexion();
                    String nombre = request.getParameter("txtNombre");
                    String apellidos = request.getParameter("txtApellidos");
                    String pass = request.getParameter("txtPass");
                    String domicilio = request.getParameter("txtDomicilio");
                    String strFecha = request.getParameter("dtpFecha");
                    int renta = Integer.parseInt(request.getParameter("txtRenta"));
                    Date fecha = null;
                    int familia;
                    if(request.getParameter("rdbFamilia").equals("0")){
                        familia = 0;
                    }else{
                        familia = 1;
                    }
                    int privilegios = 0;
                    
                    try{
                        Connection conn = conexion.Conexion();
                        PreparedStatement st = conn.prepareStatement("INSERT INTO tbl_usuarios VALUES (?,?,?,?,?,?,?,?,?,?)"); 
                        st.setString(1, null);
                        st.setString(2, Rut);
                        st.setString(3, nombre);
                        st.setString(4, apellidos);
                        st.setString(5, pass);
                        st.setString(6, domicilio);
                        st.setInt(7, renta);
                        st.setString(8, strFecha);
                        st.setInt(9,familia);
                        st.setInt(10, privilegios);
                        st.executeUpdate();
                        out.print("INGRESADO CORRECTAMENTE");
                    }catch(SQLException e){
                        out.print(e.getMessage());
                    }
                    
                    
                }else{
                    response.sendRedirect("index.jsp");
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
