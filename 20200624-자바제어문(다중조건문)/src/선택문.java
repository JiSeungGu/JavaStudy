/*
 * 	���ù�
 * 	=> switch(����, ����, ���ڿ�)
 * 	  { 
 * 		case ������:
 * 			//ó������
 * 			==> if(����){ó��}
 * 		case ������:
 * 			//ó������
 * 			==> else if(����){ó��}
 * 		}
 * 		===�������� switch���� ����====
 * 		switch(a)
 * 		{
 * 			case 1:
 * 				== �� (�ߺ��� ����)
 * 			case 1: ==> error
 * 		}
 *      =========================
 *		switch(a)
 * 		{
 * 			case 1:
 * 				ó������ 1
 * 			case 2: 
 * 				ó������ 2
 * 				break; <- �ϳ��� �����ϰ� �����ϴ°Ÿ� break�� �� ����(case)���� �־���Ѵ�.
 * 							//break�� ���� ������ case1�� ���� �ϴ��� ������ case 5~9���� ������ �Ѵ�~ �� ���̾�!
 * 			case 3:
 * 				ó������ 3
 * 		}
 */
import java.util.*;
public class ���ù� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("����(1~5) :");
		select= scan.nextInt();
		switch (select) 
		{
		case 1:	
		{
			System.out.println("1���� �Է��Ͽ����ϴ�");
			break; //switch�� �����Ѵ�.
		}
		case 2:	
		{
			System.out.println("2���� �Է��Ͽ����ϴ�");
			break; //switch�� �����Ѵ�.
		}
		case 3:	
		{
			System.out.println("3���� �Է��Ͽ����ϴ�");
			break; //switch�� �����Ѵ�.
		}
		case 4:	
		{
			System.out.println("4���� �Է��Ͽ����ϴ�");
			break; //switch�� �����Ѵ�.
		}
		case 5:	
		{
			System.out.println("5���� �Է��Ͽ����ϴ�");
			break; //switch�� �����Ѵ�.
		}
		default:
		{
			System.out.println("���� '��'�� �Է��ϼ̽��ϴ� ");
		}
	
		}
		
	}
}

