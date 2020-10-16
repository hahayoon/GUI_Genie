import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Genre extends JPanel {
	JLabel mlt = null;
	JButton[] btnarr = new JButton[8];

	Genre() {
		setLayout(null);
		setBackground(Color.WHITE);
		JLabel la = new JLabel("¿Â∏£¿Ωæ«");
		la.setFont(new Font("Times", Font.BOLD, 21));
		la.setForeground(Color.darkGray);
		la.setLocation(100, 0);
		la.setSize(100, 100);
		add(la);
		mlt = new JLabel("mlist3.jpg");

		String g[] = { "∞°ø‰", "pop", "ost", "∆Æ∑‘", "EDM", "JAZZ", "CLASSIC", "JPOP" };
		// JButton[] btnarr = new JButton[8];
		for (int i = 0; i < 8; i++) {
			btnarr[i] = new JButton();
			btnarr[i].setFont(new Font("Times", Font.BOLD, 21));
			btnarr[i].setBackground(Color.LIGHT_GRAY);
			btnarr[i].setText(g[i]);
			btnarr[i].setSize(110, 50);
			btnarr[i].setLocation((100 + i * 110), 100);
			add(btnarr[i]);
			btnarr[i].addActionListener(new ActionListener() {

				@Override
		
		public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					// TODO Auto-generated method stub
					if (e.getSource() == btnarr[0]) {

						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[0].setBackground(Color.white);

						ImageIcon img = new ImageIcon("mlist.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);

					} else if (e.getSource() == btnarr[1]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[1].setBackground(Color.white);

						ImageIcon img = new ImageIcon("mlist2.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);

					} else if (e.getSource() == btnarr[2]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[2].setBackground(Color.white);
						ImageIcon img = new ImageIcon("mlist3.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);
					} else if (e.getSource() == btnarr[3]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[3].setBackground(Color.white);
						ImageIcon img = new ImageIcon("mlist4.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);
					} else if (e.getSource() == btnarr[4]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[4].setBackground(Color.white);
						ImageIcon img = new ImageIcon("mlist5.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);
					} else if (e.getSource() == btnarr[5]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[5].setBackground(Color.white);
						ImageIcon img = new ImageIcon("mlist6.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);
					} else if (e.getSource() == btnarr[6]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[6].setBackground(Color.white);
						ImageIcon img = new ImageIcon("mlist7.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);
					} else if (e.getSource() == btnarr[7]) {
						for (int i = 0; i < 8; i++) {
							btnarr[i].setBackground(Color.LIGHT_GRAY);
						}
						btnarr[7].setBackground(Color.white);
						ImageIcon img = new ImageIcon("mlist8.jpg");
						mlt.setIcon(img);
						mlt.setSize(1000, 700);
						mlt.setLocation(100, 200);
						add(mlt);
					}
				}

			});
		}

	}
	/*	public void removeImg () {
		for(int i = 0 ; i < 8 ; i ++) {
			remove(btnarr[i]);
			remove(mlt);
			repaint();
		}
	}
*/
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.DARK_GRAY);
		g.drawLine(100, 100, 2000, 100);

	}

}
