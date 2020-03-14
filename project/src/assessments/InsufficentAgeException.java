package assessments;

public class InsufficentAgeException extends Exception {
	InsufficentAgeException(){
		super("insuffient age for voting");
	}

}
