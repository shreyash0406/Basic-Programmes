import java.util.Scanner;
public class sumOfdigit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        int temp=n;
        while(temp>0){
            int a=temp%10;
            temp=temp/10;
            s=s+a;
        }
        System.out.println("Sum of digit of "+n+" is "+s); 
    }
}