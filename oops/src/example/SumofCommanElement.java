//sum of comman elements in two arrays
package example;
public class SumofCommanElement {
	public static int sum(int arr1[],int arr2[]) {
		int i,j,s=0;
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					s=s+arr1[i];
					break;
				}
				else
					continue;
			}
		}
		return s;
		
	}

}
