import java.util.*;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.awt.event.*;
import java.io.IOException;
import java.net.*;

public class Idus_메인폼_사진형태 extends JPanel{
	//public ImageIcon imageIcon = new ImageIcon();
	
	JLabel Top_image = new JLabel();
	JLabel Image_Explain = new JLabel();
	JLabel center_content = new JLabel();
	//JLabel Star= new JLabel();
	//JLabel subtitle = new JLabel();
	//JPanel p = new JPanel();
	
	public Idus_메인폼_사진형태()
	{
		setLayout(null);
		//setSize(210,200);
		
		Top_image.setBounds(5,5,205,195);
		Top_image.setOpaque(true);
		
		Image_Explain.setBounds(5,205,205,15);
		Image_Explain.setOpaque(true);
		Image_Explain.setForeground(Color.GRAY);
		center_content.setBounds(5,225,205,30);
		center_content.setOpaque(true);
		//center_content.setFont(new Font("굴림",Font.BOLD,13));
		//Star.setBounds(5,240,300,30);
		//Star.setOpaque(true);
		//Star.setBackground(Color.orange);
		
		//subtitle.setBounds(5,275,300,30);
		//subtitle.setOpaque(true);
		
		add(Top_image);
		add(Image_Explain);
		add(center_content);
		//add(Star);
		//add(subtitle);
	}
	public static void main(String[] args) {

	}
}
