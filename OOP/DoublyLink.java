import java.util.Scanner;

public class DoublyLink {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.next = null;

        }
    }

    Node head = null;
    Node tail = null;

    public void create() {
        int data, n, m, p;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter New data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                head.prev = new_node;
                new_node.next = head;
                head = new_node;

            }
            System.out.println("do you contine so press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void travers() {
        System.out.println("Hi I am Show your data ");
        Node temp = head;
        if (head == null) {
            System.out.println("LinkList Not Exits");
        } else {
            while (temp != null) {
                System.out.print(" " + temp.data);
                temp = temp.next;
            }
         
        }

    }

    public static void main(String[] args) {
        System.out.println("Doubly LinkList");
        DoublyLink db = new DoublyLink();
        db.create();
        db.travers();
    }
}
