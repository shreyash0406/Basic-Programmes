import java.util.Scanner;
public class powerOfNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the power");
        int pow=sc.nextInt();
        int i=1, sum=1;
        while(i<=pow){
            sum=sum*n;
            i++;
        }
        System.out.println(+n+" to the power "+pow+" is: "+sum);
    }
}