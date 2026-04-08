import java.util.*;
public class SetExamble {
    public static void main(String[] args) {
        Set<Integer>Linkedset=new LinkedHashSet<>();
        Set<Integer>Hset=new HashSet<>();
        int [] arr={5,3,9,1,7,2};
        for(int i:arr){
            Linkedset.add(i);
            Hset.add(i);
        }
        System.err.println(Linkedset);
        System.out.println(Hset);
        
    }
}
