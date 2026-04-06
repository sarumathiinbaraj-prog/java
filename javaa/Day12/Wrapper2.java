// wrapper class are immutable - if anychanges(new object create [not already exist changed])
import java.util.ArrayList;
public class Wrapper2 {
    public static void main(String[] args) {
        // int[] arr=new int[] --> faster
        ArrayList<Integer> l1=new ArrayList<>();//->slower
        l1.add(10);//autoboxing
        int i=l1.get(0);//unboxing
    }
}
