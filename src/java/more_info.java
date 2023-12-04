/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
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
public class more_info extends HttpServlet {

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
        PrintWriter sout = response.getWriter();
        try {

            //                    DATABASE & CONNETCION
            String dburl = "jdbc:mysql://localhost:3306/blue_pumpkin";
            String dbuname = "root";
            String dbpassword = "";
            String dbdriver = "com.mysql.jdbc.Driver";
            FileInputStream fis;
            Class.forName(dbdriver);

            Connection con;
            PreparedStatement pre;
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
            //                END OF DATABASE & CONNETCION

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE MORE_INFO.JSP PAGE
            String employee_id = request.getParameter("employee_num");
            String dob = request.getParameter("dob");
            String DOB = dob.substring(5, 10);
            sout.print(DOB);
            String age = request.getParameter("age");
            String gender = request.getParameter("gender");
            Part filePart = request.getPart("image");

            InputStream inputStream = null;
            inputStream = filePart.getInputStream();

            //                       INSERTING DATA INTO profile_tbl IN THE DATABASE
            pre = con.prepareStatement("insert into profile_tbl(employee_id,DOB,age,gender,picture) values(?,?,?,?,?)");// TODO add your handling code here:

            pre.setString(1, employee_id);
            pre.setString(2, DOB);
            pre.setString(3, age);
            pre.setString(4, gender);
            pre.setBlob(5, inputStream);

            pre.executeUpdate();
            response.sendRedirect("profile.jsp");

            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(more_info.class.getName()).log(Level.SEVERE, null, ex);
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
