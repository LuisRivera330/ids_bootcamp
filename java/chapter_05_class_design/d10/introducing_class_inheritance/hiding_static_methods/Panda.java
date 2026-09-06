package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.hiding_static_methods;

public class Panda extends Bear {
    //Compila sin problemas ya que, el método eat() de la clase hija oculta el eat() de la clase padre
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    //No compila porque, el método sneeze() está marcado como estático en la clase padre pero no en la hija
    //se rompe la quinta regla
    //El compilador detecta que se está intentando sobrescribir un método que debería estar oculto
    /*public void sneeze() {
        System.out.println("Panda bear sneezes quietly");
    }*/

    //No compila porque, el método hibernate() en la clase padre es un miembro de instancia y en la clase hija es un método estático
    //Es un miembro de instancia en la clase padre, pero un método estático en la clase hija
    /*public static void hibernate() {
        System.out.println("Panda bear is going to sleep");
    }*/

    public static void main(String[] args) {
        Panda.eat();
    }
}
