package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class employee_005fmanipulate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Blue Pumpkin</title>\n");
      out.write("          <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Table-With-Search-1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Table-With-Search.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("  <div id=\"wrapper\">\n");
      out.write("      \n");
      out.write("        <nav class=\"navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0\">\n");
      out.write("            <div class=\"container-fluid d-flex flex-column p-0\">\n");
      out.write("                <a class=\"navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0\" href=\"#\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\"><i class=\"fab fa-weibo\"></i></div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\"><span>Blue Pumpkin</span> ");
 String username=session.getAttribute("Ename").toString(); 
      out.write("\n");
      out.write("                                        <h3> My name is ");
      out.print( username);
      out.write("</h3></div>\n");
      out.write("                </a>\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("                <ul class=\"nav navbar-nav text-light\" id=\"accordionSidebar\">\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"administration.jsp\"><i class=\"fas fa-tachometer-alt\"></i><span>Dashboard </span></a></li>\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link \" href=\"profile.jsp\"><i class=\"fas fa-user\"></i><span>Profile</span></a></li>\n");
      out.write("                \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"registration.jsp\"><i class=\"fas fa-users\"></i><span>Registration</span></a>\n");
      out.write("               \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"winnings.jsp\"><i class=\"fas fa-user-friends\"></i><span>Winnings</span></a></li>\n");
      out.write("              \n");
      out.write("                        <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link \" href=\"requested_events.jsp\"><i class=\"fab fa-product-hunt\"></i><span>Requested events</span></a></li>\n");
      out.write("                  \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"#\"><i class=\"fas fa-money-check-alt\"></i><span>Remove Employee</span></a></li>\n");
      out.write("                    \n");
      out.write("<!--                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"department.jsp\"><i class=\"fas fa-table\"></i><span>Department</span></a></li>\n");
      out.write("                      \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"reports.jsp\"><i class=\"fas fa-table\"></i><span>Reports</span></a></li>-->\n");
      out.write("                </ul><button class=\"btn rounded-circle border-0\" id=\"sidebarToggle\" type=\"button\"></button>\n");
      out.write("                <div class=\"text-center d-none d-md-inline\"></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    \n");
      out.write("\t<div class=\"table-responsive pt-3\">\n");
      out.write("\t\t<div class=\"table-wrapper\">\n");
      out.write("\t\t\t<div class=\"table-title\">\n");
      out.write(" <h3 class=\"text-dark mb-4\">Delete Employee</h3>\n");
      out.write("\t\t\t<table class=\"table table-striped table-hover\" id=\"myTable\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t<th>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"selectAll\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"selectAll\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</th>\n");
      out.write("\t\t\t\t\t\t<th>Firstname</th>\n");
      out.write("\t\t\t\t\t\t<th>Lastname</th>\n");
      out.write("                                                <th>Employee Number</th>\n");
      out.write("\t\t\t\t\t\t<th>Email</th>\n");
      out.write("                                                <th>Phone Number</th>\n");
      out.write("                                                <th>Role</th>        \n");
      out.write("                                                <th>Action</th>                           \n");
      out.write("                      \n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("                                               ");

                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                            ResultSet resultSet;
                                            Statement st = conn.createStatement();
                                            String sql = "select * from employee_tbl";
                                            resultSet = st.executeQuery(sql);
                                            int id=1;
                                            while (resultSet.next()) {
                                                
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("\t\t\t\t\t\t\t<span class=\"custom-checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"checkbox1\" name=\"options[]\" value=\"1\">\n");
      out.write("\t\t\t\t\t\t\t\t<label for=\"checkbox1\"></label>\n");
      out.write("\t\t\t\t\t\t\t</span>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("firstname") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("lastname") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("employee_id") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("email") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("phone_num") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("role") );
      out.write("</td>\n");
      out.write("                                             \n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("<a href=\"#deleteEmployeeModal\" class=\"delete\" data-toggle=\"modal\"><i class='fas fa-trash-alt' data-toggle=\"tooltip\" onclick=\"getdeletId(<c:out value='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${row.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'/>)\" title=\"Delete\">&#xE872;</i></a>\n");
      out.write("\t\t\t\t\t\t</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                                       \n");
      out.write("                                        ");

                       id++; }
                        
                        conn.close();
                        } catch (Exception e) {
                        e.printStackTrace();
                            out.print(e);
                        }
                        
      out.write("\n");
      out.write("                                         \n");
      out.write("\t\t\t\t</tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>        \n");
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("                                                \n");
      out.write("                                                 <!-- Delete Modal HTML -->\n");
      out.write("                                                <div id=\"deleteEmployeeModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("                    <form action=\"delete-promotion\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">Delete Employee</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Are you sure you want to delete these Records? </p>\n");
      out.write("                                        <span id=\"deleteIdValue\"></span>\n");
      out.write("\t\t\t\t\t<p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                        <div class=\"modal-footer\">\n");
      out.write("                            <input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("                            <input type=\"submit\" class=\"btn btn-danger\" value=\"Delete\">\n");
      out.write("                        </div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("                                                 \n");
      out.write("                                                   <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/chart.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js\"></script>\n");
      out.write("    <script src=\"assets/js/Table-With-Search.js\"></script>\n");
      out.write("    <script src=\"assets/js/theme.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
