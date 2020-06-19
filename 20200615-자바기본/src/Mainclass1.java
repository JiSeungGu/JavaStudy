/*
 * 채제원
 * 이메일: vcandjava@nate.com
 * 전화번호 010 9146 2849
 */
class A{
	
}
public class Mainclass1 {
	//main 항시 필요
	public static void main(String[] args) {
		//자바에서 표현 하는 방법
		/*
		 * 정수 
		 * 	  = 10진법 10,20,30
		 *    =  8진법
		 *    = 16진법
		 *    =  2진법
		 * 실수
		 *    = 저장크기 => 4byte 10.5f 
		 *    = 저장크기 => 8byte 10.5
		 * 문자
		 *    = ' ' 한글자
		 * 문자열 
		 *    = "  " 여러글자 
		 *    
		 * ASC (c) ======> 1byte
		 * Unicode (자바)=> 2byte
		 * 
		 * UTF - 8 
		 */
		
		System.out.println('헿');
		System.out.println("Hellow Java");
		System.out.println(10.5);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		//10진법으로 프로그램 짜는방향으로
		System.out.println(10); //명령프롬프트에 10을 출력하라는 명령문
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		/*
		 *  1.기본 문법 
		 *  =========
		 *   => 대소문자 구분
		 *   	=> 라이브러리(클래스: 대문자 시작, 메소드 : 소문자 시작, 상수: 모두 대문자)
		 *   	변수 / 상수
		 *   	상수 = 바뀌지 않는값
		 *   	변수 = 원하는대로 변경가능
		 *   
		 *   	int kor = 100;
		 *  	final이 붙으면 상수!
		 *   	final int KOR =200;
		 *   => 명령문이 끝나면 반드시 세미콜론을 사용한다.
		 *   
		 *   3. 들여쓰기
		 */
	}
}
