package stuff.threads;

import java.util.Queue;
import java.util.Random;

/**
 * Created by manish.sharan on 22/09/16
 */
public class Producer extends Thread{

    private Queue<Integer> queue;
    private int maxSize;

    public Producer(Queue<Integer> queue, int maxSize, String name){
        super(name);
        this.maxSize = maxSize;
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            synchronized (queue){
                while(queue.size() == maxSize){
                    try {
                        System.out.println("Queue is full, waiting for consumer to consume");
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Random random = new Random();
                int num = random.nextInt();
                System.out.println("Pushing integer "+ num);
                queue.add(num);
                queue.notifyAll();
            }
        }
    }
}
