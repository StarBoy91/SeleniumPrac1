package org.test.sel.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	static WebDriver driver;
	 static Properties prop = new Properties();

	  public TestBase() throws FileNotFoundException  {
		 
		 try {
			
		 
			FileInputStream ip=new FileInputStream("/home/ankit/eclipse-workspace/selprac1/src/main/java/org/test/sel/config/config.properties");
		
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
		 }
	  }



	public static void initialization() {
		
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","/home/ankit/Desktop/Selenium/selenium-java-3.11.0/chromedriver");
			driver=new ChromeDriver();}
			else if((browsername.equals("FF"))) {
				System.setProperty("webdriver.chrome.driver","/home/ankit/Desktop/Selenium/selenium-java-3.11.0/geckodriver");	
				driver=new FirefoxDriver();
				}
		}
		
		
		
		
		
		
	}}
