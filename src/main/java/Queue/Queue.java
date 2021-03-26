package Queue;

import DataStructure.DataStructure;

public class Queue<T> extends DataStructure {

    private Node<T> head;
    private Node<T> tail;

    public boolean offer(T value) {
        Node node = new Node<T>(value);

        if (head == null){
            head = node;
        }
        if (tail != null){
            tail.next = node;
        }
        tail = node;
        size++;
        return true;
    }

    public T poll() {
        if (head == null){
            tail = null;
            return null;
        }

        T polled =  head.value;
        head = head.next;
        size--;
        return polled;
    }

    public T peek() {
        return head != null ? head.value : null;
    }

    private static class Node<T>{
        private final T value;
        private Node<T> next;

        public Node(T value){
            this.value = value;
        }
    }

}
