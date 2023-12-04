/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
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
import javax.servlet.http.Part;

/**
 *
 * @author test2
 */
public class register_event extends HttpServlet {

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        //     RESOURCE CODE FOR PRINTWRITER
        PrintWriter sout = response.getWriter();
        try {
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
            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE REGISTER_EVENT.JSP PAGE
            String agenda = request.getParameter("agenda");
            String event_type = request.getParameter("event_type");
            String Participates = request.getParameter("Participates");
            String Duration = request.getParameter("Duration");
            String StartDate = request.getParameter("StartDate");
            String EndDate = request.getParameter("EndDate");
            String Location = request.getParameter("Location");
            String description = request.getParameter("description");
            Part filePart = request.getPart("ev_img");

            InputStream inputStream = null;
            inputStream = filePart.getInputStream();

            //                       INSERTING DATA INTO event_tbl IN THE DATABASE
            pre = con.prepareStatement("insert into event_tbl(agenda,event_type,participates,duration,start_date,end_date,location,description,event_img) values(?,?,?,?,?,?,?,?,?)");// TODO add your handling code here:

            pre.setString(1, agenda);
            pre.setString(2, event_type);
            pre.setString(3, Participates);
            pre.setString(4, Duration);
            pre.setString(5, StartDate);
            pre.setString(6, EndDate);
            pre.setString(7, Location);
            pre.setString(8, description);
            pre.setBlob(9, inputStream);

            pre.executeUpdate();
            response.sendRedirect("administration.jsp");

            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(register_event.class.getName()).log(Level.SEVERE, null, ex);
            sout.print(ex);
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
