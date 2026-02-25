package collections;

public class Linkedlist {
    Node head;
    private int size;

    Linkedlist() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
            size++;
        }
    }

    // add item at start of LL
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add item at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // print LL
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete first item
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete from last
    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addFirst(15);
        list.addFirst(16);
        list.addLast(17);
        list.deleteFirst();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize()); //1, nulll not counted
    }
}
