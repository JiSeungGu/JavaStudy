/*
 * 1.������ (�ڷ���)
 * 	����,�Ǽ�,����,�� 
 * 
 * 	�Ѿ� ==> x,y ��ǥ(int) ==> 
 *  Ű���尪 ==> char
 *  
 *  �������� ���� ==> long
 *  ������ ���� ��� ==> double 
 *  ���� ���� ���� Ȯ��  ==> true/false => boolean
 *  =====================
 *  
 *  2.������ ���� ���
 *   =�Ѱ� ����=======>
 *   			�����ؼ� ��� ������ : ����
 *   			�������� �ʴ� ������ : ���
 *   =������ ���� =====> ���� ���� (�迭)
 *   =������ ���� =====> �ٸ� ���� (Ŭ����) ==> ����� ���� �������� 
 *   
 *   
 *  3. �޸𸮸� ����� ��� => ��������
 *  ��������
 *  	��) ����
 *  		int  ==> int a;
 *  		long == long a;
 *  		�Ǽ�
 *  		double ==> double;
 *  		����
 *  		char char c;
 *  		��
 *  		boolean ===>> boolean b;
 *  
 *  4. ������ ���� �ʱⰪ 
 *     int=a;
 *	   long a=0L;
 *	   double a=0.0
 *	   boolean b=false
 * 
 * 5. �������� �����ϴ� ���	
 * 	  int a=10;
 * 	  a = 100;
 * 	  a = 200;
 *    a = 300;
 *
 * 6.������ ������ ��ȯ
 *  => temp��� �ӽ� ������ �ʿ��ϴ�
 *  
 * 7. 25page ����
 *    ==========
 *    �������� ���鶧 ����ϴ� ���(�ĺ���)
 *    
 *   
 */
public class JavaTypeValueExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=200;
		int temp=x; //100
		x=y;
		// y=200 ==> x=y ===> x=200
		y=temp; // y=x ==> x=200 ===> y=200
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}
