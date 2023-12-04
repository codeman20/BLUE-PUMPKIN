<%-- 
    Document   : employee_manipulate
    Created on : Mar 17, 2023, 11:12:33 AM
    Author     : test2
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Requested Events - Blue Pumpkin</title>
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
        <div id="wrapper">

            <!--    GETTING SESSION OF EMPLOYEE NUMBER-->
            <% String username = session.getAttribute("Ename").toString(); %>
            <% String e_role = session.getAttribute("Erole").toString(); %>
            <% String e_number = session.getAttribute("Enumber").toString(); %>

            <%
                //                      SESSION VALIDATION
                if ((e_role == null || e_role.equalsIgnoreCase("employee"))) {
                    response.sendRedirect("index.jsp");
                }

            %> 

            <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
                <div class="container-fluid d-flex flex-column p-0">
                    <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                        <div class="sidebar-brand-icon rotate-n-15"><i class="fab fa-weibo"></i></div>
                        <div class="sidebar-brand-text mx-3"><span>Blue Pumpkin</span></div>
                    </a>
                    <hr class="sidebar-divider my-0">
                    <ul class="nav navbar-nav text-light" id="accordionSidebar">

                        <li class="nav-item" role="presentation"><a class="nav-link" href="administration.jsp"><i class="fas fa-tachometer-alt"></i><span>Dashboard </span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link " href="profile.jsp"><i class="fas fa-user"></i><span>Profile</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link" href="registration.jsp"><i class="fas fa-users"></i><span>Registration</span></a>

                        <li class="nav-item" role="presentation"><a class="nav-link" href="winnings.jsp"><i class="fas fa-user-friends"></i><span>Winnings</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link active" href="#"><i class="fab fa-product-hunt"></i><span>Requested events</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link " href="employee_manipulate.jsp"><i class="fas fa-money-check-alt"></i><span>Remove Employee</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link" href="index.jsp"><i class="fa fa-internet-explorer"></i><span>Website </span></a></li>

                    </ul><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button>
                    <div class="text-center d-none d-md-inline"></div>
                </div>
            </nav>
            <div class="d-flex flex-column" id="content-wrapper">
                <div id="content">
                    <nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
                        <div class="container-fluid"> <h3 class=" d-none d-lg-inline mr-2 text-gray-400">Requested Events</h3>

                            <ul class="nav navbar-nav flex-nowrap ml-auto">
                                <div class="d-none d-sm-block topbar-divider"></div>
                                <li class="nav-item dropdown no-arrow" role="presentation">
                                    <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="profile.jsp"><span class="d-none d-lg-inline mr-2 text-gray-600 small"><%= username%></span><img class="border rounded-circle img-profile" src="assets/img/avatars/user.png"></a>
                                        <div
                                            class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu"><a role="presentation" class="dropdown-item" href="profile.jsp"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile</a>
                                            <div class="dropdown-divider"></div> 
                                            <!--LOGOUT BTN CODE-->
                                            <form action="logout" method="post">
                                                <button class="btn btn-none " style="padding-left: 23px"> <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400 small ps-2">
                                                    </i>&nbsp;Logout</button>
                                            </form></div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </nav>

                    <div class="table-responsive pt-3">
                        <div class="table-wrapper">
                            <div class="table-title">


                                <table class="table table-striped table-hover" id="myTable">
                                    <thead>
                                        <tr>

                                            <th>event_id</th>
                                            <th>employee_id</th>
                                            <th>event_type</th>
                                            <th>start_date</th>
                                            <th>status</th>
                                            <th>agenda</th>        
                                            <th>Action</th>                           

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            try {
                                                //                    DATABASE & CONNETCION
                                                Class.forName("com.mysql.jdbc.Driver");
                                                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blue_pumpkin", "root", "");
                                                ResultSet resultSet;
                                                Statement st = conn.createStatement();
                                                //                END OF DATABASE & CONNETCION

                                                //            GETTING EVENT INFO USING A SESSION NAMED EVENT_ID FROM DB
                                                String sql = "select * from request_response_tbl";
                                                resultSet = st.executeQuery(sql);
                                                //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE

                                                while (resultSet.next()) {

                                        %>
                                        <tr>

                                            <td><%=resultSet.getString("id")%></td>
                                            <td><%=resultSet.getString("employee_id")%></td>
                                            <td><%=resultSet.getString("event_type")%></td>
                                            <td><%=resultSet.getString("start_date")%></td>
                                            <td><%=resultSet.getString("status")%></td>
                                            <td><%=resultSet.getString("agenda")%></td>
                                            <td>
                                                <a href="#approvemodal" class="delete" data-toggle="modal"><i class="fas fa-clipboard-check" style='font-size:18px;color:buttonfacelue'></i></a>
                                            </td>
                                        </tr>
                                        <%
                                                }
                                                //CLOSE ALL RESOURCES
                                                conn.close();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                                out.print(e);
                                            }
                                        %>

                                    </tbody>
                                </table>
                            </div>
                        </div>        
                    </div>
                </div>

                <!-- Approve Modal HTML -->

                <!--JAVASCRIPT CODE FOR GETTING INFORMATION FROM THE TABLE INTO THE MODAL ON BEING CLICKED-->                              

                <script>

                    var table = document.getElementById('myTable');

                    for (var i = 1; i < table.rows.length; i++)
                    {
                        table.rows[i].onclick = function ()
                        {
                            //rIndex = this.rowIndex;
                            document.getElementById("d_e_id").value = this.cells[0].innerHTML;
                            document.getElementById("employee_num").value = this.cells[1].innerHTML;

                        };
                    }

                </script>

                <div id="approvemodal" class="modal fade">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <form action="approve" method="post">
                                <div class="modal-header">						
                                    <h4 class="modal-title">Approve Request</h4>
                                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                </div>
                                <div class="modal-body">					
                                    <p>Are you sure you want to approve these Request? </p>
                                    <span id="deleteIdValue"></span>
                                    <p class="text-warning"><small>This action can only be done once.</small></p>
                                    <input type="hidden" name ="d_e_id" required id="d_e_id" >
                                    <input type="hidden" name ="employee_num" required id="employee_num" >
                                </div>
                                <div class="modal-footer">
                                    <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                    <input type="submit" class="btn btn-outline-primary" value="Approve">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>

        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/chart.min.js"></script>
        <script src="assets/js/bs-init.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
        <script src="assets/js/Table-With-Search.js"></script>
        <script src="assets/js/theme.js"></script>
    </body>
</html>
