/*
 *  ���� ���ǹ� : if ~ else
 *  ����)
 *  	=>  �α��� ó�� 
 *  	=>  ���̵� �ߺ� üũ 
 *  	=>  �۾��� (����/���)
 *  	=>  ¦�� / Ȧ��	
 *  	=>  �빮�� / �ҹ���
 *   
 *  	if(���ǹ�)
 *  	{
 *  		==> ������ true�϶� ó���ϴ� ����
 *  	}
 *  	else
 *  	{
 *  		==> ������ false�� ��쿡 ó���ϴ� ����
 *  	}
 * 
 */
import java.util.Scanner;
public class �ڹټ������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��ĳ�ʸ� ���� => Ű������ �Է°��� �ִ� ��쿡 ó��
		Scanner scan = new Scanner(System.in);
		// �ڹ��� ��� Ŭ����, ����� ���� Ŭ���� ==> ������ �Ҷ�
		// �ݵ�� new�̿��ؼ� ����
		// System.in ==> ����� Ű���� �Է°� �޴´�.
		// System.out ==> ����Ϳ� ����� �� ���
		System.out.println("������ �Է�(1~100) :");
		int a =scan.nextInt(); // �Է°� �޾Ƽ� a��� �޸� ������ ����
		//1���� 100������ ������ �Էµ��� �ʾҴٸ�,
		if(!(a<1 || a>100)) // !�� �ݴ�ȿ��
		{	
			System.out.println(a+"(��)�� �ԷµǾ����ϴ�.");
		
		}
		else {
			//1~100 ���� ������ ������ �Է��� �Ǿ��ٸ� 
			System.out.println("�߸��� �Է��Դϴ�.\n ���α׷��� ���� �մϴ�.");
		}
		
	}

}
