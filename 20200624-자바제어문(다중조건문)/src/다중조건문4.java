/*
 *  사용자 => 정수입력(1~12)
 *  12,1,2 => 겨울입니다.
 *  3,4,5 => 봄입니다.
 *  
 *  6,7,8 => 여름입니다.
 *  9,10,11 => 가을입니다.
 * 	================
 * 
 * 	문자를 입력 을 받아서 char ch
 * 		= 숫자     ch>='0' && ch <= '9'
 * 		= 알파벳 ch >= 'A' && ch <= 'Z'
 * 		= 한글 ch >='가' && ch <= '힣'
 * 		= 특수문자 
 * 
 */
import java.util.*;
public class 다중조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//사용자 입력을 받기 위한 클래스 객체 선언
		Scanner scan = new Scanner(System.in);
		//'월'을 받을 변수 생성
		/*
		int a = 0;
		System.out.print("월을 입력해 주세요 ");
		a= scan.nextInt();
		if (a== 12||a== 1|| a== 2) {
			System.out.println(a+"월달은 겨울 입니다.");
		}
		else if (a== 3||a== 4|| a== 5) {
			System.out.println(a+"월달은 봄 입니다.");
		}
		else if (a== 6||a== 7|| a== 8) {
			System.out.println(a+"월달은 여름 입니다.");
		}
		else if (a==9||a==10||a==11){
			System.out.println(a+"월달은 가을 입니다.");
		}
		else {
			System.out.println("잘못된 달을 입력하셨습니다.");
		}
		*/
		//2번 문제
		System.out.println(" 문자를 입력해 주세요 ");
		char ch =scan.next().charAt(0);
		
		if (ch>='0' && ch <='9') {
			System.out.println("숫자 입니다.");
		}
		else if (ch>='A' && ch <='Z'|| ch>='a' && ch <='z') {
			System.out.println("알파벳 입니다.");
		}
		else if (ch>='가' && ch <='힣') {
			System.out.println("한글 입니다.");
		}
		else {
			System.out.println("특수 문자 입니다.");
		}
	}
}
