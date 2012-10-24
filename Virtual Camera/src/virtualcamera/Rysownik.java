package virtualcamera;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.ArrayList;
import javax.swing.JPanel;

public class Rysownik extends JPanel /*implements KeyListener*/{
	private ArrayList<Wektor2D> wektory;

	public Rysownik() {
		setPreferredSize(new Dimension(639, 402));
		this.setBackground(Color.GRAY);
	}

	public void setWektory(ArrayList<Wektor2D> wektory) {
		this.wektory = wektory;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		Graphics2D g2d = (Graphics2D) g;

		if(wektory != null) {
			for (Wektor2D wektor : wektory) {
				g2d.drawLine((int) wektor.getA().getX(),
						(int) wektor.getA().getY(), (int) wektor.getB().getX(),
						(int) wektor.getB().getY());
			}
		}	
	}

}
