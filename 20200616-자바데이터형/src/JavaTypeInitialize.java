
public class JavaTypeInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=78;
		int eng=85;
		int math=96;
		/*
		 *  문자열 결합
		 *  ========
		 *  7+7+"1"+7+7
		 *  ===
		 *  14+"1"+7+7
		 *  141+7+7
		 *  "14177"
		 *  
		 *  
		 */
		System.out.println("총점:"+(kor+eng+math));
		
		int a=97;
		char c=97;// char = 문자,숫자
		int b=1;
		int e='1';
		
		System.out.println("b="+b);
		System.out.println("e="+e);
		
		System.out.println("a="+a);
		System.out.println("c="+c);
		/*
		 *  char는 문자,정수 취급을한다. char 숫자를 넣고 출력시 해당 문자가나온다
		 *  int형은 문자넣을시 숫자로 
		 *  
		 *  
		 *  long = int 
		 *    8     4
		 *   int = long
		 *    4     8 => ERROR
		 *    
		 *   double = int,long,float
		 *   int = double(x)
		 *   
		 *   예외 ==> char = int;
		 */
		double f=10.5f;
		//byte < char < int < long <float < double 
		System.out.println(100);
		System.out.println(10.8);
		
		double i=21400000000L;
		System.out.println(i);
	}

}
