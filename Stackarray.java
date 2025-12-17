import java.util.*;
class Stack {
    int[] arr;
    int top;
    int n;
    Stack(int n) {
        this.n = n;
        arr = new int[n];
        top = -1;
    }
    void push(int m) {
        if (top == n - 1) {
            System.out.print("stack overflow");
            return;
        }
        arr[++top] = m;
    }
    void pop() {
        if (top == -1) {
            System.out.print("stack underflow");
            return;
        }
        top--;
    }
    int top() {
        if (top == -1) {
            System.out.print("no elements");
            return -1;
        }
        return arr[top];
    }
    int size() {
        return top + 1;
    }
}
public class Stackarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter stack size:");
        int s = sc.nextInt();
        Stack st = new Stack(s);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("top : " + st.top());
        System.out.println("size : " + st.size());
        st.pop();
        System.out.println("top after pop : " + st.top());
    }
}