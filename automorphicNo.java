/*An Automorphic number is a number whose square ends in the same digits as the 
number itself
for example:
5, 6, 25 are automorphic numbers.
5*5=25 // last digit 5
6*6=36 // last digit 6
25*25=625 // last digit 25*/
import java.util.Scanner;
public class automorphicNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean equal=false;
        int temp=n;
        int t=10;
        int sq=n*n;
        int r;
        System.out.println("Square of "+n+" is "+sq);
        while(temp>0){
            r=sq%t;
            if(n==r){
                equal=true;
                break;
            }
            temp=temp/10;
            t=t*10;
        }
        if(equal==true){
            System.out.println(n+" is a automorphic number");
        }
        else{
            System.out.println(n+" is not a automorphic number");
        }
    }
}