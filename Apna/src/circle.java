
import java.util.Scanner;

public class circle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radias of circle:");
        int r=sc.nextInt();
        System.out.println(circumference(r));
    }

    private static double   circumference(int r) {
        return 2*Math.PI*r;

    }

}
