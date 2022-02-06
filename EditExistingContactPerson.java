package com.bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class EditExistingContactPerson {

	ArrayList<ContactsDetails> contactDetails = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int i = 0;
		EditExistingContactPerson obj = new EditExistingContactPerson();

		while (i == 0) {
			System.out.println("Do you want add new Contact/Edit existing contact: ");
			System.out.println("1.Add details.\n2.Edit details.");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				obj.addContactDetails();
				break;
			case 2:
				obj.editContactDetails();
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
		// sc.close();
		contactDetails.add(contactsdetails);
		System.out.println(contactsdetails.toString());
	}

	// Method to edit the contact details

	public void editContactDetails() {

		System.out.println("Confirm your first name to edit details: ");
		String name = sc.next();

		for (int i = 0; i < contactDetails.size(); i++) {
			if (contactDetails.get(i).getFirstname().equals(name)) {
				System.out.println("Select form below to change: ");
				System.out.println(
						"\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
				int edit = sc.nextInt();

				switch (edit) {
				case 1:
					System.out.println("Enter first name");
					contactDetails.get(i).setFirstname(sc.next());
					break;
				case 2:
					System.out.println("Enter Last name");
					contactDetails.get(i).setLastname(sc.next());
					break;
				case 3:
					System.out.println("Enter address");
					contactDetails.get(i).setAddress(sc.next());
					break;
				case 4:
					System.out.println("Enter city");
					contactDetails.get(i).setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter state");
					contactDetails.get(i).setState(sc.next());
					break;
				case 6:
					System.out.println("Enter email");
					contactDetails.get(i).setEmail(sc.next());
					break;
				case 7:
					System.out.println("Enter Zip");
					contactDetails.get(i).setZip(sc.nextInt());
					break;
				case 8:
					System.out.println("Enter phone number");
					contactDetails.get(i).setPhonenumber(sc.nextInt());
					break;
				}

				System.out.println(contactDetails);

			} else
				System.out.println("Enter valid First name");
		}

	}

}
