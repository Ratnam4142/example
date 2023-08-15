package seleniumCode;

import org.openqa.selenium.chrome.ChromeDriver;

public class titleValidaation {
	public static void main(String[] args) {
		System.out.println("Welcome to Bliss tech");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
        String title = "Practice Page";
        if(driver.getTitle().equals(title)) {
        	System.out.println("The titile was matched");
        }else {
        	System.out.println("The titile was not matched");
        }
        System.out.println(driver.getTitle());
        if(driver.getTitle().equals("Practice Page")) {
        	System.out.println("The titile was matched");
        }else {
        	System.out.println("The titile was not matched");
        }

	}

}
