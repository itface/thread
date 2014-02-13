package runnable;

public class RunnableDemo2 implements Runnable{
	private int count=10;
	public void run(){
	    while(count>0){
			System.out.println(2+Thread.currentThread().getName()+" is running"+count);
			count--;
		}
	}

}
