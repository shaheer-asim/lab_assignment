public class Magazine extends LibraryItem{
    private int issueNumber;
    public Magazine(String title,String author,int year,LibraryItemType itemType,int issueNumber)
    {
        super(title, author, year,itemType);
        this.issueNumber=issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
    @Override
    public String toString()
    {
        return super.toString()+String.format("\t%d",this.issueNumber);
    }
}
