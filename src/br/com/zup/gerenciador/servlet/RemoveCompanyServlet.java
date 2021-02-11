package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.gerenciador.models.DataBase;

@WebServlet("/removeCompany")
public class RemoveCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idParam = request.getParameter("id");
		
		Long id = Long.valueOf(idParam);
	
		DataBase DB = new DataBase();
		
		DB.remove(id);
		
		response.sendRedirect("listCompanies");
	
	}

}
