package com.itkweb.menotte.menotte_rs.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Sprint {


	@Id
	private int id;

	private List<Ticket> tickets;

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
