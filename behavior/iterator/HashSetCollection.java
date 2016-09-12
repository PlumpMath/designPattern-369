package behavior.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by manish.sharan on 12/09/16.
 */
public class HashSetCollection implements CommonIterator {

    private Set<String> hashSet = new HashSet<>();

    public HashSetCollection(Set<String> hashSet){
        this.hashSet = hashSet;
    }

    @Override
    public Iterator iterate() {
        return hashSet.iterator();
    }
}
