package example;
//create interface inside class and implemets in another class
 public class SecondMain extends InterfaceInsideClass  {

	 public void getData(){
			System.out.println("we can create interface with in class also");
		}
	public static void main(String[] args) {
		
		SecondMain s=new SecondMain();
		s.getData();
		
	}

}
