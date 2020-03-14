package junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloworldTestClass {
	@Test
	public void testMesg1() {
		Helloworld h=new Helloworld();
		assertEquals("hello",h.mesg1());
	}
	@Test
	public void testMesg2() {
		Helloworld h=new Helloworld();
		assertEquals("hi",h.mesg2());
	}

}
