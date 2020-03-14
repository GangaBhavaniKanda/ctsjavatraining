package assessments;
import java.util.*;
class UserMainCode18{
	public static int addPrimeIndex(int arr[]) {
		int i=0,fact,sum=0,c=0;
		for(i=2;i<arr.length;i++)
		{
			fact=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					fact++;
			}
			if(fact==2) {
				sum=sum+arr[i];
				c++;
			}
		}
		int avg=sum/c;
		return avg;
		
	}
}
public class AveragePrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(UserMainCode18.addPrimeIndex(arr));

	}

}
