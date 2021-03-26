package Stack;

import DataStructure.DataStructure;

public class Stack<T> extends DataStructure {
    private Node<T> top;

    public T push(T value){
        Node<T> node = new Node(value);

        if (top == null){
            top = node;
            top.previous = null;
        } else {
            Node previous = top;
            top = node;
            top.previous = previous;
        }

        size++;
        return node.value;
    }

    public T pop() {
        if (top == null) return null;

        T popped = top.value;

        top = top.previous;
        size--;
        return popped;

    }

    public T peek() {
        return top != null ? top.value : null;
    }

    private static class Node<T>{
        private final T value;
        private Node<T> previous;

        public Node(T value){
            this.value = value;
        }
    }
}
