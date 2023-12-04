<%-- 
    Document   : login
    Created on : Mar 16, 2023, 11:08:01 AM
    Author     : test2
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Register - Blue Pumpkin</title>
    <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i">
    <link rel="stylesheet" href="assets/fonts/fontawesome-all.min.css">
    <link rel="stylesheet" href="assets/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="assets/fonts/typicons.min.css">
    <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css">
    <link rel="stylesheet" href="assets/css/FPE-Gentella-form-elements-1.css">
    <link rel="stylesheet" href="assets/css/FPE-Gentella-form-elements.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css">
</head>

<body class="bg-gradient-primary">
        <div id="wrapper">
            
  <% String username=session.getAttribute("Ename").toString(); %>
      <% String e_role=session.getAttribute("Erole").toString(); %>
      <% String e_number=session.getAttribute("Enumber").toString(); %>
 
      <%
          if((session.getAttribute("Erole") == null || e_role.equalsIgnoreCase("employee"))){
              response.sendRedirect("index.jsp");
          }

          %>    
          
            <nav class="navbar navbar-dark align-items-start sidebar sidebar-dark accordion bg-gradient-primary p-0">
            <div class="container-fluid d-flex flex-column p-0"  style="margin-top:100px">
                <a class="navbar-brand d-flex justify-content-center align-items-center sidebar-brand m-0" href="#">
                    <div class="sidebar-brand-icon rotate-n-15"><i class="fab fa-weibo"></i></div>
                    <div class="sidebar-brand-text mx-3"><span>Blue Pumpkin</span></div>
                </a>
                <hr class="sidebar-divider my-0">
                <ul class="nav navbar-nav text-light" id="accordionSidebar">
                 
                    <li class="nav-item" role="presentation"><a class="nav-link " href="administration.jsp"><i class="fas fa-tachometer-alt"></i><span>Dashboard </span></a></li>
                 
                    <li class="nav-item" role="presentation"><a class="nav-link " href="profile.jsp"><i class="fas fa-user"></i><span>Profile</span></a></li>
                
                    <li class="nav-item" role="presentation"><a class="nav-link active" href="#"><i class="fas fa-users"></i><span>Registration</span></a>
               
                    <li class="nav-item" role="presentation"><a class="nav-link" href="winnings.jsp"><i class="fas fa-user-friends"></i><span>Winnings</span></a></li>
              
                        <li class="nav-item" role="presentation"><a class="nav-link " href="requested_events.jsp"><i class="fab fa-product-hunt"></i><span>Requested events</span></a></li>
                  
                    <li class="nav-item" role="presentation"><a class="nav-link" href="employee_manipulate.jsp"><i class="fas fa-money-check-alt"></i><span>Remove Employee</span></a></li>

                                        <li class="nav-item" role="presentation"><a class="nav-link" href="index.jsp"><i class="fa fa-internet-explorer"></i><span>Website </span></a></li>

                </ul><button class="btn rounded-circle border-0" id="sidebarToggle" type="button"></button>
                <div class="text-center d-none d-md-inline"></div>
            </div>
        </nav>
    <div class="container">
                    <br><br>
                <h2 style="color: white; text-align: center;">Blue Pumpkin</h2>
        <div class="card shadow-lg o-hidden border-0 my-5">

            <div class="card-body p-0">
                <div class="row">
                    <div class="col-lg-5 d-none d-lg-flex">
                        <div class="flex-grow-1 bg-register-image" style="background-image: url(&quot;assets/img/dogs/smiling-face.webp&quot;);"></div>
                    </div>
                    <div class="col-lg-7">
                        <div class="p-5">
                            <div class="text-center">
                                <h4 class="text-dark mb-4">Create an Account!</h4>
                            </div>
                            <form class="user" action ="register" method="Post">
                                <div class="form-group">
                                            <div class="custom-control custom-radio small">
                                                <div class="form-check"><input class="form-check-input custom-control-input" type="radio" id="formCheck-1" name="user" value="administrator"><label class="form-check-label custom-control-label" for="formCheck-1">Administrator</label></div>
                                                <span id="adminCode"></span>
                                            </div>
                                             <div class="custom-control custom-radio small">
                                                 <div class="form-check"><input class="form-check-input custom-control-input" type="radio" id="formCheck-2" name="user" value="employee"><label class="form-check-label custom-control-label" for="formCheck-2" >Employee</label></div>
                                            </div>
                                        </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="text" id="exampleFirstName" placeholder="Firstname" name="firstname"></div>
                                    <div class="col-sm-6"><input class="form-control form-control-user" type="text" id="exampleLastName" placeholder="Lastname" name="lastname"></div>
                                </div>
                                  <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="text" id="exampleFirstName" placeholder="Employee Number" name="employee"></div>
                                    <div class="col-sm-6"><input class="form-control form-control-user" type="text" id="exampleLastName" placeholder="Phone Number" name="phone"></div>
                                </div>
                                <div class="form-group"><input class="form-control form-control-user" type="email" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Email Address" name="email"></div>
                                <div class="form-group"><span id="empName"></span></div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0"><input class="form-control form-control-user" type="password" id="examplePasswordInput" placeholder="Password" name="password"></div>
                                    <div class="col-sm-6"><input class="form-control form-control-user" type="password" id="exampleRepeatPasswordInput1" placeholder="Confirm Password" name="passwordConfirm"></div>
                                </div>
                                
                                <button class="btn btn-primary btn-block text-white btn-user" type="submit">Register Account</button>
                            </form>
