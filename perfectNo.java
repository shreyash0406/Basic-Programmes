import java.util.Scanner;
public class perfectNo{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int i=1;
        int s=0;
        int n=sc.nextInt();
        while(i<n){
            if(n%i==0){
                s=s+i;
            }
            i++;
        }
        if(s==n){
            System.out.println(i+" is a perfect number");
        }
        else{
            System.out.println(i+" is not a perfect number");
        }
    }
}