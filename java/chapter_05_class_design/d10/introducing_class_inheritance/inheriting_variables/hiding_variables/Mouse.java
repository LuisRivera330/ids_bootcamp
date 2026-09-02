package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_variables.hiding_variables;

//La clase Mouse hereda de Rodent
public class Mouse extends Rodent {
    //Se declara una variable de instancia de tipo int con acceso protected.
    protected int tailLength = 8;
    //Se crea el método getMouseDetails()
    //Dentro se imprime tailLength de la clase hija y super.tailLength de la clase padre
    public void getMouseDetails() {
        System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
    }
    public static void main(String[] args) {
        //Se instancia un objeto de la clase Mouse
        Mouse mouse = new Mouse();
        //Se invoca el método getRodentDetails y getMouseDetails
        mouse.getRodentDetails();
        mouse.getMouseDetails();
    }
    //Ojo: No hay ningún cambio en el código que pueda provocar que Java sobrescriba el valor de tailLength,
    // haciéndolo igual en la clase padre e hija
    //Resultado:
    //[parentTail=4]
    //[tail=8,parentTail=4]
}
