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
import javax.servlet.http.HttpSession;
/**
 *
 * @author xzur
 */
@WebServlet(name = "Control_Ingreso", urlPatterns = {"/Control_Ingreso"})
public class Control_Ingreso extends HttpServlet {

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
            if(request.getParameter("btnIngreso")!=null){
                String user = request.getParameter("usuario");
                String clave = request.getParameter("pass");
                Conexion conexion = new Conexion();
                try{
                    Connection conect = conexion.Conexion();
                    PreparedStatement st = conect.prepareStatement("SELECT COUNT(*) FROM tbl_usuarios WHERE rutUsuario='"+user+"' AND claveUsuario='"+clave+"'");
                    ResultSet rs = st.executeQuery();
                    while(rs.next()){
                        if(rs.getInt(1) == 1){
                            // AQUI DEBERIA CONSULTAR A LA BASE DE DATOS LOS DATOS DEL USUARIO Y LUEGO CREAR UN 
                            // OBJETO DE USUARIO, LUEGO RESCATAR LOS PRIVILEGIOS DEL USUARIO
                            // Y CONDICIONAR.
                            response.sendRedirect("Vista/User/Catalogo.jsp");
                        }else{
                            response.sendRedirect("index.jsp");
                        }
                    }
                }catch(SQLException e){
                   System.out.print(e.getMessage());
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
