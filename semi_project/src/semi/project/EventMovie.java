package semi.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventMovie implements ActionListener{
	ViewMovie_Home vmh= null;
	Panel_Home			 ph    = null;
	public EventMovie(ViewMovie_Home vmh) {
		this.vmh = vmh;
	}
	public EventMovie( Panel_Home ph) {
		this.ph = ph;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		/********************************************
		 * 			메인화면에서 화면전환(카드) 이벤트 처리		*
		 ********************************************/
		if(obj == vmh.jbtn_logo) {
			vmh.maincard.show(vmh.jp_main, "Home");
		}
		else if(obj == vmh.jbtn_signup) {
			vmh.maincard.show(vmh.jp_main, "SignUp");
		}
		else if(obj == vmh.jbtn_login) {
			vmh.maincard.show(vmh.jp_main, "Login");
		}
		else if(obj == vmh.jbtn_cardmovie) {
			vmh.maincard.show(vmh.jp_main, "Movies");
		}
		else if(obj == vmh.jbtn_cardticket) {
			vmh.maincard.show(vmh.jp_main, "Ticketing");
		}
		// 메인화면에서 화면전환(카드) 이벤트 처리 끝
		
		
		/********************************************
		 * 			메인화면에서 화면전환(카드) 이벤트 처리		*
		 ********************************************/
		if(obj == ph.jbtn_img_1) {
			ph.card.next(ph);
		}
	}
}