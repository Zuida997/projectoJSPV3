/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
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
    Control_Conexion con=new Control_Conexion();
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
                HttpSession sesion=request.getSession();
                String usu=(String)request.getParameter("usuario");
                String pass=(String)request.getParameter("pass");
                String sql="SELECT * FROM usuarios WHERE estado = 1 AND alias='"+usu+"' AND clave='"+pass+"'";
                ResultSet res=con.consultar(sql);
                try{
                    while(res.next()){
                        switch (res.getInt(4)) {
                            case 1:
                                //cambiar luego a la pagina administracion
                                response.sendRedirect("Vista/Principal_Adm.jsp");
                                break;
                            case 2:
                                //cambiar luego a la pagina para usuarios comunes
                                response.sendRedirect(null);
                                break;
                            case 3:
                                //cambiar luego a la pagina pagina comun con permisos para agregar cabañas
                                response.sendRedirect(null);
                                break;
                            default:
                                break;
                        }
                    }

                }catch(Exception ex){}
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
