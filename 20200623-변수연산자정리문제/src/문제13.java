/*
 * ���� ==> �Ѱ��� �����͸� ����
 * 			����, �Ǽ�, ����, True/False
 * 			==> �޸� ũ�� ����
 * 			    ==========
 * 					�ڹٿ��� �޸� ũ�⸦ ���� ==> �⺻��
 * 				==> ��������(�ڷ���)
 * 					�Ǽ� : double(8byte)float(4byte)
 * 						========================== f(F)
 * 						default : double
 * 					���� : byte(1byte), short(2byte), int(4byte), long(8byte)
 * 						
 * 					20000000000L (���� �Ѿ�� ���ڴ� L�ٿ� long���� ��Ÿ���ش�)
 * 				
 * 					���� : char(2byte) -0~65535 => Unicode(��� �� �� ����� �� �ֵ���)
 * 												 ASKII ( ���� ���� ǥ��)
 * 
 * 					�� : boolean(1byte) => true/false
 * 
 * 
 */
import java.util.Scanner;
public class ����13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//***������� Ǯ���ֽ� ���***
		/*
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("������ ���� �Է�:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		System.out.println(a*b+c);
		*/
		
		//***������� Ǯ���ֽ� ��� 15������***
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("(10~99):89>");
		a=scan.nextInt();
		if(a%11==0) {
			System.out.println("10�ڸ��� 1�ڸ��� ����.");
		}
		else {
			System.out.println("10�ڸ��� 1�ڸ��� �ٸ���");
		}
	}
}
