package hcltraining;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class hcltrainingday2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@Test
	public void assertNotEqual() {
		String name = "Jayakokila";
		assertNotEqual(name, "kokila");
		System.out.println("Assert not equal");
	}

	private void assertNotEqual(String name, String string) {
		// TODO Auto-generated method stub

	}

	@Test
	public void assertequals() {
		String name = "kokila";
		assertEquals(name, "kokila");
		System.out.println("Assert equal");
	}

	@Test
	public void assertnotsame() {
		String str1 = "Apple";
		String str2 = "Orange";
		Assertions.assertNotSame(str1, str2);
		System.out.println("assert not same");
	}

	@Test
	public void assertsame() {
		String str1 = "Apple";
		String str2 = "Apple";
		Assertions.assertSame(str1, str2);
		System.out.println("assertsame");
	}

	@Test
	public void assertnull() {
		String str1 = null;
		String str2 = "hello";
		AssertNull(str1);
		System.out.println("String holds null value � Assert passed");
	}

	private void AssertNull(String str12) {
		// TODO Auto-generated method stub

	}

	@Test
	public void assertnotnull() {
		String str1 = "bye";
		String str2 = "hello";
		AssertNotNull(str2);
		System.out.println("String not holding null value � Assert passed");
	}

	@Test
	public void assertrue() {

		AssertTrue(100 > 30);
		System.out.println("Assert true");
	}

	@Test
	public void assertfalse() {

		AssertFalse(1 > 30);
		System.out.println("Asert False");
	}
	@Test(timeout=10000) 
	 public void timeout() { 
		 int i; i=1; while(i==1) {
	 System.out.println(i); } }
	
	 
	private void AssertFalse(boolean b) {
		// TODO Auto-generated method stub

	}

	private void AssertTrue(boolean b) {
		// TODO Auto-generated method stub

	}

	private void AssertNotNull(String str2) {
		// TODO Auto-generated method stub

	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

	
}