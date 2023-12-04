<%-- 
    Document   : index
    Created on : Mar 20, 2023, 9:10:26 AM
    Author     : test2
--%>


<!--JSP IMPORTS-->
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta content="width=device-width, initial-scale=1.0" name="viewport">

        <title>Blue Pumpkin</title>
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

        <!-- CSS File -->
        <link href="blue_pumpkin/assets/css/style.css" rel="stylesheet">


    </head>

    <body>

        <!-- ======= Header ======= -->
        <header id="header" class="fixed-top ">
            <div class="container d-flex align-items-center">

                <h1 class="logo me-auto"><a href="index.jsp"><img src="blue_pumpkin/assets/img/favicon.png">lue Pumpkin</a></h1>

                <!-- .navbar -->
                <nav id="navbar" class="navbar">
                    <ul>
                        <li><a class="nav-link scrollto active" href="#hero">Home</a></li>
                        <li><a class="nav-link scrollto" href="#about">About-Us</a></li>
                        <li><a class="nav-link   scrollto" href="#portfolio">Events</a></li>
                        <li><a class="nav-link scrollto" href="#team">Winners</a></li>
                        <li><a class="nav-link scrollto" href="#contact">Contact</a></li>
                        <li class="nav-link scrollto"><a href="profile.jsp">Profile</a></li>
                        <li class="nav-link scrollto"><a href="#faq">Faq</a></li>
                        <li style="padding-left: 70px;"><a class="getstarted scrollto" href="login.jsp" >Login</a></li>

                    </ul>
                    <i class="bi bi-list mobile-nav-toggle"></i>
                </nav>

            </div>
        </header><!-- End Header -->

        <!-- ======= Hero Section ======= -->
        <section id="hero" class="d-flex align-items-center">

            <div class="container">
                <div class="row">
                    <div class="col-lg-6 d-flex flex-column justify-content-center pt-4 pt-lg-0 order-2 order-lg-1" data-aos="fade-up" data-aos-delay="200">
                        <h1>Blue Pumpkin ...</h1>
                        <h2>A Website For Interactive and Entertainment Purpose Of The Employees.</h2>
                        <div class="d-flex justify-content-center justify-content-lg-start">
                            <a href="#about" class="btn-get-started scrollto">Get Started</a>
                        </div>
                    </div>
                    <div class="col-lg-6 order-1 order-lg-2 hero-img" data-aos="zoom-in" data-aos-delay="200">
                        <img src="blue_pumpkin/assets/img/hero-img.png" class="img-fluid animated" alt="">
                    </div>
                </div>
            </div>

        </section><!-- End Hero -->

        <main id="main">

            <!-- ======= Clients Section ======= -->
            <section id="clients" class="clients section-bg">
                <div class="container">

                    <div class="row" data-aos="zoom-in">

                        <div class="col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center">
                            <img src="blue_pumpkin/assets/img/clients/client-1.png" class="img-fluid" alt="">
                        </div>

                        <div class="col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center">
                            <img src="blue_pumpkin/assets/img/clients/client-2.png" class="img-fluid" alt="">
                        </div>

                        <div class="col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center">
                            <img src="blue_pumpkin/assets/img/clients/client-3.png" class="img-fluid" alt="">
                        </div>

                        <div class="col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center">
                            <img src="blue_pumpkin/assets/img/clients/client-4.png" class="img-fluid" alt="">
                        </div>

                        <div class="col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center">
                            <img src="blue_pumpkin/assets/img/clients/client-5.png" class="img-fluid" alt="">
                        </div>

                        <div class="col-lg-2 col-md-4 col-6 d-flex align-items-center justify-content-center">
                            <img src="blue_pumpkin/assets/img/clients/client-6.png" class="img-fluid" alt="">
                        </div>

                    </div>

                </div>
            </section><!-- End Cliens Section -->

            <!-- ======= About Us Section ======= -->
            <section id="about" class="about">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>About Us</h2>
                    </div>

                    <div class="row content">
                        <div class="col-lg-6">
                            <p>
                                We are a marketing agent of an internet marketing company, who
                                provides different services like dial up services and the broadband services.
                            </p>
                            <ul>
                                <li><i class="ri-check-double-line"></i> Social marketing group, automatic group sending | private chat messages, automatic forwarding of messages</li>
                                <li><i class="ri-check-double-line"></i>Global Data Collection Expert, Collect according to keywords or countries and regions, collect mailboxes, mobile phone numbers, search engines</li>
                                <li><i class="ri-check-double-line"></i> SMS landing support in more than 200 countries around the world</li>
                            </ul>
                        </div>
                        <div class="col-lg-6 pt-4 pt-lg-0">
                            <p>

                                Integrates a variety of marketing software into one marketing framework, so that you no longer worry about multi-platform marketing
                            </p>
                            <a href="#" class="btn-learn-more">Learn More</a>
                        </div>
                    </div>

                </div>
            </section><!-- End About Us Section -->


            <!-- ======= Birthdays Section ======= -->
            <section id="services" class="services section-bg">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>Today's Birthdays</h2>
                        <p>“Wishing you a day filled with happiness and a year filled with joy. Hope your special day brings you all that your heart desires! Happy birthday!”</p>
                    </div>
                    <div class="row">
                        <%

                  //          GETTING TODAYS CALENDER CODE
                            Calendar cal = Calendar.getInstance();
                            SimpleDateFormat format1 = new SimpleDateFormat("MM-dd");
                            String formatted = format1.format(cal.getTime());

                            try {
                  //              CLASS && DATABASE CONNECTION REGISTRATION CODE
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                ResultSet resultSet;
                                Statement st = conn.createStatement();
                                String sql = "select employee_id from profile_tbl where DOB='" + formatted + "'";
                                resultSet = st.executeQuery(sql);
                                while (resultSet.next()) {

                  //                  GETTING TODAYS BIRTHDAYS FROM THE DATABASE {CALENDER CODE IS  COMPARD WITH DATABASE DATE CODE TO RETRIVE INDIVIDUALS THAT HAVE BIRTHDAYS TODAY FROM DB}
                                    String employee_number = resultSet.getString("employee_id");
                                    String sql2 = "SELECT * FROM employee_tbl WHERE employee_id='" + employee_number + "'";

                                    st = conn.prepareStatement(sql2);
                                    ResultSet result2 = st.executeQuery(sql2);

                                    while (result2.next()) {
                                        String fname = result2.getString("firstname");
                                        String lname = result2.getString("lastname");
                                        String fullname = fname + " " + lname;

                        %>


                        <!--PRINTING TODAYS BIRTHDAYS-->

                        <div class="col-xl-3 col-md-6 d-flex align-items-stretch" data-aos="zoom-in" data-aos-delay="100">
                            <div class="icon-box">
                                <div class="icon"><i class="bi bi-balloon-heart" style="  cursor:pointer; " onMouseOut="this.style.color = '#0F0'"onMouseOver="this.style.color = '#47b2e4'"></i>
                                    <i class="bi bi-balloon" style="  cursor:pointer; " onMouseOut="this.style.color = '#fcff4b'"onMouseOver="this.style.color = '#47b2e4'"></i>
                                    <i class="bi bi-balloon-heart" style="  cursor:pointer; " onMouseOut="this.style.color = '#eb0000'"onMouseOver="this.style.color = '#47b2e4'">
                                    </i><i class="bi bi-balloon" style="  cursor:pointer; " onMouseOut="this.style.color = '#eb25dc'"onMouseOver="this.style.color = '#47b2e4'"></i>
                                </div>
                                <h4 style="  cursor:pointer;"<a><%= fullname%></a></h4>
                                <p class="mint">It's your special day — wishing you the biggest slice of happy today!</p>
                            </div>
                        </div>



                        <%
                                    }
                                }
                  //CLOSE ALL RESOURCES
                                conn.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                                out.print(e);
                            }
                        %>
                    </div>
                </div>
            </section><!-- End Birthdays Section -->

            <!-- ======= Cta Section ======= -->
            <section id="cta" class="cta">
                <div class="container" data-aos="zoom-in">

                    <div class="row">
                        <div class="col-lg-9 text-center text-lg-start">
                            <h3>Call To Action</h3>
                            <p> Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
                        </div>
                        <div class="col-lg-3 cta-btn-container text-center">
                            <a class="cta-btn align-middle" href="#">Call To Action</a>
                        </div>
                    </div>

                </div>
            </section><!-- End Cta Section -->

            <!-- ======= Portfolio Section ======= -->
            <section id="portfolio" class="portfolio">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>Events</h2>
                        <p>“With the variability and ever-changing landscape of social media, there’s value in reaching our audience where they are most likely to see and read our messages."</p>
                    </div>

                    <ul id="portfolio-flters" class="d-flex justify-content-center" data-aos="fade-up" data-aos-delay="100">
                        <li class="filter-active section-title">All</li>

                    </ul>

                    <div class="row portfolio-container" data-aos="fade-up" data-aos-delay="200">

                        <%
            //                  GETTING ON-COMING EVENTS FROM DATBASE & DEISPLAYING ON UI CODE
                            try {
                                String agenda, event_type, event_id;

            //                CLASS && DATABASE CONNECTION REGISTRATION CODE
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                ResultSet resultSet;
                                Statement st = conn.createStatement();
                                String sql = "select * from event_tbl";
                                resultSet = st.executeQuery(sql);
                                while (resultSet.next()) {

                                    agenda = resultSet.getString("agenda");
                                    event_type = resultSet.getString("event_type");
                                    event_id = resultSet.getString("event_id");

            //                                SETTING UP A SESSION FOR USE ON THE MORE DETAILS ON EVENT PAGE CODE 
                                    session.setAttribute("image_session", event_id);


                        %>

                        <div class="col-lg-4 col-md-6 portfolio-item filter-card border shadow-2-strong rounded-4">
                            <div class="portfolio-img"><img src="blue_pumpkin/assets/img/event.jpg" height="350px" width="350px" class="img-fluid" alt=""></div>
                            <div class="portfolio-info">
                                <h4><%= agenda%></h4>
                                <p><%= event_type%></p>
                                <a href="blue_pumpkin/assets/img/portfolio/portfolio-4.jpg" data-gallery="portfolioGallery" class="portfolio-lightbox preview-link" title="<%= agenda%>"><i class="bx bx-plus"></i></a>
                                <a href="event_details.jsp?event_id=<%= event_id%>" class="details-link" title="More Details"><i class="bx bx-link"></i></a>
                            </div>
                        </div>
                        <%

                                }
 //CLOSE ALL RESOURCES
                                conn.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                                out.print(e);
                            }
                        %>

                    </div>
                </div>

                </div>
            </section><!-- End Portfolio Section -->

            <!-- ======= Winners Section ======= -->
            <section id="team" class="team section-bg">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>Winners</h2>
                        <p>“A champion needs a motivation above and beyond winning. It’s not whether you win or lose, it’s how you play the game.”<sup>       -Grantland Rice</sup></p>
                    </div>

                    <div class="row">


                        <%
                            try {
                                String fulname, lname, fname;
                                String rankings = "";

          //                CLASS && DATABASE CONNECTION REGISTRATION CODE
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                ResultSet resultSet;
                                Statement st = conn.createStatement();
                                String sql = "select * from winners";
                                resultSet = st.executeQuery(sql);
                                while (resultSet.next()) {

                                    // GETTING PAST EVENTS WINNERS & DISPLAYING INTO UI 
                                    fname = resultSet.getString("firstname");
                                    lname = resultSet.getString("lastname");
                                    rankings = resultSet.getString("ranking");
                                    fulname = fname + " " + lname;
                        %>

                        <div class="col-lg-6" data-aos="zoom-in" data-aos-delay="100">
                            <div class="member d-flex align-items-start">
                                <div class="pic"><img src="blue_pumpkin/assets/img/team/team-1.jpg" class="img-fluid" alt=""></div>
                                <div class="member-info">
                                    <h4><%=fulname%></h4>
                                    <span><%=resultSet.getString("competition_name")%></span>
                                    <p><%=resultSet.getString("award")%></p>
                                    <div class="social">

                                        <%
            //                                    DISPLAYING WINNERS INFO INTO UI AND THEIR RATINGS
                                            int rank = Integer.parseInt(rankings);
                                            int i = 0;
                                            while (i <= rank) {

                                        %>
                                        <a href=""><i class="bi bi-trophy-fill" style="color: #8b8b51"></i></a>

                                        <%                                    i++;
                                            }
                                        %>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <%
                                }
           //CLOSE ALL RESOURCES
                                conn.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                                out.print(e);
                            }
                        %>

                    </div>

                </div>
            </section><!-- End Winners Section -->


            <!-- ======= Contact Section ======= -->
            <section id="contact" class="contact">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>Contact</h2>
                        <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
                    </div>

                    <div class="row">

                        <div class="col-lg-5 d-flex align-items-stretch">
                            <div class="info">
                                <div class="address">
                                    <i class="bi bi-geo-alt"></i>
                                    <h4>Location:</h4>
                                    <p>A108 Adam Street, New York, NY 535022</p>
                                </div>

                                <div class="email">
                                    <i class="bi bi-envelope"></i>
                                    <h4>Email:</h4>
                                    <p>info@example.com</p>
                                </div>

                                <div class="phone">
                                    <i class="bi bi-phone"></i>
                                    <h4>Call:</h4>
                                    <p>+1 5589 55488 55s</p>
                                </div>

                                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621" frameborder="0" style="border:0; width: 100%; height: 290px;" allowfullscreen></iframe>
                            </div>

                        </div>

                        <div class="col-lg-7 mt-5 mt-lg-0 d-flex align-items-stretch">
                            <form action="#" method="post" role="form" class="php-email-form">
                                <div class="row">
                                    <div class="form-group col-md-6">
                                        <label for="name">Your Name</label>
                                        <input type="text" name="name" class="form-control" id="name" required>
                                    </div>
                                    <div class="form-group col-md-6">
                                        <label for="name">Your Email</label>
                                        <input type="email" class="form-control" name="email" id="email" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="name">Subject</label>
                                    <input type="text" class="form-control" name="subject" id="subject" required>
                                </div>
                                <div class="form-group">
                                    <label for="name">Message</label>
                                    <textarea class="form-control" name="message" rows="10" required></textarea>
                                </div>
                                <div class="my-3">
                                    <div class="loading">Loading</div>
                                    <div class="error-message"></div>
                                    <div class="sent-message">Your message has been sent. Thank you!</div>
                                </div>
                                <div class="text-center"><button type="submit">Send Message</button></div>
                            </form>
                        </div>

                    </div>

                </div>
            </section><!-- End Contact Section -->


            <!-- ======= Frequently Asked Questions Section ======= -->
            <section id="faq" class="faq section-bg">
                <div class="container" data-aos="fade-up">

                    <div class="section-title">
                        <h2>Frequently Asked Questions</h2>
                        <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
                    </div>

                    <div class="faq-list">
                        <ul>
                            <li data-aos="fade-up" data-aos-delay="100">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" class="collapse" data-bs-target="#faq-list-1">How to participate in the events? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-1" class="collapse show" data-bs-parent=".faq-list">
                                    <p>
                                        Feugiat pretium nibh ipsum consequat. Tempus iaculis urna id volutpat lacus laoreet non curabitur gravida. Venenatis lectus magna fringilla urna porttitor rhoncus dolor purus non.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="200">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-2" class="collapsed">What if I am unable to login into the site? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-2" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        Dolor sit amet consectetur adipiscing elit pellentesque habitant morbi. Id interdum velit laoreet id donec ultrices. Fringilla phasellus faucibus scelerisque eleifend donec pretium. Est pellentesque elit ullamcorper dignissim. Mauris ultrices eros in cursus turpis massa tincidunt dui.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="300">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-3" class="collapsed">What if I am unable to send the participation request for the event? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-3" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        Eleifend mi in nulla posuere sollicitudin aliquam ultrices sagittis orci. Faucibus pulvinar elementum integer enim. Sem nulla pharetra diam sit amet nisl suscipit. Rutrum tellus pellentesque eu tincidunt. Lectus urna duis convallis convallis tellus. Urna molestie at elementum eu facilisis sed odio morbi quis
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="400">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-4" class="collapsed">Tempus quam pellentesque nec nam aliquam sem et tortor consequat? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-4" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        Molestie a iaculis at erat pellentesque adipiscing commodo. Dignissim suspendisse in est ante in. Nunc vel risus commodo viverra maecenas accumsan. Sit amet nisl suscipit adipiscing bibendum est. Purus gravida quis blandit turpis cursus in.
                                    </p>
                                </div>
                            </li>

                            <li data-aos="fade-up" data-aos-delay="500">
                                <i class="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-5" class="collapsed">How can one be intimated with the upcoming events? <i class="bx bx-chevron-down icon-show"></i><i class="bx bx-chevron-up icon-close"></i></a>
                                <div id="faq-list-5" class="collapse" data-bs-parent=".faq-list">
                                    <p>
                                        Laoreet sit amet cursus sit amet dictum sit amet justo. Mauris vitae ultricies leo integer malesuada nunc vel. Tincidunt eget nullam non nisi est sit amet. Turpis nunc eget lorem dolor sed. Ut venenatis tellus in metus vulputate eu scelerisque.
                                    </p>
                                </div>
                            </li>

                        </ul>
                    </div>

                </div>
            </section><!-- End Frequently Asked Questions Section -->

        </main><!-- End #main -->

        <!-- ======= Footer ======= -->
        <footer id="footer">

            <div class="footer-top">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-3 col-md-6 footer-contact">
                            <h3>Blue Pumpkin</h3>
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
                    &copy; Copyright <strong><span>Blue Pumpkin</span></strong>. All Rights Reserved
                </div>
                <div class="credits">
                    Designed by <a href="#">Blue Pumpkin</a>
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
