/*
 *  ����� => �����Է�(1~12)
 *  12,1,2 => �ܿ��Դϴ�.
 *  3,4,5 => ���Դϴ�.
 *  
 *  6,7,8 => �����Դϴ�.
 *  9,10,11 => �����Դϴ�.
 * 	================
 * 
 * 	���ڸ� �Է� �� �޾Ƽ� char ch
 * 		= ����     ch>='0' && ch <= '9'
 * 		= ���ĺ� ch >= 'A' && ch <= 'Z'
 * 		= �ѱ� ch >='��' && ch <= '�R'
 * 		= Ư������ 
 * 
 */
import java.util.*;
public class �������ǹ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����� �Է��� �ޱ� ���� Ŭ���� ��ü ����
		Scanner scan = new Scanner(System.in);
		//'��'�� ���� ���� ����
		/*
		int a = 0;
		System.out.print("���� �Է��� �ּ��� ");
		a= scan.nextInt();
		if (a== 12||a== 1|| a== 2) {
			System.out.println(a+"������ �ܿ� �Դϴ�.");
		}
		else if (a== 3||a== 4|| a== 5) {
			System.out.println(a+"������ �� �Դϴ�.");
		}
		else if (a== 6||a== 7|| a== 8) {
			System.out.println(a+"������ ���� �Դϴ�.");
		}
		else if (a==9||a==10||a==11){
			System.out.println(a+"������ ���� �Դϴ�.");
		}
		else {
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
		}
		*/
		//2�� ����
		System.out.println(" ���ڸ� �Է��� �ּ��� ");
		char ch =scan.next().charAt(0);
		
		if (ch>='0' && ch <='9') {
			System.out.println("���� �Դϴ�.");
		}
		else if (ch>='A' && ch <='Z'|| ch>='a' && ch <='z') {
			System.out.println("���ĺ� �Դϴ�.");
		}
		else if (ch>='��' && ch <='�R') {
			System.out.println("�ѱ� �Դϴ�.");
		}
		else {
			System.out.println("Ư�� ���� �Դϴ�.");
		}
	}
}
