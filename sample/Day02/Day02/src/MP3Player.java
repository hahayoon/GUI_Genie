import javax.swing.JFrame;


public class MP3Player {
	public MP3_Gui guiPlayer;
	MP3Player(int index) {
		JFrame frame = new JFrame();
		frame.setTitle("MP3 Player");
		frame.setSize(370, 730);
		frame.setLocation(100 , 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		guiPlayer = new MP3_Gui(index); 
		guiPlayer.manager.start();
		frame.setContentPane(guiPlayer);
		frame.revalidate();	
	}

}
	

