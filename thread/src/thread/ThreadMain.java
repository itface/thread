package thread;

public class ThreadMain {

	public static void main(String[] args){
		//一个线程对象只能起一个线程,无论调用几次start
		new ThreadDemo().start();
		new ThreadDemo2().start();
		for(int i=0;i<10;i++){
			//System.out.println(i+"main Thread is running");
		}
	}
}
