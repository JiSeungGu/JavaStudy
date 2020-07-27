import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
		
public class Main extends JFrame{
	//Idus_메인폼_사진형태 Idus_메인폼_사진형태 = new Idus_메인폼_사진형태();
		
	//Project_Main Project_Main = new Project_Main();
	Idus_Menu_Form imf = new Idus_Menu_Form();
	Idus_ControllPanel icp = new Idus_ControllPanel();
	public Main()
	{	
		setLayout(null); //null주면 우리가 직접 layout설정
			
		imf.setBounds(0,0,1920, 230);
		imf.setOpaque(false);
		add(imf);

		icp.setBounds(0, 220, 1920, 850);
		add(icp);
		
		setSize(1920,1080);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 메모리 회수
		
		
	}	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); //win
		new Main();
	}	
}		
		