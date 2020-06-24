
//3개의 정수를 입력받아서 => 학점 계산 (switch case 문으로)
/* 
 * 
 *
 */
import java.util.*;
public class 선택문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//프로그램에 필요한 변수 입력 
		int kor,eng,math;
		char score='A';
		
		//사용자에게 변수를 받기위한 스캐너 생성
		Scanner scan = new Scanner(System.in);
		//입력
		System.out.print("점수 3개를 입력하세요 (90 90 90)? :");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		//결과값을 출력 => 가공 (연산자+제어문)
		//메소드 ==> 데이터를 가공 
		switch((kor+eng+math)/30) {
		case 10:
		case 9:{
			score='A';
			break;
		}
		case 8:{
			score ='B';
			break;
		}
		case 7:{
			score ='C';
			break;
		}
		case 6:{
			score ='D';
			break;
		}
		default:{
			score = 'F';
			break;
		}
		}
		System.out.println("=====결과=====");
		System.out.println("학점 :");
		
	}
}
