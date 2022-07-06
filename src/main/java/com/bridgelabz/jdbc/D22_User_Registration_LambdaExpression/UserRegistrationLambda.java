package com.bridgelabz.jdbc.D22_User_Registration_LambdaExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationLambda implements UserRegistrationLambdaIF {
	
	public UserRegistrationLambdaIF validateFirstName = firstName -> {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
		};
		
	public UserRegistrationLambdaIF validateLastName = lastName -> {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
		};
		
	public UserRegistrationLambdaIF validateEmail = email -> { 
		String regex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();   
		};
		
	public UserRegistrationLambdaIF validatePhoneNumber = phoneNumber -> {
		String regex = "^[0-9]{2}[ ]?[0-9]{10}$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(phoneNumber);
	    return matcher.matches();
	    };

	public UserRegistrationLambdaIF validatePassword = password -> {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
	    Pattern pattern = Pattern.compile(regex);
	    Matcher matcher = pattern.matcher(password);
	    return matcher.matches();
	    };

	@Override
	public boolean validate(String x) {
		// TODO Auto-generated method stub
		return false;
	}
}
