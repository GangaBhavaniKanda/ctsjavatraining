package example;

public class SearchElement {
	public static boolean findElement(int arr[],int searchElement) {
		int i,count=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==searchElement)
				 count=1;
			else
				continue;
		}
		if(count==1)
			return true;
		else
	      return false;
		
	}

}
