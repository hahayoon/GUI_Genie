import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Vector;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class List extends JPanel implements ActionListener{
	Cursor cs = new Cursor(Cursor.HAND_CURSOR);
	JButton w1[];

//	Genie gn = new Genie();
	List() {
		setLayout(null);
		setBackground(Color.WHITE);
		
		Map<String, String> k = MusicList.musicList.Kpop;
		
		MusicList musicList = MusicList.musicList;	
		musicList.Kpop();
		
		System.out.println(k.get("Embracer"));
		
		JLabel q1[];
		JButton e1[];
		
		JLabel sc = new JLabel("");
		sc.setIcon(new ImageIcon("asd.jpg"));
		sc.setBounds(100, 30, 138, 64);
		add(sc);

		JLabel s1 = new JLabel("");
		s1.setIcon(new ImageIcon("s1.jpg"));
		s1.setBounds(90, 30, 248, 200);
		add(s1);

		JLabel s2 = new JLabel("");
		s2.setIcon(new ImageIcon("s2.jpg"));
		s2.setBounds(635, 30, 300, 194);
		add(s2);

		JLabel s3 = new JLabel("");
		s3.setIcon(new ImageIcon("s3.jpg"));
		s3.setBounds(700, 30, 400, 190);
		add(s3);

		JLabel just2 = new JLabel("");
		just2.setIcon(new ImageIcon("fat.jpg"));

		just2.setBounds(100, 100, 1000, 5);
		add(just2);
		

		
		Vector<String> keyList = new Vector<String>();
		Vector<String> valueList = new Vector<String>();
		
//		 Map<String, String> hashMap;
//		for(Entry<String, String> elem : k.entrySet()){
//             System.out.println("≈∞ : " + elem.getKey() + "∞™ : " + elem.getValue());
//         }
		
		for(String key : k.keySet()){
       //     System.out.println("≈∞ : " + key);
		//	System.out.println(k.get(key));
            keyList.add(key);
        }
		
//		for(String value : k.keySet()){
//            System.out.println("¿Ã∏ß: " + value);
//            valueList.add(value);
//        }
		
		q1 = new JLabel[10];
		for (int i = 0; i < 10; i++) {
			q1[i] = new JLabel();
			q1[i].setFont(new Font("Courier", Font.BOLD, 15));
			q1[i].setBounds(100, 150 + i * 50, 1000, 50);
			
			String tempKey = keyList.get(i);
			
			q1[i].setText( "        "+(i+1)+"             "+tempKey +"   \t         " + k.get(tempKey));
			add(q1[i]);
		}
	
		w1 = new JButton[10];
		for(int i = 0; i<10; i++) {
			w1[i] = new JButton();
			w1[i].setBounds(630, 150+(i*50), 50, 50);
			w1[i].setIcon(new ImageIcon("playcircularbutton.png"));
			w1[i].setBorderPainted(false);
			w1[i].setContentAreaFilled(false);
			w1[i].setCursor(cs);
			w1[i].addActionListener(this);
			add(w1[i]);
		}
		/*w1[0].addActionListener(this);
		w1[1].addActionListener(this);
		w1[2].addActionListener(this);
		w1[3].addActionListener(this);
		w1[4].addActionListener(this);
		w1[5].addActionListener(this);
		w1[6].addActionListener(this);
		w1[7].addActionListener(this);
		w1[8].addActionListener(this);
		w1[9].addActionListener(this);*/
		
		
		
		
		e1 = new JButton[10];
		for(int i = 0; i<10; i++) {
			e1[i] = new JButton();
			e1[i].setBounds(690, 150+(i*50), 50, 50);
			e1[i].setIcon(new ImageIcon("pluscircularbutton.png"));
			e1[i].setBorderPainted(false);
			e1[i].setContentAreaFilled(false);
			e1[i].setCursor(cs);
			add(e1[i]);
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == w1[0]) {
			MP3Player musPlayer = new MP3Player(2);
		}
		if(e.getSource() == w1[1]) {
			MP3Player musPlayer = new MP3Player(3);
			
		}
		if(e.getSource() == w1[2]) {
			MP3Player musPlayer = new MP3Player(5);
			//musPlayer.guiPlayer.manager.index = 2;
		}
		if(e.getSource() == w1[3]) {
			MP3Player musPlayer = new MP3Player(4);
			//musPlayer.guiPlayer.manager.index = 3;
		}
		if(e.getSource() == w1[4]) {
			MP3Player musPlayer = new MP3Player(1);
			//musPlayer.guiPlayer.manager.index = 4;
		}
		if(e.getSource() == w1[5]) {
			MP3Player musPlayer = new MP3Player(6);
			//musPlayer.guiPlayer.manager.index = 5;
		}
		if(e.getSource() == w1[6]) {	
			MP3Player musPlayer = new MP3Player(7);
			//musPlayer.guiPlayer.manager.index = 6;
		}
		if(e.getSource() == w1[7]) {
			MP3Player musPlayer = new MP3Player(0);
			//musPlayer.guiPlayer.manager.index = 7;
		}
		if(e.getSource() == w1[8]) {
			MP3Player musPlayer = new MP3Player(8);
			//musPlayer.guiPlayer.manager.index = 8;
		}
		if(e.getSource() == w1[9]) {
			MP3Player musPlayer = new MP3Player(9);
			
		}
		
	}
				
}
