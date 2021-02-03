package br.com.zup.gerenciador.models;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	private static List<Company> companies = new ArrayList<Company>();
	
	static {

		Company companyZup = new Company();
		Company companyGoogle = new Company();
		Company companyAlura = new Company();

		companyZup.setId(01L);
		companyZup.setName("Zup Innovation!");
		companyGoogle.setId(02L);
		companyGoogle.setName("Google");
		companyAlura.setId(03L);
		companyAlura.setName("Alura");
		
		DataBase.companies.add(companyZup);
		DataBase.companies.add(companyGoogle);
		DataBase.companies.add(companyAlura);
	}

	public void add(Company company) {
		DataBase.companies.add(company);
	}

	public List<Company> getCompanies() {
		return DataBase.companies;
	}

}
