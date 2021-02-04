package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.gerenciador.models.Company;
import br.com.zup.gerenciador.models.DataBase;


@WebServlet("/listCompanies")
public class ListCompaniesServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private DataBase DB = new DataBase();;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Company> companies = DB.getCompanies();
		request.setAttribute("companies", companies);

		RequestDispatcher rd = request.getRequestDispatcher("/listCompanies.jsp");
		rd.forward(request, response);
	}

}
