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
		songList.add(new Song("In The Summer by SSAK3 (Feat. Kwang Hee Hwang) (여름 안에서 by 싹쓰리 (Feat. 황광희)).wav", "m1.jpg", "싹쓰리", "다시 여기 바닷가"));
		songList.add(new Song("BLACKPINK - 'How You Like That' (Official Audio).wav", "m2.jpg", "블랙핑크", "How You Like That"));
		songList.add(new Song("화사 (Hwa Sa)마리아 (Maria).wav", "m3.jpg", "화사", "Maria"));
		songList.add(new Song("지코 (ZICO) - Summer Hate (Feat. 비) (Official Audio).wav", "m4.jpg", "Zico", "Summer Hate"));
		songList.add(new Song("CHUNG HA (청하) - PLAY (Feat. CHANGMO (창모)) [MP3 Audio].wav", "m5.jpg", "청하", "Play"));
		songList.add(new Song("Downtown Baby.wav", "m6.jpg", "블루(Bloo)", "Downtown Baby"));
		songList.add(new Song("SUNMI (선미) - 보라빛 밤 (pporappippam) AUDIO.wav", "m7.jpg", "선미","보라빛밤"));
		songList.add(new Song("이수현 - 아직 너의 시간에 살아 사이코지만 괜찮아 OST Part 4.wav", "m8.jpg", "이수현", "아직 너의 시간에 살아 (사이코지만 괜찮아 OST PART.04)"));
		songList.add(new Song("Crush (크러쉬) - 'OHIO' Official Audio.wav", "m9.jpg", "Crush (크러쉬)", "Ohio"));
		songList.add(new Song("IU - Eight.wav", "m10.jpg", "아이유(IU)", "Eight"));
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
