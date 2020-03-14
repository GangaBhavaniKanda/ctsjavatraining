package multithreading;
class SleepThread extends Thread{
	public void run() {
		try {
			System.out.println(this.getState());
		for(int i=1;i<=100;i++) {
			System.out.println(i);
			sleep(400);
		
	}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
}
}


public class SleepExample {

	public static void main(String[] args) {
		SleepThread s=new SleepThread();
				s.start();
		for(int i=150;i<=200;i++)
			System.out.println(i);
		System.out.println(s.getState());
		System.out.println(s.getPriority());
		System.out.println(s.getName());
		System.out.println(s.getId());
		
	}

}
