import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel {
	Image back,air;
	int x=15,y=15;
	public GameView() 
	{
		//�̹����� ������ �´�.
		back = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.png");
		air = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\air.jpg");
	}
	//�̹��� ��� 
	public void paint(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(air,x,y,80,50,this);
	}
}
