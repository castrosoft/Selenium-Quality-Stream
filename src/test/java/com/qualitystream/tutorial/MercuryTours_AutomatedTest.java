package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("REGISTER");
	By registerPageLocator = By.xpath("//img[@src='/images/masts/mast_register.gif']");
	
	By usernameLocator = By.id("email");
	By passwordLocator = By.name("password");
	By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");
	By registerBtnLocator = By.name("register");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "Z:\\Descargas\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		
		//1- Click en REGISTER
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000); //Por ahora uso este delay. No se recomienda
		
		//2- Completar campos para registrar usuario
		
		//Si es true, entonces la imagen esta" 
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			//Lleno los campos
			driver.findElement(usernameLocator).sendKeys("qualityadmin");
			driver.findElement(passwordLocator).sendKeys("pass1");
			driver.findElement(confirmPasswordLocator).sendKeys("pass1");
			
			//Click en SUBMIT
			driver.findElement(registerBtnLocator).click();	
		}else {
			
			System.out.println("Register page was not found");
		}
		
		
		
		//3- Confirmar mensaje de usuario registrado
		
	}

}
