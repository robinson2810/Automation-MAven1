package com.testproject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.baseclass.java.BaseClass1;
import com.pom.com.LoginPage;

public class Project1 extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		browserLaunch("chrome");
		openurl("http://automationpractice.com/index.php?controller=my-account");
		LoginPage lp = new LoginPage(driver);

		inputvalues(lp.getEmail(), "robinson12345@gmail.com");
		inputvalues(lp.getPassword(), "12345@Robinkvkk");
		ClickOnElement(lp.getSignin());
		Mouse_MoveToElement(lp.getWomen());
		Mouse_Click(lp.getCasual());
		Mouse_MoveToElement(lp.getImg());
		ClickOnElement(lp.getCart());
		threadsleep(4000);
		Mouse_Click(lp.getProceed());
		Mouse_Click(lp.getPrcd());
		ClickOnElement(lp.getPradd());
		ClickOnElement(lp.getAgree());
		ClickOnElement(lp.getPrc());
		ClickOnElement(lp.getBank());
		ClickOnElement(lp.getSubmit());

	}
}
