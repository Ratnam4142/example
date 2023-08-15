package seleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Bliss tech");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://nxtgenaiacademy.com/alertandpopup/");
        
       String ra = "ratnam";
        Thread.sleep(5000);
       WebElement alt = driver.findElement(By.name("alertbox"));
       String text = alt.getText();
       System.out.println(text);
       alt.click();
       Thread.sleep(5000);
       System.out.println(driver.switchTo().alert().getText());
       Thread.sleep(5000);
       driver.switchTo().alert().accept();
       
	}

}
