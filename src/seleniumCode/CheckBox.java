package seleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("welcome to multi check box");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		Thread.sleep(5000);	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(5000);	
		List<WebElement> che = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int si = che.size();
		System.out.println(si);
		for(int i = 0; i<si; i++) {
			che.get(i).click();
		}

	}

}
