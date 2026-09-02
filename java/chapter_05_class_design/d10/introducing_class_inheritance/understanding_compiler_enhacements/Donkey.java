package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.understanding_compiler_enhacements;

//La siguiente declaración es lo mismo para los 3 casos
//ya que Java inserta automáticamente una llamada al constructor sin argumentos `super()`
public class Donkey {
}
//Si no declaramos el constructor por defecto Java crea uno
/*public class Donkey {
    public Donkey() {
    }
}
//Por defecto Java llama al constructor padre de Donkey en este caso Object
public class Donkey {
    public Donkey() {
        super();
    }
}*/
