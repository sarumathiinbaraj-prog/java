

public class Str3 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String str="words with even length";
        str=str.trim();
        int k=0;
        int n=str.length();
        for(int i=1;i<=n;i++){
            if(i==n||str.charAt(i)==' '){
                String a=str.substring(k,i);
                if(a.length()%2==0){
                    sb.append(a);
                    sb.append(" ");
                }
                k=i+1;
            }

        }
        System.out.print(sb.toString().trim());
    }
}
