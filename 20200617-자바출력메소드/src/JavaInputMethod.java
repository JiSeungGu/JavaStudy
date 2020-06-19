import java.util.*; // Import란 ? 
					// 		이전에 만들어진 자바파일을 읽어 온다.
/*
 *  class Scanner{
 *  
 *  }
 * 
 */
public class JavaInputMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력값 받기
		/*
		 *  System.out.println("정수 입력 : ");
		 *  System.out.print("정수입력 : \n");
		 *  
		 *  
		 *  
		 *  
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 :");

		double a=scan.nextDouble();
		// double a=100 ==> a=100.0
		// char   a=97  ==> a='a'
		System.out.println("a="+a);
		
		System.out.println(Integer.toBinaryString(240)); //이진법 변환 
		System.out.println(Integer.toHexString(240));	// 16진법 변환 
		System.out.println(Integer.toOctalString(240)); // 8진법 변환 
 		System.out.println(0b1111000);
		System.out.println(~100);
		
	}
}

