package categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;
@Category(Regression.class)//priority is high to class level 
public class Y {
	@Category(Regression.class)
	@Test
	public void m3() {
		System.out.println("m3 from y");
	}
	@Category(Performance.class)
	@Test
	public void m4() {
		System.out.println("m4 from y");
	}

}
