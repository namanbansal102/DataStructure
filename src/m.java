public class m {
    static int first=-1;
    static int last=-1;
    static int i=0;
    public static boolean isSorted(int arr[],int i,int n){
        if(i==n){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return isSorted(arr, i+1, n);
        }
        else{
            return false;
        }
        
    }
    public static void printRev(String word,int n){
        if (n==0) {
            return;
        }
        System.out.print(word.charAt(n-1));
        printRev(word, n-1);
    }
    public static void findcons(String eg,int idx,char ch){
        if(eg.charAt(idx)==ch){
            if(first==-1){
                first=idx;
            }
            last=idx;
        }
        if(idx==eg.length()-1){
            System.out.println(first+" "+last);
            return;
        }
        findcons(eg, idx+1, ch);


    }
    public static void main(String[] args) {
        // printRev("bansal", 5);
        // String eg="bnachiyuab";
        // findcons(eg, 0, 'b');
        System.out.println("Check If Array is Sorted Strictly Increasing or Not by using Recursion");
        int arr[]={1,2,3,4,5,5};
        System.out.println("Array is Strictly Inccreasing "+isSorted(arr, 0, arr.length));
        System.out.println("Recursion Problem Solved");
    }
    
}
