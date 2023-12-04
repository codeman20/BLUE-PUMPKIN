<%-- 
    Document   : administration
    Created on : Mar 16, 2023, 1:05:29 PM
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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
        <title>Administration - Blue Pumpkin</title>
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
        <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
        <link rel="stylesheet" href="assets/css/Table-With-Search-1.css">
        <link rel="stylesheet" href="assets/css/Table-With-Search.css">


        <style>
            table tr:not(:first-child){
                cursor: pointer;transition: all .25s ease-in-out;
            }
            table tr:not(:first-child):hover{background-color: #ddd;}
        </style> 
    </head>


    <body id="page-top">

        <!--GETTING SESSION OF EMPLOYEE NUMBER-->
        <% String username = session.getAttribute("Ename").toString(); %>
        <% String e_role = session.getAttribute("Erole").toString(); %>

        <%
            //       SESSION VALIDATION
            if ((e_role == null || e_role.equalsIgnoreCase("employee"))) {
                response.sendRedirect("index.jsp");
            }

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

                        <li class="nav-item" role="presentation"><a class="nav-link " href="profile.jsp"><i class="fas fa-user"></i><span>Profile</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link" href="registration.jsp"><i class="fas fa-users"></i><span>Registration</span></a>

                        <li class="nav-item" role="presentation"><a class="nav-link active" href="#"><i class="fas fa-user-friends"></i><span>Winnings</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link " href="requested_events.jsp"><i class="fab fa-product-hunt"></i><span>Requested events</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link" href="employee_manipulate.jsp"><i class="fas fa-money-check-alt"></i><span>Remove Employee</span></a></li>

                        <li class="nav-item" role="presentation"><a class="nav-link" href="index.jsp"><i class="fa fa-internet-explorer"></i><span>Website </span></a></li>

                    </ul><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button>
                    <div class="text-center d-none d-md-inline"></div>
                </div>
            </nav>
            <div class="d-flex flex-column" id="content-wrapper">
                <div id="content">
                    <nav class="navbar navbar-light navbar-expand bg-white shadow mb-4 topbar static-top">
                        <div class="container-fluid">

                            <ul class="nav navbar-nav flex-nowrap ml-auto">
                                <div class="d-none d-sm-block topbar-divider"></div>
                                <li class="nav-item dropdown no-arrow" role="presentation">
                                    <div class="nav-item dropdown no-arrow"><a class="dropdown-toggle nav-link" data-toggle="dropdown" aria-expanded="false" href="profile.jsp"><span class="d-none d-lg-inline mr-2 text-gray-600 small"><%= username%></span><img class="border rounded-circle img-profile" src="assets/img/avatars/user.png"></a>
                                        <div
                                            class="dropdown-menu shadow dropdown-menu-right animated--grow-in" role="menu"><a role="presentation" class="dropdown-item" href="profile.jsp"><i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Profile</a>
                                            <div class="dropdown-divider"></div>

                                            <form action="logout" method="post">
                                                <button class="btn btn-none " style="padding-left: 23px"> <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400 small ps-2">
                                                    </i>&nbsp;Logout</button>
                                            </form>

                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </nav>

                    <div class="container-fluid">
                        <h3 class="text-dark mb-4">Winnings Portal</h3>
                        <div class="row mb-3">
                            <div class="col-lg-4">
                                <br> <br><br><br>
                                <div class="card mb-3" style="background-image: url(&quot;assets/img/dogs/smiley.webp&quot;);">

                                    <br><br><br><br><br><br><br><br> <br><br><br><br><br><br>
                                </div>

                            </div>
                            <div class="col-lg-8">

                                <div class="row">
                                    <div class="col">
                                        <div class="card shadow mb-3">
                                            <div class="card-header py-3">
                                                <p class="text-primary m-0 font-weight-bold">Create Winning</p>
                                            </div>
                                            <div class="card-body">
                                                <form action="winnings" method="post" enctype='multipart/form-data'>

                                                    <div class="form-row">
                                                        <div class="col">
                                                            <div class="form-group"><label for="username"><strong>Firstname</strong></label><input class="form-control" type="text" placeholder="Firstname" name="Firstname"></div>
                                                        </div>
                                                        <div class="col">
                                                            <div class="form-group"><label for="email"><strong>Lastname</strong></label><input class="form-control" type="text" placeholder="Lastname" name="Lastname"></div>
                                                        </div>
                                                    </div>
                                                    <div class="form-row">
                                                        <div class="col">
                                                            <div class="form-group"><label for="first_name"><strong>Employee Number</strong></label><input class="form-control" type="text" placeholder="Employee Number" name="EmployeeNumber"></div>
                                                        </div>
                                                        <div class="col">
                                                            <div class="form-group"><label for="last_name"><strong>Competition Name</strong></label><input class="form-control" type="text" placeholder="Competition Name" name="CompetitionName"></div>
                                                        </div>
                                                    </div>
                                                    <div class="form-row">
                                                        <div class="col">
                                                            <div class="form-group"><label for="last_name"><strong>Ranking</strong></label><input class="form-control" type="number" placeholder="Ranking" name="Ranking"></div>
                                                        </div>   <div class="col">
                                                            <div class="form-group"><label for="last_name"><strong>Event_id</strong></label><input class="form-control" type="number" placeholder="Event_id" name="Event_id"></div>
                                                        </div>   
                                                    </div>
                                                    <div class="form-group"><label for="last_name"><strong>Award Description</strong></label><input class="form-control form-control-user" type="text" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Award Description" name="Award"></div>
                                                    <div class="form-group"><span id="empName"></span></div>
                                                    <div class="form-row">
                                                        <div class="col">
                                                            <div class="form-group"><label for="last_name"><strong>Award Image</strong></label><input class="form-control" type="file" placeholder="Location" name="AwardImage"></div>
                                                        </div>   <div class="col">
                                                            <div class="form-group"><label for="last_name"><strong>Employee Image</strong></label><input class="form-control" type="file" placeholder="Description" name="EmployeeImage"></div>

                                                        </div>
                                                    </div>
                                                    <div class="form-group"><button class="btn btn-primary btn-sm" type="submit">Add </button></div>
                                                </form>
                                            </div>
                                        </div>
                                        <div class="card shadow">      
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="card shadow mb-5"></div>
                        </div>


                        <div class="card-header py-3">
                            <p class="text-primary m-0 font-weight-bold">Posted Winnings</p>
                            <hr>
                            <div class="container-xl">

                                <div class="table-responsive">
                                    <div class="table-wrapper">
                                        <div class="table-title">

                                            <table class="table table-striped table-hover" id="myTable">
                                                <thead>
                                                    <tr>
                                                        <th>Event ID</th>
                                                        <th>Competition ID</th>
                                                        <th>Firstname</th>
                                                        <th>Lastname</th>
                                                        <th>Employee Number</th>
                                                        <th>Award Description</th>
                                                        <th>Competition Name</th>
                                                        <th>Ranking</th>                        
                                                        <th>Actions</th>

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

                                                            String sql = "select * from winners";
                                                            resultSet = st.executeQuery(sql);
                                                            //          IF TRUE RESULT WILL BE ASSIGNED TON THEIR SPECIFIC VARIABLE AND DISPLAYED ONTO THE UI

                                                            while (resultSet.next()) {

                                                    %>
                                                    <tr>
                                                        <td><%=resultSet.getString("id")%></td>
                                                        <td><%=resultSet.getString("event_id")%></td>
                                                        <td><%=resultSet.getString("firstname")%></td>
                                                        <td><%=resultSet.getString("lastname")%></td>
                                                        <td><%=resultSet.getString("employeee_id")%></td>
                                                        <td><%=resultSet.getString("award")%></td>
                                                        <td><%=resultSet.getString("competition_name")%></td>
                                                        <td><%=resultSet.getString("ranking")%></td>

                                                        <td>
                                                            <a href="#editEventModal" class="edit" data-toggle="modal"><i class='fas fa-marker' style='font-size:18px;color:buttonfacelue'></i></a>
                                                            <a href="#deleteEventModal" class="delete" data-toggle="modal"><i class='fas fa-trash-alt' style='font-size:18px;color:buttonfacelue'></i></a>
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
                        </div>



                        <!-- Edit Modal HTML -->


                        <script>

                            var table = document.getElementById('myTable');

                            for (var i = 1; i < table.rows.length; i++)
                            {
                                table.rows[i].onclick = function ()
                                {
                                    //rIndex = this.rowIndex;
                                    document.getElementById("e_id").value = this.cells[0].innerHTML;
                                    document.getElementById("ename").value = this.cells[1].innerHTML;
                                    document.getElementById("fname").value = this.cells[2].innerHTML;
                                    document.getElementById("lname").value = this.cells[3].innerHTML;
                                    document.getElementById("emp_name").value = this.cells[4].innerHTML;
                                    document.getElementById("award").value = this.cells[5].innerHTML;
                                    document.getElementById("comp_name").value = this.cells[6].innerHTML;
                                    document.getElementById("rank").value = this.cells[7].innerHTML;


//                                delete
                                    document.getElementById("d_e_id").value = this.cells[0].innerHTML;

                                };
                            }

                        </script>




                        <div id="editEventModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="edit_winnings" method="post">
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Edit Winnings</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">
                                            <div class="form-group">
                                                <label>Event ID</label>
                                                <input type="text" class="form-control" name ="e_id" required id="e_id" readonly>
                                            </div>
                                            <div class="form-group">
                                                <label>Competition ID</label>
                                                <input type="text" class="form-control" name ="ename" required id="ename">
                                            </div>
                                            <div class="form-group">
                                                <label>Firstname</label>
                                                <input type="text" class="form-control" name ="fname" required id="fname">
                                            </div>
                                            <div class="form-group">
                                                <label>Lastname</label>
                                                <input type="text" class="form-control" name ="lname" required id="lname">
                                            </div>
                                            <div class="form-group">
                                                <label>Employee Number</label>
                                                <input type="text" class="form-control" name ="emp_name" required id="emp_name">
                                            </div>
                                            <div class="form-group">
                                                <label>Award Description</label>
                                                <input type="text" class="form-control" name ="award" required id="award">
                                            </div>
                                            <div class="form-group">
                                                <label>Competition Name</label>
                                                <input type="text" class="form-control" name ="comp_name" required id="comp_name">
                                            </div>
                                            <div class="form-group">
                                                <label>Rankings</label>
                                                <input type="text" class="form-control" name ="rank" required id="rank">
                                            </div>
                                        </div>
                                        <div class="modal-footer">
                                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                            <input type="submit" class="btn btn-outline-info" value="Update">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!-- Delete Modal HTML -->
                        <div id="deleteEventModal" class="modal fade">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <form action="delete_winnings" method="post">
                                        <div class="modal-header">						
                                            <h4 class="modal-title">Delete Promotion</h4>
                                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                                        </div>
                                        <div class="modal-body">					
                                            <p>Are you sure you want to delete these Records? </p>
                                            <span id="deleteIdValue"></span>
                                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                                            <input type="hidden" name ="d_e_id" required id="d_e_id" >
                                        </div>
                                        <div class="modal-footer">
                                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
                                            <input type="submit" class="btn btn-outline-danger" value="Delete">
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <footer class="bg-white sticky-footer">
                            <div class="container my-auto">
                                <div class="text-center my-auto copyright"><span>Copyright © Blue Pumpkin 2023</span></div>
                            </div>
                        </footer>
                    </div><a class="border rounded d-inline scroll-to-top" href="#page-top"><i class="fas fa-angle-up"></i></a></div>
                <script src="assets/js/jquery.min.js"></script>
                <script src="assets/bootstrap/js/bootstrap.min.js"></script>
                <script src="assets/js/chart.min.js"></script>
                <script src="assets/js/bs-init.js"></script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
                <script src="assets/js/Table-With-Search.js"></script>
                <script src="assets/js/theme.js"></script>
                </body>

                </html>