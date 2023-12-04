package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.Connection;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String fn,ln,ep,em,ph,ro; 
 String an; 
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Profile - Blue Pumpkin</title>\n");
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
      out.write("        <div id=\"wrapper\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("             ");
 String username=session.getAttribute("Ename").toString(); 
      out.write("\n");
      out.write("      ");
 String e_role=session.getAttribute("Erole").toString(); 
      out.write("\n");
      out.write("      ");
 String e_number=session.getAttribute("Enumber").toString(); 
      out.write("\n");
      out.write(" \n");
      out.write("      ");

          if((e_role == null)){
              response.sendRedirect("index.jsp");
          }

          
      out.write(" \n");
      out.write("            \n");
      out.write("         <nav class=\"navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0\">\n");
      out.write("            <div class=\"container-fluid d-flex flex-column p-0\">\n");
      out.write("                <a class=\"navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0\" href=\"#\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\"><i class=\"fab fa-weibo\"></i></div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\"><span>Blue Pumpkin</span></div>\n");
      out.write("                </a>\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("                <ul class=\"nav navbar-nav text-light\" id=\"accordionSidebar\">\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"administration.jsp\"><i class=\"fas fa-tachometer-alt\"></i><span>Dashboard </span></a></li>\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"#\"><i class=\"fas fa-user\"></i><span>Profile</span></a></li>\n");
      out.write("                \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"registration.jsp\"><i class=\"fas fa-users\"></i><span>Registration</span></a>\n");
      out.write("               \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"winnings.jsp\"><i class=\"fas fa-user-friends\"></i><span>Winnings</span></a></li>\n");
      out.write("              \n");
      out.write("                        <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link \" href=\"requested_events.jsp\"><i class=\"fab fa-product-hunt\"></i><span>Requested events</span></a></li>\n");
      out.write("                  \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"employee_manipulate.jsp\"><i class=\"fas fa-money-check-alt\"></i><span>Remove Employee</span></a></li>\n");
      out.write("<!--                    \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"department.jsp\"><i class=\"fas fa-table\"></i><span>Department</span></a></li>\n");
      out.write("                      \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"reports.jsp\"><i class=\"fas fa-table\"></i><span>Reports</span></a></li>-->\n");
      out.write("                <!--</ul><button class=\"btn rounded-circle border-0\" id=\"sidebarToggle\" type=\"button\"></button>-->\n");
      out.write("                <div class=\"text-center d-none d-md-inline\"></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("      \n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col\">\n");
      out.write("          \n");
      out.write("        <nav aria-label=\"breadcrumb\" class=\"bg-light rounded-3 p-3 mb-4\">\n");
      out.write("\n");
      out.write("        </nav>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!--<div class=\"row\">-->\n");
      out.write("      <div class=\"col-lg-4 pt-5\">\n");
      out.write("          \n");
      out.write("          ");
      out.write(" \n");
      out.write("                    ");

                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                            ResultSet resultSet;
                                            
                                            Statement st = conn.createStatement();
                                            String sql = "select * from employee_tbl where employee_id='"+e_number+"'";
                                            resultSet = st.executeQuery(sql);
                                             while (resultSet.next()) {
                                               fn=resultSet.getString("firstname");
                                                 ln=resultSet.getString("lastname");
                                                 ep=resultSet.getString("employee_id");
                                                 em=resultSet.getString("email") ;
                                                 ph=resultSet.getString("phone_num");
                                                 ro=resultSet.getString("role");
                                             }    
                        conn.close();
                        } catch (Exception e) {
                        e.printStackTrace();
                            out.print(e);
                        }
                        
      out.write("\n");
      out.write("                                    \n");
      out.write("        <div class=\"card mb-4\">\n");
      out.write("          <div class=\"card-body text-center\">\n");
      out.write("            <img src=\"https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-chat/ava3.webp\" alt=\"avatar\"\n");
      out.write("              class=\"rounded-circle img-fluid\" style=\"width: 150px;\">\n");
      out.write("            <h5 class=\"my-3\">");
      out.print(fn);
      out.write(' ');
      out.write(' ');
      out.print(ln);
      out.write("</h5>\n");
      out.write("            <p class=\"text-muted mb-1\">");
      out.print(ep );
      out.write("</p>\n");
      out.write("            <p class=\"text-muted mb-4\">");
      out.print(em );
      out.write("</p>\n");
      out.write("            <div class=\"d-flex justify-content-center mb-2\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card mb-4 mb-lg-0\">\n");
      out.write("              <p class=\"mb-4 mx-auto mt-3\"><span class=\"text-primary font-italic me-1\">Awards</span> For Me\n");
      out.write("                </p>\n");
      out.write("             \n");
      out.write("          <div class=\"card-body p-0\">\n");
      out.write("              \n");
      out.write("            <ul class=\"list-group list-group-flush rounded-3\">\n");
      out.write("                \n");
      out.write("                 ");
      out.write(" \n");
      out.write("                    ");

                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                            ResultSet resultSet;
                                            
                                            Statement st = conn.createStatement();
                                            String sql = "select * from winners where employeee_id='"+e_number+"'";
                                            resultSet = st.executeQuery(sql);
                                             while (resultSet.next()) {
                                                 an=resultSet.getString("award");
                    
                        
      out.write("\n");
      out.write("              <li class=\"list-group-item d-flex justify-content-between align-items-center p-3\">\n");
      out.write("                <i class=\"fas fa-globe fa-lg text-warning\"></i>\n");
      out.write("                <p class=\"mb-0\">");
      out.print(an);
      out.write("</p>\n");
      out.write("              </li>\n");
      out.write("              ");

                                    }    
                        conn.close();
                        } catch (Exception e) {
                        e.printStackTrace();
                            out.print(e);
                        }
                        
      out.write("\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-6 pt-5\">\n");
      out.write("        <div class=\"card mb-4\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("                       \n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <p class=\"mb-0\">Full Name</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-9\">\n");
      out.write("                <p class=\"text-muted mb-0\">");
      out.print(fn);
      out.write(' ');
      out.print(ln);
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("              <hr>\n");
      out.write("               <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <p class=\"mb-0\">Employee Number</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-9\">\n");
      out.write("                <p class=\"text-muted mb-0\">");
      out.print(ep );
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <p class=\"mb-0\">Email</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-9\">\n");
      out.write("                <p class=\"text-muted mb-0\">");
      out.print(em );
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <p class=\"mb-0\">Mobile</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-9\">\n");
      out.write("                <p class=\"text-muted mb-0\">");
      out.print(ph);
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-sm-3\">\n");
      out.write("                <p class=\"mb-0\">Employee Role</p>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-9\">\n");
      out.write("                <p class=\"text-muted mb-0\">");
      out.print(ro );
      out.write("</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("                        \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row mt-1\">\n");
      out.write("        <div class=\"col-md-12\">        <!--     //£££££££££££££££££££££££££££££££££££-->\n");
      out.write("            <div class=\"card mb-4 mb-md-0\">\n");
      out.write("              <div class=\"mb-4 mb-lg-0\">\n");
      out.write("                  <p class=\"mb-4 mx-auto mt-3 text-center\"><span class=\"text-primary font-italic me-1\">More</span> Of Me</p>\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                <form action=\"more_info\" method=\"post\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\"><label for=\"username\"><strong>Date Of Birth</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"**/**/****\" name=\"dob\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\"><label for=\"username\"><strong>Age</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Age\" name=\"age\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\"><label for=\"username\"><strong>Gender</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Gender\" name=\"gender\"></div>\n");
      out.write("                    </div>\n");
      out.write("                        </div>\n");
      out.write("                    <div class=\"form-row\">\n");
      out.write("                    <div class=\"col\">\n");
      out.write("                        <div class=\"form-group\"><input class=\"form-control\" type=\"hidden\" placeholder=\"Gender\" name=\"employee_num\" value=\"no14\"></div>\n");
      out.write("                    </div><br>\n");
      out.write("                              <div class=\"col\">\n");
      out.write("                              <div class=\"form-group\"><label for=\"username\"><strong>Photo</strong></label><input class=\"form-control\" type=\"file\" placeholder=\"Gender\" name=\"e_image\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"form-group float-right\"><button class=\"btn btn-primary btn-sm\" type=\"submit\">Update Info</button></div>\n");
      out.write("\n");
      out.write("             </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    <!--</div>-->\n");
      out.write("\n");
      out.write("\n");
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
