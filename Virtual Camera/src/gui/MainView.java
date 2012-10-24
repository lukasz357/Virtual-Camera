package gui;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;

import virtualcamera.Obiekt;
import virtualcamera.Rysownik;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;

public final class MainView extends JFrame implements KeyListener {

	private Rysownik rysownik;
	private Obiekt obiekt;

	public MainView() {
		setSize(new Dimension(761, 503));
		setPreferredSize(new Dimension(760, 480));
		setTitle("Łukasz Krok - projekt Virtual Camera");
		setBackground(Color.LIGHT_GRAY);
		double dane[][] = { { 250.0, 1250.0, 200.0, 500.0, 1250.0, 200.0 },
				{ 250.0, 1250.0, 200.0, 250.0, 1250.0, 700.0 },
				{ 500.0, 1250.0, 200.0, 500.0, 1250.0, 700.0 },
				{ 500.0, 1250.0, 200.0, 500.0, 1500.0, 200.0 },
				{ 250.0, 1250.0, 200.0, 250.0, 1500.0, 200.0 },
				{ 250.0, 1500.0, 200.0, 250.0, 1500.0, 700.0 },
				{ 250.0, 1250.0, 700.0, 250.0, 1500.0, 700.0 },
				{ 250.0, 1250.0, 700.0, 500.0, 1250.0, 700.0 },
				{ 250.0, 1500.0, 700.0, 500.0, 1500.0, 700.0 },
				{ 500.0, 1500.0, 700.0, 500.0, 1250.0, 700.0 },
				{ 500.0, 1500.0, 700.0, 500.0, 1500.0, 200.0 },
				{ 500.0, 1500.0, 200.0, 250.0, 1500.0, 200.0 },
				{ 900.0, 1250.0, 200.0, 1150.0, 1250.0, 200.0 },
				{ 900.0, 1250.0, 200.0, 900.0, 1250.0, 700.0 },
				{ 1150.0, 1250.0, 200.0, 1150.0, 1250.0, 700.0 },
				{ 1150.0, 1250.0, 200.0, 1150.0, 1500.0, 200.0 },
				{ 900.0, 1250.0, 200.0, 900.0, 1500.0, 200.0 },
				{ 900.0, 1500.0, 200.0, 900.0, 1500.0, 700.0 },
				{ 900.0, 1250.0, 700.0, 900.0, 1500.0, 700.0 },
				{ 900.0, 1250.0, 700.0, 1150.0, 1250.0, 700.0 },
				{ 900.0, 1500.0, 700.0, 1150.0, 1500.0, 700.0 },
				{ 1150.0, 1500.0, 700.0, 1150.0, 1250.0, 700.0 },
				{ 1150.0, 1500.0, 700.0, 1150.0, 1500.0, 200.0 },
				{ 1150.0, 1500.0, 200.0, 900.0, 1500.0, 200.0 },

				{ 900.0, 1900.0, 200.0, 1150.0, 1900.0, 200.0 },
				{ 900.0, 1900.0, 200.0, 900.0, 1900.0, 700.0 },
				{ 1150.0, 1900.0, 200.0, 1150.0, 1900.0, 700.0 },
				{ 1150.0, 1900.0, 200.0, 1150.0, 2150.0, 200.0 },
				{ 900.0, 1900.0, 200.0, 900.0, 2150.0, 200.0 },
				{ 900.0, 2150.0, 200.0, 900.0, 2150.0, 700.0 },
				{ 900.0, 1900.0, 700.0, 900.0, 2150.0, 700.0 },
				{ 900.0, 1900.0, 700.0, 1150.0, 1900.0, 700.0 },
				{ 900.0, 2150.0, 700.0, 1150.0, 2150.0, 700.0 },
				{ 1150.0, 2150.0, 700.0, 1150.0, 1900.0, 700.0 },
				{ 1150.0, 2150.0, 700.0, 1150.0, 2150.0, 200.0 },
				{ 1150.0, 2150.0, 200.0, 900.0, 2150.0, 200.0 },

				{ 250.0, 1900.0, 200.0, 500.0, 1900.0, 200.0 },
				{ 250.0, 1900.0, 200.0, 250.0, 1900.0, 700.0 },
				{ 500.0, 1900.0, 200.0, 500.0, 1900.0, 700.0 },
				{ 500.0, 1900.0, 200.0, 500.0, 2150.0, 200.0 },
				{ 250.0, 1900.0, 200.0, 250.0, 2150.0, 200.0 },
				{ 250.0, 2150.0, 200.0, 250.0, 2150.0, 700.0 },
				{ 250.0, 1900.0, 700.0, 250.0, 2150.0, 700.0 },
				{ 250.0, 1900.0, 700.0, 500.0, 1900.0, 700.0 },
				{ 250.0, 2150.0, 700.0, 500.0, 2150.0, 700.0 },
				{ 500.0, 2150.0, 700.0, 500.0, 1900.0, 700.0 },
				{ 500.0, 2150.0, 700.0, 500.0, 2150.0, 200.0 },
				{ 500.0, 2150.0, 200.0, 250.0, 2150.0, 200.0 } };

		obiekt = new Obiekt();
		obiekt.ladujDane(dane);
//		obiekt.wypiszDane();

		rysownik = new Rysownik();
		rysownik.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		rysownik.setBackground(Color.WHITE);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager
				.getBorder("TitledBorder.border"), "Controls",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(
				Alignment.TRAILING).addGroup(
				groupLayout
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(rysownik, GroupLayout.DEFAULT_SIZE, 600,
								Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 118,
								GroupLayout.PREFERRED_SIZE).addContainerGap()));
		groupLayout
				.setVerticalGroup(groupLayout
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								Alignment.TRAILING,
								groupLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												groupLayout
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(
																rysownik,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																419,
																Short.MAX_VALUE)
														.addComponent(
																panel,
																Alignment.LEADING,
																GroupLayout.DEFAULT_SIZE,
																419,
																Short.MAX_VALUE))
										.addContainerGap()));

		JLabel lblMoving = new JLabel("Moving:");
		lblMoving.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblLeftLeft = new JLabel("Left - left arrow");

		JLabel lblRightRight = new JLabel("Right - right arrow");

		JLabel lblForwardUp = new JLabel("Forward - up arrow");

		JLabel lblBackDown = new JLabel("Back - down arrow");

		JLabel lblRotating = new JLabel("Rotating:");
		lblRotating.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblLeftZ = new JLabel("Left - z");

		JLabel lblRightX = new JLabel("Right - x");

		JLabel lblUpC = new JLabel("Up - c");

		JLabel lblDownV = new JLabel("Down - v");

		JLabel lblUp = new JLabel("Up - ,");

		JLabel lblDown = new JLabel("Down - .");

		JLabel lblLeaning = new JLabel("Leaning:");
		lblLeaning.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblLeft = new JLabel("Left - [");

		JLabel lblRight = new JLabel("Right - ]");

		JLabel lblZooming = new JLabel("Zooming:");
		lblZooming.setFont(new Font("Tahoma", Font.BOLD, 11));

		JLabel lblInPageup = new JLabel("In - PageUp");

		JLabel lblOutPagedown = new JLabel("Out - PageDn");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_panel.createSequentialGroup()
								.addGroup(
										gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addComponent(lblMoving)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblLeftLeft))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblRightRight))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblForwardUp))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblBackDown))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblUp))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addGroup(
																		gl_panel.createParallelGroup(
																				Alignment.LEADING)
																				.addComponent(
																						lblUpC)
																				.addComponent(
																						lblDownV)))
												.addComponent(lblRotating)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblRightX))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblLeftZ))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblDown))
												.addComponent(lblLeaning)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblLeft))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblRight))
												.addComponent(lblZooming)
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblInPageup))
												.addGroup(
														gl_panel.createSequentialGroup()
																.addContainerGap()
																.addComponent(
																		lblOutPagedown)))
								.addContainerGap(3, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblMoving)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblLeftLeft)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblRightRight)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblForwardUp)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblBackDown)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblUp)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblDown)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblRotating)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblLeftZ)
						.addGap(4)
						.addComponent(lblRightX)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblUpC)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblDownV)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(lblLeaning)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblLeft)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblRight)
						.addGap(18)
						.addComponent(lblZooming)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblInPageup)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblOutPagedown)
						.addContainerGap(GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		getContentPane().setLayout(groupLayout);

		obiekt.setRysownik(rysownik);
		obiekt.rysuj();
		addKeyListener(this);

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		 int code = arg0.getKeyCode();
		switch (code) {
    
			//=========== MOVING ==============
			
			// FORWARD
	        case KeyEvent.VK_UP:
	        	obiekt.przesunWPrzod();
	            break;
	        
	        // BACK
	        case KeyEvent.VK_DOWN:
	        	obiekt.przesunWTyl();
	            break;
	        
	        // LEFT
	        case KeyEvent.VK_LEFT:
	            obiekt.przesunWLewo();
	            break;
	        
	        // RIGHT
	        case KeyEvent.VK_RIGHT:
	            obiekt.przesunWPrawo();
	            break;
	       
	        // UP
	        case KeyEvent.VK_COMMA:
	            obiekt.przesunWGore();
	            break;
	        
	        // DOWN
	        case KeyEvent.VK_PERIOD:
	            obiekt.przesunWDol();
	            break;
	            
	        //=========== ROTATION ==============
	
	        // LEFT
	        case KeyEvent.VK_Z:
	            obiekt.obrocWLewo();
	            break;
	
	        // RIGHT
	        case KeyEvent.VK_X:
	            obiekt.obrocWPrawo();
	            break;
	        
	        // UP
	        case KeyEvent.VK_C:
	            obiekt.obrocWGore();
	            break;
	        
	        // DOWN
	        case KeyEvent.VK_V:
	            obiekt.obrocWDol();
	            break;
	            
	        //=========== LEANING ==============
	
	        // LEFT
	        case KeyEvent.VK_OPEN_BRACKET:
	            obiekt.przechylWLewo();
	            break;
	
	        // RIGHT
	        case KeyEvent.VK_CLOSE_BRACKET:
	            obiekt.przechylWPrawo();
	            break;
	 
		    //=========== ZOOMING ==============
		
		    // IN
		    case KeyEvent.VK_PAGE_UP:
		        obiekt.przybliz();
		        break;
		
		    // RIGHT
		    case KeyEvent.VK_PAGE_DOWN:
		        obiekt.oddal();
		        break;
		        
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		;
	}
}
