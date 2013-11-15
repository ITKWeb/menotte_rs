package com.itkweb.menotte.menotte_rs.dao;

import java.util.List;

import com.itkweb.menotte.menotte_rs.model.Ticket;



public interface TicketDao {

	List<Ticket> getTickets();

	void create(Ticket ticket);

	List<Ticket> getTicket(Integer id, Integer idSprint);

	void delete(Integer id);

	Ticket getTicket(Integer id);



}
