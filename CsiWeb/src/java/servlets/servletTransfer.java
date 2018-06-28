/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andreslt
 */
public class servletTransfer extends HttpServlet {

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

            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int edad;
            double estatura;
            double peso;
            if (!request.getParameter("edad").isEmpty())
                edad = Integer.parseInt(request.getParameter("edad"));
            else 
                edad = 0;
            if(!request.getParameter("estatura").isEmpty())
                estatura = Double.parseDouble(request.getParameter("estatura"));
            else 
                estatura = 0.0;
            if(!request.getParameter("peso").isEmpty())
                peso = Double.parseDouble(request.getParameter("peso"));
            else
                peso = 0.0;
            
            String selector = request.getParameter("select");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletTransfer</title>");
            out.println("</head>");
            out.println("<body background = 'img/wood.jpg'>");
            out.println("<h1> Hola " + nombre + " " + apellido + " " + edad + " " + estatura + " " + peso);
            
            if (selector == "administrativo") {
                String departamento = request.getParameter("departamento");
                double salario = Double.parseDouble(request.getParameter("salario"));

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
