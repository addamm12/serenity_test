package com.udemy.test.steps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.junit.*;

import static org.junit.Assert.*;

import net.thucydides.core.steps.ScenarioSteps;

import net.thucydides.core.annotations.Step;

public class UdemySteps extends ScenarioSteps {

	@Step("Go To www.Udemy.com")

	public void gotoUdemy() {

		getDriver().get("http://www.udemy.com");

	}

	@Step("Open Login Form")

	public void openLoginForm() {

		getDriver().findElement(By.linkText("Login")).click();

	}

	@Step("Entered Password: {0}")

	public void enterPassword(String s) {

		getDriver().findElement(By.id("id_password")).sendKeys(s);

	}

	@Step("Entered Useranme: {0}")

	public void enterUserName(String s) {

		getDriver().findElement(By.id("id_email")).sendKeys(s);

	}

	@Step("Click Login Button")

	public void clickLoginButton() {

		getDriver().findElement(By.cssSelector("input[type='submit'][value='Login']")).click();

	}

	@Step("Verify that the ActualValue of this div is equal to \" {0}\" ")

	public void verifyErrorPassedInText(String s) {

		String actualValue = getDriver().findElement(By.id("id_email")).getText();

		assertEquals(actualValue, s);

	}

}