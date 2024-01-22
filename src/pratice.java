import javax.sound.midi.Track;

public class pratice {
    public static class Node{
        Node[] children;
        boolean eow;
        Node(){
            this.children=new Node[26];
            this.eow=false;
            for (int i = 0; i < 26; i++) {
                this.children[i]=null;   
            }
        }
    }
        static Node root=new Node();
        // Count Number of nodes by using count function
        public static int countNode(Node root){
            Node current=root;
            int count=0;
            if(current==null){
                return 0;
            }
            for(int i=0;i<26;i++){
                if(current.children[i]!=null){
                    System.out.println("The Value of CountNode is:"+countNode(root.children[i]));
                    count+=countNode(root.children[i]);
                }
            }
            return count+1;
        }
        //Count UniqueSubStrings Of Given Problem
        public static int uniquestr(String word){
            for (int i = 0; i < word.length(); i++) {
                String suffix=word.substring(i);
                insert(suffix);
            }
            return countNode(root);
        }
        // Starts With Problem Solution
        public static boolean startsWith(String word){
            Node current=root;
            for(int i=0;i<26;i++){
                int idx=word.charAt(i)-'a';
                if(current.children[idx]==null){
                    return false;
                }
                if(i==word.length()-1){
                    return true;
                }
                current=current.children[idx];

            }
            return false;
        }
        // Searching The Data in Trie Data Structure
        public static boolean search(String word){
            Node current=root;
            for (int i = 0; i < word.length(); i++) {
                int idx=word.charAt(i)-'a';
                if(current.children[idx]==null){
                    return false;
                }
                if(i==word.length()-1){
                    if(!current.eow){
                        return false;
                    }
                }
                current=current.children[idx];
            }
            return true;
        }
        //Inserting Data in Trie Data Structure
        public static void insert(String word){
            Node current =root;
            for(int i=0;i<word.length();i++){
                int idx=word.charAt(i)-'a';
                if(current.children[idx]==null){
                    System.out.println("Making a New Node and word is "+word.charAt(i));
                    current.children[idx]=new Node();
                }
                else{
                    System.out.println("Getting in Else Condtition "+word.charAt(i)+" is already present ");
                }
                if(i==word.length()-1){
                    current.eow=true;
                }
                current=current.children[idx];
            }
        }
    public static void main(String[] args) {
        System.out.println("Working on Triee Data Structure");
        // insert("apple");
        // insert("app");
        // insert("mango");
        // insert("man");
        // insert("woman");
        // System.out.println(search("woman"));
        // System.out.println("In Triee Data Structure prefix Starts With "+startsWith("moon"));
        System.out.println("Unique Substring Present are:"+uniquestr("ababa"));

        
    }
    
}
