public class Book extends LibraryMaterial{

    private String author;
    private int pages;

    public Book(String id, String title,  boolean available, String author, int pages){
        super(id, title, available);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }

    @Override
    public String getType() {
        return "Book";
    }
}
