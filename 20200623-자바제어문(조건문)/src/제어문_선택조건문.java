/*
 *  ���� ���ǹ�
 *  if(���ǹ�)
 *  {
 *  	���ǹ��� true�� �����ϴ� ���� ����
 *  }
 *  else
 *  {
 *  	���ǹ��� false�϶� �����ϴ� ���� ����
 *  }  
 *  	  	
 *  ���ǹ� ==> 137page 
 *  == ����
 *  <
 *  >
 *  !=
 *  
 *  ====== ���� ������ �� ��� 
 *  &&
 *  ||
 *  ======
 *  
 *  ch>='A' && ch<='2'
 *  ch>='0' && ch<='9'
 *  ch>='��' && ch<='�R' ==> ��ȣ�� �Ϸ������� ..
 *  
 *  1,2,3,4,5,6,7,8,9 
 *  1,2,5,7,9
 *  ch==1 || ch==2 || ch==3 || ch==5 || ch==7 || ch==9
 *  
 *  ���ڿ� ==> !=,== ������� �ʴ´�.
 * 	//���ڿ��� ���� �ٸ��� �Ҷ��� equals�� ����.
 *  equals() -> �н����� �˻��Ҷ�
 *  !equals()
 *	
 */
import java.util.*;
public class ���_�������ǹ� {

	public static void main(String[] args) {
		//���� �Ѱ��� �Է��� �޾Ƽ� => ���ĺ����� ���� Ȯ��
		//���� ���� 
		char ch='A'; // ���� => �ʱ�ȭ 
		
		/*
		 * 	int 	=> 0
		 * 	double 	=> 0.0
		 * 	long 	=> 0L
		 * 	boolean => false 
		 */
		//Ŭ������ �ݵ�� new�� �ٿ����� ������ �� �ִ�.
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է�:");
		ch=scan.next().charAt(0); //��ĳ�ʴ� ���ڿ� �ϳ��� �޾ƿ��� ���Ѵ� " "<-�̷��������� �޾ƿ�
								  //"ABC" A=0 B=1 �̷������� ���� charAt(0)�ϸ� �Ǿտ��� �ϳ��� ������ ���´�
								  // �ڹٴ� ��� ���۹�ȣ�� 0������ �����Ѵ�.
		
		
		if((ch >'A' && ch <='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch+"��(��) ���ĺ��Դϴ�!!");
		}else {
			System.out.println(ch+"��(��) ���ĺ��� �ƴմϴ�!!");
		}
		
		
		int a;
		System.out.print(" ���� �Է�:");
		a = scan.nextInt();
		if(a>=0 && a<=9) {
			System.out.println(a+"��(��) �����Դϴ�.");
			
		}else {
			System.out.println(a+"��(��) ���ڰ� �ƴմϴ�.");
		}
	}
}
