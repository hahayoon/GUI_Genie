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
		Kpop.put("�����ȿ���", "�Ͼ���");
		Kpop.put("How you like that", "Black pink");
		Kpop.put("������", "ȭ��");
		Kpop.put("Summer hate", "����");
		Kpop.put("Play", "û��");
		Kpop.put("Downtown baby", "���");
		Kpop.put("����� ��", "����");
		Kpop.put("���� ���� �ð��� ���", "�̼���");
		Kpop.put("Ohio", "Crush");
		Kpop.put("����", "������");
	}
	
	void Pop() {
		Pop.put("ilyily", "Aidan Pohi & 6TH STREET");
		Pop.put("Dancehall Energy", "MC Zulu & Bionik");
		Pop.put("Undercover", "Pauli Gabrieli");
		Pop.put("Coordinates to Atlantis", "Roommate");
		Pop.put("Progression (Feat. Breana Marin)", "SCS");
	}
	void Ost() {
		Ost.put("���� ���ε�", "�翬");
		Ost.put("Xhei", "Useless Idea");
		Ost.put("������ ����� �ܿ�ó��", "�質��");
		Ost.put("Hero Man", "����Ʈ");
		Ost.put("�����ְ� �Ǻ�V", "�Ǻ�V");
	}
	void Trot() {
		Trot.put("�������", "���Ҹ�");
		Trot.put("����ȫ�� ���", "����");
		Trot.put("�ſ���", "������");
		Trot.put("����� ����", "ä����");
		Trot.put("�� ���� �ȸ鵵", "���̿�");
	}
	void Edm() {
		Edm.put("No Goodbye", "�̼�");
		Edm.put("Vikings", "Andreas Andreson");
		Edm.put("Release", "8D");
		Edm.put("Better Yes", "Jollydant");
		Edm.put("Jogging", "Juvasky");
	}
	void Jazz() {
		Jazz.put("Unmoored","Matt Borghi");
		Jazz.put("Black","Jump4Joy");
		Jazz.put("U jungjjung","Do&Be Sound");
		Jazz.put("For by Grace","���׼�");
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
		Jpop.put("��ǥ", "Yuuka Ueno");
		Jpop.put("Ai No Sanka", "Kataomoi");	
	}
}
