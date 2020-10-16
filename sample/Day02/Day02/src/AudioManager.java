import java.awt.event.ActionEvent;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
public class AudioManager extends Thread{
	ArrayList<Song> songList;
	static Clip clip;
	AudioInputStream stream;
	Song activeSong;
	long currClipPosition;
	boolean repeat;
	boolean shuffle;
	static long preTime = 0;
	static long time = 0;
	static long preTimePause = 0;
	static long pausedTime = 0;
	boolean currPlaying = false; //used to play one song at a time
	boolean paused = false;
	static ActionEvent action;
	static long recordTotalPauseTime = 0;
	int index;
	AudioManager(int index) {
		songList = new ArrayList<>();
		currClipPosition = 0;
		repeat = false;
		shuffle = false;
		this.index = index;
	}
	// get all prepared songs
	public void getAllSongs() {
		songList.add(new Song("In The Summer by SSAK3 (Feat. Kwang Hee Hwang) (���� �ȿ��� by �Ͼ��� (Feat. Ȳ����)).wav", "m1.jpg", "�Ͼ���", "�ٽ� ���� �ٴ尡"));
		songList.add(new Song("BLACKPINK - 'How You Like That' (Official Audio).wav", "m2.jpg", "����ũ", "How You Like That"));
		songList.add(new Song("ȭ�� (Hwa Sa)������ (Maria).wav", "m3.jpg", "ȭ��", "Maria"));
		songList.add(new Song("���� (ZICO) - Summer Hate (Feat. ��) (Official Audio).wav", "m4.jpg", "Zico", "Summer Hate"));
		songList.add(new Song("CHUNG HA (û��) - PLAY (Feat. CHANGMO (â��)) [MP3 Audio].wav", "m5.jpg", "û��", "Play"));
		songList.add(new Song("Downtown Baby.wav", "m6.jpg", "���(Bloo)", "Downtown Baby"));
		songList.add(new Song("SUNMI (����) - ����� �� (pporappippam) AUDIO.wav", "m7.jpg", "����","�������"));
		songList.add(new Song("�̼��� - ���� ���� �ð��� ��� ���������� ������ OST Part 4.wav", "m8.jpg", "�̼���", "���� ���� �ð��� ��� (���������� ������ OST PART.04)"));
		songList.add(new Song("Crush (ũ����) - 'OHIO' Official Audio.wav", "m9.jpg", "Crush (ũ����)", "Ohio"));
		songList.add(new Song("IU - Eight.wav", "m10.jpg", "������(IU)", "Eight"));
	}
	
	public Song getActiveSong() {
		return this.activeSong;
	}
	
	public void run() {
		preTime = System.currentTimeMillis();
		while(true) {
			System.out.println(time);
			activeSong =  songList.get(index);
			time = System.currentTimeMillis() - preTime;
			if(!currPlaying && !activeSong.playing) {
				currPlaying = true;
				try {
					stream = AudioSystem.getAudioInputStream(activeSong.fileSong);
					clip = AudioSystem.getClip();
					clip.open(stream);
					clip.setMicrosecondPosition(currClipPosition);
					clip.start();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			// Keep track of time
			if (time-recordTotalPauseTime==songList.get(index).totalTime*1000) {
				System.out.println("in first if");
				index = (index+1)%songList.size();
				preTime = System.currentTimeMillis();
				currClipPosition = 0;
				currPlaying = false;	
				pausedTime = 0;
			}
			//pause track
			if (activeSong.playing) {
				if(currPlaying) {
					System.out.println("pausedTime "+pausedTime);
					currClipPosition = clip.getMicrosecondPosition();
					pausedTime = System.currentTimeMillis();				
					clip.stop();
					currPlaying = false;
				}
				else {
					recordTotalPauseTime = System.currentTimeMillis() - pausedTime;
					//System.out.println(recordTotalPauseTime);
				}

			}
		}
	}

}
