import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Recommend extends JPanel {
	
	Recommend() {
		
		setLayout(null);
		setBackground(Color.WHITE);
		JLabel la = new JLabel("��õ ����");
		la.setFont(new Font("Times", Font.BOLD, 21));
		la.setForeground(Color.darkGray);
		la.setLocation(100, 0);
		la.setSize(100, 100);
		
	    add(la);
		ImageIcon img= new ImageIcon("reco2.jpg");
		
		JLabel la2 = new JLabel();
		la2.setIcon(img);
		la2.setSize(1000,1000);
		la2.setLocation(100,10);
		add(la2);
		
			
		
		
	}

}
