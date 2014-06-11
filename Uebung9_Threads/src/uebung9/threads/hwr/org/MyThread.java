package uebung9.threads.hwr.org;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread implements Runnable{
	public static List<MyThread> threadlist = new ArrayList<>();
	public static int sum = 0;
	public void run(){ //Nebenläufigkeiten
		int i = 1;
		while (i++ <= 1000){
			MyThread.sum += i;
			// System.out.println("Ergebnis:"+sum);
		}
	
	}
	public static void main(String[] args) {
			for (int i = 0;i<10;i++){
				threadlist.add(new MyThread());
				threadlist.get(i).start();
			}
			System.out.println(getSum());
	}
	public static int getSum(){
		return MyThread.sum;
	}
}
