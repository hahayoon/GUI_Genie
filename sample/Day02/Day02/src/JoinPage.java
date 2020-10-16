import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class JoinPage extends JFrame {
	public int checknum = 0;

	JoinPage() {

		setTitle("회원가입  ");
		JPanel p = new JPanel();
		setContentPane(p);
		p.setLayout(null);
		p.setBackground(Color.ORANGE);

		JLabel NewLabel = new JLabel("genie 회원가입");
		NewLabel.setBounds(100, 30, 200, 35);
		NewLabel.setFont(new Font("Times", Font.BOLD, 27));
		NewLabel.setForeground(Color.gray);
		p.add(NewLabel);

		JLabel name = new JLabel("이름");
		name.setBounds(70, 75, 200, 100);
		name.setFont(new Font("Times", Font.BOLD, 23));

		name.setForeground(Color.black);
		p.add(name);

		JTextField nameinput = new JTextField(20);
		nameinput.setBounds(200, 95, 250, 50);
		p.add(nameinput);

		JLabel la1 = new JLabel("아이디 ");
		la1.setBounds(70, 130, 200, 100);
		la1.setFont(new Font("Times", Font.BOLD, 23));

		la1.setForeground(Color.black);
		p.add(la1);

		JTextField id = new JTextField(20);
		id.setBounds(200, 153, 250, 50);
		p.add(id);

		JButton overlap = new JButton("중복확인");
		overlap.setBounds(455, 155, 120, 30);
		overlap.setFont(new Font("Times", Font.BOLD, 13));
		p.add(overlap);
		overlap.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String checkid = "";
				int check1 = 0;
				
				checkid = id.getText();
				check1 = Login.instance.checkId(checkid);

				if (check1 == -1) {
					new Available();
					checknum = 1; // 로그인 가능
				}

				else {
					new Unusable();
					checknum = 0; // 로그인 불가능
				}

			}
		});

		JLabel la2 = new JLabel("비밀번호  ");
		la2.setFont(new Font("Times", Font.BOLD, 23));
		la2.setBounds(70, 230, 150, 25);
		p.add(la2);

		JTextField pw = new JTextField(20);
		pw.setBounds(200, 210, 250, 50);
		p.add(pw);

		JLabel email = new JLabel("이메일  ");
		email.setFont(new Font("Times", Font.BOLD, 23));
		email.setBounds(70, 280, 150, 25);
		p.add(email);

		JTextField em = new JTextField(20);
		em.setBounds(200, 270, 250, 50);
		p.add(em);

		JButton btn = new JButton("회원가입");
		btn.setFont(new Font("Times", Font.BOLD, 28));
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLUE);
		btn.setBounds(200, 350, 200, 60);
		p.add(btn);

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (checknum == 1) {

					String id1 = id.getText();
					String pw1 = pw.getText();

					System.out.println(id1);
					System.out.println(pw1);

					int n = 0;
					
					n = Login.instance.Join(id1, pw1);
					if (n == -1) {
						new Success();
					}

				} else {
					new Failed();
				}

			}
		});

		setSize(600, 500);
		setLocation(800, 300);
		setResizable(false);
		setVisible(true);

	}

}