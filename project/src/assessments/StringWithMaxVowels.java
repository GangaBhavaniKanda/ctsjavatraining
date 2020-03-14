package assessments;
import java.util.*;
class MaxVowelStr{
	public static String maxVowel(String str) {
		String []arr=str.split(" ");
		String res="";
		int i=0,max_v_count=0;
		for(i=0;i<arr.length;i++) {
			int v_count=0;
			for(int j=0;j<arr[i].length();j++) {
				if(arr[i].charAt(j)=='a' || arr[i].charAt(j)=='e' || arr[i].charAt(j)=='i' || arr[i].charAt(j)=='o' ||arr[i].charAt(j)=='u' || arr[i].charAt(j)=='A' || arr[i].charAt(j)=='E' || arr[i].charAt(j)=='I' || arr[i].charAt(j)=='O' || arr[i].charAt(j)=='U' ) {
					v_count++;
				}
			}
			if(v_count>max_v_count) {
				max_v_count=v_count;
					res=arr[i];
			}
			else if(v_count==max_v_count){
					res=arr[i-1];
			}
		}
		
		return res;
		
	}
}

public class StringWithMaxVowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(MaxVowelStr.maxVowel(str));
		
	}

}
