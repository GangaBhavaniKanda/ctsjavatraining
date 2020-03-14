package Exceptionhandling;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
	String str;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter integer");
	str=sc.nextLine();
    //System.out.println("num"+Integer.parseInt(str));
    try {
    	int num=Integer.parseInt(str);
    	if(num>=0 || num<0) {
    		System.out.println("square value:"+num*num);
    		System.out.println("the work has done successfully");
    	}
    	else
    		System.out.println("invalid");
    		
    	
    }
    catch(NumberFormatException e) {
    	System.out.println("Entered input is not valid format of an integer");
    }
    finally {
    	System.out.println("program is  continue");
    }

}
}