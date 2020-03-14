package assessments;
import java.util.*;
class UserMainCode20{
	public static int largestSpan(int arr[]) {
		int i=0,j=0 ,count,max_count=0;
		for(i=0;i<arr.length;i++) {
			count=0;
			for(j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count=j;
			}
			}
			if(max_count<count)
				max_count=count;
			
		}
		return max_count+1;
		
	}
}
public class LargestSpan {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(UserMainCode20.largestSpan(arr));
		}

}
