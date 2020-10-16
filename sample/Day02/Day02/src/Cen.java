import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cen extends JPanel {
   Cen() {

      setLayout(new FlowLayout());
      setBackground(Color.white);
      ImageIcon logo = new ImageIcon("logo.jpg");
      // la.setSize(300,50);
      JLabel logo1 = new JLabel(logo);
      add(logo1);

      JTextField tf = new JTextField(25);
      tf.setSize(200, 10);
      tf.setLocation(10, 200);
      tf.setFont(new Font("Times", Font.BOLD, 21));

      add(tf, BorderLayout.CENTER);
      ImageIcon img2 = new ImageIcon("q.jpg");
      JButton btn1 = new JButton(img2);
      btn1.setBorderPainted(false);
      btn1.setContentAreaFilled(false);
      btn1.setSize(300, 50);
      add(btn1);

      // la.setSize(300,50);
      // JLabel la3 = new JLabel(img2);
      // --add(la3);
   }
}