public class Magazine extends LibraryMaterial{

    private String publicationMonth;
    private int numberEdition;

    public Magazine(String id, String title, String publicationMonth, int numberEdition){
        super(id, title);
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

    @Override
    public String toString() {
        return super.toString() +
                String.format(" (edición=%d, mes=%s)", numberEdition, publicationMonth);
    }
}
