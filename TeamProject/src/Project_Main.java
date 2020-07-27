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
import com.sist.data.Idus_메인폼_사진형태_데이터;

import java.awt.event.*;
import java.net.*;

public class Project_Main {
	// ******** GridLayout 을 만들기 위한 각 속성 배치
	public int count = 0;
	//JPanel border = new JPanel();
	
	//****** 여기서부터 코드 뒤집기 시작하는 부분
	public Idus_메인폼_사진형태_데이터[] Idius_Main_Form_Data() {
		Idus_메인폼_사진형태_데이터[] Data = new Idus_메인폼_사진형태_데이터[18];
		try {
			Document doc = Jsoup.connect("https://www.idus.com").get();
			//doc.select("찾아서 가져올 태그부분의 값을 넣는다);
			Elements image = doc.select("div.ui_card__imgcover a");  // 10개씩
			Elements star_value = doc.select("div.ui_card__vcenter div.ui_rating");
			Elements review = doc.select("span.ui_card__comment");
			
			System.out.println("/?");
			for(int i=0;i<18;i++)
			{
				Data[i] = new Idus_메인폼_사진형태_데이터();
			
				
				//이미지 넣는 부분
				String temp = image.get(i).attr("style").substring(23, 98);
				Data[i].setTop_image(temp);
				System.out.println("!");
				System.out.println("temp 의 값" + temp);
			
				//이미지 소제목
				Element title = doc.select("div.ui_card__info a").get(count++);
				Data[i].setImage_Explain(title.text());
				
				//이미지 제목
				title = doc.select("div.ui_card__info a").get(count++);
				Data[i].setCenter_content(title.text());
				
				//별점 넣는 부분
				String value = star_value.get(i).attr("data-value");
				Data[i].setStar(value);

				//리뷰 넣는 부분
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
		
		setLayout(null); // 배치
		//border.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		//border.setSize(200,300);
		// border.setBounds(10, 20, 1280, 900);
		pan.setLayout(new GridLayout(3,6,5,5)); // 그리드 레이아웃은 크기가 똑같이 균형을 줄때 사용한다 4줄 5칸 간격은 8을 의미한다 이말이야!
		pan.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		try {
			FripData(1);
			imagePrint();

		} catch (Exception ex) {
		}
		pan.setBounds(0,0, 1900, 830);
		add(pan);
	}
	//이미지 가져올때 사이즈 결정해주는 메소드
	Image getImage(ImageIcon ii,int w,int h)
    {
    	Image dimg = ii.getImage().getScaledInstance(w, h,
    	        Image.SCALE_SMOOTH);
    	return dimg;
    }
	
	void imagePrint() throws Exception {
		// TODO Auto-generated method stub
		// 07.10 테두리 설정
		//pan.setBorder(new TitledBorder(new LineBorder(Color.black,4)));
		// pan.removeAll();
		for (int i = 0; i < 18; i++) {

			if (Idus_form_data[i].Top_image != null) {
				System.out.print("9번 출력 " + i);
				// URL url = new URL(in.Top_image.getText());
				URL URL_url = new URL(Idus_form_data[i].Top_image); // 웹사이트에서 주소 읽어오는 함수
				System.out.println("image_list"+URL_url);
				Idus_form[i].Top_image.setIcon(new ImageIcon(getImage(new ImageIcon(URL_url),230,250)));
				//Idus_form[i].Top_image.setIcon(new ImageIcon(URL_url));
				Idus_form[i].center_content.setText(Idus_form_data[i].center_content);
				Idus_form[i].Image_Explain.setText(Idus_form_data[i].Image_Explain);
				pan.add(Idus_form[i]);
			}
		}
		// pan.validate(); 07/17 무슨 함수인지모르겟음
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
		// Elements 부분에서 사이트에 있는 그림 주소값을 수정해야함
		Document doc = Jsoup.connect(url).get(); // 사이트를 전부 읽어온다
		Elements image = doc.select("div.ui_card__imgcover a"); // 값을 가져오는데 style 부분을 따로빼는 방법을 모르겠음..

		// ***** 그림밑에 약간 투명한 글씨
		Element link = doc.select("div.ui_card__info a").first();
		
		// ***** center_context가져오는 부분
		String center_context = image.attr("aria-label");
		// System.out.println("image.attr :"+image.attr("style"));
		for (int i = 0; i < 18; i++) {
			Idus_form[i] = new Idus_메인폼_사진형태();
			Idus_form_data[i] = new Idus_메인폼_사진형태_데이터();
			/*
			 * .attr("style").toString().substring(23, 98); 이부분에서 style의 속성값을 가져오기위해서
			 * attr("style") 또 style속성 값안에서 url주소값을 가져오기위해서 substring !!
			 * 
			 */
	/*
			String temp = image.get(i).attr("style").toString().substring(23, 98);
			System.out.println("temp 의 값" + temp);
			Idus_form_data[i].Top_image = temp;
			
			
			Element link3 = doc.select("div.ui_card__info a").get(count++);
			Idus_form_data[i].Image_Explain = link3.text();
			link3 = doc.select("div.ui_card__info a").get(count++);
			Idus_form_data[i].center_content =link3.text();

			// Idus_form[i].Star
			// Idus_form[i].subtitle

			
			/// 돈가져오는부분
			Element link4 = doc.select("div.ui_card__info a").get(0);
			System.out.println(" !!!! "+link4.text());
			Document doc32 = Jsoup.connect("https://www.idus.com/search?word="+link4.text()).get();
			//System.out.println(doc32);
			// 목록이 1개이므로 Elements 가아닌 Element로 변수를만든다
			Element title = doc32.selectFirst("div.product-info__price span.price-sale");
			System.out.println("나오려나?"+title.text());

		}
	}
	public static Idus_Detail_VO[] Idus_Detail_Data() {
		Idus_Detail_VO[] Detail = new Idus_Detail_VO[20];
		try {
//			Document doc = Jsoup.connect("https://www.mangoplate.com/top_lists/1965_hotel_bingsu").get();
//			//doc.select("찾아서 가져올 태그부분의 값을 넣는다);
//			Elements title = doc.select("span.title h3"); // 10개씩
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
		Idus_메인폼_사진형태_데이터[] Data = a.Idius_Main_Form_Data();
		
	}
}
