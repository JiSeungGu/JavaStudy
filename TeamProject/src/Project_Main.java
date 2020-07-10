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
	//JPanel border = new JPanel(); //  border ���� 
	JButton b1;
	Project_Main()
	{
		b1 = new JButton("���");
		JPanel p = new JPanel(); // Jpanel ���� 
		
		p.add(b1); //�гο� ��ư ���� 
		add(p);
		setLayout(null); //��ġ
		p.setBounds(10, 15, 780, 35);
		//border.setBounds(10, 20, 1280, 900);
		pan.setBounds(10, 200, 1280, 900);
		/* ||| ���� �������� �κ� (�ܼ��� ���� �ϳ�)
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
		//07.10 �׵θ� ����
		pan.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		pan.setLayout(new GridLayout(4,3,15,80)); //�׸��� ���̾ƿ��� ũ�Ⱑ �Ȱ��� ������ �ٶ� ����Ѵ� 4�� 5ĭ ������ 8�� �ǹ��Ѵ� �̸��̾�!
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
	
		//Elements �κп��� ����Ʈ�� �ִ� �׸� �ּҰ��� �����ؾ���
		Document doc = Jsoup.connect(url).get(); //����Ʈ�� ���� �о�´�
		Elements image = doc.select("div.ui_card__imgcover a");   //���� �������µ� style �κ��� ���λ��� ����� �𸣰���..
		
		image.attr("style");
		System.out.println("image.attr  :"+image.attr("style"));
		
		System.out.println("����� "+image.attr("style").toString().substring(23, 98));
		for(int i=0;i<9;i++)
		{	
			System.out.println("??");
			Idus_Info_Main[i]=new Idus_Info_Main();
			/*
			 * .attr("style").toString().substring(23, 98);
			 * �̺κп���
			 *  style�� �Ӽ����� �����������ؼ� attr("style") 
			 *  �� style�Ӽ� ���ȿ���  url�ּҰ��� �����������ؼ� substring !! 
			 *  
			 */
			String temp=image.get(i).attr("style").toString().substring(23, 98);
			System.out.println("���� ��� ����ϴ� temp"+temp);
			Idus_Info_Main[i].poster=temp.substring(temp.indexOf("=")+1); // src=" ~~" src�� �������ִ� �����Ͱ��� attr�� �����´�.
			System.out.println("���� ��� ����ϴ� substring"+temp.substring(temp.indexOf("=")+1));
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
