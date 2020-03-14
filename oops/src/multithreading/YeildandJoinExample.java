package multithreading;
class HelloThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
		 System.out.println("hello thread exeuting");
	}
}

public class YeildandJoinExample {

	public static void main(String[] args) throws InterruptedException {
		HelloThread h=new HelloThread();
		h.start();
		//h.yield();//waits the current thread until all other threads execution completed
		 h.join();	//waits all other thread until current thread execution completed
		for(int i=0;i<10;i++)
		 System.out.println("main thread executing");

	}

}
