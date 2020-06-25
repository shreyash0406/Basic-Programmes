import java.util.Scanner;
public class strongNo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1;
        int sum=0;
        int temp=n;
        while(temp>0){
            int r=temp%10;
            for(int i=1; i<=r; i++){
                p=p*i;
            }
            sum+=p;
            temp=temp/10;
            p=1;
        }
        if(sum==n){
            System.out.println("Strong number");
        }
        else{
            System.out.println("Not Strong number");
        }
    }
}