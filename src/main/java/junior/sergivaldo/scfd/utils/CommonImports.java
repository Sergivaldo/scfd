package junior.sergivaldo.scfd.utils;

import java.util.HashMap;
import java.util.Map;

public class CommonImports {

    private static final Map<String,String> imports = new HashMap<>();

    public CommonImports() {
        loadImports();
    }

    public String getImport(String name){
        return imports.get(name);
    }
    private static void loadImports(){
        imports.put("Jakarta Persistence","import jakarta.persistence.*;");
        imports.put("List","import java.util.List;");
        imports.put("Map","import java.util.Map;");
        imports.put("Optional","import java.util.Optional;");
        imports.put("UUID","import java.util.UUID;");
        imports.put("Set","import java.util.Set;");
        imports.put("Date","import java.util.Date;");
        imports.put("Jpa Repository","import org.springframework.data.jpa.repository.JpaRepository;");
        imports.put("Repository Stereotype", "import org.springframework.stereotype.Repository;");
        imports.put("Service Stereotype","import org.springframework.stereotype.Service;");
        imports.put("Bind Annotations","import org.springframework.web.bind.annotation.*;");
    }
}
