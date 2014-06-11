package uebung7.hwr.berlin.de;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MyFrame extends Frame {
	
	public MyFrame() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				super.windowClosing(e);
			}	
		});
		setTitle("MyFrame");
		setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		setLocation(400, 100);
		setSize(600, 400);
	}
	
	public static void setSleep() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void setUnvisible(List<MyFrame> frames) {
		for(MyFrame frame : frames) {
			frame.setVisible(false);
			
		}
	}
	
	public static void setSize(List<MyFrame> frames) {
		for(MyFrame frame : frames){
			frame.setSize(400, 600);
			frame.setVisible(true);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//g.setColor(Color.BLACK);
		
		g.setColor(Color.CYAN);
		g.fillRect(10, 34, 200, 300);
		HausNikolaus hn = new HausNikolaus(20,400);
		hn.drawNicolaus(g);
		super.paint(g);
	}
	
	
	public static void main(String[] args) {
		//1
		List<MyFrame> myframe = new ArrayList<>();
		myframe.add(new MyFrame());
		myframe.add(new MyFrame());
		myframe.add(new MyFrame());
		setSleep();
		setUnvisible(myframe);
		setSleep();
		setSize(myframe);
		
		
	}
}

