
class LinkedList

{
    int node;
    LinkedList next;
        
    LinkedList(int node, LinkedList next)
    {
        this.node = node;
        this.next = next;
    }

    public void addListItem (int number)
    //add item to linked list, keep order of the list and put item to the right place.
    {   
        if (this.next == null)
        {
            this.next = new LinkedList(number, null);
        }
        
    }

    public boolean searchListItem(int number)
    //go through list to find number, return true if list contains number, else false
    {
        return true;
    }


    public void removeListItem()
    //should remove a list item and link the item before and the next item togehter. linkage of list should remain existing
    {

    }



}


