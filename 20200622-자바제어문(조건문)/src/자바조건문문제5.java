/*
 *	char변수 선언 ==> 값을 대입
 *	
 *	=> char alpha = 'A';
 *	=> alpha 가 대문자면 => 소문자로 출력 
 *	=> alpha 가 소문자면 => 대문자로 출력
 * 
 * 	1.제어문 
 * 		연산자(비교연산자,논리연산자,부정연산자)
 * 			=비교연산자
 * 				같다: ==
 * 			  같지 않다: !=
 * 				작다: >
 * 				크다: <
 * 		        작거나 같다: >=
 *		        크거나 같다: <=
 *                        ===> 출력값은 True/False 
 * 			=논리연산자 
 * 				조건 && 조건 ==> 조건이 둘다 true 일때 true
 * 				&& : 포함 (기간, 범위)
 * 				조건 || 조건 ==> 조건중 한개이상이 true일때 true
 * 				|| : 미포함
 * 			=부정연산자 : 반대 ==> !
 * 		단독처리 => 산술연산자, 증감연산자, 대입연산자
 * 				 ========================
 * 				 응용 => 제어문
 */
public class 자바조건문문제5 {
	public static void main(String[] args) {
		char alpha= 'H';
		char b= 'i';
		System.out.println(""+alpha);
		System.out.println(""+b);
		
		if(alpha >= 'A' && alpha <='Z') {
			alpha += 32;
			System.out.println("대문자에서 소문자로 "+alpha);
		}
		if(b >= 'a' && b <='z') {
			b -= 32;
			System.out.println("소문자에서 대문자로 "+b);
		}
	}
}
