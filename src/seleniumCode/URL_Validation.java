package seleniumCode;

import org.openqa.selenium.chrome.ChromeDriver;

public class URL_Validation {
	public static void main(String[] args) {
		System.out.println("Welcome to Bliss tech");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        
        String url = "https://rahulshettyacademy.com/AutomationPractice/";
        if(driver.getCurrentUrl().equals(url)) {
        	System.out.println("yes");
        }else {
        	System.out.println("no");
        }
        System.out.println(driver.getCurrentUrl());
	}

}
