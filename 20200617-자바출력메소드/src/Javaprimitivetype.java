/*			
 *   자바 => 기본형
 *   		자바에 지원하는 데이터형
 *   		논리형 ==> boolean ==> 값 : true/false : if(조건문)을 사용할때 주로 사용하는 데이터형  
 *   											  Turn : 번갈아 실행할때 사용 
 *
 *       =====> UpCasting(자동 형변환)
 *byte > short(char) < int < long < float < double 
 *                    <===== DownCasting (강제 형변환)  
 *
 *  double d;
 *  char c='a'
 *  int i ='A' ==> i==65
 *  
 *  
 *  byte b1=10;
 *  byte b2=10;
 *  byte b3 = b1+b2; (byte + byte 는 int 형) 
 *  
 *  byte a=10;
 *  byte b=30;
 *  byte c=(byte)a*b;		
 *  
 *  int i = 'A' ==> 'A' ==> 65 ==> (char)65
 *  
 *  10.5 + 10
 *  	=======
 *  	  10.0
 *  
 *  'A'+1
 *   ====	 
 *    66
 * 	
 */
public class Javaprimitivetype {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			boolean b1=false; // boolean => 1byte
			System.out.println("b="+b1);
			b1= true;
			System.out.println("b="+b1);
			byte a=10;
			byte b=30;
			int c=a*b;
			System.out.println("c="+c);
			//각문자는 숫자번호를 가지고 있다 (Char는 정수형으로 인식한다)
			System.out.println((char)12619);
			
			
			
	}			
}
