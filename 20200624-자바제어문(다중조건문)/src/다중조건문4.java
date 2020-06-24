/*
 *  »ç¿ëÀÚ => Á¤¼öÀÔ·Â(1~12)
 *  12,1,2 => °Ü¿ïÀÔ´Ï´Ù.
 *  3,4,5 => º½ÀÔ´Ï´Ù.
 *  
 *  6,7,8 => ¿©¸§ÀÔ´Ï´Ù.
 *  9,10,11 => °¡À»ÀÔ´Ï´Ù.
 * 	================
 * 
 * 	¹®ÀÚ¸¦ ÀÔ·Â À» ¹Þ¾Æ¼­ char ch
 * 		= ¼ýÀÚ     ch>='0' && ch <= '9'
 * 		= ¾ËÆÄºª ch >= 'A' && ch <= 'Z'
 * 		= ÇÑ±Û ch >='°¡' && ch <= 'ÆR'
 * 		= Æ¯¼ö¹®ÀÚ 
 * 
 */
import java.util.*;
public class ´ÙÁßÁ¶°Ç¹®4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//»ç¿ëÀÚ ÀÔ·ÂÀ» ¹Þ±â À§ÇÑ Å¬·¡½º °´Ã¼ ¼±¾ð
		Scanner scan = new Scanner(System.in);
		//'¿ù'À» ¹ÞÀ» º¯¼ö »ý¼º
		/*
		int a = 0;
		System.out.print("¿ùÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä ");
		a= scan.nextInt();
		if (a== 12||a== 1|| a== 2) {
			System.out.println(a+"¿ù´ÞÀº °Ü¿ï ÀÔ´Ï´Ù.");
		}
		else if (a== 3||a== 4|| a== 5) {
			System.out.println(a+"¿ù´ÞÀº º½ ÀÔ´Ï´Ù.");
		}
		else if (a== 6||a== 7|| a== 8) {
			System.out.println(a+"¿ù´ÞÀº ¿©¸§ ÀÔ´Ï´Ù.");
		}
		else if (a==9||a==10||a==11){
			System.out.println(a+"¿ù´ÞÀº °¡À» ÀÔ´Ï´Ù.");
		}
		else {
			System.out.println("Àß¸øµÈ ´ÞÀ» ÀÔ·ÂÇÏ¼Ì½À´Ï´Ù.");
		}
		*/
		//2¹ø ¹®Á¦
		System.out.println(" ¹®ÀÚ¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä ");
		char ch =scan.next().charAt(0);
		
		if (ch>='0' && ch <='9') {
			System.out.println("¼ýÀÚ ÀÔ´Ï´Ù.");
		}
		else if (ch>='A' && ch <='Z'|| ch>='a' && ch <='z') {
			System.out.println("¾ËÆÄºª ÀÔ´Ï´Ù.");
		}
		else if (ch>='°¡' && ch <='ÆR') {
			System.out.println("ÇÑ±Û ÀÔ´Ï´Ù.");
		}
		else {
			System.out.println("Æ¯¼ö ¹®ÀÚ ÀÔ´Ï´Ù.");
		}
	}
}
