// finding nature of quadratic equation
package example;
public class UserMain3 {
	public static String findRoots(int a,int b,int c) {
		int res= ((b*b)-(4*a*c));
		if(res>0)
			return "roots are real and unequal";
		else if(res==0)
			return " roots are real and equal";
		else
		  return "roots are imaginary";
	}

}
