package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import br.com.zup.gerenciador.models.Company;
import br.com.zup.gerenciador.models.DataBase;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/listCompanies")
public class ListCompaniesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private DataBase DB = new DataBase();;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Company> companies = DB.getCompanies();

		RequestDispatcher rd = request.getRequestDispatcher("/listCompanies.jsp");
		request.setAttribute("companies", companies);
		rd.forward(request, response);

	}

}
