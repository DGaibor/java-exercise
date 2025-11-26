import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private Map<String, LibraryMaterial>  materials = new HashMap<>();

    public void addMaterial(LibraryMaterial material){

        materials.put(material.getId(),material);
        System.out.println(material.getId() + " Ha sido agregado");
    }

    public List<LibraryMaterial> searchMaterialByTitle(String title){
        List<LibraryMaterial> resultMaterials = new ArrayList<>();
        String lowerCaseTitle = title.toLowerCase();

        for (LibraryMaterial material: materials.values()){
            if (material.getTitle().toLowerCase().contains(lowerCaseTitle)){
                resultMaterials.add(material);
            }
        }
        return resultMaterials;
    }

    public void lendMaterial(String id){
        LibraryMaterial material = materials.get(id);
        if (material == null){
            System.out.println( id + " No existe el Material");
            return;
        }

        if (!material.isAvailable()){
            throw new NoAvailableException(" El material "+id+" no esta disponible");
        }

        material.lend();
        System.out.println(material.getId() + " Prestado correctamente");

    }

    public void returnMaterial(String id){
        LibraryMaterial material = materials.get(id);
        if (material == null){
            System.out.println( id + " No existe el Material");
            return;
        }

        if (material.isAvailable()){
            System.out.println(material.getId() + " El material esta disponible");
            return;
        }

        material.returnItem();
        System.out.println(material.getId() + " Develto correctamente");

    }

    public void showAllMaterials(){
        System.out.println(" Catalogo completo: ");
        for (LibraryMaterial material: materials.values()){
            System.out.println( " - " + material);
        }
    }

}
