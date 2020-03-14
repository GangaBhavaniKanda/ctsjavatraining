package example;
/*class MyThread implements Runnable{
	public void run() {
		System.out.println("without lambda expression");
	}
}*/
public class LambdaExpression {

	public static void main(String[] args) {
	Runnable runnable=()->System.out.println("Inside the thread using lambda expressions");
	Thread t=new Thread(runnable);
	t.start();
	/*MyThread m=new MyThread();
	Thread t1=new Thread(m);
	t1.start();*/
	

	}

}
