package br.com.zup.gerenciador.servlet;

import java.io.IOException;

import br.com.zup.gerenciador.models.Company;
import br.com.zup.gerenciador.models.DataBase;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	DataBase DB = new DataBase();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Company company = new Company();

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		company.setId(Long.parseLong(id));
		company.setName(name);

		DB.add(company);

		RequestDispatcher rd = request.getRequestDispatcher("/confirmRegister.jsp");
		request.setAttribute("companyName", company.getName());
		rd.forward(request, response);
	}

}
