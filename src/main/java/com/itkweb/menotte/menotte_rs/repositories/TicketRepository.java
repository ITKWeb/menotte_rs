package com.itkweb.menotte.menotte_rs.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itkweb.menotte.menotte_rs.model.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, Integer> {

}
