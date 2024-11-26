package Patterns;
import java.util.Scanner;
public class HalloDiamond {

	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enterf the size:");
		int n=s.nextInt();
		int st=1;
		if(n%2==0) n+=1;
		int sp=n/2;
		for(int i=1;i<n-1;i++) {
			for(int j=1;j<=sp;j++) 
				System.out.print("* ");
			for(int j=1;j<st;j++)
				System.out.print("  ");
			for(int j=1;j<=sp;j++)
				System.out.print("* ");
			
			System.out.println();
			if(i<n/2) {
				sp--;
				st+=2;
				
			}
			else {
				sp++;
				st-=2;
			}
		}
	}

}
