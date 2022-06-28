

/*
 * Class represents every single node.
 */
public class LinkedListElement{
    private int node;
    private LinkedListElement nextElement;

    LinkedListElement(int newNode){
        this.node = newNode;
        this.nextElement = null;
    }

    LinkedListElement(int newNode, LinkedListElement nextElement){
        this.node = newNode;
        this.nextElement = nextElement;
    }
}