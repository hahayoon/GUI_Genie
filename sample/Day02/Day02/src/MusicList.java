import java.util.HashMap;
import java.util.Map;


public class MusicList {
   
   public static MusicList musicList = new MusicList();
   
   public Map<String, String> Kpop = new HashMap<>();
   public Map<String, String> Pop = new HashMap<>();
   public Map<String, String> Ost = new HashMap<>();
   public Map<String, String> Trot = new HashMap<>();
   public Map<String, String> Edm = new HashMap<>();
   public Map<String, String> Jazz = new HashMap<>();
   public Map<String, String> Classic = new HashMap<>();
   public Map<String, String> Jpop = new HashMap<>();

   public void Kpop() {
		Kpop.put("여름안에서", "싹쓰리");
		Kpop.put("How you like that", "Black pink");
		Kpop.put("마리아", "화사");
		Kpop.put("Summer hate", "지코");
		Kpop.put("Play", "청하");
		Kpop.put("Downtown baby", "블루");
		Kpop.put("보라빛 밤", "선미");
		Kpop.put("아직 너의 시간에 살아", "이수현");
		Kpop.put("Ohio", "Crush");
		Kpop.put("에잇", "아이유");
	}
	
	void Pop() {
		Pop.put("ilyily", "Aidan Pohi & 6TH STREET");
		Pop.put("Dancehall Energy", "MC Zulu & Bionik");
		Pop.put("Undercover", "Pauli Gabrieli");
		Pop.put("Coordinates to Atlantis", "Roommate");
		Pop.put("Progression (Feat. Breana Marin)", "SCS");
	}
	void Ost() {
		Ost.put("젊은 연인들", "재연");
		Ost.put("Xhei", "Useless Idea");
		Ost.put("봄날을 사랑한 겨울처럼", "김나영");
		Ost.put("Hero Man", "임팩트");
		Ost.put("우주최강 또봇V", "또봇V");
	}
	void Trot() {
		Trot.put("사랑도둑", "강소리");
		Trot.put("연분홍빛 사랑", "김경애");
		Trot.put("거울당신", "진수정");
		Trot.put("고귀한 선물", "채미진");
		Trot.put("내 고향 안면도", "나이영");
	}
	void Edm() {
		Edm.put("No Goodbye", "미소");
		Edm.put("Vikings", "Andreas Andreson");
		Edm.put("Release", "8D");
		Edm.put("Better Yes", "Jollydant");
		Edm.put("Jogging", "Juvasky");
	}
	void Jazz() {
		Jazz.put("Unmoored","Matt Borghi");
		Jazz.put("Black","Jump4Joy");
		Jazz.put("U jungjjung","Do&Be Sound");
		Jazz.put("For by Grace","조항선");
		Jazz.put("Make It Right","Blue Light");
	}
	void Classic() {
		Classic.put("Violin Concerto No.2 in D Minor", "Eugene Ormandy");
		Classic.put("Violin Concerto in D Major", "Isaac Stern");
		Classic.put("Threads", "Maarja Nuut");
		Classic.put("Violin Sonata in D Major", "Isaac Stern");
		Classic.put("Violin Sonata in A Major", "Isaac Stern");
	}
	void Jpop() {
		Jpop.put("Summer Time Magic", "ame_no");
		Jpop.put("Sherbet Pink", "NGT48");
		Jpop.put("Planet floor", "THREE1989");
		Jpop.put("증표", "Yuuka Ueno");
		Jpop.put("Ai No Sanka", "Kataomoi");	
	}
}
