package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.contactService.ContactService;
import com.contact.model.Contact;

@RestController
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactService contactservice;
	
	@GetMapping("/user/{userId}")
	public List<Contact> getAllContact(@PathVariable ("userId") Long userId)
	{
		return contactservice.getcontactsofuser(userId);
	}
}
