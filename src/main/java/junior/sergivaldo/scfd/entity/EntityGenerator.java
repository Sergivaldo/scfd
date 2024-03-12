package junior.sergivaldo.scfd.entity;

import junior.sergivaldo.scfd.generator.AbstractGenerator;

public class EntityGenerator extends AbstractGenerator {

    private String generatePackage(String basePackage) {
        return "package "+ basePackage + ";";
    }
    
    private String generateImports(){

    }

}
