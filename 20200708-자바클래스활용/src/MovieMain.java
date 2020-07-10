import java.util.*;
import java.awt.*;
import javax.swing.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.net.*;
public class MovieMain extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5;
	//JLabel la = new JLabel(); //�׸�����ϴ� ��ü����
	static MovieVO[] movies = new MovieVO[20];
	JPanel pan = new JPanel();
	MovieMain()
	{
		b1 = new JButton("���� �� ��ȭ     ");
		b2 = new JButton("���� ���� ��ȭ     ");
		b3 = new JButton("�ڽ� ���ǽ�(�ְ�)");
		b4 = new JButton("�ڽ� ���ǽ�(����)"); 	
		b5 = new JButton("�ڽ� ���ǽ�(�Ⱓ)");
		JPanel p = new JPanel();
	
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		add(p);
		setLayout(null); //��ġ
		p.setBounds(10, 15, 780, 35);
		pan.setBounds(10, 60, 1280, 900);
		try
		{
			URL url = new URL("https://t1.daumcdn.net/movie/7e764f93ec67879aaec315047ab409ff35c96f94");
			//la.setIcon(new ImageIcon(getImage(new ImageIcon(url),200,350)));
		}catch(Exception ex) {ex.printStackTrace();}
		add(pan);
		setSize(1300,1000);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		try
		{
			movieData(1);
			imagePrint();
		}catch(Exception ex) {}
		setVisible(true);
	}
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	void imagePrint() throws Exception
	{
		
		pan.setLayout(new GridLayout(4,5,8,8)); //�׸��� ���̾ƿ��� ũ�Ⱑ �Ȱ��� ������ �ٶ� ����Ѵ� 4�� 5ĭ ������ 8�� �ǹ��Ѵ� �̸��̾�!
		pan.removeAll();
		for(MovieVO vo:movies)
		{
			if(vo.poster!=null)
			{
				URL url = new URL(vo.poster);
				pan.add(new JLabel(new ImageIcon(getImage(new ImageIcon(url),250,280))));
			}
		}
		pan.validate();
	}
	static void movieData(int no) throws Exception
	{
		String url="";
		
		switch (no) {
		case 1:
			url="https://movie.daum.net/premovie/released";
			break;
		case 2:
			url="https://movie.daum.net/premovie/scheduled";
			break;
		case 3:
			url="https://movie.daum.net/boxoffice/weekly";
			break;
		case 4:
			url="https://movie.daum.net/boxoffice/monthly";
			break;
		case 5:
			url="https://movie.daum.net/boxoffice/yearly";
			break;
			}
		/*
		 * <div class="info_movie">
								<span class="thumb_movie bg_noimage">
								<img src="//img1.daumcdn.net/thumb/C236x340/?fname=https://t1.daumcdn.net/movie/3986610f921d4371be92d6184bf75dc1c74d80e2" class="img_g" alt="" onload="noImageOnLoad($(this))">
		 */ 
		Document doc = Jsoup.connect(url).get(); //����Ʈ�� ���� �о�´�
		Elements image = doc.select("div.info_movie span.thumb_movie img.img_g");
		System.out.println("test"+doc.select("div.info_movie span.thumb_movie img.img_g"));
		for(int i=0;i<20;i++)
		{	
			movies[i]=new MovieVO();
			String temp=image.get(i).attr("src");
			System.out.println("���� ��� ����ϴ� temp"+temp);
			movies[i].poster=temp.substring(temp.indexOf("=")+1); // src=" ~~" src�� �������ִ� �����Ͱ��� attr�� �����´�.
			System.out.println("���� ��� ����ϴ� substring"+temp.substring(temp.indexOf("=")+1));
		}	
	}		
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel"); //win
		new MovieMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			try {
				movieData(2);
			}catch(Exception ex) {}
		}
		else if(e.getSource()==b2)
		{
			try {
				movieData(2);
			}catch(Exception ex) {}
		}
		else if(e.getSource()==b3)
		{
			try {
				movieData(2);
			}catch(Exception ex) {}
		}
		else if(e.getSource()==b4)
		{
			try {
				movieData(2);
			}catch(Exception ex) {}
		}
		else if(e.getSource()==b5)
		{
			try {
				movieData(2);
			}catch(Exception ex) {}
		}
	}		
			
}	
