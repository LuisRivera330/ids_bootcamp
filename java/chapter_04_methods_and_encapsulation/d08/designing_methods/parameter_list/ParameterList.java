package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.designing_methods.parameter_list;

public class ParameterList {

    public void walk1() { }//Es una declaración de método válida a pesar de que no tenga parámetros
    //public void walk2 { }//No compila porque le faltan los paréntesis alrededor de la lista de parámetros
    public void walk3(int a) { }//Es una declaración de método válida, la cual contiene un parámetro de tipo int
    //public void walk4(int a; int b) { }// No compila porque los parámetros están separados por un punto y coma en lugar de una coma.
    public void walk5(int a, int b) { }//Es una declaración de método válida con dos parámetros de tipo int
}
