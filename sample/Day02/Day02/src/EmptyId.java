import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EmptyId extends JFrame {
	EmptyId() {
		setTitle("�α��� ����  ");
		JPanel p = new JPanel();
		setContentPane(p);
		p.setLayout(null);
		p.setBackground(Color.pink);

		JLabel LA = new JLabel("���̵�/��й�ȣ�� �Է��ϼ��� . ");
		LA.setFont(new Font("Times", Font.BOLD, 15));
		LA.setLocation(40, 70);
		LA.setSize(250, 30);
		p.add(LA);

		setSize(300, 200);

		setLocation(800, 300);
		setResizable(false);
		setVisible(true);

	}

}