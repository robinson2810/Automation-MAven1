package com.baseclass.java;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Return;

public class BaseClass1 {
	public static WebDriver driver;
//browser launch
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\welcome\\eclipse-workspace\\project1\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("invalid");
		}
		driver.manage().window().maximize();
		return driver;
	}
//get url
	public static void openurl(String str) {
		driver.get(str);
	}

// click
	public static void ClickOnElement(WebElement element) {
		element.click();
	}
//sendkeys
	public static void inputvalues(WebElement element, String str) {
		element.sendKeys(str);
	}
// close
	public static void close() {
		driver.close();
	}
// quit
	public static void quit() {
		driver.quit();
	}

// Navigate to
	public static void Nextpage(String url) {
		driver.navigate().to(url);
	}
//back	
	public static void backpage(String url) {
		driver.navigate().back();
	}

//actions
// move to element
	public static void Mouse_MoveToElement(WebElement refname) throws AWTException {
		Actions a = new Actions(driver);
		Robot r = new Robot();
		a.moveToElement(refname).build().perform();
	}

//click using mouse
	public static void Mouse_Click(WebElement refname) throws AWTException {
		Actions a = new Actions(driver);
		Robot r = new Robot();
		a.click(refname).build().perform();
	}

//context click
	public static void Mouse_Contextclick(WebElement refname) throws AWTException {
		Actions a = new Actions(driver);
		Robot r = new Robot();
		a.contextClick(refname).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
//thread.sleep
	public static void threadsleep(int i) throws InterruptedException {
		Thread.sleep(i);
	}

}
