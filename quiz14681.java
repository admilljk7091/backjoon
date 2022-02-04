package backjoon;
import java.util.Scanner;
public class quiz14681 {

	public static void main(String[] args) {
		Scanner IN = new Scanner(System.in);
				int a = IN.nextInt();
				int b = IN.nextInt();
				
				if (a>0)
				{if (b>0)
					System.out.println("1");
				else if(b<0)
				    System.out.println("4");
				}
				else if(a<0)
					{if (b>0)
					System.out.println("2");
					
				else if(b<0)
				    System.out.println("3");}
	}

}
