package Numbers;

import java.util.Scanner;
class Strong {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range");
        int a = s.nextInt();
        int b=s.nextInt();
       
        for(int i=a;i<=b;i++){
            int temp=i;
        int sum=0;

        while(temp>0)
        {
            int d = temp%10;
            int fact = 1;
            for(int j = 1; j <= d; j++)
            {
                fact *= j;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==i) System.out.println(i+" Strong Number");
        
        }
    }
}
