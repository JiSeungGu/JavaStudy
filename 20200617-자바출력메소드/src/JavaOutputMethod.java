/*
 *  화면 출력
 *  	=System.out.println() -> 다음줄에 출력
 *  	ex)
 *  		System.out.println("Hello");
 *  		System.out.println("Java");
 *  		=출력 결과=
 *  		Hello
 *  		Java
 *  
 *  	=System.out.print() 
 *  	ex)
 *  		System.out.print("Hello");
 *  		System.out.print("Java");
 *  		=출력 결과=
 *  		HelloJava
 *  
 *  	=System.out.printf() -> 서식이 있는 출력
 *  	ex)
 *  		80 80 80 240 80.0 8
 *  
 *  		System.out.printf("80 80 80 240 80.0 8");
 *  		
 *  		System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,8);
 *  
 *  		%5d 일때 
 *  
 *  	
 */			
public class JavaOutputMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		   
		 System.out.printf("80 80 80 240 80.0 8");
		   		
		 System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,'8');
		 System.out.println();
		 System.out.printf("%.1f",80.0);
		 
		 System.out.printf("%.1f",80.55);
		 int a=2;
		 int b=2;
		 System.out.println(a+"*"+b+"="+a*b);
		 System.out.printf("%d*%d=%d",a,b,a*b);
		 
		 /*
		  *  %d => 정수
		  *  %f => 실수
		  *  %c => 문자
		  *  %s => 문자열 
		  */
	}
}
