package com.sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Admin\\eclipse-workspace\\Selenium_feb\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://twitter.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		//driver.close();
		
		//driver.quit();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
	}

}
