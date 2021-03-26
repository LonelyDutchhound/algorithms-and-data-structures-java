package Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        int stackSize = stack.size();
        for (int i = 0; i <= stackSize; i++) {
            System.out.println("size: " + stack.size());
            System.out.println("top: " + stack.peek());
            System.out.println(stack.pop());
            System.out.println("Empty: " + stack.isEmpty());
        }
    }
}
