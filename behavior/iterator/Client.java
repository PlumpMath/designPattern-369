package behavior.iterator;

import java.util.*;

/**
 * Created by manish.sharan on 12/09/16
 */
public class Client {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("manish");
        list.add("sharan");
        list.add("bangalore");
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        String[] array = new String[3];
        array[0] = "testing";
        array[1] = "iterator";
        Map<String,String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");

        ArrayListCollection arrayListCollection = new ArrayListCollection(list);
        HashSetCollection hashSetCollection = new HashSetCollection(set);
        ArrayIterator arrayIterator = new ArrayIterator(array);
        MapIterator mapIterator = new MapIterator(map);

        //iteration can be done in a usual way taking each collection at a time

        //iteration using iterator
        iterateAndPrintCollectionContents(arrayListCollection);
        iterateAndPrintCollectionContents(hashSetCollection);
        iterateAndPrintCollectionContents(arrayIterator);
        iterateAndPrintCollectionContents(mapIterator);

    }

    private static void iterateAndPrintCollectionContents(CommonIterator commonIterator){
        Iterator iterator = commonIterator.iterate();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

/* Philosophy:

We can use a common way to iterate over different types of collections. As per the client code above, we could had iterated over each collection by calling iterator
on each of them and then iterating. But that would be code repetetion as they would return differnt types of iterator.

We create one common type of iterator and call the smae iterator implicitly in the collection classes and then use it to print the values.

 */
