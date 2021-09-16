package com.bridgelabz.Address_Book_System.model;
//Data Layer/ Model Layer

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ContactOperation implements ContactOperationInterface {
	List<ContactDetails> list = new ArrayList<>();

	public void addContact() {
		ContactDetails user = new ContactDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname = sc.nextLine();
		System.out.println("Enter Last Name: ");
		String lname = sc.nextLine();
		System.out.println("Enter Email id: ");
		String emailId = sc.nextLine();
		System.out.println("Enter Address: ");
		String address = sc.nextLine();
		System.out.println("Enter City");
		String city = sc.nextLine();
		System.out.println("Enter State");
		String state = sc.nextLine();
		System.out.println("Enter Zip");
		int zip = sc.nextInt();
		System.out.println("Enter PhoneNumber");
		long phoneNumber = sc.nextLong();

		user.setFirstName(fname);
		user.setLastName(lname);
		user.setEmail(emailId);
		user.setAddress(address);
		user.setCity(city);
		user.setState(state);
		user.setZip(zip);
		user.setPhoneNumber(phoneNumber);
		list.add(user);
		System.out.println("Contact Details Added Successfully!");
	}
	
	public void getDetails() {
		Iterator<ContactDetails> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void editContact() {
		Iterator<ContactDetails> iterator = list.listIterator();
		while(iterator.hasNext()){
			ContactDetails user = iterator.next();
			System.out.println("Enter the first name for which you want make the changes: ");
			Scanner sc = new Scanner(System.in);
			String fname = sc.next();
			if(fname.equals(user.getFirstName())) {
				System.out.println("Choose the attribute you want to edit: \n 1. First Name. \n2. Last Name. \n3. Email Id. \n4. Address. \n5. City. \n6. State. \n7. Zip. \n8. Phone Number");
				int n = sc.nextInt();
				updateContacts(user, sc, n);	
			}
			else 
				System.out.println("Name not present in the Contact List!");
		}
	}

	private void updateContacts(ContactDetails user, Scanner sc, int n) {
		String fname;
		switch(n) {
			case 1:
				System.out.println("Enter correct first name:");
				fname = sc.next();
				user.setFirstName(fname);
				break;
			case 2:
				System.out.println("Enter correct last name:");
				String lname = sc.next();
				user.setLastName(lname);
				break;
			case 3:
				System.out.println("Enter correct email:");
				String email = sc.next();
				user.setEmail(email);
				break;
			case 4:
				System.out.println("Enter correct address:");
				String address = sc.next();
				user.setAddress(address);
				break;
			case 5:
				System.out.println("Enter correct city:");
				String city = sc.next();
				user.setCity(city);
				break;
			case 6:
				System.out.println("Enter correct state:");
				String state = sc.next();
				user.setState(state);
				break;
			case 7:
				System.out.println("Enter correct zip code:");
				int zip = sc.nextInt();
				user.setZip(zip);
				break;
			case 8:
				System.out.println("Enter correct phone number:");
				int number = sc.nextInt();
				user.setPhoneNumber(number);
				break;
			default:
				System.out.println("Default");
		}
	}
	
	public void performUserSelection(int n) {

		switch (n) {
			case 1:
				addContact();
				break;
			case 2:
				getDetails();
				break;
			case 3:
				editContact();
				break;
			case 4:
				break;
			case 5:
				break;
		}
	}
}
