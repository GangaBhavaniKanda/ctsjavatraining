package example;

public class MyThread {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=1;i<100;i++) {
				System.out.println(i);
			}
		};
		Thread t=new Thread(r);
		t.start();
		t.run();
		

	}

}
