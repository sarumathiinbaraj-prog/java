public class Str {
    public static void main(String[] args) {
        String str="VIRATKOHLI";
        String res="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                res+=str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++){
            if(i%2==1){
                res+=str.charAt(i);
            }
        }
        System.out.print(res);
    }
    
    
}
