import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterfaceDemo {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);

        System.out.println(ar);


        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(4);
        ll.add(5);
        ll.addFirst(90);
        ll.addLast(89);

        System.out.println(ll);

        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(67);
        st.push(232);

        st.pop();
        System.out.println(st.peek());
        System.out.println(st);


        Vector<Integer> vc = new Vector<>();
        vc.add(32);
        vc.add(342);
        System.out.println(vc);
        System.out.println(vc.capacity());
        System.out.print(vc.size());
    }
    
}
