package com.demo_app_2.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo_app_2.model.Calculator;

/**
 * Servlet implementation class DeleteController
 */
@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("delete_numbers.jsp");
	     rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String num1= request.getParameter("num1");
     String num2= request.getParameter("num2");
     
     int x = Integer.parseInt(num1);
     int y=  Integer.parseInt(num2);
     Calculator a = new Calculator();
     int result = a.deleteNumber(x, y);
     request.setAttribute("res", result);
     
     RequestDispatcher rd = request.getRequestDispatcher("delete_numbers.jsp");
     rd.forward(request, response);
     
	}

}
