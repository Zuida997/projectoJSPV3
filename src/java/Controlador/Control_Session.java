/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author maxim
 */
@WebServlet(name = "Control_Session", urlPatterns = {"/Control_Session"})
public class Control_Session extends HttpServlet {
    Conexion conexion = new Conexion();
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
            
            String usu,pass,sql;
            usu=request.getParameter("usuario");
            pass=request.getParameter("pass");
            
            Connection conect;
            ResultSet rs;
            sql="SELECT * FROM tbl_usuarios WHERE correoUsuario= '"+usu+"' AND claveUsuario= '"+pass+"' ";
            
                try{
                    conect = conexion.Conexion();
                    PreparedStatement st=conect.prepareStatement(sql);
                    rs = st.executeQuery();
                    if(rs.next()){
                        String rut,nom,ape;
                        int pu;
                        rut=rs.getString(1);
                        nom=rs.getString(2);
                        ape=rs.getString(3);
                        pu=rs.getInt(11);
                        Usuario modUser = new Usuario(rut,nom,ape,pu);
                        HttpSession session=request.getSession();
                        session.setAttribute("idUser",modUser);
                        switch(modUser.getPrivUsuario()){
                            case 1:
                                response.sendRedirect("Vista/User/Catalogo.jsp");
                                break;
                            case 2:
                                response.sendRedirect("Vista/adm/Administrador.jsp");
                                break;
                            case 3:
                                response.sendRedirect("Vista/UserIngresoCabaña/CatalogoIngresoCabaña.jsp");
                                break;
                            default:
                                response.sendRedirect("index.jsp");
                                break;
                        }
                    }else{
                        response.sendRedirect("index.jsp");

                    }
                }catch(SQLException ex){
                    out.println(ex.getMessage());
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
