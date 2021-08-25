package hcltraining;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGPriority {
@BeforeSuite
public void before_suite1()
 {
System.out.println("Before Suite file");
}
@BeforeClass
public void beforeclass() {
System.out.println("Before class");
}
@BeforeMethod
public void before_method1() {
System.out.println("Before method");
}
@BeforeTest
public void before_test1() {
System.out.println("Before Test");
}
@Test(priority=1)
public void sample1() {
System.out.println("First test method");
}
@Test(priority=3)
public void sample2() {
System.out.println("Second test method");
}
@Test(priority=2)
public void sample3() {
System.out.println("Third test method");
}
@AfterMethod
public void after_method1() {
System.out.println("after method");
}@AfterTest
public void AfterTest() {
System.out.println("after Test");
}
@AfterClass
public void AfterClass() {
System.out.println("after Test");
}

@AfterSuite
public void after_suite1() {
System.out.println("After Suite file ");
}
}