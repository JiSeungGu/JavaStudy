// �� ���� ������ ��¥ ���
// 6 => 30  7 => 31
/*
 *  1-31, 2-28, 3-31, 4-30. 5-31, 6-30
 *  7-31, 8-31, 9-30, 10-31, 11-30, 12-31
 *  
 *  => 28, 30, 31
 */

import java.util.*;
public class �������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������� �Է°��� �޴´�
		Scanner scan = new Scanner(System.in);
		/*
		 * ���� ==> nextInt()
		 * ���ڿ�=> next(), nextLine()
		 * �Ǽ� ==> nextDouble()
		 * �� ==> nextBoolean()
		 * 
		 */
		
	
		int month=0;
		System.out.println("���ϴ� ���� �Է�(1~12)");
		// �޸𸮿� ����
		month = scan.nextInt();
		/*
		if(month==1) {
			System.out.println("1���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==2) {
			System.out.println("2���� 28�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==3) {
			System.out.println("3���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==4) {
			System.out.println("4���� 30�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==5) {
			System.out.println("5���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==6) {
			System.out.println("6���� 30�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==7) {
			System.out.println("7���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==8) {
			System.out.println("8���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==9) {
			System.out.println("9���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==10) {
			System.out.println("10���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==11) {
			System.out.println("11���� 31�ϱ��� �ֽ��ϴ�.");
		}
		else if(month==12) {
			System.out.println("12���� 31�ϱ��� �ֽ��ϴ�.");
		}
			=>����ȭ,�������� �ʿ���
					======== ��������
					==> �ҽ��ڵ� ����
		*/	
		if(month==4 ||month==6 ||month==9 ||month==11 )
		{ 
			System.out.println(month+"���� 30�� ���� �ֽ��ϴ�");	
		}
		else if(month == 2) {
			System.out.println(month+"���� 28�� ���� �ֽ��ϴ�");		
		}
		else  {
			System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�.");
		}
		
	}
}
