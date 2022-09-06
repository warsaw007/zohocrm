package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;

public interface ContactService {

	public void saveContact(Contact contact);
           //26/04/22
	public List<Contact>findAllContacts();
	public Contact getContact(long id);
}
