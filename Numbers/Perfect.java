package Numbers;

import java.util.Scanner;
class Perfect {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = s.nextInt();
        int b=s.nextInt();
        
        for(int j=a;j<=b;j++){
            int temp=j;
            int sum = 0;
        for(int i = 1; i <= j/2 ; i++)
        {
            if(temp % i == 0)
            {
                sum = sum + i;
            }
        }
        
        if(j == sum)
        {
            System.out.println(j+" Perfect num");
        }
    }
        
    }
}

