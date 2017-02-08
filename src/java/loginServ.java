/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Login;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Hp
 */
public class loginServ extends HttpServlet {

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
        try {
            String uname = request.getParameter("uname");
            String pwd = request.getParameter("pwd");
            
             Session se =  NewHibernateUtil.getSessionFactory().openSession();
             
             Transaction tr = se.beginTransaction();
             
             Criteria cr = se.createCriteria(Login.class);
             cr.add(Restrictions.eq("uname" ,uname));
             cr.add(Restrictions.eq("pwd" , pwd));
             
             
             
                  
             ArrayList<Login> al = (ArrayList<Login>) cr.list();
              tr.commit();
             if(al.size()>0)
             {
             
             RequestDispatcher rd = request.getRequestDispatcher("userhome.jsp");
             rd.forward(request, response);
             }
            
                else
             {
              
             RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
             rd.forward(request, response);
             }
           
        
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
