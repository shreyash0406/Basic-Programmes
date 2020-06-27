import java.util.Scanner;
public class circumferenceOfCircle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius");
        float r=sc.nextFloat();
        
        float c=(float)(2*3.14*r);
        System.out.println("Circumference of the circle: "+c);
    }
}