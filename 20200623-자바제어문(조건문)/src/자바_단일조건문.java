/*
 * �ڹٿ��� �����ϴ� ���
 * = ���ǹ�, ���ù�
 * 		= ���� ���ǹ�  :if
 * 			 ����)
 * 				==> �α��� ó��, ID�ߺ� üũ
 * 				if(���ǹ�)
 * 				{
 * 					������  true�϶��� �����ϴ� ����
 * 				}
 * 		= ���� ���ǹ�  :if~else
 * 			����)
 * 				if(���ǹ�)
 * 				{
 * 					������ true�� ��쿡 ó���ϴ� ���� 
 * 				}
 * 				else
 * 				{
 * 					������ false�� ��쿡 ó���ϴ� ����
 * 				}
 * 		= ���� ���ǹ�  :if~ else if ~ else if ~ else
 * 				if(���ǹ�){
 * 					������ true�� ��쿡 ó���ϴ� ����
 * 				}
 * 				else if(���ǹ�){
 * 					������ true�� ��쿡 ó���ϴ� ����
 * 				}
 * 				else if(���ǹ�){
 * 					������ true�� ��쿡 ó���ϴ� ����
 * 				}
  * 			else if(���ǹ�){
 * 					������ true�� ��쿡 ó���ϴ� ����
 * 				}
 * 				else {
 * 					�����ص� �Ǵ� �κ�
 * 				}
 * 		= ���ù�         :Switch ~ case
 * = �ݺ���
 * 		= �ݺ�Ƚ���� ������ ��� (for)
 * 		= �ݺ�Ƚ���� ������ �ȵ� ��� (whlie)
 * 		= �ݵ�� �ѹ� �̻� ���� (do~while)
 * = �ݺ����
 * 		= break    : �ݺ��� ����
 * 		= continue : Ư���κ��� ����
 */
import java.util.*;
//���� 2��, char 1(+,-,*,/)
public class �ڹ�_�������ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		//a,b => ����ڰ� �Է�
		//c   => ������ ����
		char op = '+';
		
		//������� �Է°��� �޴´�.
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� �Է�:");
		a=scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�:");
		b=scan.nextInt();
		
		System.out.print("������(+,-,*,/):");
		op = scan.next().charAt(0);
		// charAt �̶� "+" ��  '+'������ִ� ��� 
		// Scanner => char�� �޾Ƽ� ó���ϴ� ����� ���� => ���ڿ�
		// System.in => ����ó���� �ؾ� �Ѵ�.
		
		//����ó��
		if(op=='+') {
			System.out.printf("%d+%d=%d\n",a,b,a+b);
		}
		if(op=='-') {
			System.out.printf("%d-%d=%d\n",a,b,a-b);
		}
		if(op=='*') {
			System.out.printf("%d*%d=%d\n",a,b,a*b);
		}
		if(op=='/') {
			//����ó���ϴºκ�
			if(b==0) {
				System.out.println("0���� �������� ���� ");
			}
			else{
				System.out.printf("%d/%.2f=%.2f\n",a,(double)b,(double)a/b);
			}
		}
		System.out.println("���α׷� ����");
		//main => end ==> ���α׷� ����
		//main : ���α׷� ����, ���� �޼ҵ�
		//���α׷� ==> Ŭ���� (1) ==> ������
		//.
	}
}
