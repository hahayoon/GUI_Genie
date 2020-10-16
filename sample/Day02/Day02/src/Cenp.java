import java.awt.Color;	
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;

public class Cenp extends JPanel {
	Cenp() {
		setLayout(null);
		setBackground(Color.white);
		JButton[] la = new JButton[5];
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		
		Genre gen = new Genre();
		gen.setSize(2000, 2000);
		gen.setLocation(0, 122);
		//p1.add(gen);
		//add(gen);
		
		
		List l= new List();
		l.setSize(2000, 2000);
		l.setLocation(0, 122);
		
		
		Recommend recommend = new Recommend();
		recommend.setSize(2000, 2000);
		recommend.setLocation(0, 122);
		
		Tv tv= new Tv();
		tv.setSize(2000, 2000);
		tv.setLocation(0, 122);
		
		
		MusicImg m = new MusicImg();
		m.setSize(2000,2000);
		m.setLocation(0,122);
		

		for (int i = 0; i < 5; i++) {
			la[i] = new JButton();

			la[i].setFont(new Font("Times", Font.BOLD, 25));
			la[i].setSize(150, 50);
			la[i].setBorderPainted(false);
			la[i].setContentAreaFilled(false);
			la[i].setLocation((170 + 150 * i), 50);
			la[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					for (int i = 0; i < 5; i++) {
						if (e.getSource() == la[i]) {

							for (int j = 0; j < 5; j++) {
								la[j].setForeground(Color.black);
							}

							la[i].setForeground(Color.blue);
							
							if(i == 0) {
								remove(gen);
								remove(m);
								l.repaint();
								add(l);
								l.setBackground(Color.WHITE);
			
							}
							
							else if(i==1) {
	
								remove(gen);
								remove(l);
								m.repaint();
								add(m);
								m.setBackground(Color.white);
								
							}
							else if(i==2) {

								remove(m);
								remove(l);
								gen.setBackground(Color.white);
							//	m.removeImg();
								gen.repaint();
										add(gen);
							
							}
							

							else if(i == 3) {
								
								remove(m);
								remove(l);
								remove(gen);
								remove(recommend);
								tv.setBackground(Color.white);
							//	m.removeImg();
								tv.repaint();
										add(tv);
								
								
								
								
								
							} 
							
							
							else if (i==4) {
								remove(m);
								remove(l);
								remove(gen);
								remove(tv);
								recommend.setBackground(Color.white);
							//	m.removeImg();
								recommend.repaint();
										add(recommend);
							
								
								
							}
							
							// MyMouse(i);

							/*
							 * String[] m1 = { "top 200", "장르별차트", "시대별차트", "뮤직비디오차트 " };
							 * 
							 * JList<String> li = new JList<String>(m1); li.setSize(50, 100);
							 * li.setLocation(50, 100); add(li);
							 */

						}
					}
				}
			});

			add(la[i]);
		}

		la[0].setText("지니차트 ");
		la[1].setText("최신음악 ");
		la[2].setText("장르음악 ");
		la[3].setText("지니TV");
		la[4].setText("추천 ");

		JButton log = new JButton("로그인/회원가입 ▼ ");
		log.setBorderPainted(false);
		log.setContentAreaFilled(false);

		log.setFont(new Font("Times", Font.PLAIN, 15));
		log.setSize(200, 50);
		log.setLocation(1000, 50);
		add(log);
		log.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new NewWindow();

			}
		});

	

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.GRAY);
		g.drawLine(0, 120, 2000, 120);

	}

	public void MyMouse(int n) {

		String[] m1 = { "top 200", "장르별차트", "시대별차트", "뮤직비디오차트 " };

		JList<String> li = new JList<String>(m1);
		li.setSize(50, 100);
		li.setLocation(50, 100);
		add(li);

	}

}