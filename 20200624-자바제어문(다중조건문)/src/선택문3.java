
//3���� ������ �Է¹޾Ƽ� => ���� ��� (switch case ������)
/* 
 * 
 *
 */
import java.util.*;
public class ���ù�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���α׷��� �ʿ��� ���� �Է� 
		int kor,eng,math;
		char score='A';
		
		//����ڿ��� ������ �ޱ����� ��ĳ�� ����
		Scanner scan = new Scanner(System.in);
		//�Է�
		System.out.print("���� 3���� �Է��ϼ��� (90 90 90)? :");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		//������� ��� => ���� (������+���)
		//�޼ҵ� ==> �����͸� ���� 
		switch((kor+eng+math)/30) {
		case 10:
		case 9:{
			score='A';
			break;
		}
		case 8:{
			score ='B';
			break;
		}
		case 7:{
			score ='C';
			break;
		}
		case 6:{
			score ='D';
			break;
		}
		default:{
			score = 'F';
			break;
		}
		}
		System.out.println("=====���=====");
		System.out.println("���� :");
		
	}
}
