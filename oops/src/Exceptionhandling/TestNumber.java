//user defined exception for even,odd number checking
package Exceptionhandling;

public class TestNumber {

	public void testNumber(int num)throws EvenNumberException, OddNumberException{
		if(num%2==0)
			throw new EvenNumberException();
		else
			throw new OddNumberException();
	}
}
