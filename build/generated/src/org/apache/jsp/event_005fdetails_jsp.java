package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Connection;

public final class event_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>- Event Details -</title>\n");
      out.write("  <meta content=\"\" name=\"description\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"blue_pumpkin/assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/img/favicon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Jost:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/aos/aos.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"blue_pumpkin/assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Template Main CSS File -->\n");
      out.write("  <link href=\"blue_pumpkin/assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("\n");
      out.write("\n");
      out.write("/* CSS */\n");
      out.write(".button-85 {\n");
      out.write("  padding: 0.6em 2em;\n");
      out.write("  border: none;\n");
      out.write("  outline: none;\n");
      out.write("  color: rgb(255, 255, 255);\n");
      out.write("  background: #111;\n");
      out.write("  cursor: pointer;\n");
      out.write("  position: relative;\n");
      out.write("  z-index: 0;\n");
      out.write("  border-radius: 10px;\n");
      out.write("  user-select: none;\n");
      out.write("  -webkit-user-select: none;\n");
      out.write("  touch-action: manipulation;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button-85:before {\n");
      out.write("  content: \"\";\n");
      out.write("  background: linear-gradient(\n");
      out.write("    45deg,\n");
      out.write("    #ff0000,\n");
      out.write("    #ff7300,\n");
      out.write("    #fffb00,\n");
      out.write("    #48ff00,\n");
      out.write("    #00ffd5,\n");
      out.write("    #002bff,\n");
      out.write("    #7a00ff,\n");
      out.write("    #ff00c8,\n");
      out.write("    #ff0000\n");
      out.write("  );\n");
      out.write("  position: absolute;\n");
      out.write("  top: -2px;\n");
      out.write("  left: -2px;\n");
      out.write("  background-size: 400%;\n");
      out.write("  z-index: -1;\n");
      out.write("  filter: blur(5px);\n");
      out.write("  -webkit-filter: blur(5px);\n");
      out.write("  width: calc(100% + 4px);\n");
      out.write("  height: calc(100% + 4px);\n");
      out.write("  animation: glowing-button-85 20s linear infinite;\n");
      out.write("  transition: opacity 0.3s ease-in-out;\n");
      out.write("  border-radius: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes glowing-button-85 {\n");
      out.write("  0% {\n");
      out.write("    background-position: 0 0;\n");
      out.write("  }\n");
      out.write("  50% {\n");
      out.write("    background-position: 400% 0;\n");
      out.write("  }\n");
      out.write("  100% {\n");
      out.write("    background-position: 0 0;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write(".button-85:after {\n");
      out.write("  z-index: -1;\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  width: 100%;\n");
      out.write("  height: 100%;\n");
      out.write("  background: #222;\n");
      out.write("  left: 0;\n");
      out.write("  top: 0;\n");
      out.write("  border-radius: 10px;\n");
      out.write("} \n");
      out.write("        </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("              \n");
      out.write("               \n");
      out.write("                 ");

                session = request.getSession(false);
          if(session == null){
              response.sendRedirect("index.jsp");
          }
          
          
        String username="";
          
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"fixed-top header-inner-pages\">\n");
      out.write("    <div class=\"container d-flex align-items-center\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("      <h1 class=\"logo me-auto\"><a href=\"index.jsp\"><img src=\"blue_pumpkin/assets/img/favicon.png\">lue Pumpkin</a></h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("       <ul>\n");
      out.write("          <li><a class=\"nav-link scrollto active\" href=\"#hero\">Home</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#about\">About-Us</a></li>\n");
      out.write("          <li><a class=\"nav-link   scrollto\" href=\"#portfolio\">Events</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#team\">Winners</a></li>\n");
      out.write("          <li class=\"nav-link scrollto\"><a href=\"#faq\">Faq</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#contact\">Contact</a></li>\n");
      out.write("          <li style=\"padding-left: 70px;\"><a class=\"getstarted scrollto\">Logged-In</a></li>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("          \n");
      out.write("           ");

          if(!(session.getAttribute("Erole") == null)){
               
      out.write(" \n");
      out.write("               \n");
      out.write("                     <li><a class=\"nav-link scrollto\">");
      out.print( username);
      out.write("</a></li>\n");
      out.write("         ");
 
                      }
else{   
      out.write(" \n");
      out.write("                        <li><a class=\"nav-link scrollto\">");
      out.print( username);
      out.write("</a></li> ");

}


          
      out.write(" \n");
      out.write("        </ul>\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("      </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </header><!-- End Header -->\n");
      out.write("\n");
      out.write("  <main id=\"main\">\n");
      out.write("\n");
      out.write("    <!-- ======= Breadcrumbs ======= -->\n");
      out.write("    <section id=\"breadcrumbs\" class=\"breadcrumbs\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <ol>\n");
      out.write("          <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("          <li>Event Details</li>\n");
      out.write("        </ol>\n");
      out.write("        <h2>Event Details</h2>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Breadcrumbs -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     ");

          String n = request.getParameter("event_id");
          int event_id=Integer.parseInt(n);
          
            String agenda="";
            String participates="";
            String duration="";
            String start_date="";
            String end_date="";
            String location="";
            String description="";
            String event_type="";
            
            try {
                    
            String dburl = "jdbc:mysql://localhost:3306/blue_pumpkin";
            String dbuname = "root";
            String dbpassword = "";
            String dbdriver = "com.mysql.jdbc.Driver";
            Class.forName(dbdriver);

            Connection con;
            PreparedStatement pre;
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
            
            String sql = "SELECT * FROM event_tbl WHERE event_id=?";
            pre = con.prepareStatement(sql);
            pre.setInt(1, event_id);
   
            ResultSet result = pre.executeQuery();
//
  while (result.next()) {
             agenda=result.getString("agenda");
             participates=result.getString("participates");
             duration=result.getString("duration");
             start_date=result.getString("start_date");
             end_date=result.getString("end_date");
             location=result.getString("location");
             description=result.getString("description");
             event_type=result.getString("event_type");
  }
 } catch (Exception ex) {
       ex.printStackTrace();
  out.print(ex);
        }

      
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ======= Portfolio Details Section ======= -->\n");
      out.write("    <section id=\"portfolio-details\" class=\"portfolio-details\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row gy-4\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-8\">\n");
      out.write("            <div class=\"portfolio-details-slider swiper\">\n");
      out.write("              <div class=\"swiper-wrapper align-items-center\">\n");
      out.write("\n");
      out.write("                <div >\n");
      out.write("                  <img src=\"blue_pumpkin/assets/img/portfolio/portfolio-3.jpg\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("              <div class=\"swiper-pagination\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-4\">\n");
      out.write("            <div class=\"portfolio-info\">\n");
      out.write("              <h3>");
      out.print( agenda);
      out.write("</h3>\n");
      out.write("              <ul>\n");
      out.write("                <li><strong>Category</strong> : ");
      out.print( event_type);
      out.write("</li>\n");
      out.write("                <li><strong>Location</strong> : ");
      out.print( location);
      out.write("</li>\n");
      out.write("                <li><strong>Participants</strong> :  ");
      out.print( participates);
      out.write("</li>\n");
      out.write("                <li><strong>Duration</strong> : <a href=\"#\">");
      out.print( duration);
      out.write("</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"portfolio-description\">\n");
      out.write("              <h2> ");
      out.print( start_date);
      out.write(" - ");
      out.print( end_date);
      out.write(" </h2>\n");
      out.write("              <p>\n");
      out.write("                ");
      out.print( description);
      out.write("</p>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Portfolio Details Section -->\n");
      out.write("\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("\n");
      out.write("  <!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("\n");
      out.write("    <div class=\"footer-newsletter\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("          <div class=\"col-lg-6\">\n");
      out.write("              \n");
      out.write("\n");
      out.write("\n");
      out.write("            <h4>Request To Join Our Event</h4>\n");
      out.write("            <tt style=\"text-transform: capitalize; te\" >By pressing the button below, the administration will approve your request to join the event. Further information will be communicated to you respectfully</tt>\n");
      out.write("            <!-- HTML !--><br><br>\n");
      out.write("            \n");
      out.write("              ");

          if(!(session.getAttribute("Erole") == null)){
               
      out.write(" \n");
      out.write("               \n");
      out.write("                      <center> <a href=\"request_to_join?event_id=g\" class=\"button-85\" role=\"button\">Request To Join</a></center>\n");
      out.write("         ");
 
                      }


          
      out.write(" \n");
      out.write("        \n");
      out.write("              \n");
      out.write("              \n");
      out.write(" \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-contact\">\n");
      out.write("            <h3>Arsha</h3>\n");
      out.write("            <p>\n");
      out.write("              A108 Adam Street <br>\n");
      out.write("              New York, NY 535022<br>\n");
      out.write("              United States <br><br>\n");
      out.write("              <strong>Phone:</strong> +1 5589 55488 55<br>\n");
      out.write("              <strong>Email:</strong> info@example.com<br>\n");
      out.write("            </p>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("            <h4>Useful Links</h4>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("            <h4>Our Services</h4>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>\n");
      out.write("              <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-links\">\n");
      out.write("            <h4>Our Social Networks</h4>\n");
      out.write("            <p>Cras fermentum odio eu feugiat lide par naso tierra videa magna derita valies</p>\n");
      out.write("            <div class=\"social-links mt-3\">\n");
      out.write("              <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\n");
      out.write("              <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container footer-bottom clearfix\">\n");
      out.write("      <div class=\"copyright\">\n");
      out.write("        &copy; Copyright <strong><span>Arsha</span></strong>. All Rights Reserved\n");
      out.write("      </div>\n");
      out.write("      <div class=\"credits\">\n");
      out.write("        <!-- All the links in the footer should remain intact. -->\n");
      out.write("        <!-- You can delete the links only if you purchased the pro version. -->\n");
      out.write("        <!-- Licensing information: https://bootstrapmade.com/license/ -->\n");
      out.write("        <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/arsha-free-bootstrap-html-template-corporate/ -->\n");
      out.write("        Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer><!-- End Footer -->\n");
      out.write("\n");
      out.write("  <div id=\"preloader\"></div>\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- Vendor JS Files -->\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/aos/aos.js\"></script>\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/glightbox/js/glightbox.min.js\"></script>\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/swiper/swiper-bundle.min.js\"></script>\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/waypoints/noframework.waypoints.js\"></script>\n");
      out.write("  <script src=\"blue_pumpkin/assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"blue_pumpkin/assets/js/main.js\"></script>\n");
      out.write("\n");
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
