//5
import java.util.Scanner;

public class ReversNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,rem=0,revnum=0;
		System.out.println("enter number");
		n=sc.nextInt();
		while(n!=0 && n>0) {
			rem=n%10;
			revnum=revnum*10+rem;
			n=n/10;
			
		}
		System.out.println("reverse number"+revnum);
	}

}
