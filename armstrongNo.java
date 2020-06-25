import java.util.Scanner;
public class armstrongNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int temp;
        temp=n;
        int c=0;
        int sum=0;
        while(temp>0){
            c=c+1;
            temp=temp/10;
        }
        System.out.println(c);
        int t=n;
        while(t>0){
            int r=t%10;
            sum=sum+(int)(Math.pow(r,c));
            t=t/10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}