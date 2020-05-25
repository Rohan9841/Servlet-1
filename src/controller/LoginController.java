package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class LoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter pWriter = response.getWriter();
		pWriter.println("Get request is successful");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter pWriter = response.getWriter();
		pWriter.println("You have successfully Logged in!");
		pWriter.println(
				"Email: " + request.getParameter("userEmail") + "\nPassword: " + request.getParameter("userPassword"));
	}
}
