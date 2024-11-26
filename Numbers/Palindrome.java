package Numbers;


import java.util.Scanner;
class Palindrome {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int s = sc.nextInt();
        int e=sc.nextInt();
        range(s,e);
    }
    public static void range(int s,int e){
        for(int i=s;i<=e;i++){
            if(isPalindrome(i)) System.out.println(i);
    }
}
    public static boolean isPalindrome(int n){  
        int temp=n,rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(temp==rev) return true;
        else return false;
    }
}

