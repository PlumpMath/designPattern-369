package behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by manish.sharan on 12/09/16.
 */
public class ArrayListCollection implements CommonIterator {

    private List<String> arrayList = new ArrayList<>();

    public ArrayListCollection(List<String> arrayList){
        this.arrayList = arrayList;
    }

    @Override
    public Iterator<String> iterate() {
        return arrayList.iterator();
    }
}
