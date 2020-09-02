package semi.project;

import javax.swing.JFrame;

public class Test extends JFrame {
	public Test() {
		Login();//여기에 테스트하고싶은 패널 입력
	}
	
	void SignUp() {
		this.add(new Panel_SignUp());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	
	void Home() {
		this.add(new Panel_Home());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	void Login() {
		this.add(new Panel_Login());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	void Movies() {
		this.add(new Panel_Movies());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	void MyPage() {
		this.add(new Panel_MyPage());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	void Ticketting() {
		this.add(new Panel_Ticketing());
		this.setSize(500, 500);
		this.setVisible(true);
	}
	

	public static void main(String[] args) {
		new Test();

	}

}
