//multithreading example
//order of thread execution purely based thread Schedular
package multithreading;
class MyThread extends Thread{
	//overriding run() method in thread class
	@Override
	public void run()
	{
		System.out.println("thread execution begins..");
		for(int i=100;i<=150;i++)
			System.out.println(i);
		System.out.println("thread is end");
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method execution begins");
		MyThread t1=new MyThread();
		t1.start();
		for(int j=0;j<=100;j++)
			System.out.println(j);
		System.out.println("main method end");
		System.out.println("priority of mythread:"+t1.getPriority());
		

	}

}
