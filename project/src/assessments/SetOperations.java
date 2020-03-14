package assessments;
import java.util.*;
class Operations{
	public static ArrayList<Integer>setOperations(ArrayList<Integer>list1,ArrayList<Integer>list2,char ch){
		ArrayList<Integer>list3=new ArrayList<Integer>();
		LinkedHashSet<Integer>lh=new LinkedHashSet<Integer>();
		switch(ch) {
		case '+':	list1.addAll(list2);
					lh.addAll(list1);
					list3.addAll(lh);
					break;
		case '-':	
			for(int i=0;i<list1.size();i++) {
				for(int j=0;j<list2.size();j++) {
					if(list1.get(i)==list2.get(j))
						list1.remove(i);
				}
			}
				list3.addAll(list1);
					break;
		case '*':
					for(int i=0;i<list1.size();i++) {
						for(int j=0;j<list2.size();j++) {
							if(list1.get(i)==list2.get(j))
								list3.add(list1.get(i));
						}
					}
					break;
		}
		return list3;
	}
}
public class SetOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of arraylists");
		int n=sc.nextInt();
		ArrayList<Integer>list1=new ArrayList<Integer>();
		ArrayList<Integer>list2=new ArrayList<Integer>();
		System.out.println("enter first list elements");
		for(int i=0;i<n;i++) {
			list1.add(sc.nextInt());
		}
		System.out.println("enter second list elements");
		for(int i=0;i<n;i++) {
			list2.add(sc.nextInt());
		}
		System.out.println("enter set operator");
		char ch=sc.next().charAt(0);
		Operations.setOperations(list1, list2, ch).forEach(System.out::println);


	}

}
