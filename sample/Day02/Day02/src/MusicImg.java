import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MusicImg extends JPanel implements ActionListener {
	
	JButton [] btn = new JButton[10];
	JLabel la;


	MusicImg() {
		
		setLayout(null);
		setBackground(Color.WHITE);
		
		
		la = new JLabel("√÷Ω≈¿Ωæ«");
		la.setFont(new Font("Times", Font.BOLD, 21));
		la.setForeground(Color.darkGray);
		la.setLocation(100, 20);
		la.setSize(100, 100);
		add(la);
		
		
		for(int i = 0 ; i <  10 ; i ++ ) {
		btn[i] = new JButton();
		//btn[i].addActionListener(this);
		
		}
		


		btn[0] = new JButton("");
		btn[0] .setIcon(new ImageIcon("m1.jpg"));
		btn[0] .setBounds(100, 154, 200, 200);
		btn[0].addActionListener(this);
		add(btn[0]);
		

		btn[1]  = new JButton("");
		btn[1]  .setIcon(new ImageIcon("m2.jpg"));
		btn[1]  .setBounds(320, 154, 200, 200);	
		btn[1].addActionListener(this);
		add(btn[1]  );

		btn[2]   = new JButton("");
		btn[2].setIcon(new ImageIcon("m3.jpg"));
		btn[2].setBounds(540, 154, 200, 200);
		btn[2].addActionListener(this);
		add(btn[2]);
		
		 btn[3] = new JButton("");
		 btn[3].setIcon(new ImageIcon("m4.jpg"));
		 btn[3].setBounds(760, 154, 200, 200);
		 btn[3].addActionListener(this);
		 add(btn[3]);

		btn[4] = new JButton("");
		btn[4] .setIcon(new ImageIcon("m5.jpg"));
		btn[4] .setBounds(980, 154, 200, 200);
		btn[4].addActionListener(this);
		add(btn[4] );

		btn[5]  = new JButton("");
		btn[5] .setIcon(new ImageIcon("m6.jpg"));
		btn[5] .setBounds(100, 393, 200, 200);
		btn[5].addActionListener(this);
		add(btn[5] );

		btn[6]   = new JButton("");
		btn[6].setIcon(new ImageIcon("m7.jpg"));
		btn[6].setBounds(320, 393, 200, 200);
		btn[6].addActionListener(this);
		add(btn[6]);

		btn[7]= new JButton("");
		btn[7].setIcon(new ImageIcon("m8.jpg"));
		btn[7].setBounds(540, 393, 200, 200);
		btn[7].addActionListener(this);
		add(btn[7]);

		btn[8] = new JButton("");
		btn[8].setIcon(new ImageIcon("m9.jpg"));
		btn[8].setBounds(760, 393, 200, 200);
		btn[8].addActionListener(this);
		add(btn[8]);

		 btn[9] = new JButton("");
		 btn[9].setIcon(new ImageIcon("m10.jpg"));
		 btn[9].setBounds(980, 393, 200, 200);
		 btn[9].addActionListener(this);
		add(btn[9]); 

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn[0]) {
			MP3Player musPlayer = new MP3Player(0);
		}
		if(e.getSource() == btn[1]) {
			MP3Player musPlayer = new MP3Player(1);
			
		}
		if(e.getSource() == btn[2]) {
			MP3Player musPlayer = new MP3Player(2);
			//musPlayer.guiPlayer.manager.index = 2;
		}
		if(e.getSource() == btn[3]) {
			MP3Player musPlayer = new MP3Player(3);
			//musPlayer.guiPlayer.manager.index = 3;
		}
		if(e.getSource() == btn[4]) {
			MP3Player musPlayer = new MP3Player(4);
			//musPlayer.guiPlayer.manager.index = 4;
		}
		if(e.getSource() == btn[5]) {
			MP3Player musPlayer = new MP3Player(5);
			//musPlayer.guiPlayer.manager.index = 5;
		}
		if(e.getSource() == btn[6]) {	
			MP3Player musPlayer = new MP3Player(6);
			//musPlayer.guiPlayer.manager.index = 6;
		}
		if(e.getSource() == btn[7]) {
			MP3Player musPlayer = new MP3Player(7);
			//musPlayer.guiPlayer.manager.index = 7;
		}
		if(e.getSource() == btn[8]) {
			MP3Player musPlayer = new MP3Player(8);
			//musPlayer.guiPlayer.manager.index = 8;
		}
		if(e.getSource() == btn[9]) {
			MP3Player musPlayer = new MP3Player(9);
			
		}
	}
	
	
/*	public void removeImg () {
		for(int i = 0 ; i < 8 ; i ++) {
			remove(btn[i]);
			remove(la);
			repaint();
		}
	}
	*/
}
