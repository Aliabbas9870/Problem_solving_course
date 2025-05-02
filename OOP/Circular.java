import java.util.Scanner;

public class Circular {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void create() {
        int n, data;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter the data:");
            data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {

                head = new_node;
                tail = new_node;
                new_node.next = head;

            }

            System.out.println("Do you want to continue adding data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);

        sc.close();

    }

    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            while (temp.next != head) {
                System.out.print("[ " + temp.data + " ] ");
                temp = temp.next;
            }
            System.out.println(); 
        }

    }

    public static void main(String[] args) {
        Circular cl = new Circular();
        cl.create();
        cl.show();
    }

}
