package assessments;
import java.util.*;
class Num{
	public static int kaprearNum(int n) {
		int square=n*n;
		int res=0;
		String str=String.valueOf(square);
		int len=str.length();
		if(len%2==0) {
		int left=Integer.parseInt(str.substring(0, len/2));
		int right=Integer.parseInt(str.substring(len/2));
		if(n==(left+right))
			res=1;
		else
			res=-1;
		}
		return res;
	}
}
public class KaprearNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(Num.kaprearNum(n)==1)
			System.out.println("kaprear number");
		else
			System.out.println(" not kaprear number");
	}

}
