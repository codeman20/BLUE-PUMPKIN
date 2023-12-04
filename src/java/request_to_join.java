/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class request_to_join extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        //     RESOURCE CODE FOR PRINTWRITER
        PrintWriter sout = response.getWriter();

        try {
            processRequest(request, response);

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

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE REQUEST_TO_JOIN.JSP PAGE
            String agenda = request.getParameter("agenda");
            String event_type = request.getParameter("event_type");
            String start_date = request.getParameter("start_date");
            String emp_id = request.getParameter("emp_id");
//             SETTING THE STATUS TO "NOT APPROVED" INTO TABLE BEFORE IT CAN BE APPROVED BY ADMIN
            String status = "Not Approved";

            //                       INSERTING DATA INTO request_response_tbl IN THE DATABASE
            pre = con.prepareStatement("insert into request_response_tbl(employee_id,event_type,start_date,status,agenda) values(?,?,?,?,?)");// TODO add your handling code here:
            pre.setString(1, emp_id);
            pre.setString(2, event_type);
            pre.setString(3, start_date);
            pre.setString(4, status);
            pre.setString(5, agenda);

            pre.executeUpdate();
            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();
            //REDIRECTION
            response.sendRedirect("index.jsp");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            sout.print(ex);
            System.out.println("employee id = ");
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
