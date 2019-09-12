package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GT Jul 001\\workspace\\Selenium\\lib\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.lvbankonline.in/index.html?module=login");
	WebElement e = driver.findElement(By.id("login_username|input"));
	e.sendKeys("praveen");
	
	
	
}
}
