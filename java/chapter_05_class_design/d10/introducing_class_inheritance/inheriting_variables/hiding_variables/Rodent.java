package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_variables.hiding_variables;

public class Rodent {
    //Se declara el atributo tailLength de tipo int de acceso protected
    protected int tailLength = 4;
   //Se crea el método getRodentDetails no retorna nada(void)
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
