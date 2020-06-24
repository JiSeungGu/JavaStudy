/*
 * 
 * 
 */
public class 선택문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		switch (a)
		{
		case 10:// case 부분에 {}를 주면 블록변수로 사용하므로 다른 case문에서 변수를 불러올 수 없다.
			int b=100; 
			System.out.println("a="+a+",b="+b);
			break;
		case 11:
			b =200;
			System.out.println("a="+a+",b="+b);
			break;
		
		}
	}
}

