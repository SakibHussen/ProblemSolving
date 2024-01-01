package ProblemSolving.Linkdlist;

public class nthNodeFromEnd {
    public static Node nthNode(Node head, int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }

        int m= size- n + 1;

        temp=head;
        for(int i=1; i<m;i++){

            temp=temp.next;

        }

        return temp;
    }
    //If intervewer ask us to do it one traverse
    public static Node nthNode2(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=0; i<n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public static Node deleteNthFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=0; i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }

    }

    public static void main(String[] args) {
        Node a= new Node(100);
        Node b= new Node(13);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node q=nthNode(a,3);
        Node r=nthNode2(a,3);

        display(a);
       a= deleteNthFromEnd(a,6);
        display(a);


    }
}
