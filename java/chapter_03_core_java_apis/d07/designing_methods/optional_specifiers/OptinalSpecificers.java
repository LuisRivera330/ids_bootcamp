package ids_bootcamp.java.chapter_03_core_java_apis.d07.designing_methods.optional_specifiers;

public class OptinalSpecificers {
    //static: Se utiliza para métodos de clase. Es decir, no se necesita instanciar un objeto de clase para utilizarlo
    //abstract: Se utiliza cuando no se proporciona un cuerpo para el método. Es decir no tiene información dentro {}
    //final: Se utiliza cuando no se permite que una subclase sobrescriba un método.
    //synchronized: No considerar por el momento
    //native: Se utiliza al interactuar con código escrito en otro lenguaje
    //strictfp: Se utiliza para hacer que los cálculos de punto flotante sean portables.


    public void walk1() {} //Es una declaración de método válida sin especificador
    public final void walk2() {}//Es una declaración de método válida. Es decir, no permite que una subclase sobrescriba un método.
    public static final void walk3() {}//Se utiliza dos especificadores. Es decir, no permite que una subclase sobrescriba un método, asimismo es un método de clase no de objeto
    public final static void walk4() {}//Al igual que el anterior método solo que en diferente orden.
    //public modifier void walk5() {} // No compila porque, el modificador no es un especificador válido
    //public void final walk6() {} // No compila porque, el especificador opcional está después del tipo de retorno.
    final public void walk7() {} //Java permite que los especificadores opcionales aparezcan antes del modificador de acceso
}
