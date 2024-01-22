public class same {
    Node head;
    private int size;
    same(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;  
            size++; 
        }}
        // add First Element in a list
        public void addFirst(String data){
            Node newNode=new Node(data);
            if (head == null){
                head=newNode;
                
                return;
            }
            newNode.next=head;
            head=newNode;

        }
        public void addLast(String data){
            Node newNode=new Node(data);
            if (head == null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while (currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;   
        }
        // Printing the whole linked list
        public void printList(){
            if (head==null){
                System.out.print("List is Empty");
                return;
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"->");
                currNode=currNode.next;
            }
            System.out.print("NULL");
                
            }
            public void deleteFirst(){
                if (head==null){
                    System.out.println("list is Empty");
                }
                size --;
                head=head.next;

            }
            public void deleteLast(){
                if (head==null){
                    System.out.println("list is Empty");
                }
                size--;
                if (head.next==null){
                    head=null;
                    return; 
                }
                Node secondLast=head;
                Node lastNode=head.next;
                while(lastNode.next!=null){
                    secondLast=secondLast.next;
                    lastNode=lastNode.next;
                }
                secondLast.next=null;

            }
            public int getSize(){
                return size;
            }
            public void reverseIterate(){
                if (head==null){
                    return;
                }
                if (head.next==null){
                    return;
                }
                Node prevNode=head;
                Node currNode=head.next;
                while(currNode!=null){
                    Node nextNode=currNode.next;
                    currNode.next=prevNode;
                    //update
                    prevNode=currNode;
                    currNode=nextNode;
                }
                head.next=null;
                head=prevNode;
            }
            
    
    public static void main(String[] args) {
        same list=new same();
        
        
    }
}
