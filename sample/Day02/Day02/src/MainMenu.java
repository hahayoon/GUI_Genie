import javax.swing.JPanel;

public class MainMenu extends JPanel {
	JPanel p;
	Genre gen;
	MusicImg mu;
	MainMenu(){
	 p = new JPanel();
	 gen = new Genre();
	 mu = new MusicImg();
	}
	
	public void select(int n) {
		
	if(n==1) {
		p= gen;
	}
	
	else {
		p = mu;
	}
	
	}

}
