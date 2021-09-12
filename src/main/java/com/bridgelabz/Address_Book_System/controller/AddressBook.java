package com.bridgelabz.Address_Book_System.controller;
//Controller Layer

import java.util.Scanner;
//Controller Layer

import com.bridgelabz.Address_Book_System.model.ContactDetails;
import com.bridgelabz.Address_Book_System.model.ContactOperation;
import com.bridgelabz.Address_Book_System.view.DisplayContact;

public class AddressBook 
{
    public static void main( String[] args )
    {
    	DisplayContact displayContact = new DisplayContact();
    	displayContact.display();
    }
    public void performUserSelection(int n){
    	if(n == 1) {
    		ContactDetails c = new ContactDetails();
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

        	ContactDetails user = new ContactDetails();
        	user.setFirstName(fname);
        	user.setLastName(lname);
        	user.setEmail(emailId);
        	user.setAddress(address);
        	user.setCity(city);
        	user.setState(state);
        	user.setZip(zip);
        	user.setPhoneNumber(phoneNumber);
        	
        	ContactOperation operation = new ContactOperation();
        	operation.addContact(user);
        	operation.getDetails();
    	}
    }	
}
