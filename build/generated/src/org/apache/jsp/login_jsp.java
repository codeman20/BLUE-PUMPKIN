package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--JSP IMPORTS-->\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Login - Blue Pumpkin</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/typicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/FPE-Gentella-form-elements-1.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/FPE-Gentella-form-elements.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"bg-gradient-primary\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"col-md-9 col-lg-12 col-xl-10\">\n");
      out.write("                <br><br>\n");
      out.write("                <h2 style=\"color: white; text-align: center;\">Blue Pumpkin</h2>\n");
      out.write("                <div class=\"card shadow-lg o-hidden border-0 my-5\">\n");
      out.write("                    <div class=\"card-body p-0\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-lg-6 d-none d-lg-flex\">\n");
      out.write("                                <div class=\"flex-grow-1 bg-login-image\" style=\"background-image: url(&quot;assets/img/dogs/smiley.webp&quot;);\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-6\">\n");
      out.write("                                <div class=\"p-5\">\n");
      out.write("                                    <div class=\"text-center\">\n");
      out.write("                                        <h4 class=\"text-dark mb-4\">Welcome Back!</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!--UYSER LOGIN FORM-->\n");
      out.write("                                    <form class=\"user\" action=\"login\" method=\"post\">\n");
      out.write("\n");
      out.write("                                        <div class=\"form-group\"><input class=\"form-control form-control-user\" required type=\"email\" id=\"exampleInputEmail\" aria-describedby=\"emailHelp\" placeholder=\"Enter Email Address...\" name=\"email\"/></div>\n");
      out.write("                                        <div class=\"form-group\"><input class=\"form-control form-control-user\" required type=\"password\" id=\"exampleInputPassword\" placeholder=\"Password\" name=\"password\"/></div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <div class=\"custom-control custom-radio small\">\n");
      out.write("                                                <div class=\"form-check\"><input class=\"form-check-input custom-control-input\" required type=\"radio\" id=\"formCheck-1\" name=\"user\" value=\"administrator\"><label class=\"form-check-label custom-control-label\" for=\"formCheck-1\">Administrator</label></div>\n");
      out.write("                                            </div>\n");
      out.write("                                             <div class=\"custom-control custom-radio small\">\n");
      out.write("                                                 <div class=\"form-check\"><input class=\"form-check-input custom-control-input\" required type=\"radio\" id=\"formCheck-2\" name=\"user\" value=\"employee\"><label class=\"form-check-label custom-control-label\" for=\"formCheck-2\" >Employee</label></div>\n");
      out.write("                                            </div>\n");
      out.write("                                          \n");
      out.write("                                        </div><button class=\"btn btn-primary btn-block text-white btn-user\" type=\"submit\">Login</button></form>\n");
      out.write("                                    <div class=\"text-center\"><a class=\"small\" href=\"forgotpassword.html\">Forgot Password?</a></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bs-init.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js\"></script>\n");
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
