/*
 *  ȭ�� ���
 *  	=System.out.println() -> �����ٿ� ���
 *  	ex)
 *  		System.out.println("Hello");
 *  		System.out.println("Java");
 *  		=��� ���=
 *  		Hello
 *  		Java
 *  
 *  	=System.out.print() 
 *  	ex)
 *  		System.out.print("Hello");
 *  		System.out.print("Java");
 *  		=��� ���=
 *  		HelloJava
 *  
 *  	=System.out.printf() -> ������ �ִ� ���
 *  	ex)
 *  		80 80 80 240 80.0 8
 *  
 *  		System.out.printf("80 80 80 240 80.0 8");
 *  		
 *  		System.out.printf("%5d%5d%5d%5d%5f%5c",80,80,80,240,80.0,8);
 *  
 *  		%5d �϶� 
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
		  *  %d => ����
		  *  %f => �Ǽ�
		  *  %c => ����
		  *  %s => ���ڿ� 
		  */
	}
}
