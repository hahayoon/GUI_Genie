import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Genie extends JPanel {

	Genie() {

		setLayout(new BorderLayout());
		setBackground(Color.WHITE);

		ImageIcon img = new ImageIcon("up.jpg");
		JLabel la = new JLabel(img);
		la.setLocation(10, 10);
		add(la, BorderLayout.LINE_START);

		ImageIcon img2 = new ImageIcon("upr.jpg");
		JLabel la2 = new JLabel(img2);
		add(la2, BorderLayout.LINE_END);

		Cen c = new Cen();
		add(c, "South");

	}
}