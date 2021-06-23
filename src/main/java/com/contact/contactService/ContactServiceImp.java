package com.contact.contactService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.model.Contact;

@Service
public class ContactServiceImp implements ContactService{

	List<Contact> list = List.of(
			
			new Contact(1L, "raj@wipro.com", "raj", 100L),
		    new Contact(2L, "raj@wipro.com", "raj", 100L),
			new Contact(3L, "rohan@wipro.com", "rohan", 101L),
			new Contact(4L, "kumar@wipro.com", "kumar", 102L)
			);
	
	@Override
	public List<Contact> getcontactsofuser(Long userId) {
		
		return list.stream().filter(contact ->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
