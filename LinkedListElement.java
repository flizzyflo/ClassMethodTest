
/*
 * Class represents every single node.
 */
public class LinkedListElement implements LinkedListElementInterface{
    
    private int node;
    private LinkedListElement nextElement;

    LinkedListElement(int newNode){
        this.node = newNode;
        this.nextElement = null;
    };

    LinkedListElement(int newNode, LinkedListElement nextElement){
        this.node = newNode;
        this.nextElement = nextElement;
    };

    public int getValue(){
        return this.node;
    };

    public LinkedListElement getNextElement(){
        return this.nextElement;
    };

    public void setNextElement(LinkedListElement nextElement){
        this.nextElement = nextElement;
    };
}