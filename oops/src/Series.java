import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s2=3;
		int s1=1;
		int pos=0;
		if(n%2!=0) {
		for(int i=2;i<=n;i++) {
			if(pos==0) {
				s1=s1+s2;
				pos=1;
			}
			else {
				s1=s1-s2;
				pos=0;
				}
			s2=s2+2;
		}
		System.out.println("sum is"+s1);

	}
		else
			System.out.println("n value must be odd number");
	}

	

}
