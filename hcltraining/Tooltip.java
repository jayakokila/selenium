package hcltraining;

import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.*;		

public class Tooltip {				
    public static void main(String[] args) {									
     
        String baseUrl = "http://www.leafground.com/pages/tooltip.html";					
        System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();					
        driver.get(baseUrl);					
        String expectedTooltip = "Enter your Name";	
     
	    WebElement ele=driver.findElement(By.id("age"));
	    String actualTooltip=ele.getAttribute("title");		
        System.out.println("Actual Title of Tool Tip"  +actualTooltip);	
        if(actualTooltip.equals(expectedTooltip)) {							
            System.out.println("Passed");					
        }		
        driver.close();			
   }		
}