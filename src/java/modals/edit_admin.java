/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modals;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
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
public class edit_admin extends HttpServlet {

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

//         RESOURCE CODE FOR PRINTWRITER
            PrintWriter out = response.getWriter();
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

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE ADMINISTRATION.JSP PAGE
            String ev_type = request.getParameter("ev_type");
            String agenda = request.getParameter("agenda");
            String part = request.getParameter("part");
            String duration = request.getParameter("duration");
            String start_date = request.getParameter("start_date");
            String end_date = request.getParameter("end_date");
            String location = request.getParameter("location");
            String descrip = request.getParameter("info");
            String e_id = request.getParameter("e_id");
            Part filePart = request.getPart("event_img");

            InputStream inputStream = null;
            inputStream = filePart.getInputStream();

            //                     EDITING DATA FROM event_tbl IN THE DATABASE
            pre = con.prepareStatement("update event_tbl set agenda=?,event_type=?,participates=?,duration=?,start_date=?,end_date=?,location=?,description=?,event_img=? where event_id=?");
            pre.setString(2, agenda);
            pre.setString(1, ev_type);
            pre.setString(3, part);
            pre.setString(4, duration);
            pre.setString(5, start_date);
            pre.setString(6, end_date);
            pre.setString(7, location);
            pre.setString(8, descrip);
            pre.setBlob(9, inputStream);
            pre.setInt(10, Integer.parseInt(e_id));

            pre.executeUpdate();

            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();

            //REDIRECTION
            response.sendRedirect("administration.jsp");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(edit_winnings.class.getName()).log(Level.SEVERE, null, ex);
            out.print(ex);
        } catch (SQLException ex) {
            Logger.getLogger(edit_admin.class.getName()).log(Level.SEVERE, null, ex);
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
