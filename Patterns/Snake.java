package Patterns;

import java.util.Scanner;
class Snake {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
            
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
             }

            else{

                int num=k+i-1;
                for(int j=1;j<=i;j++){
                    System.out.print(num+" ");
                    num--;
                }
                k+=i;
            }
           System.out.println();
        }
       
            }
        }
