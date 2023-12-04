<%-- 
    Document   : index
    Created on : Mar 20, 2023, 9:10:26 AM
    Author     : test2
--%>


<!--JSP IMPORTS-->
<%@page import="java.lang.String"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>- Event Details -</title>
        <meta content="" name="description">
        <meta content="" name="keywords">

        <!-- Favicons -->
        <link href="blue_pumpkin/assets/img/favicon.png" rel="icon">
        <link href="blue_pumpkin/assets/img/favicon.png" rel="apple-touch-icon">

        <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Jost:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

        <!-- Vendor CSS Files -->
        <link href="blue_pumpkin/assets/vendor/aos/aos.css" rel="stylesheet">
        <link href="blue_pumpkin/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="blue_pumpkin/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
        <link href="blue_pumpkin/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
        <link href="blue_pumpkin/assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
        <link href="blue_pumpkin/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
        <link href="blue_pumpkin/assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">

        <!-- Template Main CSS File -->
        <link href="blue_pumpkin/assets/css/style.css" rel="stylesheet">


        <style>


            /* INTERNAL CSS */
            .button-85 {
                padding: 0.6em 2em;
                border: none;
                outline: none;
                color: rgb(255, 255, 255);
                background: #111;
                cursor: pointer;
                position: relative;
                z-index: 0;
                border-radius: 10px;
                user-select: none;
                -webkit-user-select: none;
                touch-action: manipulation;
            }

            .button-85:before {
                content: "";
                background: linear-gradient(
                    45deg,
                    #ff0000,
                    #ff7300,
                    #fffb00,
                    #48ff00,
                    #00ffd5,
                    #002bff,
                    #7a00ff,
                    #ff00c8,
                    #ff0000
                    );
                position: absolute;
                top: -2px;
                left: -2px;
                background-size: 400%;
                z-index: -1;
                filter: blur(5px);
                -webkit-filter: blur(5px);
                width: calc(100% + 4px);
                height: calc(100% + 4px);
                animation: glowing-button-85 20s linear infinite;
                transition: opacity 0.3s ease-in-out;
                border-radius: 10px;
            }

            @keyframes glowing-button-85 {
                0% {
                    background-position: 0 0;
                }
                50% {
                    background-position: 400% 0;
                }
                100% {
                    background-position: 0 0;
                }
            }

            .button-85:after {
                z-index: -1;
                content: "";
                position: absolute;
                width: 100%;
                height: 100%;
                background: #222;
                left: 0;
                top: 0;
                border-radius: 10px;
            } 
        </style>
    </head>

    <body>


        <%
//                 SESSION VALIDATION

            if (session == null) {
                response.sendRedirect("index.jsp");
            }

