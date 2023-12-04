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
public class approve extends HttpServlet {

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

        processRequest(request, response);

        //     RESOURCE CODE FOR PRINTWRITER
        PrintWriter out = response.getWriter();
        try {
            processRequest(request, response);

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE REQUESTED_EVENTS.JSP PAGE
            String e_id = request.getParameter("d_e_id");
            String employee_num = request.getParameter("employee_num");
//            SETTING THE STATUS TO "APPROVED"  BY ADMINISTRATOR
            String approval = "Approved";

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

            //                       UPDATING DATA FROM request_response_tbl IN THE DATABASE
            pre = con.prepareStatement("update request_response_tbl set status=? where event_id=? && employee_id=?");
            pre.setString(1, approval);
            pre.setInt(2, Integer.parseInt(e_id));
            pre.setString(3, employee_num);
            pre.executeUpdate();

            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();

            //REDIRECTION
            response.sendRedirect("requested_events.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(delete_winnings.class.getName()).log(Level.SEVERE, null, ex);
            out.print(ex);
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
