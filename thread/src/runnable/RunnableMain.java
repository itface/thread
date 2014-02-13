package runnable;

public class RunnableMain {

	public static void main(String[] args){
		RunnableDemo demo1 = new RunnableDemo();
		RunnableDemo2 demo2 = new RunnableDemo2();
		//new Thread(demo1).start();
		new Thread(demo2).start();
		new Thread(demo2).start();
		for(int i=0;i<10;i++){
			//System.out.println(i+"main Thread is running");
		}
	}
}
