import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book bookDance = new Book("l001","Bailes","Jorge Ramirez",400);
        Book bookDeveloper = new Book("l002","Java","Paul Bloch", 200);
        Magazine magazineScience = new Magazine("l003","Ciencia de Hoy", "Octubre",40);

        library.addMaterial(bookDance);
        library.addMaterial(bookDeveloper);
        library.addMaterial(magazineScience);

        library.showAllMaterials();

        System.out.println(" Buscar materia que contenga Java");
        List<LibraryMaterial> resultsMaterial = library.searchMaterialByTitle("Java");
        for (LibraryMaterial material : resultsMaterial) {
            System.out.println("Material encontrado: "+ material.getTitle());
        }

        System.out.println("Prestar material");

        try{
            library.lendMaterial("l002");
        }catch (NoAvailableException e){
            System.out.println("Error"+ e.getMessage());
        }

        System.out.println("Devolver material");
        library.returnMaterial("l002");


    }
}