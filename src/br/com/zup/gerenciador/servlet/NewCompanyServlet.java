package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Hello World!");

		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		

		out.println("<html>" + "<body>" + "<h1>"

				+ name

				+ "</h1>" + "</body>" + "</html>");
	}

}
