package thread;

public class ThreadDemo extends Thread{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+Thread.currentThread().getName()+" is running");
		}
	}
}
