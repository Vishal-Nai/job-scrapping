/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jaunt.Element;
import com.jaunt.Elements;
import com.jaunt.UserAgent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dummy;

/**
 *
 * @author Hp
 */
public class searchjob extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
          String name=request.getParameter("job");
          String location=request.getParameter("location");
          String exp=request.getParameter("exp");
          UserAgent user = new UserAgent();
          String[] name1=name.split(" ");
                  
                  if(name1.length==2)
                  {
                     user.visit("http://www.timesjobs.com/candidate/job-search.html?searchType=personalizedSearch&from=submit&txtKeywords="+name1[0]+"+"+name1[1]+"&txtLocation="+location+"&cboWorkExp1="+exp);
                  }
                  else if(name1.length==1)
                  {
                      user.visit("http://www.timesjobs.com/candidate/job-search.html?searchType=personalizedSearch&from=submit&txtKeywords="+name+"&txtLocation="+location+"&cboWorkExp1="+exp); 
                  }
            Elements heading=user.doc.findFirst("<div id=\"searchResultData\">").findFirst("<ul class=\"joblist\">").findEvery("<h2>").findEach("<a href>");
            List<String> heading1=user.doc.findFirst("<div id=\"searchResultData\">").findFirst("<ul class=\"joblist\">").findEvery("<h2>").findAttributeValues("<a href>");

            Elements company=user.doc.findFirst("<div id=\"searchResultData\">").findFirst("<ul class=\"joblist\">").findEvery("<h3 class=\"joblist-comp-name\">");
            Elements city=user.doc.findFirst("<div id=\"searchResultData\">").findFirst("<ul class=\"joblist\">").findEvery("<ul class=\"job-more-dtl clearfix\">");
            dummy d=new dummy();
            d.setHeading(heading);
            d.setCompany(company);
            d.setCity(city);
            d.setTimesjob(heading1);
          
            request.setAttribute("d", d);
          RequestDispatcher rd=request.getRequestDispatcher("userhome.jsp");
          rd.forward(request, response);
        }
        catch(Exception e)
        {
            out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
