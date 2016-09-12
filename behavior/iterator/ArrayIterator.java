package behavior.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by manish.sharan on 12/09/16.
 */
public class ArrayIterator implements CommonIterator {

    private String[] array = new String[10];

    public ArrayIterator(String[] array){
        this.array = array;
    }

    @Override
    public Iterator iterate() {
        return Arrays.asList(array).iterator();
    }
}
