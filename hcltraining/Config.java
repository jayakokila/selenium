package hcltraining;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Config {
public static void main(String[] args) throws IOException {
	
	FileInputStream st=new FileInputStream("E:\\selenium\\esclipes\\eclipse\\Hclproject\\hcltraining\\config.properties");
	Properties prop=new Properties();
	prop.load(st);
	String browser_name= prop.getProperty("browser");
	String Chromepath= prop.getProperty("chrome_path");
	String Firefoxpath= prop.getProperty("firefox_path");
	String Edgepath= prop.getProperty("edge_path");
	WebDriver driver;
	
	if(browser_name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", Chromepath);
		driver= new ChromeDriver();
	

         driver.manage().window().maximize();
         
		 driver.get("http://www.leafground.com/pages/download.html");
	     driver.findElement(By.linkText("Download Excel")).click();
}else if(browser_name.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", Firefoxpath);
	driver= new FirefoxDriver();


     driver.manage().window().maximize();
     
	 driver.get("http://www.leafground.com/pages/download.html");
     driver.findElement(By.linkText("Download Excel")).click(); 
}else {
	System.setProperty("webdriver.edge.driver", Edgepath);
	driver= new EdgeDriver();


     driver.manage().window().maximize();
     
	 driver.get("http://www.leafground.com/pages/download.html");
     driver.findElement(By.linkText("Download Excel")).click(); 
}
	System.out.println("Hurray! File downloaded successfully");
driver.close();
}
}

