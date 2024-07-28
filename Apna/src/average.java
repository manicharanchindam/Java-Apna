import java.util.Scanner;
public class average {
    public static void sumofaverage(int a, int b, int c){
        System.out.println("Average "+(a+b+c/2));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("Enter B:");
        int b=sc.nextInt();
        System.out.println("Enter C:");
        int c=sc.nextInt();
        sumofaverage(a, b, c);
    
    }
    
}
