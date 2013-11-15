package com.itkweb.menotte.menotte_rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itkweb.menotte.menotte_rs.dao.ProjectDao;
import com.itkweb.menotte.menotte_rs.dao.TicketDao;
import com.itkweb.menotte.menotte_rs.model.Ticket;

@Controller
@RequestMapping("/tickets")
public class TicketsService {

	@Autowired
	private TicketDao ticketDao;

	@Autowired
	private ProjectDao projectDao;

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public
	List<Ticket> getAll() {

		List<Ticket> tickets = ticketDao.getTickets();

		if (tickets == null) {

			Ticket ticket1 = new Ticket();
			ticket1.setTitre("Premier Ticket");
			ticket1.setDescription("Un premier ticket pas trop dur");
			ticket1.setId(1);
			ticketDao.create(ticket1);
			tickets = ticketDao.getTickets();
		}

		return tickets;

	}

	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public @ResponseBody
	Ticket getProjectsInJSON(@PathVariable Integer id) {

		return ticketDao.getTicket(id);

	}

	@RequestMapping(value = "{idProject}/{idSprint}", method = RequestMethod.GET)
	public @ResponseBody
	List<Ticket> getProjectsInJSON(@PathVariable Integer idProject, @PathVariable Integer idSprint) {

		return ticketDao.getTicket(idProject, idSprint);

	}
}
