package br.com.zup.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.gerenciador.models.Company;
import br.com.zup.gerenciador.models.DataBase;

@WebServlet("/showCompany")
public class ShowCompanyEditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	String idParam = request.getParameter("id");
		
		Long id = Long.valueOf(idParam);
	
		DataBase DB = new DataBase();
		
		Company company = DB.getCompanyById(id);
		
		System.out.println(company);
		
		request.setAttribute("company", company);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formEditCompany.jsp");
		
		rd.forward(request, response);
	}

}
