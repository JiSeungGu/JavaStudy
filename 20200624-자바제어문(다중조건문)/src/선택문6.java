// switch  ��ø
/*
 *	if(���ǹ�){
 *		if(���ǹ�{
 *	
 *		}
 *	}
 *	switch(����)
 *	{
 *		case 1:
 *			switch(����)
 *			{
 *			case 'A':
 *			}
 * 	}
 * 	=> Computer => ����
 * 					=����
 * 					=����
 * 					=��
 * 
 */
import java.util.*;
public class ���ù�6 {
	public static void main(String[] args) {
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2
		//		      ================
		/*                    1      =
		 *                           2
	     *     ======
	     *        3
	     *        
	     *        1.Math.radom() => 0.0~0.99 => 0~2  
	     *        0 : ����
	     *        1 : ����
	     *        2 : ��
	     *        
	     *        
		 */  
		Scanner scan = new Scanner(System.in);
		System.out.println("���� (0), ���� (1), ��(2)");
		user = scan.nextInt();
		//��� �� ���
		/*
		switch (com) {
		case 0:
			switch (user) {
			case 0:
				System.out.println("��ǻ��:����, �����:���� ");
				System.out.println("����!!");
				break;
			case 1:
				System.out.println("��ǻ��:����, �����:���� ");
				System.out.println("����� Win!!");

				break;

			case 2:
				System.out.println("��ǻ��:����, �����:�� ");
				System.out.println("��ǻ�� Win!!");

				break;
			}
			break;
		case 1:
			switch (user) {
			case 0:
				System.out.println("��ǻ��:����, �����:���� ");
				System.out.println("��ǻ�� Win!!");
				break;
			case 1:
				System.out.println("��ǻ��:����, �����:���� ");
				System.out.println("����!!");
				
				break;
			case 2:
				System.out.println("��ǻ��:����, �����:�� ");
				System.out.println("����� Win!!");

				break;
			}			
			break;
		case 2:
			switch (user) {
			case 0:
				System.out.println("��ǻ��:��, �����:���� ");
				System.out.println("����� Win!!");
				break;
			case 1:
				System.out.println("��ǻ��:��, �����:���� ");
				System.out.println("��ǻ��  Win!!");
				break;

			case 2:
				System.out.println("��ǻ��:��, �����:�� ");
				System.out.println("����!!");				
				break;
			}
			break;
			
		}
		*/
		String[] str= {"����","����","��"};
		System.out.println("��ǻ�� :"+str[com]+", �����:"+str[user]);
		switch (user-com) {
		case 2:
		case -1:
			System.out.println("����� Win");
			break;
		case 1:
		case -2:
			System.out.println("��ǻ�� Win");
			break;
		default :
			System.out.println("�����ϴ�!");
			break;		
		}
		while(true) {
			System.out.println(""+Math.random()*3);
			
		}
	}  
}
