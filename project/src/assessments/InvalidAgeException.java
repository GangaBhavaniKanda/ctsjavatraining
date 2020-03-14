package assessments;

public class InvalidAgeException extends Exception{
	InvalidAgeException(){
		super("age value is 0 to 100 only");
	}

}
