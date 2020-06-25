import java.util.Scanner;
public class LCM{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int bigger, smaller;
        if(a>b){
            bigger=a;
            smaller=b;
        }
        else{
            bigger=b;
            smaller=a;
        }
        for(int i=1; i<=bigger; i++){
            if(((bigger*i)%smaller)==0){
                int lcm=bigger*i;
                System.out.println("LCM of "+a+" and "+b+" is "+lcm);
                break;
            }
        }
    }
}