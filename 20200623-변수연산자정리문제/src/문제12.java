/*
 *  ���� ����
 *  ==> ����ó��
 *  ==> ó�� ��� ���
 *  
 * 
 */

import java.util.Scanner;

public class ����12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12��) ����ڷκ��� �ΰ��� ������ �Է� �޾Ƽ� ������ ������ ������ ����� ����ϴ� ���α׷��� �ۼ�
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("�ΰ��� ������ �Է� ���ּ��� ������ ������ ���� ����� ����մϴ�."); int a =
		 * scan.nextInt(); int b = scan.nextInt();
		 * 
		 * System.out.printf("���� ��� %d",a-b); System.out.printf("���� ��� %d",a*b);
		 * System.out.println("\n");
		 */
		
		
		
		//***�������  Ǯ���ֽ� ���***
		
		//���� ���� => �޸� ������
		int a=0,b=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("�ΰ��� ����");
		
		//����ڰ� �Է��� ���� ������ ����
		a=scan.nextInt();
		b=scan.nextInt();
		
		//���
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b); // <- 14������ 
		//����ڰ� �Է��� 
	}

}
