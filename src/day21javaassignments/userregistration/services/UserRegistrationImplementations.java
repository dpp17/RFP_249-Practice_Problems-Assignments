package day21javaassignments.userregistration.services;

import java.util.ArrayList;

import day21javaassignments.userregistration.exceptions.EmailIdException;
import day21javaassignments.userregistration.exceptions.FirstNameStartWithCapitalException;
import day21javaassignments.userregistration.exceptions.LastNameStartWithCapitalException;
import day21javaassignments.userregistration.exceptions.MobileNumberException;
import day21javaassignments.userregistration.exceptions.PasswordException;
import day21javaassignments.userregistration.interfaces.IUserRegistration;
import day21javaassignments.userregistration.model.UserRegistrationContainer;
import day21javaassignments.userregistration.utility.IRegexUserRegistration;
import day21javaassignments.userregistration.utility.RegexUserRegistration;

public class UserRegistrationImplementations implements IUserRegistration {

	ArrayList<UserRegistrationContainer> arrList = new ArrayList<UserRegistrationContainer>();
	IRegexUserRegistration regObj = new RegexUserRegistration();
	
	static int count = 0;
	
	public void welcomeDisplay() {
		System.err.println("====================================================");
		System.out.println("  ::  Welcome To USER_REGISTRATION_SYSTEMS  ::  ");
		System.err.println("===================================================="+'\n');	
	}
	
	public int addDetails(UserRegistrationContainer user) throws FirstNameStartWithCapitalException,LastNameStartWithCapitalException,EmailIdException,MobileNumberException ,PasswordException{
		int taskDone = 0;
		if(regObj.isFirstCapital(user.getFirstName())) {
			if(regObj.isLastCapital(user.getLastName())) {
				if(regObj.validEmailId(user.getEmailId())) {
					if(regObj.validMobileNumber(user.getMobileNumber())) {
						if(regObj.setPassword(user.getPassword())) {
							arrList.add(count, user);
							count++;
							printList(user);
							taskDone = 1;
						}
					}
				}
			}
		}
		return taskDone;
	}

	private void printList(UserRegistrationContainer user) {
		if(null != user) {
			System.out.println("Form ::"+'\t'+"FirstName"+" :: "+"  LastName"+" :: "+"    Email_Id"+" :: "+"      Mobile_Number"+"  ::  "+"      Password");
			System.out.println('\t'+user.getFirstName()+'\t'+'\t'+user.getLastName()+'\t'+user.getEmailId()+'\t'+'\t'+user.getMobileNumber()+'\t'+'\t'+user.getPassword());
		}
	}
}
