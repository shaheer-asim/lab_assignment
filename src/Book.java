public class Book extends  LibraryItem{
    private int pageCount;
    public Book(String title,String author,int year,LibraryItemType itemType,int pageCount)
    {
        super(title, author, year,itemType);
        this.pageCount=pageCount;
    }
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    @Override
    public String toString()
    {
        return super.toString()+String.format("\t%d",this.pageCount);
    }
}
