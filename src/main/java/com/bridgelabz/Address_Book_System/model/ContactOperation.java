package com.bridgelabz.Address_Book_System.model;
//Data Layer/ Model Layer

import java.util.ArrayList;
import java.util.List;

public class ContactOperation implements ContactOperationInterface{
	List<ContactDetails> list = new ArrayList<>();
	public void addContact(ContactDetails details) {
		list.add(details);
	}
	public void getDetails() {
		for(ContactDetails allDetails : list) {
			System.out.println(allDetails);
		}
	}
}
