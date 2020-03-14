package example;
import java.util.Scanner;
public class Main {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter a positive number");
			int num=s.nextInt();
			System.out.println(UserMainCode.checkSum(num));
			s.close();
		}
	}


