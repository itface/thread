package thread;

public class ThreadMain {

	public static void main(String[] args){
		//һ���̶߳���ֻ����һ���߳�,���۵��ü���start
		new ThreadDemo().start();
		new ThreadDemo2().start();
		for(int i=0;i<10;i++){
			//System.out.println(i+"main Thread is running");
		}
	}
}
