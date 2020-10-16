import java.util.Vector;

public class Login {
	static Login instance = new Login();
	
	
	public static void main(String[] args) {
		int check;

	}
	
	public int checkId(String id) {
		int num = -2;

		Member m = new Member(id);
		int check = Manager.instance.checkJoin(m);

		if (check == -1) {
			System.out.println("회원가입 가능 ");
			num = check;
			
		} else {

			num = check;
		}
return num;
	}
		
	

	public int checklogin(String id, String pw) {

		Member m = new Member(id, pw);
		int check =-1;
		int log =100;
		
		check = Manager.instance.checkLogin(m);
		
	
		if (check != -1) {
			System.out.println(id + "님 로그인되었습니다.");
			log= 1;
		}
		else {
			System.out.println("로그인 실패");
			log=100;
		}
		return log;
	}

	public int Join(String id, String pw) {
		int num = -2;
 
		System.out.println();
		System.out.println(id+" * " +pw);
		Member m = new Member(id, pw);
		int check = Manager.instance.checkJoin(m);

		if (check == -1) {
			System.out.println("회원가입 가능 ");
			Manager.instance.addMemeber(m);
			num = check;
			Manager.instance.Ok();
	
			
		} else {

			num = check;
		}
return num;
	}
}

class Member {
	
	//static Member instance = new Member();
	
	String id = "";
	String pw = "";

	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public Member(String id) {
		this.id = id;
	}
	void set_data(String id, String pw) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.pw = pw;
	}
	
	void print () {
		System.out.println(id+ " "+"pw");
	}

}

class Manager {
	
	static Manager instance = new Manager();

	Vector<Member> vec = new Vector<Member>();

	void addMemeber(Member m) {
		System.out.println("manaber m = " + m.id);
		vec.add(m);
		System.out.println("가입완료");
		Ok();
	}

	int checkJoin(Member m) {

		int check = -1;
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).id.equals(m.id)) {
				check = i;
				break;
			}
		}
		return check;
	}

	int checkLogin(Member m) {
		System.out.println("vec id = " + vec.get(0).id);
		System.out.println("vec pw = " + vec.get(0).pw);
		System.out.println("m id = " + m.id);
		System.out.println("m pw = " + m.pw);
		int check = -1;
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).id.equals(m.id)) {
				
				System.out.println("아이디 확인");
				
				if ((vec.get(i).pw).equals(m.pw)) {
					System.out.println("아이디 비번동일 ");
					System.out.println("비번확인");
					// break;
					check = i;
					
				} 
				else {
					check = -1;

				}
			}
		}

		System.out.println("check = " + check);

		return check;

	}
	
	void Ok () {
		for(int i = 0 ; i <vec.size();i++) {
			vec.get(i).print();
		}
	}
}
