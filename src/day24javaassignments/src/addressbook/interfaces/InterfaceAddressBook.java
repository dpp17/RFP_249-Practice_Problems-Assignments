package day24javaassignments.src.addressbook.interfaces;

import day24javaassignments.src.addressbook.model.Contacts;

public interface InterfaceAddressBook {

	void welcomeDisplay();
	int createContactDetails(Contacts contacts);
	void editByName(String firstName);
	void deleteByFirstName(String firstname);
	void countByCityOrState(String input);
	void sortByNameCityStateZip(String input);
}
