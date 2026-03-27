public class Str2 {
    public static void main(String[] args) {
        String str="VIRATKOHLI";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                sb.append(str.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++){
            if(i%2==1){
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
    
    
}
