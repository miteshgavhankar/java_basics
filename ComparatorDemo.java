import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(8);
        al.add(1);

        Collections.sort(al, new Comparator<Integer>() {
            
            public int compare(Integer num1, Integer num2) {
                if (num1 < num2) {
                    return 1;
                } else if (num1 > num2){
                    return -1;
                }
                return 0;
            }
        });

        System.out.println(al);
    }
    
}
