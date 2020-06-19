/*
 *  변수 선언
 *  변수 초기화
 *  변수의 값변환
 *  다른 변수에 값 전달
 */
public class JavaTypeValueChane {
 
	public static void main(String[] args) {
		
		int a=100;
		System.out.println("a ="+a);
		a = 200;
		System.out.println("a ="+a);
		a = 300;
		System.out.println("a ="+a);
	
		
		int b=200;
		int c=b;
		int d=b+c;
		System.out.println("d ="+d);
		System.out.println("c ="+c);
		
		int x,y,z;
		x=y=z=100;
		System.out.println("x ="+x);
		System.out.println("y ="+y);
		System.out.println("z ="+z);
	}
}
