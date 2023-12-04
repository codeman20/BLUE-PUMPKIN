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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author test2
 */
public class login extends HttpServlet {

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

            //        GETTING ATTRIBUTES FROM THE UI FORM ON THE LOGIN.JSP PAGE
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String role = request.getParameter("user");

//                       GETTING DATA FROM login_tbl IN THE DATABASE
            String sql = "SELECT * FROM login_tbl WHERE email = ? and password = ? and role = ?";
            pre = con.prepareStatement(sql);
            pre.setString(1, email);
            pre.setString(2, password);
            pre.setString(3, role);

            //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
            ResultSet result = pre.executeQuery();
            String fullname = "";

            if (result.next()) {

                String employee_number = result.getString("employee_id");

                //                       GETTING DATA FROM employee_tbl IN THE DATABASE
                String sql2 = "SELECT * FROM employee_tbl WHERE employee_id = ?";
                pre = con.prepareStatement(sql2);
                pre.setString(1, employee_number);

                ResultSet result2 = pre.executeQuery();
                //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE

                while (result2.next()) {
                    String fname = result2.getString("firstname");
                    String lname = result2.getString("lastname");
                    fullname = fname + " " + lname;
                }

//                CREATION OF A SESSION WHICH WILL HOLD USER DATA
                HttpSession session = request.getSession();
                session.setAttribute("Ename", fullname);
                session.setAttribute("Enumber", employee_number);
                session.setAttribute("Erole", role);
                request.getRequestDispatcher("administration.jsp").forward(request, response);
            } else {
                //REDIRECTION
                response.sendRedirect("login.jsp");
            }

            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
