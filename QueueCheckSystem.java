package Appliance;
import java.util.LinkedList;
import java.util.Queue;

public class QueueCheckSystem {
    private Queue<Integer> queue;
    public QueueCheckSystem() {
        this.queue = new LinkedList<>();
    }
    public void enqueue(int personId) {
        queue.offer(personId);
        System.out.println("Person " + personId + " has joined the queue.");
    }
    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        int personId = queue.poll();
        System.out.println("Person " + personId + " is being checked.");
        return personId;
    }
    public int peek() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
        return queue.peek();
    }
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public int size() {
        return queue.size();
    }
}
