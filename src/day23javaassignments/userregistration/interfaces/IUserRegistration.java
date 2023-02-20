package day23javaassignments.userregistration.interfaces;

import day21javaassignments.userregistration.model.UserRegistrationContainer;

public interface IUserRegistration {
	void welcomeDisplay();
	int addDetails(UserRegistrationContainer user);
}
