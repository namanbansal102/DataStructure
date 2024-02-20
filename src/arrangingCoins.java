public class arrangingCoins {
    public static void main(String[] args) {
        System.out.println("Arranging Coins LeetCode Problem");
        int n=1804289383;
        long first=1;
        long last=n;
        while (first<=last) {
            long mid=(first+last)/2;
            
            long sum=mid*(mid+1)/2;
            if (sum<=n) {
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        System.out.println(first-1);
    }
}
