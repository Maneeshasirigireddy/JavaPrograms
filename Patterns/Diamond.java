package Patterns;


import java.util.Scanner;
class Diamond
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1;i<=n/2;i++){
            for(int j=1;j<=n/2-i+1;j++){
                System.out.print("  ");   
             }
            for(int j=1;j<=2*i-1;j++){
               System.out.print("* ");
             }
            System.out.println();
        }
        for(int i=n/2-1;i>=1;i--){
            for(int j=1;j<=n/2-i+1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}