public class stack_using_array {

    public void push(int val) {
        if (top == size - 1) {
            System.out.println("stack is full");
        } else {
            ++top;
            arr[top] = val;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println("deleted element is" + arr[top]);
            top--;
        }
    }

    public void print(arr[]){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

    public static final int size = 3;
    int[] arr = new int[size];
    int top = -1;
    stack_using_array obj = new stack_using_array();
    obj.push(5);

}