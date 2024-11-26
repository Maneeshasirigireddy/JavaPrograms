package Numbers;

import java.util.Scanner;
class Prime {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            if(i<=1) continue;
            boolean flag = true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println(i);


        }
    }
}

