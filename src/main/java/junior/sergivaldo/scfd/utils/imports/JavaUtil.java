package junior.sergivaldo.scfd.utils.imports;

import java.util.HashMap;
import java.util.Map;

import static junior.sergivaldo.scfd.utils.imports.JavaUtil.JavaUtilClasses.*;

public class JavaUtil {

    private static final Map<JavaUtilClasses, String> imports = new HashMap<>();

    public JavaUtil() {
        imports.put(LIST, "import java.util.List;");
        imports.put(MAP, "import java.util.Map;");
        imports.put(OPTIONAL, "import java.util.Optional;");
        imports.put(UUID, "import java.util.UUID;");
        imports.put(SET, "import java.util.Set;");
        imports.put(DATE, "import java.util.Date;");
    }

    public String getImport(JavaUtilClasses name) {
        return imports.get(name);
    }

    enum JavaUtilClasses{
        LIST,
        MAP,
        OPTIONAL,
        UUID,
        SET,
        DATE,
    }
}
