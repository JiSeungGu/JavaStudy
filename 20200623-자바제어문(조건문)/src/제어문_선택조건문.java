/*
 *  선택 조건문
 *  if(조건문)
 *  {
 *  	조건문이 true면 수행하는 문장 구현
 *  }
 *  else
 *  {
 *  	조건문이 false일때 수행하는 문장 구현
 *  }  
 *  	  	
 *  조건문 ==> 137page 
 *  == 단일
 *  <
 *  >
 *  !=
 *  
 *  ====== 조건 여러개 일 경우 
 *  &&
 *  ||
 *  ======
 *  
 *  ch>='A' && ch<='2'
 *  ch>='0' && ch<='9'
 *  ch>='가' && ch<='힣' ==> 번호가 일률적으로 ..
 *  
 *  1,2,3,4,5,6,7,8,9 
 *  1,2,5,7,9
 *  ch==1 || ch==2 || ch==3 || ch==5 || ch==7 || ch==9
 *  
 *  문자열 ==> !=,== 사용하지 않는다.
 * 	//문자열이 같냐 다르냐 할때는 equals를 쓴다.
 *  equals() -> 패스워드 검색할때
 *  !equals()
 *	
 */
import java.util.*;
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		//문자 한개를 입력을 받아서 => 알파벳인지 여부 확인
		//변수 설정 
		char ch='A'; // 변수 => 초기화 
		
		/*
		 * 	int 	=> 0
		 * 	double 	=> 0.0
		 * 	long 	=> 0L
		 * 	boolean => false 
		 */
		//클래스는 반드시 new를 붙여아지 저장할 수 있다.
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 입력:");
		ch=scan.next().charAt(0); //스캐너는 문자열 하나를 받아오지 못한다 " "<-이런형식으로 받아옴
								  //"ABC" A=0 B=1 이런식으로 따라서 charAt(0)하면 맨앞에꺼 하나만 가지고 들어온다
								  // 자바는 모든 시작번호가 0번으로 시작한다.
		
		
		if((ch >'A' && ch <='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch+"는(은) 알파벳입니다!!");
		}else {
			System.out.println(ch+"는(은) 알파벳이 아닙니다!!");
		}
		
		
		int a;
		System.out.print(" 숫자 입력:");
		a = scan.nextInt();
		if(a>=0 && a<=9) {
			System.out.println(a+"는(은) 숫자입니다.");
			
		}else {
			System.out.println(a+"는(은) 숫자가 아닙니다.");
		}
	}
}
