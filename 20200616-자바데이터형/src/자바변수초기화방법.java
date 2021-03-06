/*
 * 변수 => 초기화
 * 1) 직접처리
 * 		int a = 100;
 * 2) 선언 ==>키보드에서 받아서 저장 
 * 3) 임의의 수를 저장 (랜덤) ==> 게임, 로또
 * 4) 입력창을 만들어서 값을 받는 방식
 * 
 * 
 * ===> 선언 동시에 초기값 부여
 * 		int a = 100;
 * ===> 선언하고 나중에 초기값을 부여
 * 		int a;
 * 		a = 100;
 * 
 */
import java.util.*;
// String,System,Math ==> java.lang에 들어있음 ==> 다만,import 생략이 가능함
public class 자바변수초기화방법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100; 
		System.out.println("a="+a);
		
		int b; //메모리 공간을 먼저 만들어 놓고
		b = 200;
		System.out.println("b ="+b);
		
		int c;
		c =(int) ((Math.random()*100)+1);
		/*
		 * =========== 0.0 ~ 0.99 ==> *100 ==> 0.0~99.0 => int 0~99
		 */		
		System.out.println("c = "+ c);
		
		int d;
		Scanner scan=new Scanner(System.in);
		System.out.println("정수입력 : ");
		d=scan.nextInt();
		
		
		System.out.println("d= "+d);
	}
}
