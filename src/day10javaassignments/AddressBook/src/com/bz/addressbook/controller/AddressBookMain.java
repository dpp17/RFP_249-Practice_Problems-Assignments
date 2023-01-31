package day10javaassignments.AddressBook.src.com.bz.addressbook.controller;
import java.util.Scanner;

import com.bz.addressbook.interfaces.InterfaceAddressBook;
import com.bz.addressbook.model.Contacts;
import com.bz.addressbook.services.ImplementationsOfAddressBook;

public class AddressBookMain {
	
	private static Scanner getDetailInput = new Scanner(System.in);
	
	
//main method	
	public static void main(String[] args) {
	
		InterfaceAddressBook inBook = new ImplementationsOfAddressBook();
		
		byte menuExitNumber = 0, choice = 0;
		do {
			System.out.println(" :: ---- ADDRESS BOOK ----  :: ");
			System.err.println("   ========================= "+'\n');
			System.out.println(" 1. Add New Contact ");//done
			System.out.println(" 2. View All Contacts");//done
			System.out.println(" 3. Delete Contact");//done
			System.out.println(" 4. Update Contact");//done
			System.out.println(" 5. Search Contact");//done
			System.out.println(" ");
			System.out.println("-->> Enter Option :: ");
			byte option = getDetailInput.nextByte();
			switch(option) {
			case 1:
				Contacts contacts = getContacts();
				int index = inBook.createContactDetails(contacts);
				System.out.println(" Contact_ID :: " + index);
				break;
			case 2:
				inBook.showAllContacts();
				break;
			case 3:
				System.out.println("Delete Details :: \"+ '\\n' + \" Please Enter your ' VALID ' Aadhar number to Proceed: ");
				inBook.deleteContact(getDetailInput.nextLong());
				break;
			case 4:
				System.out.println(" Update Details :: "+ '\n' + " Please Enter your ' VALID ' Aadhar number to Proceed: ");
				inBook.updateByAadhar(getDetailInput.nextLong());
				break;
			case 5:
				do {
				
				System.out.println("1.Search By FirstName"+'\n'+"2.Search By Aadhar_Number"+'\n'+"Enter Choice :: ");
				choice = getDetailInput.nextByte();
					if(choice == 1) {
					System.out.println("Enter FirstName to search details :: ");
					inBook.searchByFirstName(getDetailInput.next());
					
					}else if(choice == 2) {
						System.out.println("Enter AadharNumber to search details :: ");
						inBook.searchByAadhar(getDetailInput.nextLong());
					}else {
						System.err.println(":: Please Enter a Valid Choice ::"+'\n');
					}
				}while(choice > 2 || choice < 1);
				break;
				
			default:
				System.err.println(" Invalid Option ");
			}
			
			System.out.println('\n'+" Press 1 :: To check previous again " + '\n' + " Press 6 :: To Log Out ");
			menuExitNumber = getDetailInput.nextByte();
		}while(menuExitNumber == 1);
		
		
	}
	
	
	private static Contacts getContacts() {
		Contacts contacts = new Contacts();
		
		System.out.println(" Enter FirstName:");
		contacts.setFirstName(getDetailInput.next());
		
//		System.out.println(" Enter LastName:");
//		contacts.setLastName(getDetailInput.next());
		
//		System.out.println(" Enter Address:");
//		contacts.setAddress(getDetailInput.next());
//		
//		System.out.println(" Enter City:");
//		contacts.setCity(getDetailInput.next());
//		
//		System.out.println(" Enter State:");
//		contacts.setState(getDetailInput.next());
//		
//		System.out.println(" Enter Email ID:");
//		contacts.setEmail(getDetailInput.next());
//		
//		System.out.println(" Enter Zip:");
//		contacts.setZip(getDetailInput.nextInt());
//		
//		System.out.println(" Enter Phone_Number:");
//		contacts.setPhoneNumber(getDetailInput.nextLong());
//		
		System.out.println(" Enter Aadhar_Number:");
		contacts.setAadharNumber(getDetailInput.nextLong());
		
		return contacts;
	}
	
}




