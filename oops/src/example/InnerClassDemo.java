package example;

 class OuterClass{
	//inner class can be static or default
	class InnerClass{
			public int fact(int n) {
				if(n==0 || n==1)
					return n;
				else
					return n*fact(n-1);
			}
		}
	public void display() {
		InnerClass obj=new InnerClass();
		System.out.println(obj.fact(5));
	}

}
class InnerClassDemo {
	public static void main(String []args) {
		OuterClass outer=new OuterClass();
		outer.display();
	}
}
