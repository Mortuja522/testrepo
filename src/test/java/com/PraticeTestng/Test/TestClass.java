package com.PraticeTestng.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	@Test(priority=2)
	public void TestGoogle() throws Throwable {
	     
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("mortuja morshed", Keys.ENTER);
	    System.out.print(driver.getTitle());
	    Thread.sleep(500);
	    driver.quit();
}
	@Test(priority=1)
	public void TestGoole2() throws Throwable {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.techtarget.com/searchsecurity/definition/logon");

	    // Find the search input field by its name and enter the query
	    WebElement searchfunctional = driver.findElement(By.xpath("//*[@id=\"page-header\"]/nav/div[1]/a[1]/span"));
	    searchfunctional.click();
	    
	    WebElement searchInput = driver.findElement(By.name("email"));
	    searchInput.sendKeys("mortujaaiub@gmail.com");
	   
	    WebElement loginfunctional = driver.findElement(By.xpath("//*[@id=\"saveProfileChanges\"]"));
	    loginfunctional.click();

	    System.out.print(driver.getTitle());

	    driver.quit();
	}
}