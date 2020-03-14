package categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class X {
	@Category(Performance.class)
	@Test
	public void m1() {
		System.out.println("m1 from x");
	}
	
	@Category(Regression.class)
	@Test
	public void m2() {
		System.out.println("m2 from x");
	}

}
