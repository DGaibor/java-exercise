public abstract class LibraryMaterial  implements Provider{

    private String id;
    private String title;
    private boolean available;


    public LibraryMaterial(String id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }

    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void lend(){
        setAvailable(false);
    }

    @Override
    public void returnItem(){
        setAvailable(true);
    }

    public abstract String getType();


}
