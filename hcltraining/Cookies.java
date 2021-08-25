package hcltraining;

import java.awt.AWTException;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
//import org.testng.annotations.Test;



public class Cookies {


 @Test
public void test() throws IOException {
System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://ksrtc.in/oprs-web/login/show.do");
driver.findElement(By.id("userName")).sendKeys("username");
driver.findElement(By.id("password")).sendKeys("password");
driver.findElement(By.id("submitBtn")).click();
File file1=new File("E:\\Doc\\cookies1.data");
try {
file1.createNewFile();
FileWriter fw=new FileWriter(file1);
BufferedWriter bw=new BufferedWriter(fw);
for(Cookie ck:driver.manage().getCookies()) {

bw.write((ck.getName()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()+";"+ck.getValue()));
bw.newLine();

}
bw.close();
fw.close();
}
catch(Exception e) {
System.out.println(e);
}}}