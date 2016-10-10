package stuff.threads;

import java.util.Queue;

/**
 * Created by manish.sharan on 22/09/16
 */
public class Consumer extends Thread{

    private Queue<Integer> queue;
    private int maxSize;

    public Consumer(Queue<Integer> queue, int maxSize, String name){
        super(name);
        this.maxSize = maxSize;
        this.queue = queue;
    }

    @Override
    public void run(){
        while(true){
            synchronized (queue){
                while(queue.size() == 0){
                    System.out.println("Queue is empty, waiting for producer to produce");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Removed element" + queue.remove());
                queue.notifyAll();
            }
        }
    }
}
