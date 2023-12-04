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
public class winnings extends HttpServlet {

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

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE WINNINGS.JSP PAGE
            String Firstname = request.getParameter("Firstname");
            String Lastname = request.getParameter("Lastname");
            String EmployeeNumber = request.getParameter("EmployeeNumber");
            String CompetitionName = request.getParameter("CompetitionName");
            String Ranking = request.getParameter("Ranking");
            String Event_id = request.getParameter("Event_id");
            String Award = request.getParameter("Award");
            Part AwardImage = request.getPart("AwardImage");
            Part EmployeeImage = request.getPart("EmployeeImage");

            InputStream inputStream, inputStream2;
            inputStream2 = null;
            inputStream = null;

            inputStream = AwardImage.getInputStream();
            inputStream2 = EmployeeImage.getInputStream();

            //                       INSERTING DATA INTO winners IN THE DATABASE
            pre = con.prepareStatement("insert into winners(firstname,lastname,employeee_id,award,award_img,competition_name,ranking,event_id,emp_image) values(?,?,?,?,?,?,?,?,?)");// TODO add your handling code here:

            pre.setString(1, Firstname);
            pre.setString(2, Lastname);
            pre.setString(3, EmployeeNumber);
            pre.setString(4, Award);
            pre.setBlob(5, inputStream);
            pre.setString(6, CompetitionName);
            pre.setInt(7, Integer.parseInt(Ranking));
            pre.setInt(8, Integer.parseInt(Event_id));
            pre.setBlob(9, inputStream2);

            pre.executeUpdate();
            //REDIRECTION

            response.sendRedirect("winnings.jsp");

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
