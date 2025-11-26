public class Book extends LibraryMaterial{

    private String author;
    private int pages;

    public Book(String id, String title, String author, int pages){
        super(id, title);
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

    @Override
    public String toString() {
        return super.toString() +
                String.format(" (autor=%s, páginas=%d)", author, pages);
    }
}
