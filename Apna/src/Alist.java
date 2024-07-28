
import java.util.ArrayList;

public class Alist {
    public static void main(String[] args) {
        ArrayList<Integer> ad =new ArrayList<>();
        ad.add(12);
        ad.add(1);
        ad.add(2);
        ad.add(2);
        ad.add(5);
        System.out.println(ad);
        ad.add(3,8);
        System.out.println(ad);
        System.out.println(ad.get(3));
        ad.set(0, 1);
        ad.set(1, 2);
        ad.set(2, 3);
        ad.set(3, 4);
        ad.set(4, 5);
        ad.set(5, 6);
        
        System.out.println(ad);
        ad.remove(5);
        System.out.println(ad);
        int size=ad.size();
        for(int i:ad){
            System.out.print(i+" ");
            // System.out.println(i);
        }
        System.out.println("");
        System.out.println(size);
    }
    
}
