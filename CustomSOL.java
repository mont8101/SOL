import java.util.ListIterator;

/**
Represents a SOL using a custom implementation of a Linked List

@author YOUR NAME HERE


*/

public class CustomSOL<E> implements SOL<E>{
    //Note: Your implementation must provide a constructor with no input parameters.
    
    private static class Node<E> {
        private E data;
        private Node<E> next;
        
        // constructor
        private Node(E data) {
            this.data = data;
            next = null;
        }
        
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    }
    
    private Node<E> head = null;
    private int size;
    
    public CustomSOL() {
        size = 0;
    }
    
    @Override
    public E solLookup(E target) {
        return null;
    }
    
    @Override
    public boolean solAdd(E toAdd) {
        if (size == 0) {
            Node<E> newNode = new Node<E>(toAdd);
            head.next = newNode;
            size++;
            return true;
        } else {
            Node<E> newNode = new Node<E>(toAdd);
            head.next = newNode;
            newNode.next = ;
            size++;
            return true;
        }
    }
    
    @Override
    public String prettyStr() {
        StringBuilder toReturn = new StringBuilder("{");
        Node<E> nodeRef = head;
        while (nodeRef != null) {
            toReturn.append(nodeRef.data);
            if (nodeRef.next != null) {
                toReturn.append(", ");
            }
            nodeRef = nodeRef.next;
        }
        toReturn.append("}");
        return toReturn.toString();
    }
    
    /**
    For each item in the list, create a copy of it.
    */
    public void duplicate(){
        
    }
    
    /**
    For each item in the list, if there is a copy or copies adjacent to the item, delete the copies.
    */
    public void collapse(){
        
    }

}
