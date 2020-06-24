/*
 * 
 * 
 */

import java.util.Scanner;
public class 자바조건문문제2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int a = scan.nextInt();
		System.out.print("영어점수 : ");
		int b = scan.nextInt();
		System.out.print("수학점수 : ");
		int c = scan.nextInt();
		int f = a+b+c;
		double g = f/3;
		System.out.println("총점 : "+f);
		System.out.println("평균 : "+g);
		
		if(g >=90) {
			System.out.println("학점 : A ");
		}if(g >=80 && g<90) {
			System.out.println("학점 : B ");
		}if(g >=70 && g<80) {
			System.out.println("학점 : C ");
		}if(g >=60 && g<70) {
			System.out.println("학점 : D ");
		}if(g <60){
			System.out.println("학점 : F");
		}
	}
}
