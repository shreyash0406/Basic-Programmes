import java.util.Scanner;
public class reverseNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        int d=0;
        while(temp>0){
            int r=temp%10;
            d=(d*10)+r;
            temp=temp/10;
        }
        System.out.println("Reverse of "+n+" is "+d);
    }
}