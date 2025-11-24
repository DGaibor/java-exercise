import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, LibraryMaterial>  materials = new HashMap<>();

    public void addMaterial(LibraryMaterial material){
        materials.put(material.getId(),material);
    }

}
