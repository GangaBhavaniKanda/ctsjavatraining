//user defined Exception
package Exceptionhandling;

public class InsufficientAgeException extends Exception {

	public InsufficientAgeException() {
		super("age is more than 18");
	}

}
