package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "Z:\\Descargas\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void testGooglePage() {
		WebElement searchBox = driver.findElement(By.name("q"));
		
		//Limpia cualquier texto en la caja de busqueda
		searchBox.clear();
		
		//Envia al buscador el texto
		searchBox.sendKeys("Introduccion a automation");
		
		//"Enter"
		searchBox.submit();
		
		//Delay para que Google recupere los resultados. Esto evita un falso positivo
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit wait
		WebDriverWait ewait = new WebDriverWait(driver, 10);
		
		//Condicion por la que estoy esperando
		ewait.until(ExpectedConditions.titleContains("Introduccion a automation"));
		

		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
