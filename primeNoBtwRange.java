import java.util.Scanner;
public class primeNoBtwRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("prime numbers between "+a+" to "+b);
        for(int i=a; i<=b; i++){
            int flag=0;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
    }
}