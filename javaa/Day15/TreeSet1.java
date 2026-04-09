
import java.util.*;
//closest element
public class TreeSet1 {

    public static void main(String[] args) {
        TreeSet<Integer>ts=new TreeSet();
        int t=1;
        int[] arr={15,3,9,1,7,2};
        for (int i:arr){
            ts.add(i);
        } 
        Integer high=ts.higher(t);
        Integer low=ts.lower(t);
        int result=0;
        if(low==null){
            result=high;
        }else if(high==null){
            result=low;
        }
        else{
            result=t-low<high-t?low:high;
        }
        System.out.print(result);
    }
}
