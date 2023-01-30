package com.bz.addressbook.interfaces;

import com.bz.addressbook.model.Contacts; 

public interface InterfaceAddressBook {

	int createContactDetails(Contacts contacts);
	void showAllContacts();
	void deleteContact(long contacts);
	void updateByAadhar(long adhar);
	void searchByAadhar(long adhar);
	void searchByFirstName(String firstName);
}
