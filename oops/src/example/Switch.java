package example;

public class Switch {

	public static void main(String[] args) {
		String str=new String("hello");
		switch(str)
		{
		case "hi":
			System.out.println("hi");
			break;
		case "helloworld":
			System.out.println("helloworld");
			break;
		case "hello":
			System.out.println("hello");
			break;
		default:
			System.out.println("nothing matches");
			break;
		}

	}

}
