/* finding number of vowels in given string and return count of vowels to Main class*/

package example;
public class UserMain {
	public static int countVowels(String string) {
		int len=string.length();
		int count=0,i;
		String str=string.toLowerCase();
		for(i=0;i<len;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			   count++;
			}
			else
				continue;
				
		}
		return count;
	}

}
