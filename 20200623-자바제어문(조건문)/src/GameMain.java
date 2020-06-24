import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//윈도우만 존재
//KeyListener 란 키보드를 눌렀을 때 처리해주는 기능
public class GameMain extends JFrame implements KeyListener{
	GameView gv= new GameView();
	public GameMain() {
		add("Center",gv);
		setSize(1024,768);
		setVisible(true);
		
		addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMain gm = new GameMain();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	//키버튼 눌렀을때 처리하는 메소드 부분 
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this) {
			if(e.getKeyCode() == KeyEvent.VK_UP) {
				gv.y-=5;
				if(gv.y<0) {
					gv.y=768;
				}
			}
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				gv.y+=5;
				if(gv.y>768) {
					gv.y=0;
				}				
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				gv.x-=5;
				if(gv.x<0)
				gv.x=1024;
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				gv.x+=5;
				if(gv.x>1024)
				gv.x=0;				
			}
			gv.repaint();
			
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
