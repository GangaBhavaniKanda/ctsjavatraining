/*Assignment-5
------------
Write a Program to take care of Number Format Exception if user enters values other than 
integer for calculating average marks of 2 students. The name of the students and marks 
in 3 subjects are taken from the user while executing the program.
In the same Program write your own Exception classes to take care of Negative values and 
values out of range (i.e. other than in the range of 0-100)
 * */

package Exceptionhandling;
import java.util.Scanner;
class Student{
	int sum=0;
	String name;
	int m1,m2,m3;
	Student(String name,int m1,int m2,int m3){
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void run() throws NumberFormatException, NegativeValuesAssign5{
		if((m1>=0 ||m1<0)&&(m2>=0 ||m2<0)&&(m3>=0 ||m3<0)){
			sum=m1+m2+m3;
			System.out.println(sum);
		}
		else if((m1<0 || m1>100)&&(m2<0 || m2>100)&&(m3<0 || m3>100))
			throw new NegativeValuesAssign5();
	}
}
public class Assignment5 {
	public static void main(String []agrs) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
	
		try {
			s1.run();
		}
		catch(NumberFormatException n) {
			System.out.println(n);
		}
		catch(NegativeValuesAssign5 n) {
			System.out.println(n);
		}
	}

}
