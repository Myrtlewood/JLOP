package semi.project;
/* 이클립스 github 연동 연습 전영문*/
/*성근 다녀감..*/
/*성근 다녀감.,*/

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ViewMovie_Home extends JFrame{
   //선언부
   
   Container cont       = null;
   /* 카드레이아웃 */
   CardLayout maincard = new CardLayout();
   
   //로고패널 유저패널 메뉴페널 이 들어가서 세줄로 배치시키는 노스패널
   JPanel jp_north = new JPanel(new GridLayout(3,1));
   
   
   //노스패널 맨위배치되고 로고 가 들어가는 로고패널
   JPanel jp_logo = new JPanel();
   //로고패널에 들어가는 로고버튼
   JButton    jbtn_logo    = new JButton("로고");
   
         
            
   //노스패널 두번째에 배치되고 회원가입 로그인 버튼이 오른쪽 정렬되어서 들어가는 유저패널
   JPanel jp_user = new JPanel(new FlowLayout(FlowLayout.RIGHT));
   //유저패널에 들어가는 회원가입버튼
   JButton    jbtn_signup   = new JButton("회원가입");
   //유저패널에 들어가는 로그인버튼
   JButton    jbtn_login       = new JButton("로그인");

         
      //노스패널 맨밑에 배치되고 영화 카드 예매 카드 선택할수있는 버튼이 들어가는 메뉴패널   
   JPanel jp_menu          = new JPanel(new GridLayout(1,2));
         //메뉴패널에 들어가고 메인 패널에 영화 카드를 보여주는 영화버튼
   JButton jbtn_cardmovie = new JButton("영화");
         //메뉴패널에 들어가고 메인 패널에 예매 카드를 보여주는 예매버튼
   JButton jbtn_cardticket = new JButton("예매");
   

   //영화 예매 회원가입 로그인 마이페이지 카드를 넣는 메인패널
   JPanel jp_main = new JPanel(maincard);
   
   //인스턴스화
   EventMovie em = new EventMovie(this);
   
   //생성자
   public ViewMovie_Home() {
	   cont = this.getContentPane();
      initDisplay();
   }
   
  
   public void initDisplay() {
	   this.setSize(800, 600);
	   this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //종료할때 시스템 창에서도 강제종료됨
	   
	   //액션
	   jbtn_logo.addActionListener(em);
	   jbtn_signup.addActionListener(em);
	   jbtn_login.addActionListener(em);
	   jbtn_cardmovie.addActionListener(em);
	   jbtn_cardticket.addActionListener(em);
	   
	   //가장 밑바닥 레이아웃
	   cont.setLayout(new BorderLayout());
	   //로고 패널에 버튼 붙이기
	   jp_logo.add(jbtn_logo);
	   
	   //유저패널(회원가입, 로그인 버튼 들어가있는 곳)
	   jp_user.add(jbtn_signup);
	   jp_user.add(jbtn_login);
	   
	   //메뉴패널(영화, 예매버튼 들어가있는 곳)
	   jp_menu.add(jbtn_cardmovie);
	   jp_menu.add(jbtn_cardticket);
	   
	   //로고, 유저, 메뉴 패널들 모아둔 곳
	   jp_north.add(jp_logo);
	   jp_north.add(jp_user);
	   jp_north.add(jp_menu);
	   
	   //변환할 패널 레이아웃 지정(jp_main 패널에  maincard = 카드레이아웃)
	   jp_main.setLayout(maincard);
	   //변환되는 카드들( 카드 부르기 위한 암호 , 그 암호로 부를 클래스명 )
	   jp_main.add("Home", 		new Panel_Home());
	   jp_main.add("SignUp", 		new Panel_SignUp());
	   jp_main.add("Login",			new Panel_Login());
	   jp_main.add("Movies", 		new Panel_Movies());
	   jp_main.add("Ticketing",  new Panel_Ticketing());
	   //이곳에 넣어야할지 말아야 할지?
	   jp_main.add("MyPage", 	new Panel_MyPage());
	   
	   //가장 베이스 패널 
	   cont.add("North",jp_north);         
	   cont.add("Center",jp_main);
	
	   this.setVisible(true);
   }
   
   
   //메인
   public static void main(String[] args) {
      new ViewMovie_Home();
   }

}