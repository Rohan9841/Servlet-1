package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class RegistrationController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pWriter = response.getWriter();
		pWriter.println("Welcome to Registration Controller class..!");
		pWriter.println("Username: " + request.getParameter("username") + "\nPassword "
				+ request.getParameter("userPassword") + "\nEmail: " + request.getParameter("userEmail"));
		
		RequestDispatcher rd = request.getRequestDispatcher("login.html");
		rd.forward(request,response);
	}

}
