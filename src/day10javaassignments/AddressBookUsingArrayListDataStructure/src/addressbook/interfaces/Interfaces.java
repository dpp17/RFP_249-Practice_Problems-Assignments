package day10javaassignments.AddressBookUsingArrayListDataStructure.src.addressbook.interfaces;

import day10javaassignments.AddressBookUsingArrayListDataStructure.src.addressbook.controller.Controller;

public interface Interfaces {

	int addContacts(Controller controller);
	void updateByName(String name);
	void deleteByName(String name);
	void showContacts();
	
}
