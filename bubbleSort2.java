import java.util.Scanner;
public class bubbleSort2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        for(int i=0; i<n-1; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++){
            boolean sorted=true;
            for(int j=0; j<n-1-i; j++){
                if(a[j+1]<a[j]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted=false;
                }
            }
        }
        for(int item: a){
            System.out.println(item+" ");
        }
    }
}