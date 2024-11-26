package AlternateNumbers;
import java.util.Scanner;
public class Prime {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the range:");
		int start=s.nextInt();
		int end=s.nextInt();
		int Primesum=SumofPrime(start,end);
		System.out.println(Primesum);
		if(isPrime(Primesum)) {
			System.out.println("given prime numbers range sum is a prime number");
			
		}
		else {
			System.out.println("given prime numbers range sum is not a prime number");
		}
	}
	public static int SumofPrime(int start,int end) {
		int count=0;
		int sum=0;
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				count ++;
				if(count%2!=0) {
				sum=sum+i;
				}
			}
			
		}
		return sum;
	}
	public static boolean isPrime(int n) {
		
		boolean b=true;
		if(n<=1) b=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				b=false;
				break;
			}
		}
		if(b) return true;
		else return false;
		
		
	}
}