//     GETTING REQUIRED SESSIONS
            String username = session.getAttribute("Ename").toString();
            String e_number = session.getAttribute("Enumber").toString();
        %>  

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top header-inner-pages">
            <div class="container d-flex align-items-center">


                <h1 class="logo me-auto"><a href="index.jsp"><img src="blue_pumpkin/assets/img/favicon.png">lue Pumpkin</a></h1>


                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <li><a class="nav-link scrollto" href="#about">About-Us</a></li>
                        <li><a class="nav-link   scrollto" href="#portfolio">Events</a></li>
                        <li><a class="nav-link scrollto" href="#team">Winners</a></li>
                        <li class="nav-link scrollto"><a href="#faq">Faq</a></li>
                        <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
                        <li style="padding-left: 70px;"><a class="getstarted scrollto">Logged-In</a></li>

                        <!--GETTING SESSIONS FORM LOGIN PAGE-->

                        <%
                            if (!(session.getAttribute("Erole") == null)) {
                        %> 

                        <li><a class="nav-link scrollto"><%= username%></a></li>
                            <%
                            } else {%> 
                        <li><a class="nav-link scrollto"><%= username%></a></li> <%
                            }


                            %> 
                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav><!-- .navbar -->

            </div>
        </header><!-- End Header -->

        <main id="main">

            <!-- ======= Breadcrumbs ======= -->
            <section id="breadcrumbs" class="breadcrumbs">
                <div class="container">

                    <ol>
                        <li><a href="index.jsp">Home</a></li>
                        <li>Event Details</li>
                    </ol>
                    <h2>Event Details</h2>

                </div>
            </section><!-- End Breadcrumbs -->

            <!--SHOWING MORE DETAILS FOR A GIVEN EVENT USING A SESSION NAMED EVENT_ID-->
            <%//          GETTING EVENT INFO USING A SESSION NAMED EVENT_ID AND CONVERTING INTO AN INTEGER
                String n = request.getParameter("event_id");
                int event_id = Integer.parseInt(n);

                String agenda = "";
                String participates = "";
                String duration = "";
                String start_date = "";
                String end_date = "";
                String location = "";
                String description = "";
                String event_type = "";

                try {
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

                    //            GETTING EVENT INFO USING A SESSION NAMED EVENT_ID FROM DB
                    String sql = "SELECT * FROM event_tbl WHERE event_id=?";
                    pre = con.prepareStatement(sql);
                    pre.setInt(1, event_id);

                    ResultSet result = pre.executeQuery();
                    //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
                    while (result.next()) {
                        agenda = result.getString("agenda");
                        participates = result.getString("participates");
                        duration = result.getString("duration");
                        start_date = result.getString("start_date");
                        end_date = result.getString("end_date");
                        location = result.getString("location");
                        description = result.getString("description");
                        event_type = result.getString("event_type");
                    }

                    //CLOSE ALL RESOURCES
                    con.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                    out.print(ex);
                }

            %>

            <!-- ======= Portfolio Details Section ======= -->
            <section id="portfolio-details" class="portfolio-details">
                <div class="container">

                    <div class="row gy-4">

                        <div class="col-lg-8">
                            <div class="portfolio-details-slider swiper">
                                <div class="swiper-wrapper align-items-center">

                                    <div >
                                        <img src="blue_pumpkin/assets/img/event.jpg" style=" padding-left:50px; border: 1px #cccccc  dotted" height="450px" width="550px"  alt="">
                                    </div>

                                </div>
                                <div class="swiper-pagination"></div>
                            </div>
                        </div>

                        <!--DISPLAYING RESULTS FROM THE DB-->
                        <div class="col-lg-4">
                            <div class="portfolio-info">
                                <h3><%= agenda%></h3>
                                <ul>
                                    <li><strong>Category</strong> : <%= event_type%></li>
                                    <li><strong>Location</strong> : <%= location%></li>
                                    <li><strong>Participants</strong> :  <%= participates%></li>
                                    <li><strong>Duration</strong> : <a href="#"><%= duration%></a></li>
                                </ul>
                            </div>
                            <div class="portfolio-description">
                                <h2> <%= start_date%> - <%= end_date%> </h2>
                                <p>
                                    <%= description%></p>
                            </div>
                        </div>

                    </div>

                </div>
            </section><!-- End Portfolio Details Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">

            <div class="footer-newsletter">
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-6">



                            <h4>Request To Join Our Event</h4>
                            <tt style="text-transform: capitalize; te" >By pressing the button below, the administration will approve your request to join the event. Further information will be communicated to you respectfully</tt>
                            <!-- HTML !--><br><br>

                            <!--BY pressing the button, administration will approve your request to join the event-->
                            <center> <a href="request_to_join?event_id=<%=event_id%>&&agenda=<%=agenda%>&&event_type=<%=event_type%>&&start_date=<%=start_date%>&&emp_id=<%= e_number%>" class="button-85" role="button">Request To Join</a></center>




                        </div>
                    </div>
                </div>
            </div>

            <div class="footer-top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-3 col-md-6 footer-contact">
                            <h3>Arsha</h3>
                            <p>
                                A108 Adam Street <br>
                                New York, NY 535022<br>
                                United States <br><br>
                                <strong>Phone:</strong> +1 5589 55488 55<br>
                                <strong>Email:</strong> info@example.com<br>
                            </p>
                        </div>

                        <div class="col-lg-3 col-md-6 footer-links">
                            <h4>Useful Links</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Home</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">About us</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Services</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-3 col-md-6 footer-links">
                            <h4>Our Services</h4>
                            <ul>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
                                <li><i class="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
                            </ul>
                        </div>

                        <div class="col-lg-3 col-md-6 footer-links">
                            <h4>Our Social Networks</h4>
                            <p>Cras fermentum odio eu feugiat lide par naso tierra videa magna derita valies</p>
                            <div class="social-links mt-3">
                                <a href="#" class="twitter"><i class="bx bxl-twitter"></i></a>
                                <a href="#" class="facebook"><i class="bx bxl-facebook"></i></a>
                                <a href="#" class="instagram"><i class="bx bxl-instagram"></i></a>
                                <a href="#" class="google-plus"><i class="bx bxl-skype"></i></a>
                                <a href="#" class="linkedin"><i class="bx bxl-linkedin"></i></a>
                            </div>
                        </div>

                    </div>
                </div>
            </div>

            <div class="container footer-bottom clearfix">
                <div class="copyright">
                    &copy; Copyright <strong><span>Arsha</span></strong>. All Rights Reserved
                </div>
                <div class="credits">
                    <!-- All the links in the footer should remain intact. -->
                    <!-- You can delete the links only if you purchased the pro version. -->
                    <!-- Licensing information: https://bootstrapmade.com/license/ -->
                    <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/arsha-free-bootstrap-html-template-corporate/ -->
                    Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
                </div>
            </div>
        </footer><!-- End Footer -->

        <div id="preloader"></div>
        <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

        <!-- Vendor JS Files -->
        <script src="blue_pumpkin/assets/vendor/aos/aos.js"></script>
        <script src="blue_pumpkin/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="blue_pumpkin/assets/vendor/glightbox/js/glightbox.min.js"></script>
        <script src="blue_pumpkin/assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
        <script src="blue_pumpkin/assets/vendor/swiper/swiper-bundle.min.js"></script>
        <script src="blue_pumpkin/assets/vendor/waypoints/noframework.waypoints.js"></script>
        <script src="blue_pumpkin/assets/vendor/php-email-form/validate.js"></script>

        <!-- Template Main JS File -->
        <script src="blue_pumpkin/assets/js/main.js"></script>

    </body>

</html>