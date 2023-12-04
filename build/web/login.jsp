<!--JSP IMPORTS-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Login - Blue Pumpkin</title>
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
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-9 col-lg-12 col-xl-10">
                <br><br>
                <h2 style="color: white; text-align: center;">Blue Pumpkin</h2>
                <div class="card shadow-lg o-hidden border-0 my-5">
                    <div class="card-body p-0">
                        <div class="row">
                            <div class="col-lg-6 d-none d-lg-flex">
                                <div class="flex-grow-1 bg-login-image" style="background-image: url(&quot;assets/img/dogs/smiley.webp&quot;);"></div>
                            </div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center">
                                        <h4 class="text-dark mb-4">Welcome Back!</h4>
                                    </div>
                                    <!--USER LOGIN FORM-->
                                    <form class="user" action="login" method="post">

                                        <div class="form-group"><input class="form-control form-control-user" required type="email" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Enter Email Address..." name="email"/></div>
                                        <div class="form-group"><input class="form-control form-control-user" required type="password" id="exampleInputPassword" placeholder="Password" name="password"/></div>
                                        <div class="form-group">
                                            <div class="custom-control custom-radio small">
                                                <div class="form-check"><input class="form-check-input custom-control-input" required type="radio" id="formCheck-1" name="user" value="administrator"><label class="form-check-label custom-control-label" for="formCheck-1">Administrator</label></div>
                                            </div>
                                             <div class="custom-control custom-radio small">
                                                 <div class="form-check"><input class="form-check-input custom-control-input" required type="radio" id="formCheck-2" name="user" value="employee"><label class="form-check-label custom-control-label" for="formCheck-2" >Employee</label></div>
                                            </div>
                                          
                                        </div><button class="btn btn-primary btn-block text-white btn-user" type="submit">Login</button></form>
                                    <div class="text-center"><a class="small" href="forgotpassword.html">Forgot Password?</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="assets/js/bs-init.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.js"></script>
    <script src="assets/js/theme.js"></script>
</body>

</html>