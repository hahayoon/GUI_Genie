import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ex01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("지니 음원그리고 설레임");
		frame.setLayout(new BorderLayout());
		frame.setSize(1200, 1000);
		frame.setLocation(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		Genie mp = new Genie();
		frame.add(mp, "North");

		Cenp cp = new Cenp();
		frame.add(cp, "Center");

		Genre gen = new Genre();
		//frame.add(gen, "South");
		MusicImg m= new MusicImg();
		frame.add(m,"South");

		frame.revalidate();
	}

}
