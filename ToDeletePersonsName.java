package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDeletePersonsName {

	ArrayList<ContactsDetails> contactDetails = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		ToDeletePersonsName obj = new ToDeletePersonsName();

		while (i == 0) {
			System.out.println("Would you like to continue?: ");
			System.out.println("1.Add details.\n2.Delete the details.");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				obj.addContactDetails();
				break;
			case 2:
				obj.deleteContactDetails();
				break;
			default:
			}
		}

	}


	public void addContactDetails() {

		ContactsDetails contactsdetails = new ContactsDetails();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Name of person:");
		contactsdetails.setFirstname(sc.next());
		System.out.println("Enter the Last Name of person:");
		contactsdetails.setLastname(sc.next());
		System.out.println("Enter the Address Name of person:");
		contactsdetails.setAddress(sc.next());
		System.out.println("Enter the City Name of person:");
		contactsdetails.setCity(sc.next());
		System.out.println("Enter the State Name of person:");
		contactsdetails.setState(sc.next());
		System.out.println("Enter the Email of person:");
		contactsdetails.setEmail(sc.next());
		System.out.println("Enter the Zip code of person:");
		contactsdetails.setZip(sc.nextInt());
		System.out.println("Enter the Phone number of person:");
		contactsdetails.setPhonenumber(sc.nextInt());

		contactDetails.add(contactsdetails);
		System.out.println(contactsdetails.toString());
	}


	public void deleteContactDetails() {

		System.out.println("Confirm your first name to delete details: ");
		String name = sc.next();

		for (int i = 0; i < contactDetails.size(); i++) {
			if (contactDetails.get(i).getFirstname().equals(name)) {
				contactDetails.remove(i);
			}
		}
		System.out.println(contactDetails);
	}

}
