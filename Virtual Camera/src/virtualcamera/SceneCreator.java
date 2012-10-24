package virtualcamera;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class SceneCreator extends JPanel {
	private static final long serialVersionUID = -3555631953028083841L;
	private ArrayList<My2DVector> vectors;

	public SceneCreator() {
		setPreferredSize(new Dimension(639, 402));
		this.setBackground(Color.GRAY);
	}

	public void setVectors(ArrayList<My2DVector> vectors) {
		this.vectors = vectors;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		Graphics2D g2d = (Graphics2D) g;

		if(vectors != null) {
			for (My2DVector vec : vectors) {
				g2d.drawLine((int) vec.getA().getX(),
						(int) vec.getA().getY(), (int) vec.getB().getX(),
						(int) vec.getB().getY());
			}
		}	
	}

}
