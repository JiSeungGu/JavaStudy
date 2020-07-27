import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Idus_Menu_Form extends JPanel {
	JLabel Idus_logo = new JLabel();
	JLabel Button_Label = new JLabel();
	JLabel Button_Label2 = new JLabel();
	JLabel Button_Label3 = new JLabel();
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	public Idus_Menu_Form() {
		setLayout(null);
		ImageIcon image = new ImageIcon("C:\\javaDev\\Idus_Logo.png");
		Idus_logo.setIcon(new ImageIcon(getImage(image,160,130)));
		Idus_logo.setBounds(0, 0, 160,130); 
		//추가 => add();
		
		//Button_Label.setBounds(0, 200, 1920, 30);
				
		b1 = new JButton("배움");
		b2 = new JButton("검색");
		b3 = new JButton("로그인");
		b4 = new JButton("회원가입");
		b5 = new JButton("공지");
		b6 = new JButton("카테고리");
		b7 = new JButton("인기");
		b8 = new JButton("금손클래스");
		
		Button_Label.setLayout(new GridLayout(1,5,20,30));
		Button_Label.setBounds(0, 150, 1900, 30);
		
		Button_Label2.setLayout(new GridLayout(1,3,30,10));
		Button_Label2.setBounds(0, 185, 1900,35);
		
		
		//Button_Label3.setLayout(new GridLayout());
		Button_Label.add(b1);
		Button_Label.add(b2);
		Button_Label.add(b3);
		Button_Label.add(b4);
		Button_Label.add(b5);
		
		Button_Label2.add(b6);
		Button_Label2.add(b7);
		Button_Label2.add(b8);
	
		add(Idus_logo);
		add(Button_Label);
		add(Button_Label2);
	}
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
}
