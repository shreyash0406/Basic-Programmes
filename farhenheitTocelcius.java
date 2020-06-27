import java.util.Scanner;
public class farhenheitTocelcius{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in farhenheit");
        float f=sc.nextInt();
        float c=(float)((f-32)/1.8);
        
        System.out.println("Temperature in centigrade= "+c);
    }
}