package backjoon;
import java.util.Scanner;
public class quiz2753 {

	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
		int a = IN.nextInt();
		
		if (a%4==0) {  
		 if (a%400==0)
				System.out.println("1");
			else if (a%100==0)
				System.out.println("0");
			else 
				System.out.println("1");
		}
			else System.out.println("0");
		}
	}


