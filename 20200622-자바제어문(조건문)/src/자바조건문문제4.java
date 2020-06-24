/*
 *  두개의 정수를 받아서
 *  최대값,최소값을 출력하는 프로그램 
 *  
 */
import java.util.*;
public class 자바조건문문제4 {
	public static void main(String[] args) {
		int Max,Min = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("두개의 정수를 입력하세요 : ");
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
		System.out.println("최 대 값 은"+Max+"입니다.");
		System.out.println("최 소 값 은"+Min+"입니다.");
		
		// 정수를 입력 받아서 절대값을 출력하는 프로그램 
		// 1, -1 ==> 1 
		System.out.print("정수를 입력하세요 절대값으로 표현됩니다. : ");
		int i = scan.nextInt();
		
		if ( i < 0) {
			i = i*(-1);
		}
		System.out.println("i 값:"+i);

	}
}
