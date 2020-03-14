package unittesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Testing {
	@Test
	public void test1() {
		System.out.println("test case 1");
	}

	//@Test
	@RepeatedTest(3)
	public void test2() {
		System.out.println("test case 2");
	}
	@BeforeEach
	public void beforeTest() {
		System.out.println("before each testcase");
	}
	@AfterEach
	public void afterTest() {
		System.out.println("after each testcase");
	}
	@BeforeAll
	public static void beforeClassBegin() {
		System.out.println("before begining of the class");
	}
	@AfterAll
	public static void afterAllMethodsOfTheClass() {
		System.out.println("after exuction of all methods in class");
	}
	@ParameterizedTest
	@ValueSource(strings= {"xyz","abc","hsgj"})
	void login(String str) {
		System.out.println(str);
	}
	@Disabled
	public void disableTestCase() {
		System.out.println("disabled");
	}
}
