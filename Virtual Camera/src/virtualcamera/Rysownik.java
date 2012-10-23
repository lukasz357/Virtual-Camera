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

//	@Override
//	public void keyPressed(KeyEvent arg0) {
//        int code = arg0.getKeyCode();
//
//        switch (code) {
//            //przod
//            case KeyEvent.VK_W:
//                observer.przesun(Ustawienia.krok_po_osi_obserwatora, observer.getZo());
//                repaint();
//                break;
//            //tył
//            case KeyEvent.VK_S:
//                observer.przesun(-Ustawienia.krok_po_osi_obserwatora, observer.getZo());
//                repaint();
//                break;
//            //lewo
//            case KeyEvent.VK_A:
//                observer.przesun(-Ustawienia.krok_po_osi_obserwatora, observer.getXo());
//                repaint();
//                break;
//            //prawo
//            case KeyEvent.VK_D:
//                observer.przesun(Ustawienia.krok_po_osi_obserwatora, observer.getXo());
//                repaint();
//                break;
//            //góra
//            case KeyEvent.VK_SHIFT:
//                observer.przesun(Ustawienia.krok_po_osi_obserwatora, observer.getYo());
//                repaint();
//                break;
//            //dół    
//            case KeyEvent.VK_CONTROL:
//                observer.przesun(-Ustawienia.krok_po_osi_obserwatora, observer.getYo());
//                repaint();
//                break;
//            //obrot w prawo
//            case KeyEvent.VK_P:
//                observer.obrocWokol(observer.getYo(), Ustawienia.kat_obrotu);
//                repaint();
//                break;
//            //obrót w lewo
//            case KeyEvent.VK_O:
//                observer.obrocWokol(observer.getYo(), -Ustawienia.kat_obrotu);
//                repaint();
//                break;
//            //spogladanie w dół
//            case KeyEvent.VK_J:
//                observer.obrocWokol(observer.getXo(), Ustawienia.kat_obrotu);
//                repaint();
//                break;
//            //patrzenie w góre
//            case KeyEvent.VK_U:
//                observer.obrocWokol(observer.getXo(), -Ustawienia.kat_obrotu);
//                repaint();
//                break;
//            //obroty o kat w prawo
//            case KeyEvent.VK_I:
//                observer.obrocWokol(observer.getZo(), Ustawienia.kat_obrotu);
//                repaint();
//                break;
//            // obrót o kat w lewo
//            case KeyEvent.VK_Y:
//                observer.obrocWokol(observer.getZo(), -Ustawienia.kat_obrotu);
//                repaint();
//                break;
//            // zoom przyblizanie
//            case KeyEvent.VK_Q:
//                zoom(Ustawienia.zoom_krok);
//                break;
//            // zoom oddalanie
//            case KeyEvent.VK_E:
//                zoom(-Ustawienia.zoom_krok);
//                break;
//            //reset
//            case KeyEvent.VK_R:
//                reset();
//                break;
//        }
//		
//	}

//	@Override
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		
//	}
}
