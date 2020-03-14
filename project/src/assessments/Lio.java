package assessments;
import java.util.*;
public class Lio {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringBuilder sb=new StringBuilder(input);
		int n=sc.nextInt();
		int c=0;
		String []arr=new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			if(input.indexOf(arr[i])!=-1) {
				c++;
				sb.delete(input.indexOf(arr[i]), arr[i].length());
				if(sb.length()!=0)
					continue;	
			}
			else
				System.out.println("LIO");
		}
		if(c%2!=0)
			System.out.println("strich");
		else
			System.out.println("lio");

	}

}
