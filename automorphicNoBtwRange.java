import java.util.Scanner;
public class automorphicNoBtwRange{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Automorphic number between "+a+" to "+b);
        for(int i=a; i<=b; i++){
            int temp=i;
            int sq=i*i;
            int c=0;
            while(temp>0){
                c++;
                temp=temp/10;
            }
            int p=(int)(Math.pow(10,c));
            if(sq%p==i){
                System.out.println(i);
            }
        }
    }
}