// 각 달의 마지막 날짜 출력
// 6 => 30  7 => 31
/*
 *  1-31, 2-28, 3-31, 4-30. 5-31, 6-30
 *  7-31, 8-31, 9-30, 10-31, 11-30, 12-31
 *  
 *  => 28, 30, 31
 */

import java.util.*;
public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자의 입력값을 받는다
		Scanner scan = new Scanner(System.in);
		/*
		 * 정수 ==> nextInt()
		 * 문자열=> next(), nextLine()
		 * 실수 ==> nextDouble()
		 * 논리 ==> nextBoolean()
		 * 
		 */
		
	
		int month=0;
		System.out.println("원하는 월을 입력(1~12)");
		// 메모리에 저장
		month = scan.nextInt();
		/*
		if(month==1) {
			System.out.println("1월은 31일까지 있습니다.");
		}
		else if(month==2) {
			System.out.println("2월은 28일까지 있습니다.");
		}
		else if(month==3) {
			System.out.println("3월은 31일까지 있습니다.");
		}
		else if(month==4) {
			System.out.println("4월은 30일까지 있습니다.");
		}
		else if(month==5) {
			System.out.println("5월은 31일까지 있습니다.");
		}
		else if(month==6) {
			System.out.println("6월은 30일까지 있습니다.");
		}
		else if(month==7) {
			System.out.println("7월은 31일까지 있습니다.");
		}
		else if(month==8) {
			System.out.println("8월은 31일까지 있습니다.");
		}
		else if(month==9) {
			System.out.println("9월은 31일까지 있습니다.");
		}
		else if(month==10) {
			System.out.println("10월은 31일까지 있습니다.");
		}
		else if(month==11) {
			System.out.println("11월은 31일까지 있습니다.");
		}
		else if(month==12) {
			System.out.println("12월은 31일까지 있습니다.");
		}
			=>최적화,가독성이 필요함
					======== 유지보수
					==> 소스코딩 적다
		*/	
		if(month==4 ||month==6 ||month==9 ||month==11 )
		{ 
			System.out.println(month+"월은 30일 까지 있습니다");	
		}
		else if(month == 2) {
			System.out.println(month+"월은 28일 까지 있습니다");		
		}
		else  {
			System.out.println(month+"월은 31일까지 있습니다.");
		}
		
	}
}
