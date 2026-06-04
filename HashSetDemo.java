import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

    public static void main(String[] args) {
        
        // Not sorted
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(7);
        set.add(8);

        System.out.println(set);

        set.remove(2);

        System.out.println(set);

        set.size();
        

        //always sorted
        TreeSet <Integer> tree = new TreeSet<>();
        tree.add(4);
        tree.add(7);
        tree.add(89);

        System.out.println(tree);
    }
    
}
