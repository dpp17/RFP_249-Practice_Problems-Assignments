package day23javaassignments.userregistration.interfaces;

import day21javaassignments.userregistration.model.UserRegistrationContainer;
@FunctionalInterface
public interface IUserRegistration {
	//void welcomeDisplay();
	int addDetails(UserRegistrationContainer user);
}
