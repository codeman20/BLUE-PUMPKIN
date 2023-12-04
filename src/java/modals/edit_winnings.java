package modals;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
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
public class edit_winnings extends HttpServlet {

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
            String firstname = request.getParameter("fname");
            String lastname = request.getParameter("lname");
            String employeee_id = request.getParameter("emp_name");
            String award = request.getParameter("award");
            String competition_name = request.getParameter("comp_name");
            String event_id = request.getParameter("ename");
            String ranking = request.getParameter("rank");
            String e_id = request.getParameter("e_id");

//                       UPDATING DATA FROM winners IN THE DATABASE
            pre = con.prepareStatement("update winners set firstname=?,lastname=?,employeee_id=?,award=?,competition_name=?,event_id=?,ranking=? where id=?");
            pre.setString(1, firstname);
            pre.setString(2, lastname);
            pre.setString(3, employeee_id);
            pre.setString(4, award);
            pre.setString(5, competition_name);
            pre.setInt(6, Integer.parseInt(event_id));
            pre.setInt(7, Integer.parseInt(ranking));
            pre.setInt(8, Integer.parseInt(e_id));

            pre.executeUpdate();

            //                    CLOSSING ALL RESOURCES
            con.close();
            pre.close();

            //REDIRECTION
            response.sendRedirect("winnings.jsp");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(edit_winnings.class.getName()).log(Level.SEVERE, null, ex);
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
