import java.util.LinkedList;

public class laptop{
    static Node head=null;
    public void addLast(int data){

        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        Node k=head;
        while (k.next!=null) {
            k=k.next;
        }
        k.next=temp;
    
    }

    public static  Node  mergeSorted(Node l1,Node l2){

        Node head=new Node(100);
        Node temp=head;
        Node temp1=l1;
        Node temp2=l2;
        System.out.println(temp2.data);
        while (temp1!=null && temp2!=null) {
            if(temp1.data<temp2.data){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
                
                System.out.println("temp1 is smaller"+temp.data);
            }
            else{
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
                System.out.println("temp2 is smaller"+temp.data);
                
            }
            
        }
       
        System.out.println("All Loops Completed");
        if(temp1==null){
            temp.next=temp2;
        }
        if(temp2==null){
            temp.next=temp1;
        }
        // l3.display();
        return head;
    }
    public  void addFirst(int data){
        Node temp=new Node(data);
        temp.next=head;
        head=temp;
        return;
        
    }
    public static void revDisplay(Node head){
        if(head==null){
            return;
        }
        revDisplay(head.next);
        System.out.print(head.data+"->");

    }
    public static Node reverseList(Node head){
        //Firstly Recursion Approcah Starts
        if(head.next==null){
            System.out.println("Reaching Condition of head==null");
            System.out.println(head.data);
            return head;
        }
        Node nodeHead=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return nodeHead;     
    }
    public static Node iterReverse(Node head){
        Node prev=null;
        Node curr=head;
        Node after=null;
        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;

        }
        return prev;

    }
    public static Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            
        }
        return slow;

    }
    public static  void display(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);
        
    }
    public Node peek(){
        return head;
    }
    public static  Node oddEvenLinkedList(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node odd=new Node(0);
        Node even=new Node(0);
        Node sole=even;
        Node soleo=odd;
        Node tempe=even;
        Node tempo=odd;
        Node temp=head;
        while (temp.next!=null) {
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            temp=temp.next;
            tempe=tempe.next;
            System.out.println("Running While Loop");
                        
        }
        tempo.next=even.next;
        return odd.next;
    }
    public static int maxSum(Node head){
        Node getMiddle=findMiddle(head);
        int henceSum=-9999;
        Node middleNext=getMiddle.next;
        while (middleNext!=null) {
            if(henceSum<head.data+middleNext.data){
                henceSum=head.data+middleNext.data;
            }
            head=head.next;
            middleNext=middleNext.next;

            
        }
        return henceSum;
    }
    public static boolean palindrome(Node head){
        Node youp=findMiddle(head);
        Node get=reverseList(youp.next);
        youp.next=get;
        while (get!=null) {
            if(head.data!=get.data){
                return false;
            }
            get=get.next;
            head=head.next;
            
        }
        return true;
    }
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        laptop l1=new laptop();
        laptop l2=new laptop();
        l1.addFirst(11);
        l1.addFirst(10);
        l1.addFirst(9);
        l1.addFirst(3);
        l1.addFirst(2);
        // l1.addFirst(1000);
        l1.addFirst(1);
        
        l2.addLast(2);
        l2.addLast(4);
        l2.addLast(6);
        l2.addLast(7);
        // mergeSorted(l1,l2);
        display(l1.peek());
        System.out.println();
        display(mergeSorted(l1.peek(),l2.peek()));
        // display(oddEvenLinkedList(head));
        // System.out.println(oddEvenLinkedList(head).data);
        
        // System.out.println("checking palindrome "+palindrome(l1.peek()));
        // display(l1.peek());
        // System.out.println("Getting Maximum Sum "+maxSum(head));
        // System.out.println("Our After REuslt is:");
        // System.out.println(findMiddle(l1.peek()).data); 
        // display(iterReverse(l1.peek())); 
        System.out.print("Null");
        System.out.println();
        System.out.println("Merging Two Sorted Linked List");

        
    }
}