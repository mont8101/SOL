import java.util.ListIterator;

/**
Represents a SOL using a custom implementation of a Linked List

@author YOUR NAME HERE


*/

public class CustomSOL<E> implements SOL<E>{
    //Note: Your implementation must provide a constructor with no input parameters.
    private Node<E> head = null;
    private int size;
    
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
    
    public CustomSOL() {
        size = 0;
    }
    
    // Methods
    @Override
    public E solLookup(E target) {
        Node<E> currentNode = head;
        Node<E> previousNode = null;
        Node<E> twoPreviousNode = null;
        
        while (currentNode.next != null) {
            if (currentNode.data.equals(target)) {
                // swap
                twoPreviousNode.next = currentNode;
                previousNode.next = currentNode.next;
                currentNode.next = previousNode;
                // return
                return target;
            } else {
                twoPreviousNode = previousNode;
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }
        if (currentNode.data.equals(target)) { //last one
            // swap
            twoPreviousNode.next = currentNode;
            currentNode.next = previousNode;
            previousNode.next = null;
            return target;
        } else {
            return null;
        }
        
    }
    
    @Override
    public boolean solAdd(E toAdd) {
        Node<E> newNode = new Node<E>(toAdd);
        if (size == 0) {
            head = newNode;
            head.next = null;
            size++;
            return true;
        } else if (head.next == null) {
            head.next = newNode;
            newNode.next = null;
            size++;
            return true;
        } else {
            Node<E> currentNode = head.next;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
            newNode.next = null;
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
                toReturn.append(",");
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
        Node<E> nodeRef = head;
        while(nodeRef != null) {
            nodeRef.next = nodeRef.next;
            nodeRef.next.next = nodeRef.next;
        }
        
    }
    
    /**
    For each item in the list, if there is a copy or copies adjacent to the item, delete the copies.
    */
    public void collapse(){
        
    }

}
