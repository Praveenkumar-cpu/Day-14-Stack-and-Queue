package queue;

import queue.QueueOperations;

import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {


        QueueOperations queue = new QueueOperations();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printList();

        queue.dequeue();
        queue.printList();

    }
}
