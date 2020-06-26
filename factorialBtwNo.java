import java.util.Scanner;
public class factorialBtwNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("factorial of numbers between "+a+" to "+b);
        System.out.println("Numbers : factorial");
        for(int i=a; i<=b; i++){
            int fact=1;
            for(int j=1; j<=i;j++){
                fact=fact*j;
            }
            System.out.println(i+" : "+fact);
        }
    }
}