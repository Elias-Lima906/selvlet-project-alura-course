package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/service")
public class GerenciadorServlet extends HttpServlet{ 
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<h1>");	
		
		out.println("Ola Mundo!");
		
		out.println("</h1>");

		
		out.println("</body>");
		out.println("</html>");
	
		System.out.println("Chegou ao fim da requisição!");
		
	}
}
