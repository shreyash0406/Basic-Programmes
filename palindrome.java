import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int r=0;
        while(temp>0){
            int a=temp%10;
            r=r*10+a;
            temp=temp/10;
        }
        if(r==n){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}