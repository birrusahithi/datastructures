import java.sql.SQLOutput;

public class Stack {
    static final int max = 1000;
    int top;
    int a[] = new int[max];

    public boolean isEmpty() {
        return top < 0;
    }

    Stack() {
        top = -1;
    }

    boolean push(int x) {
        if (top >= max - 1) {
            System.out.println("Stackoverflow");
            return false;
        } else {
            top++;
            a[top] = x;
            System.out.println(x + " pushed value");
            return true;
        }

    }

    public int pop() {
        if (top < 0) {
            return 0;
        } else {
            int y = a[top--];
            return y;
        }

    }

    public int peek() {
        if (top < 0) {
            System.out.println("StockUnderflow");
            return 0;
        } else {
            int z = a[top];
            return z;
        }
    }

    void print() {
        for (int i = top; i > -1; i--) {
            System.out.println(a[i] + "");
        }
    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        System.out.println(obj.isEmpty());
        System.out.println("return" + " " + obj.peek());

        System.out.println("last element removed" + " " + obj.pop());
        obj.print();
    }

}

