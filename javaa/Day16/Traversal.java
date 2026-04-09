//Iterator -move forwared only
import java.util.*;
public class Traversal{
    public static void main(String[] args){
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer>it=list.iterator();//cursor create agidum (startvalue ku before)
        while(it.hasNext()){ //iteration
            int current=it.next();//element accessing
            if(current==4){
                it.remove();
            }   
            
        }
        System.out.print(list);
    }
}