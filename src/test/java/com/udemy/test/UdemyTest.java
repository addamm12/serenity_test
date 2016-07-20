package com.udemy.test;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import com.udemy.test.steps.UdemySteps;

import net.serenitybdd.junit.runners.SerenityRunner;

import net.thucydides.core.annotations.Managed;

import net.thucydides.core.annotations.Steps;

import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)

public class UdemyTest {

	@Managed(driver = "chrome")
	WebDriver driver;
	
	@Steps
	UdemySteps steps;

	@Test
	@Title("Open Udemy Login Form and Enter In User Data")

	public void testUdemyLogin() {

		steps.gotoUdemy();

		steps.openLoginForm();

		steps.enterUserName("asd@pl");

		steps.enterPassword("abc123");

		steps.clickLoginButton();

		//steps.verifyErrorPassedInText("blah");

	}

}