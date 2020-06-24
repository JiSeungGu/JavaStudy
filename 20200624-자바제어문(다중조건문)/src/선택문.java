/*
 * 	선택문
 * 	=> switch(정수, 문자, 문자열)
 * 	  { 
 * 		case 정수값:
 * 			//처리문장
 * 			==> if(조건){처리}
 * 		case 정수값:
 * 			//처리문장
 * 			==> else if(조건){처리}
 * 		}
 * 		===에러나는 switch문의 유형====
 * 		switch(a)
 * 		{
 * 			case 1:
 * 				== 라벨 (중복이 없다)
 * 			case 1: ==> error
 * 		}
 *      =========================
 *		switch(a)
 * 		{
 * 			case 1:
 * 				처리문장 1
 * 			case 2: 
 * 				처리문장 2
 * 				break; <- 하나씩 수행하고 종료하는거면 break를 각 문항(case)마다 주어야한다.
 * 							//break를 주지 않으면 case1만 수행 하더라도 마지막 case 5~9까지 수행을 한다~ 이 말이야!
 * 			case 3:
 * 				처리문장 3
 * 		}
 */
import java.util.*;
public class 선택문 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("정수(1~5) :");
		select= scan.nextInt();
		switch (select) 
		{
		case 1:	
		{
			System.out.println("1번을 입력하였습니다");
			break; //switch문 종료한다.
		}
		case 2:	
		{
			System.out.println("2번을 입력하였습니다");
			break; //switch문 종료한다.
		}
		case 3:	
		{
			System.out.println("3번을 입력하였습니다");
			break; //switch문 종료한다.
		}
		case 4:	
		{
			System.out.println("4번을 입력하였습니다");
			break; //switch문 종료한다.
		}
		case 5:	
		{
			System.out.println("5번을 입력하였습니다");
			break; //switch문 종료한다.
		}
		default:
		{
			System.out.println("번외 '값'을 입력하셨습니다 ");
		}
	
		}
		
	}
}

