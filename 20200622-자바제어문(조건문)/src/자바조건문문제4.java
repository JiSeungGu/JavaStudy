/*
 *  �ΰ��� ������ �޾Ƽ�
 *  �ִ밪,�ּҰ��� ����ϴ� ���α׷� 
 *  
 */
import java.util.*;
public class �ڹ����ǹ�����4 {
	public static void main(String[] args) {
		int Max,Min = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("�ΰ��� ������ �Է��ϼ��� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if ( a > b ) {
			Max = a;
			Min = b;
		}
		else{
			Max = b;
			Min = a;
		}
		System.out.println("�� �� �� ��"+Max+"�Դϴ�.");
		System.out.println("�� �� �� ��"+Min+"�Դϴ�.");
		
		// ������ �Է� �޾Ƽ� ���밪�� ����ϴ� ���α׷� 
		// 1, -1 ==> 1 
		System.out.print("������ �Է��ϼ��� ���밪���� ǥ���˴ϴ�. : ");
		int i = scan.nextInt();
		
		if ( i < 0) {
			i = i*(-1);
		}
		System.out.println("i ��:"+i);

	}
}
