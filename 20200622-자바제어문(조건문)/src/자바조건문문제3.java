/*
 *	����� �Է� ==> 0,1,2 �� 
 *	
 *	=> 0�̸� => ����
 *
 *	=> 1�̸� => ����
 *
 *	=> 2��   => �� 
 *
 */
import java.util.*;
public class �ڹ����ǹ�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("0~2������ ���� �Է��ϼ���  ex)0:����, 1:����, 2:��            :");
		int user = scan.nextInt();
		int computer = (int)(Math.random()*3);
		
		if (user == 0 ) {
			System.out.println("Player : ���� ");
		}
		if (user == 1) {
			System.out.println("Player : ����");
		}
		if (user == 2) {
			System.out.println("Player :  ��");
		}
		if (user != 0 && user != 1 && user !=2 ) {
			System.out.println("0~2������ ���� �Է��ϼ��� ");
		}
		//��ǻ��
		if (computer == 0 ) {
			System.out.println("��ǻ�� : ���� ");
		}
		if (computer == 1) {
			System.out.println("��ǻ�� : ����");
		}
		if (computer == 2) {
			System.out.println("��ǻ��  : ��");
		}
		
		if (user == computer ) {
			System.out.println(" �����ϴ�.");
		}
		
		if(computer ==1)
		{
			if(user == 0) {
				System.out.println("computer��  �̰���ϴ�.");
			}
			if(user == 2) {
				System.out.println("Player�� �̰���ϴ�.");
			}
		}
		if(computer ==0)
		{
			if(user == 2) {
				System.out.println("computer��  �̰���ϴ�.");
			}
			if(user == 1) {
				System.out.println("Player�� �̰���ϴ�.");
			}
		}
		if(computer ==2)
		{
			if(user == 1) {
				System.out.println("computer��  �̰���ϴ�.");
			}
			if(user == 0) {
				System.out.println("Player�� �̰���ϴ�.");
			}
		}
		//���ڿ���==���� �񱳰� �Ұ����ϰ� equals �� ���Ѵ�.
	if (computer == user ) {
		System.out.println("�����ϴ�");
	}
	if(computer-user == -2 || computer-user ==2) {
		System.out.println("Player Win!!");
	}
	if(computer-user == -1 || computer-user ==2) {
		System.out.println("Player Win!!");
	}
	
	}
}
