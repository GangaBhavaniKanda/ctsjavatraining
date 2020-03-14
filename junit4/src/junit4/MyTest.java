package junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyTest {
	@BeforeClass
	public static void beforeAlltests(){
		System.out.println("before all test cases");
	}
	@Test
	public void test1() {
		System.out.println("first test case");
	}
	
	@Test
	@Ignore
	public void test2() {
		System.out.println("second test case");
	}
	@Test(timeout=1000)
	public void test3() {
		System.out.println("third test case");
	}
	@Before
	public void beforeTest()
	{
		System.out.println("before each test case");
	}
	@After
	public void fterTest()
	{
		System.out.println("after each test case");
	}
	@AfterClass
	public static void AfterAlltests(){
		System.out.println("after all test cases");
	}


}
