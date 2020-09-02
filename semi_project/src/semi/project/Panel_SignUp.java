package semi.project;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*********************************************************
 *                                              회원가입 패널                                           *
 *********************************************************/
public class Panel_SignUp extends JPanel{
	//선언부
	JLabel			jlb_main		= new JLabel("회원가입");
	
	JLabel 			jlb_name 		= new JLabel("이름");
	JTextField 	jtf_name  	    = new JTextField();
	
	JLabel 			jlb_number	= new JLabel("전화번호");
	JTextField 	jtf_number	= new JTextField();
	
	JLabel 			jlb_id				= new JLabel("ID");
	JTextField 	jtf_id				= new JTextField();
	JButton 			jbtn_dist		= new JButton("중복확인");
	
	JLabel 			jlb_pw			= new JLabel("비밀번호");
	JTextField		jtf_pw				= new JTextField();
	
	JLabel 			jlb_pwcheck			= new JLabel("비밀번호확인");
	JTextField		jtf_pwcheck				= new JTextField();
	
	Container cont 			= new JFrame().getContentPane();  //JFrame 안에 있는 getContentPane 메소드 사용
	//생성자
	public Panel_SignUp() {
		this.setLayout(null);//bounds 해주기 위해 레이아웃 null 
		
		jlb_main.setBounds(100,20,60,20);
		
		jlb_name.setBounds(10,50,60,30);
		jtf_name.setBounds(100,50,60,30);
		
		jlb_number.setBounds(10,80,60,30);
		jtf_number.setBounds(100,80,100,30);
		
		jlb_id.setBounds(10,120,60,30);
		jtf_id.setBounds(100,120,100,30);
		jbtn_dist.setBounds(200,120,90,29);
		
		jlb_pw.setBounds(10,150,60,30);
		jtf_pw.setBounds(100,150,100,30);
		
		jlb_pwcheck.setBounds(10,180,90,30);
		jtf_pwcheck.setBounds(100,180,100,30);
		
		this.add(jlb_main);
		
		this.add(jlb_name);
		this.add(jtf_name);
		
		this.add(jlb_number);
		this.add(jtf_number);
		
		this.add(jlb_id);
		this.add(jtf_id);
		this.add(jbtn_dist);
		
		this.add(jlb_pw);
		this.add(jtf_pw);
		
		this.add(jlb_pwcheck);
		this.add(jtf_pwcheck);
	}
}
