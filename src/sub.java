public class sub {
    public static void subsequences(String word,int i,String newStr){
        System.out.println("My new String is:"+newStr);
        if(i==word.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=word.charAt(i);
        System.out.println("Running 1st ");
        subsequences(word, i+1,newStr+currChar);
        System.out.println("Running 2nd ");
        subsequences(word, i+1,newStr);

    }
    public static void main(String[] args) {
        System.out.println("Print all Subsequences of a given String");
        String k="abc";
        subsequences(k, 0, "");
    }
}
