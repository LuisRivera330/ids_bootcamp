package ids_bootcamp.java.chapter_05_class_design.d11.creating_abstract_classes.defining_an_abstract_class;

//La clase HumpbackWhale hereda de Whale
public class HumpbackWhale extends Whale {
    //El código compila sin complicaciones.
    //ya que el método sing() de la clase Whale no es visible para la clase hija HumpbackWhale
    /*private void sing() {
        System.out.println("Humpback whale is singing");
    }*/

    //No compila porque, no se puede sobreescribir un método reduciendo la visilidad del método padre
    //solo está permitido el protected y public
    /*private void sing() {
        System.out.println("Humpback whale is singing");
    }*/

    public void sing() {
        System.out.println("Humpback whale is singing");
    }
}
