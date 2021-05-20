package com.pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement signin;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
	private WebElement casual;

	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement img;

	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement cart;

	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement proceed;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement prcd;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement pradd;

	@FindBy(id = "cgv")
	private WebElement agree;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement prc;

	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement submit;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;

	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getCasual() {
		return casual;
	}

	public WebElement getImg() {
		return img;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getPrcd() {
		return prcd;
	}

	public WebElement getPradd() {
		return pradd;
	}

	public WebElement getAgree() {
		return agree;
	}

	public WebElement getPrc() {
		return prc;
	}

	public WebElement getBank() {
		return bank;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
