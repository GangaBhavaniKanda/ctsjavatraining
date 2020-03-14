package example;

public class BinarySearch {
       public static int searchEle(int arr[],int searchElement){
         int low=0,high=arr.length,mid;
         boolean flag=false;
         mid=(low+high)/2;
         while(low<=high)
         {
           if(arr[mid]==searchElement)
           {
        	   flag=true;
        	   break;
           }
           else if(arr[mid]<searchElement) {
    		   low=mid+1;}
    	   else if(arr[mid]>searchElement) {
    		   high=mid-1;
    	    }
           mid=(low+high)/2;
         }
         if(flag)
        	 return 1;
         else
        	 return 0;
}
}
