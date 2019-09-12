package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Jul 001\\workspace\\Selenium\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
        WebElement btn = driver.findElement(By.id("loginbutton"));
		btn.click();
		
		
		
		
}

}



//WebElement e = driver.findElement(By.id("email"));
//e.sendKeys("Nijar");
//WebElement p = driver.findElement(By.name("password"));
//p.sendKeys("abc");
//WebElement btn = driver.findElement(By.id("loginbutton"));
//btn.click();
//driver.close();

//String title = driver.getTitle();
//System.out.println(title);
//String url = driver.getCurrentUrl();
//System.out.println(url);


//WebElement btn = driver.findElement(By.id("loginbutton"));
//btn.click();
//driver.navigate().to("https://www.google.com/");
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();



//WebElement e = driver.findElement(By.xpath("//input[@id='email']"));
//e.sendKeys("Gokul");
//WebElement p = driver.findElement(By.xpath("//input[@id='pass']"));
//p.sendKeys("abc");
//WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
//btn.click();


//driver.get("https://www.facebook.com");
//WebElement f = driver.findElement(By.xpath("//a[@title='Go to Facebook home']"));
//f.click();
//WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
//e.sendKeys("Gokul");
//WebElement s = driver.findElement(By.xpath("//input[@name='lastname']"));
//s.sendKeys("nath");
//WebElement p = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
//p.sendKeys("asdfg");
//WebElement l = driver.findElement(By.xpath("//input[@name='reg_email__']"));
//l.sendKeys("Gokul@gmail.com");
//WebElement q = driver.findElement(By.xpath("//select[@name='birthday_day']"));
//q.sendKeys("12");
//WebElement w = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//w.sendKeys("jan");
//WebElement t = driver.findElement(By.xpath("//select[@name='birthday_year']"));
//t.sendKeys("1998");
//WebElement g = driver.findElement(By.xpath("//input[@id='u_0_6']"));
//g.click();
//WebElement btn = driver.findElement(By.xpath("//button[@id='u_0_15']"));
//btn.click();