import java.util.Scanner;
public class automorphicMethod2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int temp=n;
        int sq=n*n;
        int c=0;
        while(temp>0){
            c++;
            temp=temp/10;
        }
        int p=(int)(Math.pow(10,c));
        if(sq%p==n){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphic number");
        }
    }
}