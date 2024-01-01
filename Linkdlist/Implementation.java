package ProblemSolving.Linkdlist;



public class Implementation {
public static class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;

            } else {
                tail.next = temp;

            }
            tail = temp;
        }
        void insertAtBeginner(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }else{
                temp.next=head;
                head=temp;

            }
        }
        void insertAt(int idx, int data){
            Node t= new Node(data);
            if(idx==size()){
                insertAtEnd(data);
                return;
            }
            if(idx==0){
                insertAtBeginner(data);
                return;
            }else if(idx<0 || idx>0){
                System.out.println("Wrong Index ");
            }
            Node temp=head;
            for(int i=0; i<idx-1-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
       int getAt(int idx){
            Node temp=head;

            for(int i=0; i<idx;i++){
              temp=temp.next;
            }
            return temp.data;
       }
       void deleteAt(int idx){
            if (idx==0){
                head= head.next;
            }
            Node temp=head;
           for(int i=0;i<idx-1;i++){
              temp=temp.next;
           }
           temp.next=temp.next.next;
           tail=temp;
       }
        void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        int size(){
            Node current=head;
            int count=0;
            while(current!=null){
                count++;
                current=current.next;
            }
            return count;
        }



        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.display();
            ll.insertAtBeginner(1);
            ll.insertAt(1,10);
            ll.insertAt(4,14);
            ll.insertAt(0,11);
            ll.display();
            ll.deleteAt(1);
            ll.display();
            System.out.println("The size is: "+ll.size());

            System.out.println(ll.getAt(4));

        }
    }
}

}
