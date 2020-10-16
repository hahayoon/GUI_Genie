import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewWindow extends JFrame {
	NewWindow() {
		setTitle("음악, 그리고 설레임 - 지니");
		// 주의, 여기서 setDefaultCloseOperation() 정의를 하지 말아야 한다
		// 정의하게 되면 새 창을 닫으면 모든 창과 프로그램이 동시에 꺼진다

		JPanel NewWindowContainer = new JPanel();
		setContentPane(NewWindowContainer);
		NewWindowContainer.setBackground(Color.white);
		NewWindowContainer.setLayout(null);

		JLabel NewLabel = new JLabel("genie 로그인");
		NewLabel.setBounds(100, 30, 200, 35);
		NewLabel.setFont(new Font("Times", Font.BOLD, 27));
		NewLabel.setForeground(Color.gray);
		NewWindowContainer.add(NewLabel);

		JLabel la1 = new JLabel("아이디 ");
		la1.setBounds(70, 80, 200, 100);
		la1.setFont(new Font("Times", Font.BOLD, 23));

		la1.setForeground(Color.black);
		NewWindowContainer.add(la1);

		JTextField id = new JTextField(20);
		id.setBounds(200, 100, 250, 50);
		NewWindowContainer.add(id);

		JLabel la2 = new JLabel("비밀번호  ");
		la2.setFont(new Font("Times", Font.BOLD, 23));
		la2.setBounds(70, 170, 150, 25);
		NewWindowContainer.add(la2);

		JTextField pw = new JTextField(20);
		pw.setBounds(200, 153, 250, 50);
		NewWindowContainer.add(pw);

		JButton btn = new JButton("로그인");
		btn.setFont(new Font("Times", Font.BOLD, 28));
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLUE);
		btn.setBounds(200, 210, 150, 50);
		NewWindowContainer.add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// TODO Auto-generated method stub
				String id1 = "";
				String pw1 = "";

				id1 = id.getText();
				pw1 = pw.getText();

				if ("".equals(id1) || "".equals(pw1)) {
					System.out.println("아이디와 비밓번호를 입력하세요.");
					new EmptyId();
				}

				else {
				
					int ck = 100;
					ck = Login.instance.checklogin(id1, pw1);

					if (ck == 100) {
						new Failed();
					} else {
						new LoginOk();
					}
				}

			}
		});

		JCheckBox chk = new JCheckBox("로그인상태 유지", false);
		chk.setFont(new Font("Times", Font.PLAIN, 10));
		chk.setBounds(70, 200, 120, 40);
		chk.setBackground(Color.WHITE);
		NewWindowContainer.add(chk);

		ImageIcon img = new ImageIcon("lo.jpg");
		JLabel lo = new JLabel();
		lo.setIcon(img);
		lo.setBounds(10, 200, 490, 320);
		lo.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				new MyMouseimg();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		NewWindowContainer.add(lo);

		JButton join = new JButton("회원가입");
		join.setFont(new Font("Times", Font.BOLD, 15));
		join.setBounds(350, 500, 150, 50);
		join.setBorderPainted(false);
		join.setContentAreaFilled(false);
		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JoinPage();

			}
		});
		NewWindowContainer.add(join);

		setSize(500, 600);
		setLocation(700, 200);
		setResizable(false);
		setVisible(true);

	}
}