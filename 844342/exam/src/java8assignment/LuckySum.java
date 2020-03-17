package java8assignment;
import java.util.*;
class UserMainCode5{
	public static int getLuckySum(int a,int b,int c) {
		int sum=0;
		if(a!=13 && b!=13 && c!=13)
			sum=a+b+c;
		else if(a!=13 && b==13 && c!=13)
			sum=a;
		else if(a!=13 && b!=13 && c==13)
			sum=a+b;
		else if(a==13)
			sum=c;
	
		return sum;
	}
}

public class LuckySum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(UserMainCode5.getLuckySum(a, b, c));

	}

}
