package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.overloading_constructors;

public class Hamster {
    private String color;
    private int weight;
    //El primer constructor recibe un único parámetro de tipo entero
    //El segundo constructor recibe un entero y una cadena de texto
    //Por lo tanto, los constructores se sobrecargan correctamente.

    /*public Hamster(int weight) {
        this.weight = weight;
        color = "brown";
    }*/

    public Hamster(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }


    /*public Hamster(int weight) {
        this(weight, "brown"); // Cuando se usa 'this'  Java llama a otro constructor en la misma instancia de la clase. Ojo: Debe ser la primera instrucción en el constructor.
        //Hamster(weight, "brown"); // No compila porque, los constructores solo se pueden llamar escribiendo `new` antes del nombre del constructor
    }*/

    public Hamster(int weight) {
        System.out.println("in constructor");
        // Listo para llamar a this
        //this(weight, "brown"); // No compila porque, en la línea 27 se imprime una instrucción. El comentario no afecta
    }
}
