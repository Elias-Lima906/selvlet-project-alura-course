package br.com.zup.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.zup.gerenciador.models.Company;
import br.com.zup.gerenciador.models.DataBase;

@WebServlet("/editCompany")
public class EditCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Company company = new Company();
		DataBase DB = new DataBase();

		String idParam = request.getParameter("id");
		String name = request.getParameter("name");
		String date = request.getParameter("date");

		Long id = Long.valueOf(idParam);

		Date openingDate = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			openingDate = sdf.parse(date);
		} catch (ParseException e) {
			throw new ServletException(e);
		}

		Company editedCompany = DB.getCompanyById(id);

		editedCompany.setId(id);
		editedCompany.setName(name);
		editedCompany.setOpeningDate(openingDate);

		response.sendRedirect("listCompanies");
	}

}
