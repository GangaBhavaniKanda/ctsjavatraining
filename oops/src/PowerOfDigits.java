import java.util.Scanner;

public class PowerOfDigits {


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				int n,rem=0,revnum=0,i=0,sum=0;
				System.out.println("enter number");
				n=sc.nextInt();
				while(n!=0) {
					rem=n%10;
					revnum=revnum*10+rem;
					n=n/10;
					
				}
				while(revnum!=0) {
					rem=n%10;
					sum=sum+(int)Math.pow(rem, i);
					i=i+1;
					revnum=revnum/10;
					
			}
				System.out.println("power of each digit with respect to their index position"+sum);

		}

	

}
