/*
 *  1. 정수를 입력받아서  짝수인지 홀수인지 확인 => 10은 짝수다,11은 홀수다
 *  
 *  2. 정수 3개를 입력을 받아서
 *  	총점,평균
 *  	학점 = 조건문
 *  	60이상이면  = D 70이상이면 = C 80이상이면 =B 90이상이면 = A 나머지는 F
 *  
 *  	국어점수 : 80
 *  	영어점수 : 80
 *  	수학점수 : 80
 *  
 *  	총점 :240 
 *  	평균 :80.0
 *  	학점 : B
 */
import java.util.*;
public class 자바조건문문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int i = scan.nextInt();
		if(i%2==0) {
			System.out.println(i+" 값은 짝수 입니다.");
		}
		else {
			System.out.println(i+"값은 홀수 입니다.");
		}
	
	}
}
