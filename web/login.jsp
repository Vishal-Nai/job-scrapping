<!DOCTYPE html>
<!-- 
Template Name: MeshJobs Multipurpose Responsive HTML Template
Version: 1.1
Author: DigiSamaritan
Website: digisamaritan.com
Purchase: http://themeforest.net/user/DigiSamaritan 
-->
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<!-- BEGIN HEAD -->


<!-- Mirrored from rulercrm.com/mesh-html-version2/mesh/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 16 Oct 2016 13:41:48 GMT -->
<head>
    <meta charset="utf-8" />
    <title>MeshJobs Multipurpose Responsive HTML Template</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" />
    <meta name="description" content="" />
    <meta name="keywords" content="">
    <meta name="author" content="" />
    <meta name="MobileOptimized" content="320">
    <!--srart theme style -->
    <link href="css/main.css" rel="stylesheet" type="text/css" />
    <!-- end theme style -->
    <!-- favicon links -->
     <link rel="shortcut icon" type="image/png" href="images/favicon.png" />
</head>

<body>
    <!--Loader Start -->
    <div class="mj_preloaded">
        <div class="mj_preloader">
            <div class="lines">
                <div class="line line-1"></div>
                <div class="line line-2"></div>
                <div class="line line-3"></div>
            </div>

            <div class="loading-text">LOADING</div>
        </div>
    </div>
    <!--Loader End -->
    <%@include  file="header.jsp" %>
    <div class="mj_lightgraytbg mj_bottompadder80">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 col-lg-offset-2 col-md-offset-2 col-sm-offset-0 col-xs-offset-0">
                    <div class="mj_mainheading mj_toppadder80 mj_bottompadder50">
                        <h1>l<span>ogin</span> <span>to my</span> A<span>ccount</span></h1>
                        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-6 col-md-6 col-lg-offset-3 col-md-offset-3 col-sm-12 col-xs-12">
                    <div class="mj_pricingtable mj_greentable mj_login_form_wrapper">
                        <form action="loginServ">
                            <div class="mj_login_form">
                                <div class="form-group">
                                    <input type="text" placeholder="Username or Email" id="uname" name="uname" class="form-control">
                                </div>
                                <div class="form-group">
                                    <input type="password" placeholder="Your Password" id="pwd" name="pwd" class="form-control">
                                </div>
                                <div class="row">
                                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 mj_toppadder20">
                                        <div class="form-group  pull-left">
                                            <div class="mj_checkbox">
                                                <input type="checkbox" value="1" id="check2" name="checkbox">
                                                <label for="check2"></label>
                                            </div>
                                            <span> remember me</span>
                                        </div>
                                    </div>
                                    <div class="col-lg-6 col-md-6 col-sm-12 col-xs-12 mj_toppadder20">
                                        <div class="form-group pull-right">
                                            <span><a href="#">forget password ?</a></span>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="mj_pricing_footer">
                                <input type="submit" name="button" value="login" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%@include file="footer.html" %>
</body>


<!-- Mirrored from rulercrm.com/mesh-html-version2/mesh/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 16 Oct 2016 13:41:48 GMT -->
</html>