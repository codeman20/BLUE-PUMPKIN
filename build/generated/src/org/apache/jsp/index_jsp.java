package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>Blue Pumpkin</title>\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"fixed-top \">\n");
      out.write("    <div class=\"container d-flex align-items-center\">\n");
      out.write("\n");
      out.write("      <h1 class=\"logo me-auto\"><a href=\"index.jsp\"><img src=\"blue_pumpkin/assets/img/favicon.png\">lue Pumpkin</a></h1>\n");
      out.write("   \n");
      out.write("      <nav id=\"navbar\" class=\"navbar\">\n");
      out.write("        <ul>\n");
      out.write("          <li><a class=\"nav-link scrollto active\" href=\"#hero\">Home</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#about\">About-Us</a></li>\n");
      out.write("          <li><a class=\"nav-link   scrollto\" href=\"#portfolio\">Events</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#team\">Winners</a></li>\n");
      out.write("          <li><a class=\"nav-link scrollto\" href=\"#contact\">Contact</a></li>\n");
      out.write("          <li class=\"nav-link scrollto\"><a href=\"profile.jsp\">Profile</a></li>\n");
      out.write("          <li class=\"nav-link scrollto\"><a href=\"#faq\">Faq</a></li>\n");
      out.write("          <li style=\"padding-left: 70px;\"><a class=\"getstarted scrollto\" href=\"login.jsp\" >Login</a></li>\n");
      out.write("      \n");
      out.write("        </ul>\n");
      out.write("        <i class=\"bi bi-list mobile-nav-toggle\"></i>\n");
      out.write("      </nav><!-- .navbar -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </header><!-- End Header -->\n");
      out.write("\n");
      out.write("  <!-- ======= Hero Section ======= -->\n");
      out.write("  <section id=\"hero\" class=\"d-flex align-items-center\">\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-6 d-flex flex-column justify-content-center pt-4 pt-lg-0 order-2 order-lg-1\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("          <h1>Blue Pumpkin ...</h1>\n");
      out.write("          <h2>A Website For Interactive and Entertainment Purpose Of The Employees.</h2>\n");
      out.write("          <div class=\"d-flex justify-content-center justify-content-lg-start\">\n");
      out.write("            <a href=\"#about\" class=\"btn-get-started scrollto\">Get Started</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-6 order-1 order-lg-2 hero-img\" data-aos=\"zoom-in\" data-aos-delay=\"200\">\n");
      out.write("          <img src=\"blue_pumpkin/assets/img/hero-img.png\" class=\"img-fluid animated\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  </section><!-- End Hero -->\n");
      out.write("\n");
      out.write("  <main id=\"main\">\n");
      out.write("\n");
      out.write("    <!-- ======= Clients Section ======= -->\n");
      out.write("    <section id=\"clients\" class=\"clients section-bg\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\" data-aos=\"zoom-in\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <img src=\"blue_pumpkin/assets/img/clients/client-1.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <img src=\"blue_pumpkin/assets/img/clients/client-2.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <img src=\"blue_pumpkin/assets/img/clients/client-3.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <img src=\"blue_pumpkin/assets/img/clients/client-4.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <img src=\"blue_pumpkin/assets/img/clients/client-5.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center\">\n");
      out.write("            <img src=\"blue_pumpkin/assets/img/clients/client-6.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Cliens Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= About Us Section ======= -->\n");
      out.write("    <section id=\"about\" class=\"about\">\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>About Us</h2>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row content\">\n");
      out.write("          <div class=\"col-lg-6\">\n");
      out.write("            <p>\n");
      out.write("              We are a marketing agent of an internet marketing company, who\n");
      out.write("              provides different services like dial up services and the broadband services.\n");
      out.write("            </p>\n");
      out.write("            <ul>\n");
      out.write("              <li><i class=\"ri-check-double-line\"></i> Social marketing group, automatic group sending | private chat messages, automatic forwarding of messages</li>\n");
      out.write("              <li><i class=\"ri-check-double-line\"></i>Global Data Collection Expert, Collect according to keywords or countries and regions, collect mailboxes, mobile phone numbers, search engines</li>\n");
      out.write("              <li><i class=\"ri-check-double-line\"></i> SMS landing support in more than 200 countries around the world</li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-6 pt-4 pt-lg-0\">\n");
      out.write("            <p>\n");
      out.write("              <!-- PLEASE TRY THE BOMOHE NETWORK MARKETING FRAMEWORK -->\n");
      out.write("              Integrates a variety of marketing software into one marketing framework, so that you no longer worry about multi-platform marketing\n");
      out.write("            </p>\n");
      out.write("            <a href=\"#\" class=\"btn-learn-more\">Learn More</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End About Us Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- ======= Birthdays Section ======= -->\n");
      out.write("    <section id=\"services\" class=\"services section-bg\">\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Today's Birthdays</h2>\n");
      out.write("          <p>“Wishing you a day filled with happiness and a year filled with joy. Hope your special day brings you all that your heart desires! Happy birthday!”</p>\n");
      out.write("        </div>\n");
      out.write("  <div class=\"row\">\n");
      out.write("      ");

          Calendar cal = Calendar.getInstance();
          SimpleDateFormat format1 = new SimpleDateFormat("MM-dd");
          String formatted = format1.format(cal.getTime());
          System.out.println(formatted);

          try {
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
              ResultSet resultSet;
              Statement st = conn.createStatement();
              String sql = "select employee_id from profile_tbl where DOB='" + formatted + "'";
              resultSet = st.executeQuery(sql);
              while (resultSet.next()) {

//                            if (result.next()) {
                  String employee_number = resultSet.getString("employee_id");
                  String sql2 = "SELECT * FROM employee_tbl WHERE employee_id='" + employee_number + "'";

                  st = conn.prepareStatement(sql2);
                  ResultSet result2 = st.executeQuery(sql2);

                  while (result2.next()) {
                      String fname = result2.getString("firstname");
                      String lname = result2.getString("lastname");
                      String fullname = fname + " " + lname;

      
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      <div class=\"col-xl-3 col-md-6 d-flex align-items-stretch\" data-aos=\"zoom-in\" data-aos-delay=\"100\">\n");
      out.write("          <div class=\"icon-box\">\n");
      out.write("              <div class=\"icon\"><i class=\"bi bi-balloon-heart\" style=\"  cursor:pointer; \" onMouseOut=\"this.style.color='#0F0'\"onMouseOver=\"this.style.color='#47b2e4'\"></i>\n");
      out.write("                  <i class=\"bi bi-balloon\" style=\"  cursor:pointer; \" onMouseOut=\"this.style.color='#fcff4b'\"onMouseOver=\"this.style.color='#47b2e4'\"></i>\n");
      out.write("                  <i class=\"bi bi-balloon-heart\" style=\"  cursor:pointer; \" onMouseOut=\"this.style.color='#eb0000'\"onMouseOver=\"this.style.color='#47b2e4'\">\n");
      out.write("                  </i><i class=\"bi bi-balloon\" style=\"  cursor:pointer; \" onMouseOut=\"this.style.color='#eb25dc'\"onMouseOver=\"this.style.color='#47b2e4'\"></i>\n");
      out.write("              </div>\n");
      out.write("              <h4 style=\"  cursor:pointer;\"<a>");
      out.print( fullname);
      out.write("</a></h4>\n");
      out.write("              <p class=\"mint\">It's your special day — wishing you the biggest slice of happy today!</p>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      ");

                  }
              }
              conn.close();
          } catch (Exception e) {
              e.printStackTrace();
              out.print(e);
          }
      
      out.write("\n");
      out.write("                          </div>\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Birthdays Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Cta Section ======= -->\n");
      out.write("    <section id=\"cta\" class=\"cta\">\n");
      out.write("      <div class=\"container\" data-aos=\"zoom-in\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-lg-9 text-center text-lg-start\">\n");
      out.write("            <h3>Call To Action</h3>\n");
      out.write("            <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-lg-3 cta-btn-container text-center\">\n");
      out.write("            <a class=\"cta-btn align-middle\" href=\"#\">Call To Action</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Cta Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Portfolio Section ======= -->\n");
      out.write("    <section id=\"portfolio\" class=\"portfolio\">\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Events</h2>\n");
      out.write("          <p>“With the variability and ever-changing landscape of social media, there’s value in reaching our audience where they are most likely to see and read our messages.\"</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <ul id=\"portfolio-flters\" class=\"d-flex justify-content-center\" data-aos=\"fade-up\" data-aos-delay=\"100\">\n");
      out.write("          <li class=\"filter-active section-title\">All</li>\n");
      out.write("      \n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <div class=\"row portfolio-container\" data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("\n");
      out.write("            ");

                  HttpSession image_session = request.getSession();
              try {
              String agenda,event_type,event_id;
              
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
              ResultSet resultSet;
              Statement st = conn.createStatement();
              String sql = "select * from event_tbl";
              resultSet = st.executeQuery(sql);
              while (resultSet.next()) {

                 agenda= resultSet.getString("agenda");
                 event_type= resultSet.getString("event_type");
                 event_id= resultSet.getString("event_id");
                 
                                 session.setAttribute("image_session", event_id);


      
      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"col-lg-4 col-md-6 portfolio-item filter-card border shadow-2-strong rounded-4\">\n");
      out.write("            <div class=\"portfolio-img\"><img src=\"blue_pumpkin/assets/img/event.jpg\" height=\"350px\" width=\"350px\" class=\"img-fluid\" alt=\"\"></div>\n");
      out.write("            <div class=\"portfolio-info\">\n");
      out.write("              <h4>");
      out.print( agenda);
      out.write("</h4>\n");
      out.write("              <p>");
      out.print( event_type);
      out.write("</p>\n");
      out.write("              <a href=\"blue_pumpkin/assets/img/portfolio/portfolio-4.jpg\" data-gallery=\"portfolioGallery\" class=\"portfolio-lightbox preview-link\" title=\"");
      out.print( agenda);
      out.write("\"><i class=\"bx bx-plus\"></i></a>\n");
      out.write("              <a href=\"event_details.jsp?event_id=");
      out.print( event_id);
      out.write("\" class=\"details-link\" title=\"More Details\"><i class=\"bx bx-link\"></i></a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("                       ");

     
              }
              conn.close();
          } catch (Exception e) {
              e.printStackTrace();
              out.print(e);
          }
      
      out.write("\n");
      out.write("       \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Portfolio Section -->\n");
      out.write("\n");
      out.write("    <!-- ======= Winners Section ======= -->\n");
      out.write("    <section id=\"team\" class=\"team section-bg\">\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Winners</h2>\n");
      out.write("          <p>“A champion needs a motivation above and beyond winning. It’s not whether you win or lose, it’s how you play the game.”<sup>       -Grantland Rice</sup></p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            \n");
      out.write("              ");

          
          try {
              String fulname,lname,fname;
              String rankings="";
              
              Class.forName("com.mysql.jdbc.Driver");
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
              ResultSet resultSet;
              Statement st = conn.createStatement();
              String sql = "select * from winners";
              resultSet = st.executeQuery(sql);
              while (resultSet.next()) {

                 fname= resultSet.getString("firstname");
                 lname= resultSet.getString("lastname");
                 rankings= resultSet.getString("ranking");
               fulname= fname+" "+lname;
      
      out.write("\n");
      out.write("            \n");
      out.write("          <div class=\"col-lg-6\" data-aos=\"zoom-in\" data-aos-delay=\"100\">\n");
      out.write("            <div class=\"member d-flex align-items-start\">\n");
      out.write("              <div class=\"pic\"><img src=\"blue_pumpkin/assets/img/team/team-1.jpg\" class=\"img-fluid\" alt=\"\"></div>\n");
      out.write("              <div class=\"member-info\">\n");
      out.write("                <h4>");
      out.print(fulname);
      out.write("</h4>\n");
      out.write("                <span>");
      out.print(resultSet.getString("competition_name") );
      out.write("</span>\n");
      out.write("                <p>");
      out.print(resultSet.getString("award") );
      out.write("</p>\n");
      out.write("                 <div class=\"social\">\n");
      out.write("                    \n");
      out.write("                            ");


                                int rank = Integer.parseInt(rankings);
                                int i = 0;
                                while (i <= rank) {

                            
      out.write("\n");
      out.write("                            <a href=\"\"><i class=\"bi bi-trophy-fill\" style=\"color: #8b8b51\"></i></a>\n");
      out.write("                              \n");
      out.write("                            ");
         
                                i++;
                                            }
                                
      out.write("\n");
      out.write("                        </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("             ");

     
              }
              conn.close();
          } catch (Exception e) {
              e.printStackTrace();
              out.print(e);
          }
      
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Winners Section -->\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- ======= Contact Section ======= -->\n");
      out.write("    <section id=\"contact\" class=\"contact\">\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Contact</h2>\n");
      out.write("          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-5 d-flex align-items-stretch\">\n");
      out.write("            <div class=\"info\">\n");
      out.write("              <div class=\"address\">\n");
      out.write("                <i class=\"bi bi-geo-alt\"></i>\n");
      out.write("                <h4>Location:</h4>\n");
      out.write("                <p>A108 Adam Street, New York, NY 535022</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"email\">\n");
      out.write("                <i class=\"bi bi-envelope\"></i>\n");
      out.write("                <h4>Email:</h4>\n");
      out.write("                <p>info@example.com</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <div class=\"phone\">\n");
      out.write("                <i class=\"bi bi-phone\"></i>\n");
      out.write("                <h4>Call:</h4>\n");
      out.write("                <p>+1 5589 55488 55s</p>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("              <iframe src=\"https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621\" frameborder=\"0\" style=\"border:0; width: 100%; height: 290px;\" allowfullscreen></iframe>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-7 mt-5 mt-lg-0 d-flex align-items-stretch\">\n");
      out.write("            <form action=\"#\" method=\"post\" role=\"form\" class=\"php-email-form\">\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                  <label for=\"name\">Your Name</label>\n");
      out.write("                  <input type=\"text\" name=\"name\" class=\"form-control\" id=\"name\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-group col-md-6\">\n");
      out.write("                  <label for=\"name\">Your Email</label>\n");
      out.write("                  <input type=\"email\" class=\"form-control\" name=\"email\" id=\"email\" required>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Subject</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"subject\" id=\"subject\" required>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"name\">Message</label>\n");
      out.write("                <textarea class=\"form-control\" name=\"message\" rows=\"10\" required></textarea>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"my-3\">\n");
      out.write("                <div class=\"loading\">Loading</div>\n");
      out.write("                <div class=\"error-message\"></div>\n");
      out.write("                <div class=\"sent-message\">Your message has been sent. Thank you!</div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"text-center\"><button type=\"submit\">Send Message</button></div>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Contact Section -->\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!-- ======= Frequently Asked Questions Section ======= -->\n");
      out.write("     <section id=\"faq\" class=\"faq section-bg\">\n");
      out.write("      <div class=\"container\" data-aos=\"fade-up\">\n");
      out.write("\n");
      out.write("        <div class=\"section-title\">\n");
      out.write("          <h2>Frequently Asked Questions</h2>\n");
      out.write("          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"faq-list\">\n");
      out.write("          <ul>\n");
      out.write("            <li data-aos=\"fade-up\" data-aos-delay=\"100\">\n");
      out.write("              <i class=\"bx bx-help-circle icon-help\"></i> <a data-bs-toggle=\"collapse\" class=\"collapse\" data-bs-target=\"#faq-list-1\">How to participate in the events? <i class=\"bx bx-chevron-down icon-show\"></i><i class=\"bx bx-chevron-up icon-close\"></i></a>\n");
      out.write("              <div id=\"faq-list-1\" class=\"collapse show\" data-bs-parent=\".faq-list\">\n");
      out.write("                <p>\n");
      out.write("                  Feugiat pretium nibh ipsum consequat. Tempus iaculis urna id volutpat lacus laoreet non curabitur gravida. Venenatis lectus magna fringilla urna porttitor rhoncus dolor purus non.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li data-aos=\"fade-up\" data-aos-delay=\"200\">\n");
      out.write("              <i class=\"bx bx-help-circle icon-help\"></i> <a data-bs-toggle=\"collapse\" data-bs-target=\"#faq-list-2\" class=\"collapsed\">What if I am unable to login into the site? <i class=\"bx bx-chevron-down icon-show\"></i><i class=\"bx bx-chevron-up icon-close\"></i></a>\n");
      out.write("              <div id=\"faq-list-2\" class=\"collapse\" data-bs-parent=\".faq-list\">\n");
      out.write("                <p>\n");
      out.write("                  Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Id interdum velit laoreet id donec ultrices. Fringilla phasellus faucibus scelerisque eleifend donec pretium. Est pellentesque elit ullamcorper dignissim. Mauris ultrices eros in cursus turpis massa tincidunt dui.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li data-aos=\"fade-up\" data-aos-delay=\"300\">\n");
      out.write("              <i class=\"bx bx-help-circle icon-help\"></i> <a data-bs-toggle=\"collapse\" data-bs-target=\"#faq-list-3\" class=\"collapsed\">What if I am unable to send the participation request for the event? <i class=\"bx bx-chevron-down icon-show\"></i><i class=\"bx bx-chevron-up icon-close\"></i></a>\n");
      out.write("              <div id=\"faq-list-3\" class=\"collapse\" data-bs-parent=\".faq-list\">\n");
      out.write("                <p>\n");
      out.write("                  Eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis orci. Faucibus pulvinar elementum integer enim. Sem nulla pharetra diam sit amet nisl suscipit. Rutrum tellus pellentesque eu tincidunt. Lectus urna duis convallis convallis tellus. Urna molestie at elementum eu facilisis sed odio morbi quis\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li data-aos=\"fade-up\" data-aos-delay=\"400\">\n");
      out.write("              <i class=\"bx bx-help-circle icon-help\"></i> <a data-bs-toggle=\"collapse\" data-bs-target=\"#faq-list-4\" class=\"collapsed\">Tempus quam pellentesque nec nam aliquam sem et tortor consequat? <i class=\"bx bx-chevron-down icon-show\"></i><i class=\"bx bx-chevron-up icon-close\"></i></a>\n");
      out.write("              <div id=\"faq-list-4\" class=\"collapse\" data-bs-parent=\".faq-list\">\n");
      out.write("                <p>\n");
      out.write("                  Molestie a iaculis at erat pellentesque adipiscing commodo. Dignissim suspendisse in est ante in. Nunc vel risus commodo viverra maecenas accumsan. Sit amet nisl suscipit adipiscing bibendum est. Purus gravida quis blandit turpis cursus in.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li data-aos=\"fade-up\" data-aos-delay=\"500\">\n");
      out.write("              <i class=\"bx bx-help-circle icon-help\"></i> <a data-bs-toggle=\"collapse\" data-bs-target=\"#faq-list-5\" class=\"collapsed\">How can one be intimated with the upcoming events? <i class=\"bx bx-chevron-down icon-show\"></i><i class=\"bx bx-chevron-up icon-close\"></i></a>\n");
      out.write("              <div id=\"faq-list-5\" class=\"collapse\" data-bs-parent=\".faq-list\">\n");
      out.write("                <p>\n");
      out.write("                  Laoreet sit amet cursus sit amet dictum sit amet justo. Mauris vitae ultricies leo integer malesuada nunc vel. Tincidunt eget nullam non nisi est sit amet. Turpis nunc eget lorem dolor sed. Ut venenatis tellus in metus vulputate eu scelerisque.\n");
      out.write("                </p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("      </div>\n");
      out.write("    </section><!-- End Frequently Asked Questions Section -->\n");
      out.write("\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("\n");
      out.write("  <!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\">\n");
      out.write("\n");
      out.write("    <div class=\"footer-top\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("          <div class=\"col-lg-3 col-md-6 footer-contact\">\n");
      out.write("            <h3>Blue Pumpkin</h3>\n");
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
      out.write("        &copy; Copyright <strong><span>Blue Pumpkin</span></strong>. All Rights Reserved\n");
      out.write("      </div>\n");
      out.write("      <div class=\"credits\">\n");
      out.write("        Designed by <a href=\"#\">Blue Pumpkin</a>\n");
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
