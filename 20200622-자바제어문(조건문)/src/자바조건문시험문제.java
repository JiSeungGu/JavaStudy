import java.util.Scanner;

public class �ڹ����ǹ����蹮�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//12��) ����ڷκ��� �ΰ��� ������ �Է� �޾Ƽ� ������ ������ ������ ����� ����ϴ� ���α׷��� �ۼ�
	Scanner scan = new Scanner(System.in);
	System.out.print("�ΰ��� ������ �Է� ���ּ��� ������ ������ ���� ����� ����մϴ�.");
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	System.out.printf("���� ��� %d",a-b);
	System.out.printf("���� ��� %d",a*b);
	System.out.println("\n");

/*
* 13��) ����ڷκ��� �� ���� ������ �Է¹��� ������ ���� ���� ������� �����ؼ� �װ���� ����ϴ� 
* ���α׷��� �ۼ��� ����,���� ��� ����ڷκ��� ������� �Է¹��� �� ���� ������ 1,2,3 �̶�� 1*2+3�� ��� �����
* ����ϴ� ���α׷��� �ۼ��غ��ÿ�
*/
	System.out.print("3���� ������ �Է����ּ���  ù° ��* �ι�° ��+ ����° �� = ������ ��µ˴ϴ�.");
	//3���� ������ �ޱ����� ���� ���� 
	int i = scan.nextInt();
	int j = scan.nextInt();
	int k = scan.nextInt();
	System.out.println(""+i+"*"+j+"+"+k+"�� ����"+(i*j+k)+"�Դϴ�");
	System.out.println("\n");

/*
* 14��) �� ���� ������ �Է� �޾Ƽ� ù° ���� ��° ���� ���� �������� ����ϴ� ���α׷��� �ۼ��غ���
*/
	System.out.print("�ΰ��� ������ �Է����ּ���  ù° ���� ��° ���� ���� �������� ����մϴ�.");
	int q = scan.nextInt();
	int w = scan.nextInt();
	System.out.println(""+q+"%"+w+"�� ����  "+(q%w)+"�Դϴ�.");
	System.out.println("\n");

/*
* 15�� ) 2�ڸ� ����(10~99) ������ ���� �Է¹ް�, ���� �ڸ��� ���� �ڸ��� ������ �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��غ���
* ex) 2�ڸ� �� ���� (10~99): 77 > "Yes! 10�ڸ��� 1�� �ڸ��� �����ϴ�."
*/
	System.out.print("2�ڸ� ���� (10~99)���� �Է��ϼ���");
	int r = scan.nextInt();
	//int z = r%10;
	//int x = r/10;
	if((r%10)==(r/10)) {
		System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
	}
	else {
		System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
	}

	}
}
