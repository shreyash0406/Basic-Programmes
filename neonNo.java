/*A neon number is a number whose sum of digits of its square is equal to the
number
For example:
9*9=81 // (8+1)=9*/
import java.util.Scanner;
public class neonNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sq=n*n;
        int sum=0;
        int temp=sq;
        while(temp>0){
            int r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        if(sum==n){
            System.out.println(n+" is a Neon number");
        }
        else{
            System.out.println(n+" is not a Neon number");
        }
    }
}