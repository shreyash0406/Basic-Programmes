/* A spy number is a number whose sum of digits is eual to the product of 
digits 
For example:
1124 is spy number
1+1+2+4=8
1*1*2*4=8*/
import java.util.Scanner;
public class spyNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sum=0, product=1;
        while(temp>0){
            int r=temp%10;
            sum=sum+r;
            product=product*r;
            temp=temp/10;
        }
        if(sum==product){
            System.out.println(n+" is a spy number");
        }
        else{
            System.out.println(n+" is not a spy number");
        }
    }
}