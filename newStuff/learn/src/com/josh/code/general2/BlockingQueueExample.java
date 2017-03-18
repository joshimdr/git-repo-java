package com.josh.code.general2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
//import java.util.function.Consumer;

public class BlockingQueueExample {

    public static void main(String[] args) throws Exception {

        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();

        Thread.sleep(4000);
    }
}

class Producer implements Runnable{

    protected BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	System.out.println("Put 1 in queue");
            queue.put("1");
            Thread.sleep(1000);
            System.out.println("Put 2 in queue");
            queue.put("2");
            Thread.sleep(1000);
            System.out.println("Put 3 in queue");
            queue.put("3");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer implements Runnable{

    protected BlockingQueue queue = null;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        try {
        	System.out.println("Take from queue ");
            System.out.println(queue.take());
            System.out.println("Take from queue ");
            System.out.println(queue.take());
            System.out.println("Take from queue ");
            System.out.println(queue.take());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
