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
            E current = iterator.next();
            if (current.equals(target)) {
                E temp = current;
                /* move the target -1 position
                E temp;
                E currentNext = iterator.next();
                E previous = iterator.previous();
                E previous2 = iterator.previous();
                E previous3 = iterator.previous();
                */
                // swap
                
                return target;
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
        ListIterator<E> iterator = list.listIterator();
        while (iterator.hasNext()) {
            toReturn.append(iterator.next());
            toReturn.append(" ");
        }
        toReturn.append("}");
        return toReturn.toString();
    }
}
