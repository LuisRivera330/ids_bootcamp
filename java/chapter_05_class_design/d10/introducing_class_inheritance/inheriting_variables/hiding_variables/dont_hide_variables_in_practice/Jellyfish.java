package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_variables.hiding_variables.dont_hide_variables_in_practice;

public class Jellyfish extends Animal {
    //No es una buena práctica de efiencia ya que, oculta el atributo length de la clase padre
    //Ocultar variables hace que el código sea muy confuso y difícil de leer, ya que
    //empiezas a modificar el valor de la variable tanto en los métodos de la clase padre como de la hija
    public int length = 5;
    public static void main(String[] args) {
        Jellyfish jellyfish = new Jellyfish();
        Animal animal = new Jellyfish();
        System.out.println(jellyfish.length);
        System.out.println(animal.length);
        //Resultado:
        //5 -- Por el atributo de la clase hija
        //2 -- Por el atributo de la clase padre
    }
}
