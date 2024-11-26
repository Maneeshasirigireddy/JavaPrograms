package Numbers;

import java.util.Scanner;
class Armstrong
 {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=s.nextInt();
        int b=s.nextInt();
        
        for(int i=a;i<=b;i++){
            int temp=i;
            int count=0;
            int t=i;
            while(t>0)
            {
             count++;
              t=t/10;
           }
        int sum=0;
        
        t=i;
        while(t>0)
        {
            int d=t%10;
            int prod=1;
            for(int k=1;k<=count;k++)
            {
                prod=prod*d; 
            }
            sum+=prod;
            t/=10;
        }
    
        if(sum==temp)System.out.println(temp+" Armstrong number");
    }
    }
}
