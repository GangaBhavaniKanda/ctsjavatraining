package example;
interface Mathemetics{
	public int add(int a,int b);
}

public class Mathe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathemetics m=(a,b)->a+b;
		System.out.println(m.add(3, 5));

	}

}
