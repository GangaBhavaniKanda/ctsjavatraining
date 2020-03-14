//this is sample program  print the last char of each string in uppercase
//result string is:S$S$E$M
package example;
import java.util.*;
class UserMainCode2{
	public static String resultString(String str) {
		String []arr=str.split(" ");
		String res="";
		for(int i=0;i<arr.length;i++) {
			res=res+arr[i].charAt(arr[i].length()-1)+"$";
		}
		String r=res.substring(0, res.length()-1).toUpperCase();
		return r;
	}
}
public class AddLastCharofEveryStr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("result string is:"+UserMainCode2.resultString(str));
	}

}
