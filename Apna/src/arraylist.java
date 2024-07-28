import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList <Integer> li= new ArrayList<>();
        for(int i=1;i<=n;i++){
            li.add(i);
        }
        System.out.println(li);

    }


}
