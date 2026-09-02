package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.default_constructor.Rabbit;

public class Bunny {
    //El siguiente caso, es un ejemplo clásico de como crear un constructor.
    //Un constructor es un método especial que coincide con el nombre de la clase
    //No tiene tipo de retorno
    /*public Bunny() {
        System.out.println("constructor");
    }*/

    //public bunny() { } // No compila porque no coincide con el nombre. Java distingue entre mayúsculas y minúsculas
    //public void Bunny() { }//El segundo método si compila, pero no es un constructor porque tiene un tipo de retorno.

    //new Bunny()//Se llama a un constructor cuando escribimos `new` seguido del nombre de la clase que queremos instanciar


    //this es opcional y hace referencia a la variable de instancia
    /*private String color;
    public Bunny(String color) {
        //Se asigna el parámetro 'color' a la variable de instancia 'color'
        this.color = color;
    }*/

    private String color;
    private int height;
    private int length;

    public Bunny(int length, int theHeight) {
        //A pesar de no generear error de compilación, está mal planteada ya que, La variable de instancia
        //length comienza con un valor de 0. Ese 0 se asigna al parámetro length del método
        length = this.length;
        //El parámetro theHeight y la variable de instancia height tienen nombres diferentes
        height = theHeight;
        //la variable de instancia color utiliza "this" incluso cuando no hay duplicación de nombres de variables.
        this.color = "white";

    }

    public static void main(String[] args) {
        //Se crea una instancia de la clase Bunny. Para ello se llama al constructor.
        //El cual solicita dos parámetros
        //Finalmente, se imprime el resultado: 0 2 white
        //El 0 se llega imprimir porque es el valor por defecto de una variable de instancia
        //lo demás si se extrae de los parámetros del constructor
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);

    }

}
