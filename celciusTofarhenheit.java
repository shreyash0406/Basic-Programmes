import java.util.Scanner;
public class celciusTofarhenheit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in centigrade");
        float c=sc.nextFloat();
        float f=(float)((1.8 * c)+32.0);
        System.out.println("Temperature in farhenheit= "+f);
    }
}