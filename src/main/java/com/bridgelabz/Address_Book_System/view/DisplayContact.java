package com.bridgelabz.Address_Book_System.view;
//View Layer

import java.util.Scanner;

import com.bridgelabz.Address_Book_System.controller.AddressBook;

public class DisplayContact {
	public void display() {
    	System.out.println("Welcome to address book program");
		Scanner sc = new Scanner(System.in);
		int n=0;
		AddressBook addressBook = new AddressBook();
			System.out.println("\nEnter your choice: \n1. To add an contact details. \n2. To edit an contact details. \n3. To delete an contact details. \n4. To exit. ");
			n = sc.nextInt();
			addressBook.performUserSelection(n);
		
	}
}
