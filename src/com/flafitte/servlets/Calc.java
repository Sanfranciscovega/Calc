package com.flafitte.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.flafitte.beans.doCalc;

/**
 * Servlet implementation class Calc
 */
@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Get number in field1, field2 and operator type from Form
		String field1=(String) request.getParameter("field1");
		String operator=(String) request.getParameter("operator");
		String field2=(String) request.getParameter("field2");
		
		// Set fields to 0 if empty {
		field1= field1.equals("") ? "0" : field1;
		field2= field2.equals("") ? "0" : field2;
		
		// Send them to the javaBean doCalc	
		doCalc calc = new doCalc(field1, operator, field2);
	
		// Send the result and all to Accueil.jsp via doGet
		request.setAttribute("result", calc.getResult());
		request.setAttribute("field1",field1);
		request.setAttribute("field2",field2);
		request.setAttribute("operator",operator);

		doGet(request, response);
		
	}

}
