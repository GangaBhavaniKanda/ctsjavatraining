package categories;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit4.TestUnit1;
import junit4.TestUnit2;

@RunWith(Categories.class)
@Categories.IncludeCategory(Regression.class)
//@Categories.IncludeCategory(Performance.class)
@Categories.ExcludeCategory(Performance.class)
@Suite.SuiteClasses({X.class,Y.class})
public class TestSuite1 {

}
