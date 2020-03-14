//return true if given number is prime else return false
package example;
public class Prime {
	public static boolean isPrime(int num) {
		int i,fact=0;
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				fact++;	
		}
		if(fact==2)
			return true;
		else
			return false;

	}

}
