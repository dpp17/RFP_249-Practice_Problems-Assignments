package com.bz.addressbook.services;

import java.util.Scanner;

import com.bz.addressbook.interfaces.InterfaceAddressBook;
import com.bz.addressbook.model.Contacts;

public class ImplementationsOfAddressBook implements InterfaceAddressBook {

	private static Scanner getDetailInput = new Scanner(System.in);
	Contacts[] storeContactDelails = new Contacts[15];//array
	
	public int createContactDetails(Contacts contacts) {
		
		System.out.println(" List of All the Contscts ");
		int index = getEmptyIndexToStore();
		storeContactDelails[index] = contacts;
		//System.out.println(index);
		return index;
	}
	
	private int getEmptyIndexToStore() {
		for(int i = 0; i <storeContactDelails.length; i++) {
				if(storeContactDelails[i] == null) {
				return i;
			}
		}
		return 0;
	}
	
//show all Contacts
	public void showAllContacts() {
		System.out.println("*************** : All Available Contacts- : ***************");
		for(int i = 0; i <storeContactDelails.length; i++) {
			Contacts contacts = storeContactDelails[i];
			if(null != storeContactDelails[i]) {
			System.out.println(" Serial No.:: ABRN_ "+ i );
			contactDetailsPrint(contacts);
			}
			
		}
		
	}
//search contacts	

	private void contactDetailsPrint( Contacts contacts) {
		if(contacts != null) {
			System.out.println(" *************** : Contact Details : *************** ");
			System.out.println(" FirstName :: " + contacts.getFirstName());
//			System.out.println(" LastName :: " + contacts.getLastName());
//			System.out.println(" Address :: " + contacts.getAddress());
//			System.out.println(" City :: " + contacts.getCity());
//			System.out.println(" State :: " + contacts.getState());
//			System.out.println(" Zip :: " + contacts.getZip());
//			System.out.println(" PhoneNumber :: " + contacts.getPhoneNumber());
			System.out.println(" AadharCard Number :: " + contacts.getAadharNumber());
		//	System.out.println(" Email ID:: " + contacts.getEmail());
			System.out.println("");
		}
	}

//delete contacts
	public void deleteContact(long adhar) {	
		System.out.println(":: Entry Deleted ::");
		for(int i = 0; i <storeContactDelails.length; i++) {
			Contacts contacts = storeContactDelails[i];
			if(null != contacts && adhar == contacts.getAadharNumber()) {
				 storeContactDelails[i] = null;
			}
		}	
		for(int i = 0; i < storeContactDelails.length; i++) {
			for(int j = i+1; j < storeContactDelails.length ; j++) {
				if(null == storeContactDelails[i] ) {
					storeContactDelails[i] = storeContactDelails[j];
					storeContactDelails[j] = null;
				}
			}
		}
	}
	
//Edit-Update details
	private void editContactDetails( Contacts contacts) {
	Contacts con = new Contacts();
	
	byte loopExit = 1; 
		do {
			System.out.println("Choose Option to Update :: " + '\n' + " 1.FirstName " + '\n' + " 2.LastName " + '\n' + " 3.Address "
					+ '\n' + " 4.City " + '\n' + " 5.State " + '\n' + " 6.Zip " + '\n'
							+ " 7.PhoneNumber " + '\n' + " 8.Aadhar_Number " + '\n' + " 9.Email_ID ");
			byte option = getDetailInput.nextByte();
			
			switch(option) {
			case 1:
					System.out.println(" FirstName :: "); 
					contacts.setFirstName(getDetailInput.next());
				break;
			case 2:
					System.out.println(" LastName :: ");
					contacts.setLastName(getDetailInput.next());
				break;
			case 3:
					System.out.println(" Address :: ");
					con.setAddress(getDetailInput.next());
				break;
			case 4:
					System.out.println(" City :: ");
					contacts.setCity(getDetailInput.next());
				break;
			case 5:
					System.out.println(" State :: ");
					contacts.setState(getDetailInput.next());
				break;
			case 6:
					System.out.println(" Zip :: ");
					contacts.setZip(getDetailInput.nextInt());
				break;
			case 7:
					System.out.println(" PhoneNumber :: ");
					contacts.setPhoneNumber(getDetailInput.nextLong());
				break;
			case 8:
					System.out.println(" AadharNumber :: ");
					con.setAadharNumber(getDetailInput.nextLong());
				break;
			case 9:
					System.out.println(" Email_ID :: ");
					contacts.setEmail(getDetailInput.next());
				break;
			default:
				System.out.println(" ****---- Invalid Input ----**** ");
			}
			System.out.println(" Press 1: If you want to update anything else " + '\n' + " Press 0: Exit to Menu ");
			loopExit = getDetailInput.nextByte();
		}while(loopExit != 0);
	}


	public void searchByAadhar(long adhar) {
		for(int i = 0; i < storeContactDelails.length; i++) {
			Contacts contacts = storeContactDelails[i];
			if(contacts != null  && adhar == contacts.getAadharNumber()) {
				contactDetailsPrint(contacts);
			}
		}
		
	}

	public void searchByFirstName(String firstName) {
		for(int i = 0; i < storeContactDelails.length; i++) {
			Contacts contacts = storeContactDelails[i];
			if(contacts != null  && contacts.getFirstName().equalsIgnoreCase(firstName)) {
				contactDetailsPrint(contacts);
			}
		}
		
	}

	public void updateByAadhar(long adhar) {
		System.out.println(":: Entry Deleted ::");
		for(int i = 0; i <storeContactDelails.length; i++) {
			Contacts contacts = storeContactDelails[i];
	
			if(null != contacts && adhar == contacts.getAadharNumber()) {
		
				editContactDetails(contacts);
			}
		}
		
	}

	




	
	
//end		
}

	

	
	







