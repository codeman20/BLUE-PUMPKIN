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
public class register extends HttpServlet {

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
//        TRY WITH RESOURCE CODE FOR PRINTWRITER
        try (PrintWriter out = response.getWriter()) {

            //                    DATABASE & CONNETCION
            String dburl = "jdbc:mysql://localhost:3306/blue_pumpkin";
            String dbuname = "root";
            String dbpassword = "";
            String dbdriver = "com.mysql.jdbc.Driver";
            Class.forName(dbdriver);
            //                END OF DATABASE & CONNETCION

//        GETTING ATTRIBUTES FROM THE UI FORM ON THE REGISTRATION.JSP PAGE
            String user = request.getParameter("user");
            String firstName = request.getParameter("firstname");
            String lastName = request.getParameter("lastname");
            String employee = request.getParameter("employee");
            String password = request.getParameter("password");
            String phonetxt = request.getParameter("phone");
            String email = request.getParameter("email");
            String passwordConfirm = request.getParameter("passwordConfirm");

//               CONVERTING STRING INTO INTERGER
            int phone = Integer.parseInt(phonetxt);

            if (password.equals(passwordConfirm)) {
                //Connection
                Connection con;
                try {

//                       INSERTING DATA INTO EMPLOYEE_TBL IN THE DATABASE
                    con = DriverManager.getConnection(dburl, dbuname, dbpassword);
                    String sql;
                    sql = "insert into employee_tbl(employee_id,firstname,lastname,email,phone_num,role,password) values('" + employee + "','" + firstName + "','" + lastName + "','" + email + "',"
                            + "'" + phone + "','" + user + "','" + password + "')";

                    //                       INSERTING DATA INTO LOGIN_TBL IN THE DATABASE
                    String login;
                    login = "insert into login_tbl(employee_id,email,password,role) values('" + employee + "','" + email + "','" + password + "','" + user + "')";

                    PreparedStatement ps = con.prepareStatement(sql);
                    PreparedStatement ps2 = con.prepareStatement(login);

                    ps.executeUpdate(sql);
                    ps2.executeUpdate(login);

                    response.sendRedirect("registration.jsp");

//                    CLOSSING ALL RESOURCES
                    con.close();
                    ps.close();
                    ps2.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                    out.print(e);
                }
            } else {
                out.print("false inputs");
                out.println(user);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
