package br.com.zup.gerenciador.models;

import java.util.Date;

public class Company {

	private Long id;
	private String name;
	private Date openingDate = new Date();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOpeningDate() {
		return openingDate;
	}

	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	@Override
	public String toString() {
		return "COMPANY: " + id + " INFO: " + " Id: " + id + " Name: " + name + " Date: " + openingDate;
	}

}
