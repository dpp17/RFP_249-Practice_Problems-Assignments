package day20javaassignments.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration implements IRegexUserRegistration{

	public boolean isFirstCapital(String firstName) {
		return getMatcher(EUserRegistrationPatter.FIRST_NAME_PATTERN.getConstant(), firstName).find();
	}
	
	public boolean isLastCapital(String lastName) {
		return getMatcher(EUserRegistrationPatter.LAST_NAME_PATTERN.getConstant(), lastName).find();
	}
	
	public boolean validEmailId(String email) {
		return getMatcher(EUserRegistrationPatter.EMAIL_ID_PATTERN.getConstant(), email).find();
	}

	public boolean validMobileNumber(String number) {
		return getMatcher(EUserRegistrationPatter.MOBILE_NUMBER_PATTERN.getConstant(), number).find();
	}
	
	public boolean setPassword(String password) {
		return getMatcher(EUserRegistrationPatter.SET_PASSWORD.getConstant(), password).find();
	}
	
	private static Matcher getMatcher(String regex, String input) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher;	
	}
}
