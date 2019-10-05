import java.util.LinkedList;
import java.util.ListIterator;

/**
Represents a SOL using Java's implementation of a Linked List

@author YOUR NAME HERE


*/

public class LinkedListSOL<E> implements SOL<E>{
    private LinkedList<E> list;
    
    public LinkedListSOL() {
        list = new LinkedList<E>();
    }
    
    @Override
    public E solLookup(E target) {
        // creating the list iterator to look for the target
        ListIterator<E> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                // move the target -1 position
                if(iterator.previous().equals(target)) {
                    return target;
                }
            }
        }
        // if not found return null
        return null;
    }

    @Override
    public boolean solAdd(E toAdd) {
        // adding the object to the list at the end
        list.add(toAdd);
        return true;
    }

    @Override
    public String prettyStr() {
        StringBuilder toReturn = new StringBuilder("{");
        ListIterator<E> iterator = new ListIterator<>(list);
        while (iterator.hasNext()) {
            toReturn.append(",");
            toReturn.append(iterator.next());
        }
        toReturn.append("}");
        return toReturn.toString();
    }
    
    public boolean duplicate() {
        // check if we can do it
        if (list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean collapse() {
        // check if we can do it
        if (list.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
