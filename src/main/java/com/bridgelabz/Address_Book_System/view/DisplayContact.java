package com.bridgelabz.Address_Book_System.view;
//View Layer

import java.util.Scanner;
import com.bridgelabz.Address_Book_System.model.ContactOperation;

public class DisplayContact {
	public void display() {
    	System.out.println("Welcome to Address Book Program");
		Scanner sc = new Scanner(System.in);
		int n=0;
		ContactOperation operation = new ContactOperation();
			while(n != 4) {
				System.out.println("\nEnter Your Choice \n1. Add Contact Details \n2. Display Contact Details \n3. Edit Contact Details \n4. Delete Contact Details \n5. Exit");
				n = sc.nextInt();
				operation.performUserSelection(n);
			}
		
	}
}
