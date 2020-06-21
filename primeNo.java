import java.util.Scanner;
public class primeNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if(n==1) System.out.println("number is composite");
        for(int i=2; i<n; i++){
            if(n%i==0){
                System.out.println("Number is not prime");
                flag=1;
                break;
            }
        }
        if(flag==0) System.out.println("Number is prime");
    }
}