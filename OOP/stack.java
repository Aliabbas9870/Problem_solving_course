import java.util.Scanner;

class StackCode {
    Scanner sc = new Scanner(System.in);
    int top = -1;
    int n = 5;
    int arr[] = new int[n];

    void push() {
        if (top == n - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter value:");
            int i = sc.nextInt();
            top = top + 1;
            arr[top] = i;
            System.out.println("Item inserted");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            top = top - 1;
            System.out.println("Item deleted");
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Your items data:");
            for (int i = top; i >= 0; i--) {
                System.out.print(" " + arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class stack {
    public static void main(String[] args) {
        StackCode st = new StackCode();
        Scanner sc = new Scanner(System.in);
        int e;

        do {
            System.out.println("Press 1 for push (insert)");
            System.out.println("Press 2 for pop (delete)");
            System.out.println("Press 3 for display");
            System.out.println("Enter a choice:");
            int d = sc.nextInt();

            switch (d) {
                case 1:
                    st.push();
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println("Press 0 for back manu and any other key press for exit");
            e = sc.nextInt();
        } while (e == 0);
        System.out.println("Exit Sucessfully");

        sc.close(); 
    }
}
