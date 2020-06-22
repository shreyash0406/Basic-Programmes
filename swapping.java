import java.util.Scanner;
public class swapping{
    public static void main(String[] args ){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int temp;
        System.out.println("Before Swapping n="+n+" & m="+m);
        temp=n;
        n=m;
        m=temp;
        System.out.println("after Swapping n="+n+" & m="+m);
    }
}