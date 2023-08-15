package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("welcome to multi check box");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");

		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 300)");
		Thread.sleep(5000);	
		WebElement drop = driver.findElement(By.id("Skills"));
		Thread.sleep(5000);	
		Select drop1 = new Select(drop);
		drop1.selectByIndex(20);
		List<WebElement> list = drop1.getOptions();
		int size = list.size();
		System.out.println(size);
		for(int i = 0; i<size; i++) {
			String text = list.get(i).getText();
			System.out.println(text);
		}
	}

}
