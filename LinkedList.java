// package LinkedList;

/*
 * class represents the list itself. manages the elements within the list.
 */
class LinkedList implements LinkedListInterface
{
    int node;
    LinkedList next;
    StringBuilder reprString = new StringBuilder();
    
    //Basic Constructor of LinkedList Class

    LinkedList(int node){
        this.node = node;
        this.next = null;
    };

    //Overloaded Constructor which allows to create a '.next' entry while initialization
    LinkedList(int node, LinkedList next)
    {
        this.node = node;
        this.next = next;
    };

    @Override
    public String toString()
    //Overriden from object base class.
    //Classmethod to define the string representation of the list object
    //Is called when print / println is called with object as argument

    {
        return this.printOutList();
    };
    
    public void addListItem (int number)
    //Adds item to LinkedList Object.Automatically keeps track of the list order and inserts new item at the right spot.

    {   
        if (this.node > number){
            int tempNode = this.node;
            LinkedList tempNext = this.next; 

            this.node = number;
            this.next = new LinkedList(tempNode, tempNext);
        }
        
        else if (this.next == null){
            this.next = new LinkedList(number, null);
        }

        else{
            this.next.addListItem(number);
        }
    };

    public boolean searchListItem(int number)
    //Searches an item within the list. Iterative search, node by node.

    {   
        if (this.node == number){
            return true;
        }

        else if (this.node != number && this.next != null){
            return this.next.searchListItem(number);
        };

        return false;
    };

    public void removeListItem(int number)
    //Removes a list item. Links the remaining items together togehter. Linkage of list remains.

    {
        if (this.node != number && this.next != null){
            this.next.removeListItem(number);
        }

        else if (this.node == number){
            this.node = this.next.node;
            this.next = this.next.next;
        }

        else if (this.searchListItem(number) == false){
            System.out.println("Result: Number does not exist in this ListItem");;
        };
    };

    private String printOutList()
    //Printmethod which will be called in toString() method. 
    //Defines the representation of the class instance when print is used.

    {
        reprString.append(this.node + " -> ");
            
        if (this.next != null){
            reprString.append(this.next.printOutList());
        }
        
        else if (this.next == null){
            reprString.append("null");
        };
       
        return reprString.toString();
    };

    public int getListSize(){
        // returns the overall size of elements of the list excluding the null entry.
        
        if (this.next == null){
            return 1;
        }
        else{
            return this.next.getListSize() + 1;
        }
    };

    public int returnListItemIndex(int number){
        // returns the list index of the number passed in as argument. count starts at 0.

        if (this.node == number){
            return 0;
        }
        else{
            return this.next.returnListItemIndex(number) + 1;
        }
    };

    public static void invertLinkedList()
    //Inverts the order of the items of the linked list. Implemented as static method.
    //In-place operation

    {
        return;
    };

}