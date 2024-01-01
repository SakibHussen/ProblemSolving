package ProblemSolving.Linkdlist;

public class Node {
    int data;
    Node next;
    public  Node(int data){
        this.data= data;
    }
//Counting the leength of the Linkdlist

    public static int countLength(Node a){
        int length=0;
        while(a!=null){
            length++;
            a=a.next;
        }
        return length;
    }

    //displaying recursively
    public static void displayR(Node head){
        if(head==null) return;
        System.out.println(head.data);
        displayR(head.next);
    }
    public static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
   Node a= new Node(3);
   Node b= new Node(4);
   Node c= new Node(5);
   Node d= new Node(6);
   Node e= new Node(7);
   a.next=b;
   b.next=c;
   c.next=d;
   d.next=e;
   display(a);
        System.out.println("printing recursively");
        displayR(a);

        int length= countLength(a);
        System.out.println("The Length is = "+length);
    }
}
