/*
 * ä����
 * �̸���: vcandjava@nate.com
 * ��ȭ��ȣ 010 9146 2849
 */
class A{
	
}
public class Mainclass1 {
	//main �׽� �ʿ�
	public static void main(String[] args) {
		//�ڹٿ��� ǥ�� �ϴ� ���
		/*
		 * ���� 
		 * 	  = 10���� 10,20,30
		 *    =  8����
		 *    = 16����
		 *    =  2����
		 * �Ǽ�
		 *    = ����ũ�� => 4byte 10.5f 
		 *    = ����ũ�� => 8byte 10.5
		 * ����
		 *    = ' ' �ѱ���
		 * ���ڿ� 
		 *    = "  " �������� 
		 *    
		 * ASC (c) ======> 1byte
		 * Unicode (�ڹ�)=> 2byte
		 * 
		 * UTF - 8 
		 */
		
		System.out.println('�m');
		System.out.println("Hellow Java");
		System.out.println(10.5);
		System.out.println(10.5f);
		System.out.println(10.5F);
		
		//10�������� ���α׷� ¥�¹�������
		System.out.println(10); //���������Ʈ�� 10�� ����϶�� ��ɹ�
		System.out.println(0b01010);
		System.out.println(012);
		System.out.println(0xA);
		/*
		 *  1.�⺻ ���� 
		 *  =========
		 *   => ��ҹ��� ����
		 *   	=> ���̺귯��(Ŭ����: �빮�� ����, �޼ҵ� : �ҹ��� ����, ���: ��� �빮��)
		 *   	���� / ���
		 *   	��� = �ٲ��� �ʴ°�
		 *   	���� = ���ϴ´�� ���氡��
		 *   
		 *   	int kor = 100;
		 *  	final�� ������ ���!
		 *   	final int KOR =200;
		 *   => ��ɹ��� ������ �ݵ�� �����ݷ��� ����Ѵ�.
		 *   
		 *   3. �鿩����
		 */
	}
}
