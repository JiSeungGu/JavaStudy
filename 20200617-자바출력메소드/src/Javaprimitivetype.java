/*			
 *   �ڹ� => �⺻��
 *   		�ڹٿ� �����ϴ� ��������
 *   		���� ==> boolean ==> �� : true/false : if(���ǹ�)�� ����Ҷ� �ַ� ����ϴ� ��������  
 *   											  Turn : ������ �����Ҷ� ��� 
 *
 *       =====> UpCasting(�ڵ� ����ȯ)
 *byte > short(char) < int < long < float < double 
 *                    <===== DownCasting (���� ����ȯ)  
 *
 *  double d;
 *  char c='a'
 *  int i ='A' ==> i==65
 *  
 *  
 *  byte b1=10;
 *  byte b2=10;
 *  byte b3 = b1+b2; (byte + byte �� int ��) 
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
			//�����ڴ� ���ڹ�ȣ�� ������ �ִ� (Char�� ���������� �ν��Ѵ�)
			System.out.println((char)12619);
			
			
			
	}			
}
