
import java.util.Scanner;

public class circlearea {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radias of circle:");
        int r=sc.nextInt();
        System.out.println("Area of circle is: "+area(r));
    }

    private static double   area(int r) {
        return Math.PI*r*r;
    }
    
}
