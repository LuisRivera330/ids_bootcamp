package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.polymorphism_and_method_overriding;

public class Gorilla extends Animal{
    //Genera un error de compilación ya que, se sobreescribe el método getName()
    //con un acceso más limitado (protecteed)
    /* protected String getName(){
        return "Gorilla";
    }*/
}
