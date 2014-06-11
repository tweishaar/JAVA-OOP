package uebung7.hwr.berlin.de;

import java.awt.Color;
import java.awt.Graphics;


public class HausNikolaus {
	int[] arx;
	int[] ary;
	int x;
	int y;
	
	public HausNikolaus(int x, int y){
		arx = new int[]{ x, x + 50, x + 50, x + 25, x};
		ary = new int[]{y, y, y - 50, y - 75, y - 50};
		this.x = x;
		this.y = y;
	}
		
	
	public void drawNicolaus(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawPolygon(arx, ary, arx.length);
		g.drawLine(x + 50, y - 50, x, y);
		g.drawLine(x + 50, y, x, y - 50);
		g.drawLine(x + 50, y - 50, x, y - 50);
	}
}
 