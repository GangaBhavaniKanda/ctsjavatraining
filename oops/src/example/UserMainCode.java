package example;

public class UserMainCode {

	public static int checkSum(int num){
		int sum=0;
		while(num!=0)
		{
		 int r=num%10;
		 sum=sum+r;
		 num=num/10;
		}
		if(sum%2==0)
			return -1;
		else
			return 1;
		
	}
}

