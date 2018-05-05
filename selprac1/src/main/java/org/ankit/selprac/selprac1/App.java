package org.ankit.selprac.selprac1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "/home/ankit/Desktop/Selenium/selenium-java-3.11.0/geckodriver");
        System.out.println( "Hello World!" );
        WebDriver d= new FirefoxDriver();
        d.get("https://www.google.com");
        d.close();
    }
}
