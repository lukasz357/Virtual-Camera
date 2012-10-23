package gui;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;

import virtualcamera.Obiekt;
import virtualcamera.Rysownik;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public final class MainView extends JFrame{
	
	public Rysownik rysownik;
	
	
	public MainView() {
		setPreferredSize(new Dimension(760, 430));
		setSize(new Dimension(760, 430));
		setTitle("Łukasz Krok - projekt Virtual Camera");
		setBackground(Color.LIGHT_GRAY);
        double dane[][] = {
{250.0,1250.0,200.0,500.0,1250.0,200.0},
{250.0,1250.0,200.0,250.0,1250.0,700.0},
{500.0,1250.0,200.0,500.0,1250.0,700.0},
{500.0,1250.0,200.0,500.0,1500.0,200.0},
{250.0,1250.0,200.0,250.0,1500.0,200.0},
{250.0,1500.0,200.0,250.0,1500.0,700.0},
{250.0,1250.0,700.0,250.0,1500.0,700.0},
{250.0,1250.0,700.0,500.0,1250.0,700.0},
{250.0,1500.0,700.0,500.0,1500.0,700.0},
{500.0,1500.0,700.0,500.0,1250.0,700.0},
{500.0,1500.0,700.0,500.0,1500.0,200.0},
{500.0,1500.0,200.0,250.0,1500.0,200.0},
{900.0,1250.0,200.0,1150.0,1250.0,200.0},
{900.0,1250.0,200.0,900.0,1250.0,700.0},
{1150.0,1250.0,200.0,1150.0,1250.0,700.0},
{1150.0,1250.0,200.0,1150.0,1500.0,200.0},
{900.0,1250.0,200.0,900.0,1500.0,200.0},
{900.0,1500.0,200.0,900.0,1500.0,700.0},
{900.0,1250.0,700.0,900.0,1500.0,700.0},
{900.0,1250.0,700.0,1150.0,1250.0,700.0},
{900.0,1500.0,700.0,1150.0,1500.0,700.0},
{1150.0,1500.0,700.0,1150.0,1250.0,700.0},
{1150.0,1500.0,700.0,1150.0,1500.0,200.0},
{1150.0,1500.0,200.0,900.0,1500.0,200.0},

{900.0,1900.0,200.0,1150.0,1900.0,200.0},
{900.0,1900.0,200.0,900.0,1900.0,700.0},
{1150.0,1900.0,200.0,1150.0,1900.0,700.0},
{1150.0,1900.0,200.0,1150.0,2150.0,200.0},
{900.0,1900.0,200.0,900.0,2150.0,200.0},
{900.0,2150.0,200.0,900.0,2150.0,700.0},
{900.0,1900.0,700.0,900.0,2150.0,700.0},
{900.0,1900.0,700.0,1150.0,1900.0,700.0},
{900.0,2150.0,700.0,1150.0,2150.0,700.0},
{1150.0,2150.0,700.0,1150.0,1900.0,700.0},
{1150.0,2150.0,700.0,1150.0,2150.0,200.0},
{1150.0,2150.0,200.0,900.0,2150.0,200.0},
        
{250.0,1900.0,200.0,500.0,1900.0,200.0},
{250.0,1900.0,200.0,250.0,1900.0,700.0},
{500.0,1900.0,200.0,500.0,1900.0,700.0},
{500.0,1900.0,200.0,500.0,2150.0,200.0},
{250.0,1900.0,200.0,250.0,2150.0,200.0},
{250.0,2150.0,200.0,250.0,2150.0,700.0},
{250.0,1900.0,700.0,250.0,2150.0,700.0},
{250.0,1900.0,700.0,500.0,1900.0,700.0},
{250.0,2150.0,700.0,500.0,2150.0,700.0},
{500.0,2150.0,700.0,500.0,1900.0,700.0},
{500.0,2150.0,700.0,500.0,2150.0,200.0},
{500.0,2150.0,200.0,250.0,2150.0,200.0}               
        };
		
		
		
		
		rysownik = new Rysownik();
		rysownik.setBorder(new TitledBorder(null, "View", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		rysownik.setBackground(Color.WHITE);
	     Obiekt obiekt = new Obiekt(rysownik);
	        obiekt.ladujDane(dane);
	        obiekt.wypiszDane();
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(rysownik, GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(rysownik, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
					.addGap(30))
		);
		getContentPane().setLayout(groupLayout);
		
        obiekt.rysuj();

	}
}
