/*
 *	사용자 입력 ==> 0,1,2 번 
 *	
 *	=> 0이면 => 가위
 *
 *	=> 1이면 => 바위
 *
 *	=> 2면   => 보 
 *
 */
import java.util.*;
public class 자바조건문문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("0~2사이의 수를 입력하세요  ex)0:가위, 1:바위, 2:보            :");
		int user = scan.nextInt();
		int computer = (int)(Math.random()*3);
		
		if (user == 0 ) {
			System.out.println("Player : 가위 ");
		}
		if (user == 1) {
			System.out.println("Player : 바위");
		}
		if (user == 2) {
			System.out.println("Player :  보");
		}
		if (user != 0 && user != 1 && user !=2 ) {
			System.out.println("0~2사이의 수를 입력하세요 ");
		}
		//컴퓨터
		if (computer == 0 ) {
			System.out.println("컴퓨터 : 가위 ");
		}
		if (computer == 1) {
			System.out.println("컴퓨터 : 바위");
		}
		if (computer == 2) {
			System.out.println("컴퓨터  : 보");
		}
		
		if (user == computer ) {
			System.out.println(" 비겼습니다.");
		}
		
		if(computer ==1)
		{
			if(user == 0) {
				System.out.println("computer가  이겼습니다.");
			}
			if(user == 2) {
				System.out.println("Player가 이겼습니다.");
			}
		}
		if(computer ==0)
		{
			if(user == 2) {
				System.out.println("computer가  이겼습니다.");
			}
			if(user == 1) {
				System.out.println("Player가 이겼습니다.");
			}
		}
		if(computer ==2)
		{
			if(user == 1) {
				System.out.println("computer가  이겼습니다.");
			}
			if(user == 0) {
				System.out.println("Player가 이겼습니다.");
			}
		}
		//문자열은==으로 비교가 불가능하고 equals 로 비교한다.
	if (computer == user ) {
		System.out.println("비겼습니다");
	}
	if(computer-user == -2 || computer-user ==2) {
		System.out.println("Player Win!!");
	}
	if(computer-user == -1 || computer-user ==2) {
		System.out.println("Player Win!!");
	}
	
	}
}
