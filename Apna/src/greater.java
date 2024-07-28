
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(greatest(a,b));
    }

    private static int greatest(int a, int b) {
        if(a>b){
            return a;
        }
        return b;
        
    }
    
}
