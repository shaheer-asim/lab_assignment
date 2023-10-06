public class Library {
    private LibraryItem list []=new LibraryItem[10];
    public void addItem(LibraryItem item)
    {
        boolean addedBook=false;
        for(int i=0;i< list.length;i++)
        {
            if(list[i]==null)
            {
                list[i]=item;
                addedBook=true;
                break;
            }
        }
        if(!addedBook)
        {
            System.out.println("Error In Adding Item Or No More Space To Add Item");
        }
    }
    public void borrowItem(LibraryItem item)
    {
        for(int i=0;i< list.length;i++)
        {
            if(item.getTitle().equals(list[i].getTitle()))
            {
                list[i].setBorrowed(true);
                break;
            }
        }
    }
    public void returnItem(LibraryItem item)
    {
        for(int i=0;i<list.length;i++)
        {
            if((item.isBorrowed()==true)&&(list[i].isBorrowed()==true))
            {
                list[i].setBorrowed(false);
                break;
            }
        }
    }
    public void displayAvailableItems()
    {

            for(LibraryItem l:list)
            {
                if(l!=null) {
                    if (l.isBorrowed() == false) {
                        System.out.println(l);
                    }
                }
            }
    }
    public void displayBorrowedItems()
    {
        boolean borrowed=false;
        for(LibraryItem l:list)
        {
            if(l!=null) {
                if (l.isBorrowed() == true) {
                    borrowed=true;
                    System.out.println(l);
                }
            }
        }
        if(borrowed==false)
        {
            System.out.println("No Books Borrowed");
        }
    }
}
