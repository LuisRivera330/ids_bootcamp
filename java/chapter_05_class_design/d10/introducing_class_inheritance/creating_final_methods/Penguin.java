package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.creating_final_methods;

//La clase Penguin hereda de Bird
public class Penguin extends Bird {
    //Aparece un error de compilación. No se puede sobreescribir el método hasFeathers
    //porque en la clase padre se declaró como final
    /*public final boolean hasFeathers() {
        return false;
    }*/
}
