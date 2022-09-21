package com.tute.contact.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.tute.contact.Contact;

@Service
public class contactServiceImpl implements ContactService {

	List<Contact> contacList = List.of(new Contact(1L, "Kiran", "kiran@baghel", 1L),
			new Contact(2L, "Shail", "shail@baghel", 1L), new Contact(3L, "Chhota Sillu", "chhotasillu@baghel", 2L));

	@Override
	public List<Contact> getContact(Long id) {
		return contacList.stream().filter(contact -> contact.getUserId().equals(id)).collect(Collectors.toList());
	}
}
