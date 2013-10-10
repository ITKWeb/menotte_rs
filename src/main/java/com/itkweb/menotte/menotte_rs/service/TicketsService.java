package com.itkweb.menotte.menotte_rs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itkweb.menotte.menotte_rs.model.Ticket;

@Controller
@RequestMapping("/tickets ")
public class TicketsService {

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody
	List<Ticket> getTicketsInJSON() {

		Ticket ticket1 = new Ticket();
		ticket1.setTitre("Premier Ticket");
		ticket1.setDescription("Un premier ticket pas trop dur");
		ticket1.setId(1);

		List<Ticket> tickets = new ArrayList<Ticket>();
		tickets.add(ticket1);

		return tickets;

	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody
	Ticket getProjectsInJSON(@PathVariable Integer id) {

		Ticket ticket = new Ticket();
		ticket.setTitre("Premier Ticket");
		ticket.setDescription("Un premier ticket pas trop dur");
		ticket.setId(id);

		return ticket;

	}
}
