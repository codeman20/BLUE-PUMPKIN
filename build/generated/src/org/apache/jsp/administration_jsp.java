package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class administration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Administration - Blue Pumpkin</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Table-With-Search-1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Table-With-Search.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    \n");
      out.write("      ");
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

          if((session.getAttribute("Erole") == null || e_role.equalsIgnoreCase("employee"))){
              response.sendRedirect("index.jsp");
          }

          
      out.write("                              \n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <nav class=\"navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0\">\n");
      out.write("            <div class=\"container-fluid d-flex flex-column p-0\">\n");
      out.write("                <a class=\"navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0\" href=\"#\">\n");
      out.write("                    <div class=\"sidebar-brand-icon rotate-n-15\"><i class=\"fab fa-weibo\"></i></div>\n");
      out.write("                    <div class=\"sidebar-brand-text mx-3\"><span>Blue Pumpkin</span></div>\n");
      out.write("                </a>\n");
      out.write("                <hr class=\"sidebar-divider my-0\">\n");
      out.write("                <ul class=\"nav navbar-nav text-light\" id=\"accordionSidebar\">\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link active\" href=\"#\"><i class=\"fas fa-tachometer-alt\"></i><span>Dashboard </span></a></li>\n");
      out.write("                 \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link \" href=\"profile.jsp\"><i class=\"fas fa-user\"></i><span>Profile</span></a></li>\n");
      out.write("                \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"registration.jsp\"><i class=\"fas fa-users\"></i><span>Registration</span></a>\n");
      out.write("               \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"winnings.jsp\"><i class=\"fas fa-user-friends\"></i><span>Winnings</span></a></li>\n");
      out.write("              \n");
      out.write("                        <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link \" href=\"requested_events.jsp\"><i class=\"fab fa-product-hunt\"></i><span>Requested events</span></a></li>\n");
      out.write("                  \n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link\" href=\"employee_manipulate.jsp\"><i class=\"fas fa-money-check-alt\"></i><span>Remove Employee</span></a></li>\n");
      out.write("\n");
      out.write("                </ul><button class=\"btn rounded-circle border-0\" id=\"sidebarToggle\" type=\"button\"></button>\n");
      out.write("                <div class=\"text-center d-none d-md-inline\"></div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <div class=\"d-flex flex-column\" id=\"content-wrapper\">\n");
      out.write("            <div id=\"content\">\n");
      out.write("                     <nav class=\"navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                        <ul class=\"nav navbar-nav flex-nowrap ml-auto\">\n");
      out.write("                     <div class=\"d-none d-sm-block topbar-divider\"></div>\n");
      out.write("                            <li class=\"nav-item dropdown no-arrow\" role=\"presentation\">\n");
      out.write("                                <div class=\"nav-item dropdown no-arrow\"><a class=\"dropdown-toggle nav-link\" data-toggle=\"dropdown\" aria-expanded=\"false\" href=\"profile.jsp\"><span class=\"d-none d-lg-inline mr-2 text-gray-600 small\">");
      out.print( username);
      out.write("</span><img class=\"border rounded-circle img-profile\" src=\"assets/img/avatars/user.png\"></a>\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"dropdown-menu shadow dropdown-menu-right animated--grow-in\" role=\"menu\"><a role=\"presentation\" class=\"dropdown-item\" href=\"profile.jsp\"><i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i> Profile</a>\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                                        <form action=\"logout\" method=\"post\">\n");
      out.write("                                            <button class=\"btn btn-none \" style=\"padding-left: 23px\"> <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400 small ps-2\">\n");
      out.write("                                                </i>&nbsp;Logout</button>\n");
      out.write("                                        </form></div>\n");
      out.write("                    </div>\n");
      out.write("                    </li>\n");
      out.write("                    </ul>\n");
      out.write("            </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <h3 class=\"text-dark mb-4\">Administration Portal</h3>\n");
      out.write("                <div class=\"row mb-3\">\n");
      out.write("                    <div class=\"col-lg-4\">\n");
      out.write("                        <br> <br><br><br>\n");
      out.write("                        <div class=\"card mb-3\" style=\"background-image: url(&quot;assets/img/dogs/smiley.webp&quot;);\">\n");
      out.write("\n");
      out.write("                            <br><br><br><br><br><br><br><br> <br><br><br><br><br><br>\n");
      out.write("                        </div>\n");
      out.write("             \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"card shadow mb-3\">\n");
      out.write("                                    <div class=\"card-header py-3\">\n");
      out.write("                                        <p class=\"text-primary m-0 font-weight-bold\">Create Upcoming Event</p>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <form action=\"register_event\" method=\"post\">\n");
      out.write("                                           \n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                  <div class=\"col\">\n");
      out.write("                                                      <div class=\"form-group\"><label for=\"username\"><strong>Event Type</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Event Type\" name=\"event_type\" required></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"email\"><strong>Agenda</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Agenda\" name=\"agenda\" required></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                   <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"first_name\"><strong>Participates</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Participates\" name=\"Participates\" required></div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"last_name\"><strong>Duration</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Duration\" name=\"Duration\" required></div>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                   <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"last_name\"><strong>Start Date</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Start Date\" name=\"StartDate\" required></div>\n");
      out.write("                                                </div>   <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"last_name\"><strong>End Date</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"End Date\" name=\"EndDate\" required></div>\n");
      out.write("                                                </div>   \n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"last_name\"><strong>Location</strong></label><input class=\"form-control\" type=\"text\" placeholder=\"Location\" name=\"Location\" required></div>\n");
      out.write("                                                </div>   <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"last_name\"><strong>Description</strong></label><input class=\"form-control\" type=\"textarea\" placeholder=\"Description\" name=\"description\" required></div>\n");
      out.write("                                              \n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-row\">\n");
      out.write("                                            <div class=\"col\">\n");
      out.write("                                                    <div class=\"form-group\"><label for=\"last_name\"><strong>Event Photo</strong></label><input class=\"form-control\" type=\"file\" placeholder=\"Add Photo\" name=\"ev_img\" required></div>\n");
      out.write("                                              \n");
      out.write("                                            </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\"><button class=\"btn btn-primary btn-sm\" type=\"submit\">Add Event</button></div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card shadow\">      \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"card shadow mb-5\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                  <div class=\"card-header py-3\">\n");
      out.write("                                        <p class=\"text-primary m-0 font-weight-bold\">Posted Events</p>\n");
      out.write("                                        <hr>\n");
      out.write("                  <div class=\"container-xl\">\n");
      out.write("                      \n");
      out.write("\t<div class=\"table-responsive\">\n");
      out.write("\t\t<div class=\"table-wrapper\">\n");
      out.write("\t\t\t<div class=\"table-title\">\n");
      out.write("\n");
      out.write("\t\t\t<table class=\"table table-striped table-hover\" id=\"myTable\">\n");
      out.write("\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t <th>Event ID</th>\n");
      out.write("\t\t\t\t\t\t<th>Event Type</th>\n");
      out.write("\t\t\t\t\t\t<th>Agenda</th>\n");
      out.write("\t\t\t\t\t\t<th>Participates</th>\n");
      out.write("                                                <th>Duration</th>\n");
      out.write("                                                <th>Start Date</th>\n");
      out.write("                                                <th>End Date</th>                        \n");
      out.write("                                                <th>Location</th>\n");
      out.write("                                                <th>Description</th>\n");
      out.write("\t\t\t\t\t\t<th>Actions</th>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t</thead>\n");
      out.write("\t\t\t\t<tbody>\n");
      out.write("                                    \n");
      out.write("                                    ");

                                        try {
                                            Class.forName("com.mysql.jdbc.Driver");
                                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                            ResultSet resultSet;
                                            Statement st = conn.createStatement();
                                            String sql = "select * from event_tbl";
                                            resultSet = st.executeQuery(sql);
                                            while (resultSet.next()) {
                                                

//                                            Blob blob = resultSet.getBlob("event_img");
//                                                byte byteArray[] = blob.getBytes(1, (int) blob.length());
//                                                response.setContentType("image/gif");
//                                                OutputStream os = response.getOutputStream();
//                                                                   
      out.write("\n");
      out.write("          \n");
      out.write("                                    <tr>\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(resultSet.getString("event_id") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("agenda") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("event_type") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("participates") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("duration") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("start_date") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("end_date") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("location") );
      out.write("</td>\n");
      out.write("                                                <td>");
      out.print(resultSet.getString("description") );
      out.write("</td>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t<td>\n");
      out.write("<a href=\"#editEventModal\" class=\"edit\" data-toggle=\"modal\"><i class='fas fa-marker' style='font-size:18px;color:buttonfacelue'></i></a>\n");
      out.write("                <a href=\"#deleteEventModal\" class=\"delete\" data-toggle=\"modal\"><i class='fas fa-trash-alt' style='font-size:18px;color:buttonfacelue'></i></a>\n");
      out.write("\t\t\t\t\t\t\t\t</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                                     \n");
      out.write("                                        ");

                  }
                        
                        conn.close();
                        } catch (Exception e) {
                        e.printStackTrace();
                            out.print(e);
                        }
                        
      out.write("\n");
      out.write("                                         \n");
      out.write("                    </tbody>\n");
      out.write("                 </table>\n");
      out.write("\n");
      out.write("         </div>\n");
      out.write("          </div>        \n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("        </div>\n");
      out.write("                                              \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                                                <!-- Edit Modal HTML -->\n");
      out.write("                                                \n");
      out.write("                                                                       \n");
      out.write("                                     <script>\n");
      out.write("    \n");
      out.write("                var table = document.getElementById('myTable');\n");
      out.write("                \n");
      out.write("                for(var i = 1; i < table.rows.length; i++)\n");
      out.write("                {\n");
      out.write("                    table.rows[i].onclick = function()\n");
      out.write("                    {\n");
      out.write("                         //rIndex = this.rowIndex;\n");
      out.write("                         document.getElementById(\"e_id\").value = this.cells[0].innerHTML;\n");
      out.write("                                                  document.getElementById(\"ev_type\").value = this.cells[1].innerHTML;\n");
      out.write("                         document.getElementById(\"agenda\").value = this.cells[2].innerHTML;\n");
      out.write("                         document.getElementById(\"part\").value = this.cells[3].innerHTML;\n");
      out.write("                                document.getElementById(\"duration\").value = this.cells[4].innerHTML;\n");
      out.write("                         document.getElementById(\"start_date\").value = this.cells[5].innerHTML;\n");
      out.write("                         document.getElementById(\"end_date\").value = this.cells[6].innerHTML;\n");
      out.write("                                document.getElementById(\"location\").value = this.cells[7].innerHTML;\n");
      out.write("                                document.getElementById(\"info\").value = this.cells[8].innerHTML;\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("//                                delete\n");
      out.write("                                                         document.getElementById(\"d_e_id\").value = this.cells[0].innerHTML;\n");
      out.write("\n");
      out.write("                    };\n");
      out.write("                }\n");
      out.write("    \n");
      out.write("         </script>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("         \n");
      out.write("<div id=\"editEventModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("                    <form action=\"edit_admin\" method=\"post\" enctype='multipart/form-data'>\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">Edit Posted Events</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Event ID</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"e_id\" required id=\"e_id\" readonly>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                     <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Event Type</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"ev_type\" required id=\"ev_type\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Agenda</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"agenda\" required id=\"agenda\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Participates</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"part\" required id=\"part\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Duration</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"duration\" required id=\"duration\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Start Date</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"start_date\" required id=\"start_date\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                       <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>End Date</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"end_date\" required id=\"end_date\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Location</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"location\" required id=\"location\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                                                        <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Description</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" name =\"info\" required id=\"info\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                                                      <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t<label>Image</label>\n");
      out.write("\t\t\t\t\t\t<input type=\"file\" class=\"form-control\" name =\"event_img\" required id=\"event_img\">\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-outline-info\" value=\"Update\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("               <!-- Delete Modal HTML -->\n");
      out.write("                                                <div id=\"deleteEventModal\" class=\"modal fade\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("                    <form action=\"delete_admin\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\"modal-header\">\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<h4 class=\"modal-title\">Delete Promotion</h4>\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>Are you sure you want to delete these Records? </p>\n");
      out.write("                                        <span id=\"deleteIdValue\"></span>\n");
      out.write("\t\t\t\t\t<p class=\"text-warning\"><small>This action cannot be undone.</small></p>\n");
      out.write("                                        <input type=\"hidden\" name =\"d_e_id\" required id=\"d_e_id\" >\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t\t<input type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\" value=\"Cancel\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"btn btn-outline-danger\" value=\"Delete\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("        <footer class=\"bg-white sticky-footer\">\n");
      out.write("            <div class=\"container my-auto\">\n");
      out.write("                <div class=\"text-center my-auto copyright\"><span>Copyright © Blue Pumpkin 2023</span></div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </footer>\n");
      out.write("            </div><a class=\"border rounded d-inline scroll-to-top\" href=\"#page-top\"><i class=\"fas fa-angle-up\"></i></a></div></div>\n");
      out.write("    \n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/chart.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js\"></script>\n");
      out.write("    <script src=\"assets/js/Table-With-Search.js\"></script>\n");
      out.write("    <script src=\"assets/js/theme.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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