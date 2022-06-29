package LinkedList.Interfaces;


public interface LinkedListInterface {
    
    //should add item to linked list in ordered way
    public void addListItem(int number);

    //look up item in linked list and return boolean, if exists or not
    public boolean searchListItem(int number);

    //should remove item from list and keep order
    public void removeListItem(int number);

    //should return the positional index of an item within the list
    public int returnListItemIndex(int number);

    //should return the total size of the list.
    public int getListSize();
 
}
