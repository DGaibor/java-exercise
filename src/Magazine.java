public class Magazine extends LibraryMaterial{

    private String publicationMonth;
    private int numberEdition;

    public Magazine(String id, String title,  boolean available, String publicationMonth, int numberEdition){
        super(id, title, available);
        this.publicationMonth = publicationMonth;
        this.numberEdition = numberEdition;
    }
    public String getPublicationMonth() {
        return publicationMonth;
    }
    public int getNumberEdition() {
        return numberEdition;
    }

    @Override
    public String getType() {
        return "Magazine";
    }
}
