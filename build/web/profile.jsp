<%-- 
    Document   : profile
    Created on : Mar 17, 2023, 9:54:10 AM
    Author     : test2
--%>
<!--JSP IMPORTS-->
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile - Blue Pumpkin</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
        <link rel="stylesheet" href="assets/css/Table-With-Search-1.css">
        <link rel="stylesheet" href="assets/css/Table-With-Search.css">
    </head>
    <body>

        <!--GETTING SESSION OF EMPLOYEE NUMBER-->
        <% String username = session.getAttribute("Ename").toString(); %>
        <% String e_role = session.getAttribute("Erole").toString(); %>
        <% String e_number = session.getAttribute("Enumber").toString(); %>

        <%
            //          SESSION VALIDATION: IF EMPLOYEE THE UI WILL REMOVE SOME OF THE ATTRIBUTES OF THE NAVIGATION BAR
            if ((e_role == null) || e_role.equalsIgnoreCase("employee")) {
        %> 

        <div id="wrapper">



            <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
                <div class="container-fluid d-flex flex-column p-0">
                    <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                        <div class="sidebar-brand-icon rotate-n-15"><i class="fab fa-weibo"></i></div>
                        <div class="sidebar-brand-text mx-3"><span>Blue Pumpkin</span></div>
                    </a>
                    <hr class="sidebar-divider my-0">
                    <ul class="nav navbar-nav text-light" id="accordionSidebar">


                        <li class="nav-item" role="presentation"><a class="nav-link active" href="index.jsp"><i class="fa fa-internet-explorer"></i><span>Website </span></a></li>

                        <div class="text-center d-none d-md-inline"></div>
                </div>
            </nav>

            <div class="row">
                <div class="col">

                    <nav aria-label="breadcrumb" class="bg-light rounded-3 p-3 mb-4">

                    </nav>
                </div>
            </div>

            <!--<div class="row">-->
            <div class="col-lg-4 pt-5">

                <%! String fn, ln, ep, em, ph, ro; %>
                <%! String an;%> 
                <%
                    try {
                        //                    DATABASE & CONNETCION
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                        ResultSet resultSet;

                        Statement st = conn.createStatement();
                        //                END OF DATABASE & CONNETCION

                        //            GETTING EVENT INFO USING A SESSION NAMED EMPLOYEE NUMBER FROM DB
                        String sql = "select * from employee_tbl where employee_id='" + e_number + "'";
                        resultSet = st.executeQuery(sql);
                        while (resultSet.next()) {
                            //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
                            fn = resultSet.getString("firstname");
                            ln = resultSet.getString("lastname");
                            ep = resultSet.getString("employee_id");
                            em = resultSet.getString("email");
                            ph = resultSet.getString("phone_num");
                            ro = resultSet.getString("role");
                        }

                        //CLOSE ALL RESOURCES
                        conn.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                        out.print(e);
                    }
                %>

                <div class="card mb-4">
                    <div class="card-body text-center">
                        <!--DISPALYING EMPLOYEE INFOMATION FROM THE DB-->
                        <img src="getImage.jsp" alt="avatar" class="rounded-circle img-fluid" style="width: 150px;height: 150px">
                        <h5 class="my-3"><%=fn%>  <%=ln%></h5>
                        <p class="text-muted mb-1"><%=ep%></p>
                        <p class="text-muted mb-4"><%=em%></p>
                        <div class="d-flex justify-content-center mb-2">
                        </div>
                    </div>
                </div>
                <div class="card mb-4 mb-lg-0">
                    <!--THIS IS TO SHOW CASE THE USERS WINNINGS / AWARDS FROM PREVIUS COMPETITIONS-->
                    <p class="mb-4 mx-auto mt-3"><span class="text-primary font-italic me-1">Awards</span> For Me
                    </p>

                    <div class="card-body p-0">

                        <ul class="list-group list-group-flush rounded-3">


                            <%
                                try {
                                    //                    DATABASE & CONNETCION
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                    ResultSet resultSet;

                                    Statement st = conn.createStatement();
                                    //                END OF DATABASE & CONNETCION
                                    //            GETTING EVENT INFO USING A SESSION NAMED EMPLOYEMENT NUMBER FROM DB
                                    String sql = "select * from winners where employeee_id='" + e_number + "'";
                                    resultSet = st.executeQuery(sql);

                                    //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
                                    while (resultSet.next()) {
                                        an = resultSet.getString("award");

                            %>
                            <li class="list-group-item d-flex justify-content-between align-items-center p-3">
                                <i class="fas fa-globe fa-lg text-warning"></i>
                                <!--DISPLAYING INDIVIDUALS AWARD INFO ONTO UI-->
                                <p class="mb-0"><%=an%></p>
                            </li>
                            <%
                                    }
                                    //CLOSE ALL RESOURCES
                                    conn.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    out.print(e);
                                }
                            %>

                        </ul>
                    </div>

                </div>
            </div>
            <div class="col-lg-6 pt-5">
                <div class="card mb-4">
                    <div class="card-body">
                        <!--DISLPLAYING INDIVIDUAL INFO ONTO UI-->
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Full Name</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><%=fn%> <%=ln%></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Employee Number</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><%=ep%></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Email</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><%=em%></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Mobile</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><%=ph%></p>
                            </div>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-sm-3">
                                <p class="mb-0">Employee Role</p>
                            </div>
                            <div class="col-sm-9">
                                <p class="text-muted mb-0"><%=ro%></p>
                            </div>
                        </div>
                        <br>

                    </div>
                </div>
                <div class="row mt-1">
                    <div class="col-md-12">        <!--     //MORE INFO ABOUT INDIVUDUAL FORM-->
                        <div class="card mb-4 mb-md-0">
                            <div class="mb-4 mb-lg-0">
                                <p class="mb-4 mx-auto mt-3 text-center"><span class="text-primary font-italic me-1">More</span> Of Me</p>


                                <form action="more_info" method="post" enctype='multipart/form-data'>
                                    <div class="form-row">
                                        <div class="col">
                                            <div class="form-group"><label for="username"><strong>Date Of Birth</strong></label><input class="form-control" type="date" placeholder="mm/dd" name="dob" required></div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="col">
                                            <div class="form-group"><label for="username"><strong>Age</strong></label><input class="form-control" type="text" placeholder="Age" name="age" required></div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="col">
                                            <div class="form-group"><label for="username"><strong>Gender</strong></label><input class="form-control" type="text" placeholder="Gender" name="gender" required></div>
                                        </div>
                                    </div>
                                    <div class="form-row">
                                        <div class="col">
                                            <div class="form-group"><input class="form-control" type="hidden" placeholder="Gender" name="employee_num" value="<%=ep%>" required></div>
                                        </div><br>
                                        <div class="col">
                                            <div class="form-group"><label for="username"><strong>Photo</strong></label><input class="form-control" type="file" placeholder="Gender" name="image" required></div>
                                        </div>
                                    </div>
                                    <div class="form-group float-right"><button class="btn btn-primary btn-sm" type="submit">Update Info</button></div>

                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>
            <!--</div>-->
            <%
            } //          SESSION VALIDATION: IF ADMIN THE UI WILL SHOW ALL OF THE ATTRIBUTES OF THE NAVIGATION BAR
            else if ((e_role == null) || e_role.equalsIgnoreCase("administrator")) {
            %>



            <div id="wrapper">



                <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
                    <div class="container-fluid d-flex flex-column p-0">
                        <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                            <div class="sidebar-brand-icon rotate-n-15"><i class="fab fa-weibo"></i></div>
                            <div class="sidebar-brand-text mx-3"><span>Blue Pumpkin</span></div>
                        </a>
                        <hr class="sidebar-divider my-0">
                        <ul class="nav navbar-nav text-light" id="accordionSidebar">

                            <li class="nav-item" role="presentation"><a class="nav-link" href="administration.jsp"><i class="fas fa-tachometer-alt"></i><span>Dashboard </span></a></li>

                            <li class="nav-item" role="presentation"><a class="nav-link active" href="#"><i class="fas fa-user"></i><span>Profile</span></a></li>

                            <li class="nav-item" role="presentation"><a class="nav-link" href="registration.jsp"><i class="fas fa-users"></i><span>Registration</span></a>

                            <li class="nav-item" role="presentation"><a class="nav-link" href="winnings.jsp"><i class="fas fa-user-friends"></i><span>Winnings</span></a></li>

                            <li class="nav-item" role="presentation"><a class="nav-link " href="requested_events.jsp"><i class="fab fa-product-hunt"></i><span>Requested events</span></a></li>

                            <li class="nav-item" role="presentation"><a class="nav-link" href="employee_manipulate.jsp"><i class="fas fa-money-check-alt"></i><span>Remove Employee</span></a></li>

                            <li class="nav-item" role="presentation"><a class="nav-link" href="index.jsp"><i class="fa fa-internet-explorer"></i><span>Website </span></a></li>

                            <div class="text-center d-none d-md-inline"></div>
                    </div>
                </nav>


                <div class="row">
                    <div class="col">

                        <nav aria-label="breadcrumb" class="bg-light rounded-3 p-3 mb-4">

                        </nav>
                    </div>
                </div>

                <!--<div class="row">-->
                <div class="col-lg-4 pt-5">

                    <%
                        try {
                            //                    DATABASE & CONNETCION
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                            ResultSet resultSet;

                            Statement st = conn.createStatement();
                            //                END OF DATABASE & CONNETCION

                            //            GETTING EVENT INFO USING A SESSION NAMED EMPLOYEE NUMBER FROM DB
                            String sql = "select * from employee_tbl where employee_id='" + e_number + "'";
                            resultSet = st.executeQuery(sql);
                            while (resultSet.next()) {
                                //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
                                fn = resultSet.getString("firstname");
                                ln = resultSet.getString("lastname");
                                ep = resultSet.getString("employee_id");
                                em = resultSet.getString("email");
                                ph = resultSet.getString("phone_num");
                                ro = resultSet.getString("role");
                            }

                            //CLOSE ALL RESOURCES
                            conn.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                            out.print(e);
                        }
                    %>

                    <div class="card mb-4">
                        <div class="card-body text-center">
                            <!--DISPALYING EMPLOYEE INFOMATION FROM THE DB-->
                            <img src="getImage.jsp" alt="avatar" class="rounded-circle img-fluid" style="width: 150px;height: 150px">
                            <h5 class="my-3"><%=fn%>  <%=ln%></h5>
                            <p class="text-muted mb-1"><%=ep%></p>
                            <p class="text-muted mb-4"><%=em%></p>
                            <div class="d-flex justify-content-center mb-2">
                            </div>
                        </div>
                    </div>
                    <div class="card mb-4 mb-lg-0">
                        <!--THIS IS TO SHOW CASE THE USERS WINNINGS / AWARDS FROM PREVIUS COMPETITIONS-->
                        <p class="mb-4 mx-auto mt-3"><span class="text-primary font-italic me-1">Awards</span> For Me
                        </p>

                        <div class="card-body p-0">

                            <ul class="list-group list-group-flush rounded-3">


                                <%
                                    try {
                                        //                    DATABASE & CONNETCION
                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                        ResultSet resultSet;

                                        Statement st = conn.createStatement();
                                        //                END OF DATABASE & CONNETCION
                                        //            GETTING EVENT INFO USING A SESSION NAMED EMPLOYEMENT NUMBER FROM DB
                                        String sql = "select * from winners where employeee_id='" + e_number + "'";
                                        resultSet = st.executeQuery(sql);

                                        //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE
                                        while (resultSet.next()) {
                                            an = resultSet.getString("award");

                                %>
                                <li class="list-group-item d-flex justify-content-between align-items-center p-3">
                                    <i class="fas fa-globe fa-lg text-warning"></i>
                                    <!--DISPLAYING INDIVIDUALS AWARD INFO ONTO UI-->
                                    <p class="mb-0"><%=an%></p>
                                </li>
                                <%
                                        }
                                        //CLOSE ALL RESOURCES
                                        conn.close();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        out.print(e);
                                    }
                                %>

                            </ul>
                        </div>

                    </div>
                </div>
                <div class="col-lg-6 pt-5">
                    <div class="card mb-4">
                        <div class="card-body">
                            <!--DISPLAYING INDIVIDUAL INFO ONTO UI-->
                            <div class="row">
                                <div class="col-sm-3">
                                    <p class="mb-0">Full Name :</p>
                                </div>
                                <div class="col-sm-9">
                                    <p class="text-muted mb-0"><%=fn%> <%=ln%></p>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <p class="mb-0">Employee Number :</p>
                                </div>
                                <div class="col-sm-9">
                                    <p class="text-muted mb-0"><%=ep%></p>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <p class="mb-0">Email :</p>
                                </div>
                                <div class="col-sm-9">
                                    <p class="text-muted mb-0"><%=em%></p>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <p class="mb-0">Mobile :</p>
                                </div>
                                <div class="col-sm-9">
                                    <p class="text-muted mb-0"><%=ph%></p>
                                </div>
                            </div>
                            <hr>
                            <div class="row">
                                <div class="col-sm-3">
                                    <p class="mb-0">Employee Role :</p>
                                </div>
                                <div class="col-sm-9">
                                    <p class="text-muted mb-0"><%=ro%></p>
                                </div>
                            </div>
                            <br>

                        </div>
                    </div>
                    <div class="row mt-1">
                        <div class="col-md-12">        <!--     //MORE INFO ABOUT INDIVIDUAL FORM-->
                            <div class="card mb-4 mb-md-0">
                                <div class="mb-4 mb-lg-0">
                                    <p class="mb-4 mx-auto mt-3 text-center"><span class="text-primary font-italic me-1">More</span> Of Me</p>


                                    <form action="more_info" method="post" enctype='multipart/form-data'>
                                        <div class="form-row">
                                            <div class="col">
                                                <div class="form-group"><label for="username"><strong>Date Of Birth</strong></label><input class="form-control" type="date" placeholder="mm/dd" name="dob" required></div>
                                            </div>
                                        </div>
                                        <div class="form-row">
                                            <div class="col">
                                                <div class="form-group"><label for="username"><strong>Age</strong></label><input class="form-control" type="text" placeholder="Age" name="age" required></div>
                                            </div>
                                        </div>
                                        <div class="form-row">
                                            <div class="col">
                                                <div class="form-group"><label for="username"><strong>Gender</strong></label><input class="form-control" type="text" placeholder="Gender" name="gender" required></div>
                                            </div>
                                        </div>
                                        <div class="form-row">
                                            <div class="col">
                                                <div class="form-group"><input class="form-control" type="hidden" placeholder="Gender" name="employee_num" value="<%=ep%>" required></div>
                                            </div><br>
                                            <div class="col">
                                                <div class="form-group"><label for="username"><strong>Photo</strong></label><input class="form-control" type="file" placeholder="Gender" name="image" required></div>
                                            </div>
                                        </div>
                                        <div class="form-group float-right"><button class="btn btn-primary btn-sm" type="submit">Update Info</button></div>

                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
                <!--</div>-->
                <%
                    }
                %>
                </body>
                </html>
