
import java.util.Scanner;

public class sumofodd {
    public static boolean isodd(int i){
        return i%2 != 0;

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int oddsum=0;
        for(int i=0;i<n;i++){
         if(isodd(i)){
            oddsum+=i;
         }
 
        }
        System.out.println(oddsum);
    }
    
}
