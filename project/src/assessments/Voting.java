package assessments;

public class Voting {
	public void testAge(int age)throws InsufficentAgeException,InvalidAgeException{
		if(age>=0 && age<18)
			throw new InsufficentAgeException();
		else if(age<0 || age>100)
			throw new InvalidAgeException();
		else
			System.out.println("eligible for voting");
	}

}

