
public class JavaTypeInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=78;
		int eng=85;
		int math=96;
		/*
		 *  ���ڿ� ����
		 *  ========
		 *  7+7+"1"+7+7
		 *  ===
		 *  14+"1"+7+7
		 *  141+7+7
		 *  "14177"
		 *  
		 *  
		 */
		System.out.println("����:"+(kor+eng+math));
		
		int a=97;
		char c=97;// char = ����,����
		int b=1;
		int e='1';
		
		System.out.println("b="+b);
		System.out.println("e="+e);
		
		System.out.println("a="+a);
		System.out.println("c="+c);
		/*
		 *  char�� ����,���� ������Ѵ�. char ���ڸ� �ְ� ��½� �ش� ���ڰ����´�
		 *  int���� ���ڳ����� ���ڷ� 
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
		 *   ���� ==> char = int;
		 */
		double f=10.5f;
		//byte < char < int < long <float < double 
		System.out.println(100);
		System.out.println(10.8);
		
		double i=21400000000L;
		System.out.println(i);
	}

}
