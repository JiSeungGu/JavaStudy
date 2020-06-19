/*
 * 형변환 => 자신의 데이터형은 다른형식의 데이터형으로 변환
 * 
 * boolean : 제외
 * byte > char < int < long < float < double
 * 
 * 정수 => 실수, 문자, 정수		int a = (int)10L => long a = (long) 10
 * 							double d= (double)10
 * 실수 => 정수, 문자
 * 문자 => 정수, 실수
 */
public class JavaTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			double d=5/(double)2;
			System.out.println(d);
	}

}