<!--                            <div class="text-center"><a class="small" href="forgot_password.jsp">Forgot Password?</a></div>-->
                            <div class="text-center"><a class="small" href="login.jsp">Already have an account? Login!</a></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!--<script>
$(document).ready(function(){
    $('input:checkbox').click(function() {
        $('input:checkbox').not(this).prop('checked', false);
    });
});

 document.getElementById("formCheck-2").addEventListener('click', event => {
     
     if(document.getElementById("formCheck-2").checked == false){
         document.getElementById("exampleFirstName").setAttribute("placeholder","Long Name");
         document.getElementById("exampleLastName").setAttribute("placeholder","Short Name");
         document.getElementById("examplePasswordInput").setAttribute("placeholder","Password");
        document.getElementById("exampleRepeatPasswordInput1").setAttribute("placeholder","Repeat Password");
        document.getElementById("empName").innerHTML = '';
     }else{
         document.getElementById("empName").innerHTML = '<input class="form-control form-control-user" type="text"placeholder="Employee Name" name="name">';
         document.getElementById("examplePasswordInput").setAttribute("placeholder","Employee Number");
        document.getElementById("exampleRepeatPasswordInput1").setAttribute("placeholder","Repeat Number");
        document.getElementById("exampleFirstName").setAttribute("placeholder","Department Name");
        document.getElementById("exampleLastName").setAttribute("placeholder","Service Name");
     }
 });
 
  document.getElementById("formCheck-1").addEventListener('click', event => {
     if(document.getElementById("formCheck-1").checked == false){
         document.getElementById("adminCode").innerHTML = '';
         document.getElementById("exampleFirstName").setAttribute("placeholder","Long Name");
         document.getElementById("exampleLastName").setAttribute("placeholder","Short Name");
     }else{
          document.getElementById("adminCode").innerHTML =  '<input class="form-control form-control-user" type="text" placeholder="Admin Code" name="adminCode">';
         document.getElementById("exampleFirstName").setAttribute("placeholder","First Name");
         document.getElementById("exampleLastName").setAttribute("placeholder","Last Name");
         document.getElementById("examplePasswordInput").setAttribute("placeholder","Password");
        document.getElementById("exampleRepeatPasswordInput1").setAttribute("placeholder","Repeat Password");
     }
     
 });
 
  document.getElementById("formCheck-3").addEventListener('click', event => {
     if(document.getElementById("formCheck-1").checked == true){
         document.getElementById("exampleFirstName").setAttribute("placeholder","Long Name");
         document.getElementById("exampleLastName").setAttribute("placeholder","Short Name");
         document.getElementById("examplePasswordInput").setAttribute("placeholder","Password");
        document.getElementById("exampleRepeatPasswordInput1").setAttribute("placeholder","Repeat Password");
     }
 });
     
</script>-->
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>