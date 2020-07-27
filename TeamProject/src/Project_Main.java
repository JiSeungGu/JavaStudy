import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.sist.data.Idus_Detail_VO;
import com.sist.data.Idus_������_��������_������;

import java.awt.event.*;
import java.net.*;

public class Project_Main {
	// ******** GridLayout �� ����� ���� �� �Ӽ� ��ġ
	public int count = 0;
	//JPanel border = new JPanel();
	
	//****** ���⼭���� �ڵ� ������ �����ϴ� �κ�
	public Idus_������_��������_������[] Idius_Main_Form_Data() {
		Idus_������_��������_������[] Data = new Idus_������_��������_������[18];
		try {
			Document doc = Jsoup.connect("https://www.idus.com").get();
			//doc.select("ã�Ƽ� ������ �±׺κ��� ���� �ִ´�);
			Elements image = doc.select("div.ui_card__imgcover a");  // 10����
			Elements star_value = doc.select("div.ui_card__vcenter div.ui_rating");
			Elements review = doc.select("span.ui_card__comment");
			
			System.out.println("/?");
			for(int i=0;i<18;i++)
			{
				Data[i] = new Idus_������_��������_������();
			
				
				//�̹��� �ִ� �κ�
				String temp = image.get(i).attr("style").substring(23, 98);
				Data[i].setTop_image(temp);
				System.out.println("!");
				System.out.println("temp �� ��" + temp);
			
				//�̹��� ������
				Element title = doc.select("div.ui_card__info a").get(count++);
				Data[i].setImage_Explain(title.text());
				
				//�̹��� ����
				title = doc.select("div.ui_card__info a").get(count++);
				Data[i].setCenter_content(title.text());
				
				//���� �ִ� �κ�
				String value = star_value.get(i).attr("data-value");
				Data[i].setStar(value);

				//���� �ִ� �κ�
				String review_data =  review.get(i).text();
				Data[i].setReview(review_data);
				
//			Elements score = doc.select("strong.point span");
//			Elements address=doc.select("p.etc"); 			
//			Elements poster= doc.select("img.center-croping");
//			Elements review= doc.select("p.short_review");
			
			}
		}catch (Exception e) {}
		
		return Data;
	}
	/*
	//******
	public Project_Main() {
		
		setLayout(null); // ��ġ
		//border.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		//border.setSize(200,300);
		// border.setBounds(10, 20, 1280, 900);
		pan.setLayout(new GridLayout(3,6,5,5)); // �׸��� ���̾ƿ��� ũ�Ⱑ �Ȱ��� ������ �ٶ� ����Ѵ� 4�� 5ĭ ������ 8�� �ǹ��Ѵ� �̸��̾�!
		pan.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		try {
			FripData(1);
			imagePrint();

		} catch (Exception ex) {
		}
		pan.setBounds(0,0, 1900, 830);
		add(pan);
	}
	//�̹��� �����ö� ������ �������ִ� �޼ҵ�
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
	void imagePrint() throws Exception {
		// TODO Auto-generated method stub
		// 07.10 �׵θ� ����
		//pan.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		// pan.removeAll();
		for (int i = 0; i < 18; i++) {

			if (Idus_form_data[i].Top_image != null) {
				System.out.print("9�� ��� " + i);
				// URL url = new URL(in.Top_image.getText());
				URL URL_url = new URL(Idus_form_data[i].Top_image); // ������Ʈ���� �ּ� �о���� �Լ�
				System.out.println("image_list"+URL_url);
				Idus_form[i].Top_image.setIcon(new ImageIcon(getImage(new ImageIcon(URL_url),230,250)));
				//Idus_form[i].Top_image.setIcon(new ImageIcon(URL_url));
				Idus_form[i].center_content.setText(Idus_form_data[i].center_content);
				Idus_form[i].Image_Explain.setText(Idus_form_data[i].Image_Explain);
				pan.add(Idus_form[i]);
			}
		}
		// pan.validate(); 07/17 ���� �Լ������𸣰���
	}
	void FripData(int no) throws Exception {
		String url = "";

		switch (no) {
		case 1:
			url = "https://www.idus.com";
			break;
		case 2:
			url = "https://www.idus.com/w/main/liver-order-product";
			break;
		case 3:
			url = "https://www.idus.com/";
			break;
		case 4:
			url = "https://www.idus.com/";
			break;
		case 5:
			url = "https://www.idus.com/";
			break;
		}
		// Elements �κп��� ����Ʈ�� �ִ� �׸� �ּҰ��� �����ؾ���
		Document doc = Jsoup.connect(url).get(); // ����Ʈ�� ���� �о�´�
		Elements image = doc.select("div.ui_card__imgcover a"); // ���� �������µ� style �κ��� ���λ��� ����� �𸣰���..

		// ***** �׸��ؿ� �ణ ������ �۾�
		Element link = doc.select("div.ui_card__info a").first();
		
		// ***** center_context�������� �κ�
		String center_context = image.attr("aria-label");
		// System.out.println("image.attr :"+image.attr("style"));
		for (int i = 0; i < 18; i++) {
			Idus_form[i] = new Idus_������_��������();
			Idus_form_data[i] = new Idus_������_��������_������();
			/*
			 * .attr("style").toString().substring(23, 98); �̺κп��� style�� �Ӽ����� �����������ؼ�
			 * attr("style") �� style�Ӽ� ���ȿ��� url�ּҰ��� �����������ؼ� substring !!
			 * 
			 */
	/*
			String temp = image.get(i).attr("style").toString().substring(23, 98);
			System.out.println("temp �� ��" + temp);
			Idus_form_data[i].Top_image = temp;
			
			
			Element link3 = doc.select("div.ui_card__info a").get(count++);
			Idus_form_data[i].Image_Explain = link3.text();
			link3 = doc.select("div.ui_card__info a").get(count++);
			Idus_form_data[i].center_content =link3.text();

			// Idus_form[i].Star
			// Idus_form[i].subtitle

			
			/// ���������ºκ�
			Element link4 = doc.select("div.ui_card__info a").get(0);
			System.out.println(" !!!! "+link4.text());
			Document doc32 = Jsoup.connect("https://www.idus.com/search?word="+link4.text()).get();
			//System.out.println(doc32);
			// ����� 1���̹Ƿ� Elements ���ƴ� Element�� �����������
			Element title = doc32.selectFirst("div.product-info__price span.price-sale");
			System.out.println("��������?"+title.text());

		}
	}
	public static Idus_Detail_VO[] Idus_Detail_Data() {
		Idus_Detail_VO[] Detail = new Idus_Detail_VO[20];
		try {
//			Document doc = Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
//			//doc.select("ã�Ƽ� ������ �±׺κ��� ���� �ִ´�);
//			Elements title = doc.select("span.title h3"); // 10����
//			Elements score = doc.select("strong.point span");
//			Elements address=doc.select("p.etc"); 			
//			Elements poster= doc.select("img.center-croping");
//			Elements review= doc.select("p.short_review");
			Document doc = Jsoup.connect("https://www.idus.com/").get();
			Elements link = doc.select("div.ui_card__imgcover a");
			int j=0;
			Document doc2 = Jsoup.connect("http://www.cgv.co.kr" + link.get(j).attr("href")).get();
			Jsoup.connect(" https://www.idus.com/"+link.get(j).attr("href")).get();
		}catch (Exception e) {}
	
		return Detail;
	}
	*/
	public static void main(String[] args) {
		Project_Main a = new Project_Main();
		Idus_������_��������_������[] Data = a.Idius_Main_Form_Data();
		
	}
}
