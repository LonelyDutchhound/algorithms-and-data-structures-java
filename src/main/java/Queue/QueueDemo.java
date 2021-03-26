package Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 0; i < 5; i++) {
            queue.offer(i);
        }

        int queueSize = queue.size();
        for (int i = 0; i <= queueSize; i++) {
            System.out.println("size: " + queue.size());
            System.out.println("head: " + queue.peek());
            System.out.println(queue.poll());
            System.out.println("Empty: " + queue.isEmpty());
        }
    }
}
