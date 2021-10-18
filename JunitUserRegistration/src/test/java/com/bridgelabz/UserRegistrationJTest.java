package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationJTest {
	UserRegistrationJ userRegistration = new UserRegistrationJ();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Prashant");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.firstName("prashant");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Phad");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("phad");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("prashantphad2018@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("prashant&phad@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.phoneNumber("91 9970899057");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPhoneNumber_WhenNotProper_ShouldReturnFlase() {
		boolean result = userRegistration.phoneNumber("919970899057");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("prashant");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("pra@22");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule2("Prashant123");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule2("pra@22");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.passwordRule3("Prashant123");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.passwordRule3("prashant@gn");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("prashant@123");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("raj22");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail1_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail1_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidator("abc.100@abc.com.au");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc()*@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc123@gmail.a –");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail5_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc123@.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail6_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator(".abc@abc.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail7_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc.@gmail.com –");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail8_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc@abc@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
		Assert.assertEquals(false, result);
	}

}