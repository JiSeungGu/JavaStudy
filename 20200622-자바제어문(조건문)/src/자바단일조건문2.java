/*
 * 1)단일 조건문은 여러개를 사용해도 처음부터 마지막까지  수행된다
 * 2) {}을 생략할때는 수행문장이 1개일 경우
 * 
 * 
 * 
 */
public class 자바단일조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15; //3배수, 5배수, 7배수
		if (a%3 ==0) { //if문 뒤에 ; 세미콜론을 붙이면  if문장 바로 종료 
		
			System.out.println(a+"는 3의 배수"); //한문장
		}
		else if (a%5 ==0) {
		
			System.out.println(a+"는 5의 배수"); //한문장
		}
		else if (a%7 ==0) {
		
			System.out.println(a+"는 7의 배수"); //한문장 
		}
	}
}
