<%-- 
    Document   : index
    Created on : Mar 20, 2023, 9:10:26 AM
    Author     : test2
--%>


<!--JSP IMPORTS-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>



<%
    //    GETTING SESSION OF EMPLOYEE NUMBER

    int image_number = 6;

    try {
        //                    DATABASE & CONNETCION

        Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    Connection connection = null;
    try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
        //                END OF DATABASE & CONNETCION
        //            GETTING EVENT INFO USING A SESSION NAMED EVENT_ID FROM DB
        PreparedStatement ps = connection.prepareStatement("select * from event_tbl where event_id= '" + image_number + "'");
        ResultSet rs = ps.executeQuery();

//          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
        if (rs.next()) {
            Blob blob = rs.getBlob("event_img");
            byte byteArray[] = blob.getBytes(1, (int) blob.length());
            response.setContentType("image/gif");
            OutputStream os = response.getOutputStream();
            os.write(byteArray);
            os.flush();
            os.close();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        out.print(ex);
    } //CLOSE ALL RESOURCES
    finally {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
%>





