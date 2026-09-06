package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.understanding_compiler_enhacements;

//No compila porque,no se define ningún constructor dentro de la clase Elephant, por lo que el compilador intentará
//insertar un constructor predeterminado sin argumentos con una llamada a super()
public class Elephant extends Mammal {
    /*public Elephant() { //No compila porque, el compilador intenta insertar `super()`sin argumentos. No existe tal constructor en la clase padre.
    }*/
    //Solución: Añadir una llamada a un constructor padre que acepte un argumento fijo
    public Elephant() {
        super(10);
    }

}
