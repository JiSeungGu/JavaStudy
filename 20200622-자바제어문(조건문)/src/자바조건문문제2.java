/*
 * 
 * 
 */

import java.util.Scanner;
public class �ڹ����ǹ�����2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�������� : ");
		int a = scan.nextInt();
		System.out.print("�������� : ");
		int b = scan.nextInt();
		System.out.print("�������� : ");
		int c = scan.nextInt();
		int f = a+b+c;
		double g = f/3;
		System.out.println("���� : "+f);
		System.out.println("��� : "+g);
		
		if(g >=90) {
			System.out.println("���� : A ");
		}if(g >=80 && g<90) {
			System.out.println("���� : B ");
		}if(g >=70 && g<80) {
			System.out.println("���� : C ");
		}if(g >=60 && g<70) {
			System.out.println("���� : D ");
		}if(g <60){
			System.out.println("���� : F");
		}
	}
}
