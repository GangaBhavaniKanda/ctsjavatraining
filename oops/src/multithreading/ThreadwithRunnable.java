//thread creation with runnable interface
package multithreading;
/*class MyThread implements Runnable{
	public void run()
	{
		for(int i=101;i<=200;i++)
			System.out.println(i);
	}
}
*/
public class ThreadwithRunnable {

	public static void main(String[] args) {
		/*MyThread my=new MyThread();
		Thread t=new Thread(my);
		t.start();*/
		
		//using lambda expression
		Runnable r=()->{
			for(int i=101;i<=200;i++)
				System.out.println(i);
		};
		// runnable interface has only one run() method and all methods are available in thread class
		Thread t=new Thread(r);
		t.start();
	}

}
