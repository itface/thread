package runnable;

public class RunnableDemo implements Runnable{

	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(1+Thread.currentThread().getName()+" is running"+i);
		}
	}
}
