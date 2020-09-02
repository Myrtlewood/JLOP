package semi.project;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/*********************************************************
 *                                                  홈 패널                                                 *
 *********************************************************/
public class Panel_Home extends JPanel{
	//선언부
	CardLayout 		card 					= new CardLayout();
	JButton				jbtn_snack		= new JButton("스낵코너에서 파는 것들 이미지");
	JButton				jbtn_img_1		= new JButton("1번 이미지");
	JButton 				jbtn_img_2		= new JButton("2번 이미지");
	JButton 				jbtn_img_3		= new JButton("3번 이미지");
	
	JPanel 				jp_north			= new JPanel();
	JPanel 				jp_center			= new JPanel();
	
	//인스턴스화
	EventMovie	em			= new EventMovie(this);
	public Panel_Home() {
		initDisplay();
	}
	public void initDisplay() {
		jbtn_img_1.addActionListener(em);
		jbtn_img_2.addActionListener(em);
		jbtn_img_3.addActionListener(em);
		
		this.setLayout(new BorderLayout());
		
		jp_north.add(jbtn_snack);
		
		jp_center.setLayout(card);
		jp_center.add(jbtn_img_1);
		jp_center.add(jbtn_img_2);
		jp_center.add(jbtn_img_3);
		
		
		this.add("North",jp_north);
		this.add("Center",jp_center);
	}
}
