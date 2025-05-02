import java.util.Scanner;

public class LinkList {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
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
                System.out.println(
                        "In which position do you want to add the data? Press 1 for first, 2 for last, 3 for specific position:");
                int m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;
                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:
                        System.out.println("Enter the position:");
                        int pos = sc.nextInt();
                        if (pos <= 0) {
                            System.out.println("Invalid position! Please enter a valid position.");
                        } else if (pos == 1) {
                            new_node.next = head;
                            head = new_node;
                        } else {
                            Node temp1 = head;
                            for (int i = 1; i < pos - 1 && temp1 != null; i++) {
                                temp1 = temp1.next;
                            }
                            if (temp1 == null) {
                                System.out.println("Position out of bounds!");
                            } else {
                                new_node.next = temp1.next;
                                temp1.next = new_node;
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid option! Please enter 1, 2, or 3.");
                        break;
                }
            }
            System.out.println("Do you want to continue adding data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);
        sc.close();
    }
    public void delete() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("Linked List does not exist");
                break;
            } else {
                System.out.println("enter the position which want delete node 1 start 2 end 3 specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = head.next;
                        head = temp;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:
                        System.out.println("Enter the position:");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 1; i < p - 1; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                    default:
                        System.out.println("Invalid option! Please enter 1, 2, or 3.");
                        break;
                }
            }
            System.out.println("Do you want to continue deleting data? If yes, press 1:");
            n = sc.nextInt();
        } while (n == 1);
    }
    public void show() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List does not exist");
        } else {
            while (temp != null) {
                System.out.print("[ " + temp.data + " ] ");
                temp = temp.next;
            }
            System.out.println(); // For better output formatting
        }
    }
    public static void main(String[] args) {
        LinkList li = new LinkList();
        li.create();
        li.show();
        li.delete();
    }
}
