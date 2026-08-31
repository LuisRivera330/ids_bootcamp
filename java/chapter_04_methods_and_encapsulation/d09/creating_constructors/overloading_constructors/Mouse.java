package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.overloading_constructors;

public class Mouse {
    //Esta técnica se llama encadenamiento de constructores.
    //Ya que, consiste en que cada constructor añada un parámetro hasta llegar al constructor que realiza todo el trabajo
    private int numTeeth;
    private int numWhiskers;
    private int weight;
    public Mouse(int weight) {
        this(weight, 16); // Llama al constructor con dos parámetros
    }
    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6); // Llama al constructor con tres parámetros
    }
    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }
    public void print() {
        System.out.println(weight + " " + numTeeth + " " + numWhiskers);
    }
    public static void main(String[] args) {
        //Instancia un objeto de la clase Mouse. Llama al primer constructor
        Mouse mouse = new Mouse(15);
        //Imprime los valores de: 15 16 6
        mouse.print();
    }
}