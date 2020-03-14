//class is inside a method
package example;
import java.util.Scanner;
public class ClassInsideMethod {
	public void method(int []arr) {
		class Max{
			public int maximumElement() {
		
			
			int max=arr[0];
			for(int i=1;i<arr.length;i++)
			{
				if(max<arr[i])
					max=arr[i];
			}
			return max;
			
		}
		}
		Max obj=new Max();
		System.out.println(obj.maximumElement());
		
	}

	public static void main(String[] args) {
		int []arr=new int[5];
		int i;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		ClassInsideMethod c=new ClassInsideMethod();
		c.method(arr);

	}

}
