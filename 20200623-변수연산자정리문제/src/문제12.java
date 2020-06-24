/*
 *  변수 선언
 *  ==> 연산처리
 *  ==> 처리 결과 출력
 *  
 * 
 */

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12번) 사용자로부터 두개의 정수를 입력 받아서 뺄셈과 곱셈의 연산의 결과를 출력하는 프로그램을 작성
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * System.out.print("두개의 정수를 입력 해주세요 뺄셈과 곱셈의 연산 결과를 출력합니다."); int a =
		 * scan.nextInt(); int b = scan.nextInt();
		 * 
		 * System.out.printf("뺄셈 결과 %d",a-b); System.out.printf("곱셈 결과 %d",a*b);
		 * System.out.println("\n");
		 */
		
		
		
		//***강사님이  풀어주신 방법***
		
		//변수 선언 => 메모리 기억공간
		int a=0,b=0;
		Scanner scan = new Scanner(System.in);
		System.out.print("두개의 정수");
		
		//사용자가 입력한 값을 변수에 대입
		a=scan.nextInt();
		b=scan.nextInt();
		
		//출력
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a%b); // <- 14번문제 
		//사용자가 입력한 
	}

}
