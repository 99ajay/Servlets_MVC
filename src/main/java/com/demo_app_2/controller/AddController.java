package com.demo_app_2.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.demo_app_2.model.Addnumber;

@WebServlet("/add")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddController() {
        super();
  
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");//request.getParameter only reads the String Value,I need to convert to the Integer
		String num2 = request.getParameter("num2");
		
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		
		Addnumber a = new Addnumber();//create a object of the model.
		int result = a.addNumber(x, y);
		
		//How to send to browser-- jsp page 
		//Storing the result in res variable of request object.
		
		request.setAttribute("res",result);
		
		//request object i need to give to jsp page wapas--
		
		RequestDispatcher rd = request.getRequestDispatcher("add_numbers.jsp");//linked rd page to the view"add_numbers.jsp page"
		rd.forward(request, response);//automatically "request and response object " forward to the view page 
		
		
		
		
		
 	}

}
