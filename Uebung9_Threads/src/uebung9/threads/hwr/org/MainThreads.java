package uebung9.threads.hwr.org;

import java.util.ArrayList;
import java.util.List;

public class MainThreads extends Thread implements Runnable{
	public static List<MyThread> threadlist = new ArrayList<>();
	static{
		for (int i = 0;i<10;i++){
			threadlist.add(new MyThread());
			threadlist.get(i).start();
		}
	}
	public MainThreads() { //Konstrukrtor
		
		}

	public static void getThread(){
		
		}
	
	public static void main(String[] args) {
		//getThread();
	}

}
