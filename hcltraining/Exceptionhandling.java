package hcltraining;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



class Exceptionhandling {
@Test(expected=SessionNotCreatedException.class)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("http://www.google.com");
	    driver.manage().window().maximize();
	    WebElement searchbar=driver.findElement(By.xpath("//*[@id=\"input\"]"));
	    searchbar.sendKeys("coimbatore");
	    searchbar.click();
	    
	}

}
