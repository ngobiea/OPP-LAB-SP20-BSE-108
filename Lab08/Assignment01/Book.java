package Lab08.Assignment1;
/*book, which adds a page count */
public class Book extends Publication {
    private int pageCount;

    public Book() {

    }
    public Book(int pageCount){
        this.pageCount = pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }
    @Override
    public void display(){
        System.out.println("Title:"+getTitle()+"\nPrice:"+getPrice()+"\nPage count: " + getPageCount());
    }
}
