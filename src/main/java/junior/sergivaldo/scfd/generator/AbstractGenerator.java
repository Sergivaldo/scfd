package junior.sergivaldo.scfd.generator;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.StringSubstitutor;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractGenerator {

    private final static Map<String, String> parameters = new HashMap<>();

    public String generateSetter(String nameProp, String typeProp) {
        var methodTemplate =
                """
                public void set${methodName}(${typeProp} ${nameProp}) {
                    this.${nameProp} = ${nameProp};
                }
                """;

        parameters.clear();
        parameters.put("methodName", StringUtils.capitalize(nameProp));
        parameters.put("nameProp", nameProp);
        parameters.put("typeProp", typeProp);

        return new StringSubstitutor(parameters).replace(methodTemplate);
    }

    public String generateGetter(String nameProp, String typeProp) {
        var methodTemplate =
                """
                public ${typeProp} get${methodName}() {
                    return ${nameProp};
                }
                """;

        parameters.clear();
        parameters.put("methodName", StringUtils.capitalize(nameProp));
        parameters.put("nameProp", nameProp);
        parameters.put("typeProp", typeProp);
        return new StringSubstitutor(parameters).replace(methodTemplate);
    }

    public String generateImports() {
        return null;
    }

    public String generatePackage() {
        return null;
    }
}
