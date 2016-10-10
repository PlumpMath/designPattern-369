package stuff.threads;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by manish.sharan on 22/09/16
 */
public class ProducerConsumer {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int maxSize =10;

        Producer producer = new Producer(queue, maxSize, "producer");
        Consumer consumer = new Consumer(queue, maxSize, "producer");

        producer.start();
        consumer.start();
    }

}
