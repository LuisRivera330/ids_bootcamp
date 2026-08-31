package ids_bootcamp.java.chapter_04_methods_and_encapsulation.overloading_methods.overloading_and_varargs;

public class OverladingAndVarargs {
    //public void fly(int[] lengths) { }
    public void fly(int... lengths) { } // No compila porque, Java trata los argumentos variables como si fueran un array. Y ya hay uno anteriormente definido

    //fly(new int[] { 1, 2, 3 }); La siguiente línea de código compilaría para ambos de igual manera
}
