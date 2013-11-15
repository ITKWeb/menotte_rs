package com.itkweb.menotte.menotte_rs.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itkweb.menotte.menotte_rs.dao.TicketDao;
import com.itkweb.menotte.menotte_rs.model.Ticket;
import com.itkweb.menotte.menotte_rs.repositories.TicketRepository;

@Service
public class TicketDaoImpl implements TicketDao {

	@Autowired
	TicketRepository ticketRepository;

	@Override
	public List<Ticket> getTickets() {
		return ticketRepository.findAll();
	}

	@Override
	public void create(Ticket ticket) {
		ticketRepository.save(ticket);
	}

	@Override
	public Ticket getTicket(Integer id) {
		return ticketRepository.findOne(id);
	}

	@Override
	public void delete(Integer id) {
		ticketRepository.delete(id);

	}

	@Override
	public List<Ticket> getTicket(Integer id, Integer idSprint) {
		// TODO Auto-generated method stub
		return null;
	}

}
