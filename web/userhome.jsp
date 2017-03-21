<%@page import="model.dummy"%>
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


<!-- Mirrored from rulercrm.com/mesh-html-version2/mesh/jobs.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 16 Oct 2016 13:39:18 GMT -->
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
    
     <%@include  file="header1.jsp" %>  
      <div class="mj_mapmarker">
        <div id="map"><div class="tp-bgimg defaultimg" style="background-color: rgba(0, 0, 0, 0); background-repeat: no-repeat; background-image: url(&quot;images/sliderbg1.jpg&quot;); background-size: cover; background-position: center center; width: 100%; height: 100%; opacity: 1; visibility: inherit; z-index: 20;" src="images/sliderbg1.jpg"></div> </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                    <div class="mj_top_searchbox">
                        <form action="searchjob">
                            <div class="col-lg-4 col-md-3 col-sm-3 col-xs-12">
                                <div class="form-group">
                                    <input type="text" name="job" class="form-control" placeholder="Enter Skill,Designation Etc">
                                </div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                                			
                                            <div class="form-group">  <select name="location" class="form-control">
                                                    <option value="">Location</option>
									<option>Ahmedabad</option>
									<option>Surat</option>
									<option>Baroda</option>
                                
                                                </select></div>
                            </div>
                            <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12">
                               		 <div class="form-group"><select name="exp" class="form-control">
                                                 <option value="0">Experience</option>
									<option>Fresher</option>
									<option>1</option>
									<option>2</option>
                                                                        <option>3</option>
                                                                        <option>4</option>
                                                                        <option>5</option>
                                                                        <option>6</option>
                                             </select></div>
                            </div>
                            <div class="col-lg-2 col-md-3 col-sm-3 col-xs-12">
                                <input type="submit" value="Search" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="mj_filter_section">
        <div class="container">
            <div class="row">
               
                <%
                    if(request.getAttribute("d")!=null){
                       dummy d=(dummy)request.getAttribute("d"); 
                    %>
                <div class="mj_tabcontent mj_bottompadder80">
                    <table class="table table-striped">
                        <%
                       for(int i=0;i<10;i++){
                        %>
                        <tr>
                            <td>
                                <div class="mj_liks"><a href="#"><i class="fa fa-heart"></i></a><span>Save this Job</span>
                                </div>
                            </td>
                            <td>
                                <a href="#"><img src="images/profilepic1.jpg" class="img-responsive" alt="">
                                </a>
                            </td>
                            <td>
                                <h4><a href="SecondServlet?url=<%=d.getTimesjob().get(i)%>"><%=d.getHeading().getElement(i).innerHTML()%></a></h4>
                                       <p><%=d.getCompany().getElement(i).innerHTML()%></p>
                            </td>
                            <td style="font-size: 15px"><i class="fa fa-map-marker"></i>
                                <P><%=d.getCity().getElement(i).innerHTML()%></P>
                            </td>
                            <td><input type="submit" value="Apply"></td>
                        </tr>
                        <%}%>
                    
                    </table>
                    <div class="col-lg-4 col-md-4 col-sm-12 col-xs-12 col-lg-offset-4 col-md-offset-4">
						<div class="mj_showmore"> <a href="#" class="mj_showmorebtn mj_blackbtn">Show More</a> </div>
					</div>
                </div>
                <%}
                %>
            </div>
        </div>
    </div>
    <!-- Script End -->
</body>

<%@include file="footer.html" %>
<!-- Mirrored from rulercrm.com/mesh-html-version2/mesh/jobs.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 16 Oct 2016 13:39:20 GMT -->
</html>
