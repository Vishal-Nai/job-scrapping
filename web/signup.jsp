<%@page import="model.City"%>
<%@page import="java.util.*"%>
<%@page import="model.State"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <!-- Mirrored from rulercrm.com/mesh-html-version2/mesh/create_account.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 16 Oct 2016 13:41:45 GMT -->
    <head>
        <%@include  file="header.jsp" %> 
        
        
        <script type="text/javascript">
            function getCity1()
            {
                
                var sid=document.getElementById("sid").value;
                var url= "getCity?state="+sid;
            
                xmlHttp = new XMLHttpRequest();
                xmlHttp.onreadystatechange = function()
                {
                  if(this.readyState == 4 && this.status == 200)
                  {
                     
                    document.getElementById("city").innerHTML=xmlHttp.responseText;
                  }
                }
                xmlHttp.open("GET",url,true);
                xmlHttp.send();
            }
            
        </script>
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
        <div class="mj_lightgraytbg mj_bottompadder80">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-md-8 col-sm-12 col-xs-12 col-lg-offset-2 col-md-offset-2 col-sm-offset-0 col-xs-offset-0">
                        <div class="mj_mainheading mj_toppadder80 mj_bottompadder50">
                            <h1>J<span>ob</span> S<span>eeker</span></h1>
                            <p>Register Yourself And Find a Best Job For You!!</p>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-lg-offset-3 col-md-offset-3 col-sm-12 col-xs-12">
                        <div class="mj_pricingtable mj_yellowtable mj_createaccount_form_wrapper">
                            <!-- Nav tabs -->

                            <form action="regUser">
                                <div class="mj_createaccount_form">
                                    <div class="form-group">
                                        <input type="text" placeholder="Name" name="uname" id="uname" class="form-control" required="">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" placeholder="Email" name="email" id="email" class="form-control" required="">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" placeholder="Mobile" name="mobile" id="mobile" class="form-control"required="">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" placeholder="Password"  name="pwd" id="pwd" class="form-control" required="">
                                    </div>
                                    <div class="form-group">
                                        
                                            <select id="sid" class="form-control" name="state" onchange="getCity1()">
                                           <option>State</option>    
                                           <%
                                               if(request.getAttribute("state")!=null)
                                               {
                                                   ArrayList<State> al = (ArrayList<State>) request.getAttribute("state");
                                                   for(int i=0;i<al.size();i++)
                                                   {
                                                       State st = al.get(i);
                                                       %>
                                                       
                                                       <option value="<%=st.getSid()%>"><%=st.getSname()%></option>   
                                                       <%
                                                   }
                                               }
                                              
                                               
                                            %>
                                            </select>
                                    </div>
                                     <div class="form-group">
                                        
                                         <select id="city" name="city" class="form-control" >
                                             <option>City</option>
                                        </select>
                                    </div>
                                </div>
                                <div class="mj_pricing_footer">
                                    <input type="submit" value="Get Started Now!" />
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%@include  file="footer.html" %> 


    </body>


    <!-- Mirrored from rulercrm.com/mesh-html-version2/mesh/create_account.html by HTTrack Website Copier/3.x [XR&CO'2014], Sun, 16 Oct 2016 13:41:45 GMT -->
</html>