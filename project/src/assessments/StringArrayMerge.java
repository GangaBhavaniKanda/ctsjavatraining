package assessments;

public class StringArrayMerge {
	public static String[] merge(String names1[],String names2[]) {
		String res[]=new String[10];
		int j=0;
		for(int i=0;i<names1.length;i++,j++) {
			res[j]=names1[i];
		}
		
		for(int i=0;i<names2.length;i++) {
			for(int k=0;k<j;k++) {
			if(!names2[i].equals(res[k])) {
				res[j]=names2[i];
				j++;
				break;
			}
			else
				break;
		}
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		String []names1= {"banana","apple","orange"};
		String []names2= {"cherry","apple","xyz"};
		String arr[]=merge(names1,names2);
	}

}
