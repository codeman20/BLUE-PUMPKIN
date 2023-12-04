/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modals;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author test2
 */
public class delete_winnings extends HttpServlet {

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE ADMINISTRATION.JSP PAGE
            String e_id = request.getParameter("d_e_id");

            //                    DATABASE & CONNETCION
            String dburl = "jdbc:mysql://localhost:3306/blue_pumpkin";
            String dbuname = "root";
            String dbpassword = "";
            String dbdriver = "com.mysql.jdbc.Driver";
            Class.forName(dbdriver);

            Connection con;
            PreparedStatement pre;
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
            //                END OF DATABASE & CONNETCION

            //                     DELETING DATA FROM winners IN THE DATABASE
            pre = con.prepareStatement("DELETE FROM winners where id=?");
            pre.setString(1, e_id);
            pre.executeUpdate();
            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();

            //REDIRECTION
            response.sendRedirect("winnings.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(delete_winnings.class.getName()).log(Level.SEVERE, null, ex);
        }

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
