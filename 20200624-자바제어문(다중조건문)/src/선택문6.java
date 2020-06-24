// switch  중첩
/*
 *	if(조건문){
 *		if(조건문{
 *	
 *		}
 *	}
 *	switch(정수)
 *	{
 *		case 1:
 *			switch(정수)
 *			{
 *			case 'A':
 *			}
 * 	}
 * 	=> Computer => 가위
 * 					=가위
 * 					=바위
 * 					=보
 * 
 */
import java.util.*;
public class 선택문6 {
	public static void main(String[] args) {
		int user=0;
		int com=(int)(Math.random()*3); // 0,1,2
		//		      ================
		/*                    1      =
		 *                           2
	     *     ======
	     *        3
	     *        
	     *        1.Math.radom() => 0.0~0.99 => 0~2  
	     *        0 : 가위
	     *        1 : 바위
	     *        2 : 보
	     *        
	     *        
		 */  
		Scanner scan = new Scanner(System.in);
		System.out.println("가위 (0), 바위 (1), 보(2)");
		user = scan.nextInt();
		//결과 값 출력
		/*
		switch (com) {
		case 0:
			switch (user) {
			case 0:
				System.out.println("컴퓨터:가위, 사용자:가위 ");
				System.out.println("비겼다!!");
				break;
			case 1:
				System.out.println("컴퓨터:가위, 사용자:바위 ");
				System.out.println("사용자 Win!!");

				break;

			case 2:
				System.out.println("컴퓨터:가위, 사용자:보 ");
				System.out.println("컴퓨터 Win!!");

				break;
			}
			break;
		case 1:
			switch (user) {
			case 0:
				System.out.println("컴퓨터:바위, 사용자:가위 ");
				System.out.println("컴퓨터 Win!!");
				break;
			case 1:
				System.out.println("컴퓨터:바위, 사용자:바위 ");
				System.out.println("비겼다!!");
				
				break;
			case 2:
				System.out.println("컴퓨터:바위, 사용자:보 ");
				System.out.println("사용자 Win!!");

				break;
			}			
			break;
		case 2:
			switch (user) {
			case 0:
				System.out.println("컴퓨터:보, 사용자:가위 ");
				System.out.println("사용자 Win!!");
				break;
			case 1:
				System.out.println("컴퓨터:보, 사용자:바위 ");
				System.out.println("컴퓨터  Win!!");
				break;

			case 2:
				System.out.println("컴퓨터:보, 사용자:보 ");
				System.out.println("비겼다!!");				
				break;
			}
			break;
			
		}
		*/
		String[] str= {"가위","바위","보"};
		System.out.println("컴퓨터 :"+str[com]+", 상용자:"+str[user]);
		switch (user-com) {
		case 2:
		case -1:
			System.out.println("사용자 Win");
			break;
		case 1:
		case -2:
			System.out.println("컴퓨터 Win");
			break;
		default :
			System.out.println("비겼습니다!");
			break;		
		}
		while(true) {
			System.out.println(""+Math.random()*3);
			
		}
	}  
}
