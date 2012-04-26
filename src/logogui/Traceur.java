/*
 * Created on 12 sept. 2008
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package logogui;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Graphics;

/**
 * @author Claude Moulin
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Traceur {
	private static Traceur instance;
	private Graphics2D g2d;
	private double initx = 300, inity = 300;   // position initiale
	private double posx = initx, posy = inity; // position courante
	private int angle = 90;
	private double teta;
	private final int SIZE = 1000;
	private boolean drawing = true;
	
	public Traceur() {
		setTeta();
	}

	/**
	 * @return Returns the instance.
	 */
	public static Traceur getInstance() {
		if (instance == null)
			instance = new Traceur();
		return instance;
	}

	public void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;	
	}
	
	private int toInt(double a) {
		return (int) Math.round(a);
	}
	
	private void setTeta() {
		teta = Math.toRadians(angle);
	}
	
	public void av(double r) {
		double a = posx + r * Math.cos(teta) ;
		double b = posy - r * Math.sin(teta) ;
		int x1 = toInt(posx);
		int y1 = toInt(posy);
		int x2 = toInt(a);
		int y2 = toInt(b);
		if(drawing)
			g2d.drawLine(x1,y1,x2,y2);
		posx = a;
		posy = b;
	}

	public void td(double r) {
		angle = (angle - toInt(r)) % 360;
		setTeta();
	}
	
	public void tg(double r) {
		angle = (angle + toInt(r)) % 360;
		setTeta();
	}
	
	public void rec(double r) {
		angle = (angle + 180) % 360;
		setTeta();
		av(r);
		angle = (angle - 180) % 360;
	}
	
	public void fpos(double m1, double m2) {
		posx = m1;
		posy = m2;
		angle = 90;
		setTeta();
	}
	
	public void ve() {
    	if (g2d != null) {
    		g2d.clearRect(0, 0, SIZE, SIZE);
    	}
	}
	
	public void lc() {
		if(drawing)
			drawing = false;
	}
	
	public void bc() {
		if(!drawing)
			drawing = true;
	}
	
	public void fcc(double n) {
		int col = toInt(n) % 8;
		
		switch(col) {
		case 1:
			g2d.setColor(Color.RED);
			break;
		case 2:
			g2d.setColor(Color.GREEN);
			break;
		case 3:
			g2d.setColor(Color.YELLOW);
			break;
		case 4:
			g2d.setColor(Color.BLUE);
			break;
		case 5:
			g2d.setColor(Color.CYAN);
			break;	
		case 6:
			g2d.setColor(Color.ORANGE);
			break;
		case 7:
			g2d.setColor(Color.MAGENTA);
			break;
		case 0:
			g2d.setColor(Color.BLACK);
			break;
		}
	}
	
	public void fcap(double m) {
		angle = toInt(m);
		setTeta();
	}
	
	
}
