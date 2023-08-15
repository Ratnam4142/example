package seleniumCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {

	public static void main(String[] args) throws InterruptedException {
		
			System.out.println("Welcome to Bliss tech");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ratnam\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        Thread.sleep(10000);
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("username")));
        WebElement name = driver.findElement(By.name("username"));
        name.sendKeys("Admin");
        
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("admin123");
        
        WebElement click = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        click.click();
	}

}
