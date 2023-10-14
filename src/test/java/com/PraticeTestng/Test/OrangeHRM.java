package com.PraticeTestng.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
    
    WebDriver driver;

    //@Test
//    public void lounchApp() {
//	
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	String baseURL = "https://opensource-demo.orangehrmlive.com/";
//	driver.get(baseURL);
//    }
    
    @Test
    public  void EnterLoginDetails() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	System.out.println("abcd");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	System.out.println("ab");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	System.out.println("a");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.close();
    }


}
