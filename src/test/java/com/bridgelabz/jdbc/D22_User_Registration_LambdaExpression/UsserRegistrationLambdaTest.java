package com.bridgelabz.jdbc.D22_User_Registration_LambdaExpression;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class CustomException extends Exception {

	public CustomException(String message) {
		super(message);
	}
}

public class UsserRegistrationLambdaTest {

	UserRegistrationLambda userRegistrationLambda;

	@Before
	public void before() {
		userRegistrationLambda = new UserRegistrationLambda();
		
	}

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws CustomException {
		boolean result = userRegistrationLambda.validateFirstName.validate("Hemnath");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() throws CustomException {
		boolean result = userRegistrationLambda.validateFirstName.validate("hemnath");
		Assert.assertFalse(result);

	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws CustomException {
		boolean result = userRegistrationLambda.validateLastName.validate("Navin");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() throws CustomException {
		boolean result = userRegistrationLambda.validateLastName.validate("navin");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws CustomException {
		boolean result = userRegistrationLambda.validateEmail.validate("abc@yahoo.com");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() throws CustomException {
		boolean result = userRegistrationLambda.validateEmail.validate("abc()*@gmail.com");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() throws CustomException {
		boolean result = userRegistrationLambda.validatePhoneNumber.validate("91 9876543210");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFalse() throws CustomException {
		boolean result = userRegistrationLambda.validatePhoneNumber.validate("+91 9876543210");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPasswordRule1_WhenProper_ShouldReturnTrue() throws CustomException {
		boolean result = userRegistrationLambda.validatePassword.validate("password@123");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPasswordRule1_WhenNotProper_ShouldReturnFalse() throws CustomException {
		boolean result = userRegistrationLambda.validatePassword.validate("psw@");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() throws CustomException {
		boolean result = userRegistrationLambda.validatePassword.validate("passWord@123");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() throws CustomException {
		boolean result = userRegistrationLambda.validatePassword.validate("psw@");
		Assert.assertFalse(result);
	}

}
