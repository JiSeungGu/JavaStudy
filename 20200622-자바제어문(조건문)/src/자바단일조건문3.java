// 조건문 제작하는 방법  
/*
 * if(조건문) : 조건문은 무조건 결과값 ==> True/False
 * 	==> 필요한 경우(조건이 True일 때)에만 문장을 수행 
 * 		False 일 경우 건너뛴다 (문장을 수행하지 못한다)
 */
public class 자바단일조건문3 {
	public static void main(String[] args) {
		int a = 11;
		
		/*
		 * System.out.println("1"); System.out.println("2"); // a값이 짝수일 경우 출력 if(a%2 ==
		 * 0) System.out.println("3");
		 * 
		 * System.out.println("4"); System.out.println("5");
		 */		
		char alpha = '\t';
		if(alpha >= 'A' && alpha <= 'Z')
		{
			System.out.println(alpha+"는(은) 대문자 입니다.");
		}
		if(alpha >= 'a' && alpha <= 'z')
		{
			System.out.println(alpha+"는(은) 소문자 입니다.");
		}
		if(alpha >= '0' && alpha <= '9')
		{
			System.out.println(alpha+"는(은) 숫자 입니다.");
		}
		if(alpha >= 'ㄱ' && alpha <= '힣')
		{
			System.out.println(alpha+"는(은) 한글 입니다.");
		//특수 문자 
		}
		if (alpha == '\t' || alpha == '\n')
		{
			System.out.println(alpha +"는(은) 특수문자 입니다.");
		}	
	}
}
