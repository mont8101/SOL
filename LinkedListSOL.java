import java.util.LinkedList;
import java.util.ListIterator;

/**
Represents a SOL using Java's implementation of a Linked List

@author Luca Comba

*/
public class LinkedListSOL<E> implements SOL<E>{
    private LinkedList<E> list;
    
    public LinkedListSOL() {
        list = new LinkedList<E>();
    }
    
    /**
     * @see SOL#solLookup(java.lang.Object)
     */
    @Override
    public E solLookup(E target) {
        // creating the list iterator to look for the target
        ListIterator<E> iterator = list.listIterator();
        while (iterator.hasNext()) {
            E current = iterator.next();
            if (current.equals(target) ) {
                iterator.remove();
                if (iterator.hasPrevious()) {
                    iterator.previous();
                }
                iterator.add(target);
                return target;
            }
        }
        // if not found return null
        return null;
    }

    
    /**
     * @see SOL#solAdd(java.lang.Object)
     */
    @Override
    public boolean solAdd(E toAdd) {
        // adding the object to the list at the end
        list.add(toAdd);
        return true;
    }

    
    /**
     * @see SOL#prettyStr()
     */
    @Override
    public String prettyStr() {
        StringBuilder toReturn = new StringBuilder("{");
        ListIterator<E> iterator = list.listIterator();
        E currentValue;
        while (iterator.hasNext()) {
            currentValue = iterator.next();
            toReturn.append(currentValue);
            if (iterator.hasNext()) {
                toReturn.append(",");
            }
        }
        toReturn.append("}");
        return toReturn.toString();
    }
}
