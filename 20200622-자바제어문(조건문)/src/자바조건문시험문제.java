import java.util.Scanner;

public class 자바조건문시험문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//12번) 사용자로부터 두개의 정수를 입력 받아서 뺄셈과 곱셈의 연산의 결과를 출력하는 프로그램을 작성
	Scanner scan = new Scanner(System.in);
	System.out.print("두개의 정수를 입력 해주세요 뺄셈과 곱셈의 연산 결과를 출력합니다.");
	int a = scan.nextInt();
	int b = scan.nextInt();
	
	System.out.printf("뺄셈 결과 %d",a-b);
	System.out.printf("곱셈 결과 %d",a*b);
	System.out.println("\n");

/*
* 13번) 사용자로부터 세 개의 정수를 입력받은 다음에 곱과 합을 순서대로 진행해서 그결과를 출력하는 
* 프로그램을 작성해 보자,예를 들어 사용자로부터 순서대로 입력받은 세 개의 정수가 1,2,3 이라면 1*2+3의 계산 결과를
* 출력하는 프로그램을 작성해보시오
*/
	System.out.print("3개의 정수를 입력해주세요  첫째 수* 두번째 수+ 세번째 수 = 값으로 출력됩니다.");
	//3개의 변수를 받기위한 변수 선언 
	int i = scan.nextInt();
	int j = scan.nextInt();
	int k = scan.nextInt();
	System.out.println(""+i+"*"+j+"+"+k+"의 값은"+(i*j+k)+"입니다");
	System.out.println("\n");

/*
* 14번) 두 개의 정수를 입력 받아서 첫째 수를 두째 수로 나눈 나머지를 출력하는 프로그램을 작성해보자
*/
	System.out.print("두개의 정수를 입력해주세요  첫째 수를 둘째 수로 나눈 나머지를 출력합니다.");
	int q = scan.nextInt();
	int w = scan.nextInt();
	System.out.println(""+q+"%"+w+"의 값은  "+(q%w)+"입니다.");
	System.out.println("\n");

/*
* 15번 ) 2자리 정수(10~99) 사이의 값을 입력받고, 십의 자리와 일의 자리가 같은지 판별하여 출력하는 프로그램을 작성해보자
* ex) 2자리 수 정수 (10~99): 77 > "Yes! 10자리와 1의 자리가 같습니다."
*/
	System.out.print("2자리 정수 (10~99)값을 입력하세요");
	int r = scan.nextInt();
	//int z = r%10;
	//int x = r/10;
	if((r%10)==(r/10)) {
		System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
	}
	else {
		System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
	}

	}
}
