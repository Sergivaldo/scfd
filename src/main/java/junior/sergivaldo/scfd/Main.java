package junior.sergivaldo.scfd;


import junior.sergivaldo.scfd.generator.AbstractGenerator;

public class Main {
    public static void main(String[] args) {
        var entityGen = new Test();
        System.out.println(entityGen.generateSetter("user","User"));
        System.out.println(entityGen.generateGetter("user","User"));
    }

    static class Test extends AbstractGenerator{}
}