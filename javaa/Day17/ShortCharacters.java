import java.util.*;
public class ShortCharacters {
    public static List<Character> shortChar(String s){
        //1.frequency
        Map<Character,Integer>freq=new HashMap<>();
        for(int i=0;i<s.length();i++){
            freq.put(s.charAt(i),freq.getOrDefault(s.charAt(i), 0)+1);
        }
        //2.map strode in list
        List<Map.Entry<Character,Integer>>list=new ArrayList<>(freq.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b){
                if(!a.getValue().equals(b.getValue())){
                    return b.getValue()-a.getValue();//count accses
                }
                return a.getKey()-b.getKey();//key accses
            }
        });
        List<Character>result=new ArrayList<>();
        //list(map,entries)->list(characters)
        for(Map.Entry<Character,Integer> i:list){
            result.add(i.getKey());
        }
        return result;
    }
    public static void main(String[] args) {
        String s="tree";
        System.out.print(shortChar(s));
    }
}
