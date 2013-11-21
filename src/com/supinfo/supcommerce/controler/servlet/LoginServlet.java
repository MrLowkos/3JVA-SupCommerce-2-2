package com.supinfo.supcommerce.controler.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 * 
 * Create a new session and a "username" attribute in this one.
 * 
 * @author Elka
 * @version 2.2
 * @since SupCommerce 2.2
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PARAM_USERNAME_POST = "username";
    private static final String LIST_PRODUCT_SERVLET	= "listProduct";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    /**
	 * Handles <code>POST</code> HTTP method
	 * 
	 * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve 
		final String usernameParam = request.getParameter(PARAM_USERNAME_POST);
		
		request.getSession().setAttribute(PARAM_USERNAME_POST, usernameParam);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listProduct");
		rd.forward(request, response);
		// Or
		// this.getServletContext().getRequestDispatcher("/listProduct").forward(request, response);
		// Or
		// request.getRequestDispatcher("/listProduct").forward(request, response);
	}

}
