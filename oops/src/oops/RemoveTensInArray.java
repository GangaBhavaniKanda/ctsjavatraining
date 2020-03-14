/*1.write a program to read an integer array and remove all 10 s from the array.
 shift the other elements towards left and fill the trailing empty positions by 0 so
 that the modified array is of the same length of the given array
 */
package oops;
import java.util.Scanner;
class Question1{
	static int[] removeTens(int []arr) {
		int i,j,count=0;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				count++;
				for(j=i;j<arr.length-1;j++)
					arr[j]=arr[j+1];
				
			}
		}
		for(i=(arr.length-count);i<arr.length;i++)
						arr[i]=0;
return arr;
	}
}
public class RemoveTensInArray {

	public static void main(String[] args) {
		int size,i;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int []arr=new int[size];
		for(i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		arr=Question1.removeTens(arr);
		System.out.println("modified array");
		for(int ele:arr)
			System.out.print(ele);

	}

}
