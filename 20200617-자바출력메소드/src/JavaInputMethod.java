import java.util.*; // Import�� ? 
					// 		������ ������� �ڹ������� �о� �´�.
/*
 *  class Scanner{
 *  
 *  }
 * 
 */
public class JavaInputMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Է°� �ޱ�
		/*
		 *  System.out.println("���� �Է� : ");
		 *  System.out.print("�����Է� : \n");
		 *  
		 *  
		 *  
		 *  
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� :");

		double a=scan.nextDouble();
		// double a=100 ==> a=100.0
		// char   a=97  ==> a='a'
		System.out.println("a="+a);
		
		System.out.println(Integer.toBinaryString(240)); //������ ��ȯ 
		System.out.println(Integer.toHexString(240));	// 16���� ��ȯ 
		System.out.println(Integer.toOctalString(240)); // 8���� ��ȯ 
 		System.out.println(0b1111000);
		System.out.println(~100);
		
	}
}

