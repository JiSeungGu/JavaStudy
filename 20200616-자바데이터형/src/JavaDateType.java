/*
 * 자바에서 사용하는 데이터형(자료형) => 메모리의 크기 지정 
 * static 공통으로 쓰는 변수
 * 
 * 정수
 *  = byte (0,1을 8개 저장하는 공간) =8bit( 1byte) ==> WeB에서 주로 사용함
 *  	11111111 = -128 앞자리 1은 음수
 *  	01111111 = 127  앞자리 0은 양수
 *  	-128~127 까지 저장
 *  	
 *  = short(0,1을 16개 저장하는 공간) =16bit (2byte) =
 *  	1111 1111 1111 1111 ==> -32768
 *  	0111 1111 1111 1111 ==>  32767
 *  	==> C언어와 호환성 (사용빈도가 없다
 *  
 *  = int(평상시에 사용하는 모든 정수는 컴퓨터에서 int로 인식) => Default 값
 *  	(0,1을 32개 저장하는 공간)
 *  	1111 1111 1111 1111 1111 1111 1111 1111
 *  	0111 1111 1111 1111 1111 1111 1111 1111 
 *  	==>자바 코딩의 정수는 대부분 사용
 *  
 *  = long (0,1 => 64개의 저장공간) : 빅데이터,금융권,주식에서 사용
 *  	국어점수 : byte , short , int , long ==> int 
 *  	수학점수 : byte , short , int , long ==> int
 *  	영어점수 : byte , short , int , long ==> int
 *  	총     점 : (300) byte(X) , short , int , long ==> int
 * 		우리나라의 연봉 : long 
 * 실수
 *		= 4byte ==> 소수점(6자리)  ==> float
 *		= 8byte ==> 소수점(15자리) ==> double
 *		**문 제 점**
 *			float f =10.5 하면 오류  즉, 10.5 는 컴퓨터에서 double 로 인식하기때문에  64bit(double)은 32bit(float)에 들어갈 수 없음.
 *			float f =10.5f 이 맞는 문법
 *			
 * 문자
 * 		= char (0,1 => 16bit) : 음수 없이 양수만 가지고 있다 = > 0~65535개의 문자
 * 		*문자 마다 고유의 번호를 가지고 있다 . 
 * 		'A' = 65
 * 		'a' = 97
 * 		'0' = 49
 * 논리 
 * 		= true/flase 저장 => boolean (1byte)
 * 		  login , idcheck 할때
 * 		메모리에 저장하는 크기 (표현할 수 있는 숫자의 크기) 
 * 			byte < short < int < long < float < double
 * 					char
 * 			※) int = 10,20       float = 10.5f
 * 			  long = 10L,20L     double = 10.5
 * =====================================================
 * 변수 : 한개의 데이터를 저장하는 메모리 공간의 별칭
 * 변수명 만들때
 * 	1) 알파벳이나 한글로 시작한다
 * 	==== 알파벳은 반드시 대소문자 구분
 * 		a != A 
 *  2)  숫자 사용이 가능 (단 앞에는 사용할 수 없다)
 *  	a1,a2....(2a(error))
 *  3) 특수문자 사용 가능 ( '_' '$')  _(언더바) 는 임시파일 TEST용 , 단어가 여러개 일 경우  ex) file_size, file_name ...
 *  4) 키워드는 사용할 수 없다
 *  5) 변수의 길이는 15자 이내로 한다 
 *  ============================
 *  변수 선언/ 변수 초기화 
 *  1) 변수 선언 (변수 선언은 항상 초기값을 주어야 한다)
 *  ========== 저장해야하는 데이터가 존재할때
 *  형식)
 *  	1.데이터형 변수명;
 *  
 *  	점수를 저장 ==> int grade;
 *  				grade = 100;
 *  	
 *  2) 변수 초기화
 *  ========== 변수를 선언했을때 
 *  
 *  	int a = 0;
 *  	int b = 0;
 *  	int c = 0;
 *  	=====
 *  	int a,b,c;
 *  	int a=0,b=0,c=0;
 *  
 *  	======================
 *  	변수에 초기화
 *  	1. 정수형
 *  		byte   =>0
 *  		short  =>0
 *  		int	   =>0
 *  		long   =>0L
 *  	2. 실수형
 *  		float  =>0.0f
 *  		double =>0.0d => d는 생략이 가능하다
 *  	3. 문자형 	   => 'A' => ''(error)
 *  
 *  	4. 논리형
 *  		boolean=> false/true
 *  
 *  	★모든 변수는 초기화를 해야한다.
 */
public class JavaDateType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어 영어 수학 총점 평균 학점
		int kor=80;
		int eng=80;
		int math=80;
		
		int total= 240;
		double avg =80.0;
		char score='B';
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총     점:"+total);
		System.out.println("평     균:"+avg);
		System.out.println("학     점:"+score);
	}

}
