public class LinkedListImp
{
    static class node{
        int data;
        node next;

        node(int value) {
            data = value;
            next = null;
        }
    }

    static node head;

    //display the list
    static void printList(){
        node p = head;
        System.out.println("\n[");

        //start from the beginning
        while(p != null){
            System.out.println(" " + p.data + " ");
            p = p.next;
        }
        System.out.println("]");
    }

    //insertion at the beginning

    static void insertatbegin(int data){

        //create a link
        node lk = new node(data);;

        //point it to the old first node
        head = lk;
    }
    public static void main(String[] args){
        int k=0;
        insertatbegin(12);
        insertatbegin(22);
        insertatbegin(30);
        insertatbegin(44);
        insertatbegin(50);
        System.out.println("Linked List: ");
        printList();
    }
}
