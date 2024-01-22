import java.util.ArrayList;

public class move {
    
    public static boolean boolArr[]=new boolean[26];
    
    public static void recursive(String word,int i,int n){
        int idx=word.charAt(i)-'a';
        if (i==n-1) {
            System.out.println("i = n condition");
            StringBuilder k=new StringBuilder();

            for (int p = 0; p <26; p++) {
                if(boolArr[p]==true){
                    
                    k.append((char)(p+'a'));
                } 
            }
            System.out.println(k);
            return;
            
        }        
        if(!boolArr[idx]){
            boolArr[idx]=true;
        }
        recursive(word, i+1, n);
    }
    public static void main(String[] args) {
        System.out.println("Recursive Problem to Remove Duplicates Elements from  a string");
        String eg="namanbansal";
        recursive(eg, 0, eg.length());

    }
}
