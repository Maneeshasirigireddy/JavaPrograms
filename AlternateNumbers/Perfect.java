package AlternateNumbers;
import java.util.Scanner;
public class Perfect {
	public static void main(String [] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range:");
		int start=s.nextInt();
		int end=s.nextInt();
		int PerfectSum=SumOfPerfect(start,end);
		System.out.println(PerfectSum);
		if(isPerfect(PerfectSum)) {
			System.out.println("Alternative sum of perfect numbers in a given range is also a Perfect number");
		}
		else {
			System.out.println("Alternative sum of perfect numbers in a given range is not a Perfect number");
		}
	}
	public static int SumOfPerfect(int start,int end) {
		int count=0;
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(isPerfect(i)) {
				count ++;
				if(count%2!=0) {
					sum=sum+i;
				}
			}
		}
		return sum;
	}
	public static boolean isPerfect(int n) {
		
		int sum =0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) return true;
		else return false;
	}

}
