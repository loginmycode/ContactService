package com.contact.contactService;

import java.util.List;

import com.contact.model.Contact;

public interface ContactService {

	public List <Contact> getcontactsofuser(Long userId);
	
}
