//user defined Exception
package Exceptionhandling;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super("age can't be -ve and more than 100");
	}

}
