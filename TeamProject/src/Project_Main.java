import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.net.*;

public class Project_Main extends JFrame implements ActionListener{
	static Idus_Info_Main[] Idus_Info_Main = new Idus_Info_Main[20];
	JPanel pan = new JPanel();
	//JPanel border = new JPanel(); //  border 위한 
	JButton b1;
	Project_Main()
	{
		b1 = new JButton("배움");
		JPanel p = new JPanel(); // Jpanel 생성 
		
		p.add(b1); //패널에 버튼 부착 
		add(p);
		setLayout(null); //배치
		p.setBounds(10, 15, 780, 35);
		//border.setBounds(10, 20, 1280, 900);
		pan.setBounds(10, 200, 1280, 900);
		/* ||| 사진 가져오는 부분 (단순히 사진 하나)
		try
		{
			URL url = new URL("https://t1.daumcdn.net/movie/7e764f93ec67879aaec315047ab409ff35c96f94");
			//la.setIcon(new ImageIcon(getImage(new ImageIcon(url),200,350)));
		}catch(Exception ex) {ex.printStackTrace();}
		*/
		//add(border);
		add(pan);
	
		setSize(1300,1000);
		b1.addActionListener(this);
		try
		{
			FripData(1);
			imagePrint();
		}catch(Exception ex) {}
		setVisible(true);
		setVisible(true);
	}
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    } 
	
	void imagePrint() throws Exception {
		// TODO Auto-generated method stub
		//07.10 테두리 설정
		pan.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		pan.setLayout(new GridLayout(4,3,15,80)); //그리드 레이아웃은 크기가 똑같이 균형을 줄때 사용한다 4줄 5칸 간격은 8을 의미한다 이말이야!
		pan.removeAll();
		for(Idus_Info_Main in:Idus_Info_Main)
		{
			if(in.poster!=null)
			{
				URL url = new URL(in.poster);
				pan.add(new JLabel(new ImageIcon(getImage(new ImageIcon(url),250,280))));
			}
		}
		pan.validate();
	}
	static void FripData(int no) throws Exception
	{
		String url="";
		
		switch (no) {
		case 1:
			url="https://www.idus.com";
			break;
		case 2:
			url="https://www.idus.com/w/main/liver-order-product";
			break;
		case 3:
			url="https://www.idus.com/";
			break;
		case 4:
			url="https://www.idus.com/";
			break;
		case 5:
			url="https://www.idus.com/";
			break;
			}
	
		//Elements 부분에서 사이트에 있는 그림 주소값을 수정해야함
		Document doc = Jsoup.connect(url).get(); //사이트를 전부 읽어온다
		Elements image = doc.select("div.ui_card__imgcover a");   //값을 가져오는데 style 부분을 따로빼는 방법을 모르겠음..
		
		image.attr("style");
		System.out.println("image.attr  :"+image.attr("style"));
		
		System.out.println("어디지 "+image.attr("style").toString().substring(23, 98));
		for(int i=0;i<9;i++)
		{	
			System.out.println("??");
			Idus_Info_Main[i]=new Idus_Info_Main();
			/*
			 * .attr("style").toString().substring(23, 98);
			 * 이부분에서
			 *  style의 속성값을 가져오기위해서 attr("style") 
			 *  또 style속성 값안에서  url주소값을 가져오기위해서 substring !! 
			 *  
			 */
			String temp=image.get(i).attr("style").toString().substring(23, 98);
			System.out.println("시험 삼아 출력하는 temp"+temp);
			Idus_Info_Main[i].poster=temp.substring(temp.indexOf("=")+1); // src=" ~~" src가 가지고있는 데이터값을 attr로 가져온다.
			System.out.println("시험 삼아 출력하는 substring"+temp.substring(temp.indexOf("=")+1));
		}	
	}		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); //win
		new Project_Main();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try {
				FripData(2);
			}catch(Exception ex) {}
		}
	}
}
