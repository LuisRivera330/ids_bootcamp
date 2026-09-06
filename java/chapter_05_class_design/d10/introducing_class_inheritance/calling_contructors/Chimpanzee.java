package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.calling_contructors;

//La clase Chimpanzee hereda de Ape
public class Chimpanzee extends Ape {
    public static void main(String[] args) {
        //Se inserta un constructor predeterminado sin argumentos
        new Chimpanzee();
        //El código se ejecutará llamando primero a los constructores padre
        //Resultado:
        //Primate
        //Ape
    }
}
