package java8assignment;
import java.util.*;
class UserMainCode3{
	public static boolean checkTriplets(int arr[]) {
		
		boolean b=false;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i;j<i+3;j++) {
				if(arr[i]==arr[j])
					c++;
				else
					break;
			}
			if(c==3) {
				b=true;
				break;
			}
		
		}
		return b;
		
	}
}
public class CheckTriplets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
System.out.println(UserMainCode3.checkTriplets(arr));
	}

}
