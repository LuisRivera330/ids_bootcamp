package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.calling_contructors;

//La clase Ape hereda de Primate. Por lo tanto hay un super() implícito
//Dentro del constructor de Ape() se imprime "Ape"
class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}
