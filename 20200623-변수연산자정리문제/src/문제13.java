/*
 * 변수 ==> 한개의 데이터만 저장
 * 			정수, 실수, 문자, True/False
 * 			==> 메모리 크기 설정
 * 			    ==========
 * 					자바에서 메모리 크기를 지원 ==> 기본형
 * 				==> 데이터형(자료형)
 * 					실수 : double(8byte)float(4byte)
 * 						========================== f(F)
 * 						default : double
 * 					정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
 * 						
 * 					20000000000L (수가 넘어가는 숫자는 L붙여 long형을 나타내준다)
 * 				
 * 					문자 : char(2byte) -0~65535 => Unicode(모든 언어를 다 사용할 수 있도록)
 * 												 ASKII ( 영문 숫자 표현)
 * 
 * 					논리 : boolean(1byte) => true/false
 * 
 * 
 */
import java.util.Scanner;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//***강사님이 풀어주신 방법***
		/*
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		System.out.print("세개의 정수 입력:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		System.out.println(a*b+c);
		*/
		
		//***강사님이 풀어주신 방법 15번문제***
		int a;
		Scanner scan = new Scanner(System.in);
		System.out.println("(10~99):89>");
		a=scan.nextInt();
		if(a%11==0) {
			System.out.println("10자리와 1자리가 같다.");
		}
		else {
			System.out.println("10자리와 1자리가 다르다");
		}
	}
}
