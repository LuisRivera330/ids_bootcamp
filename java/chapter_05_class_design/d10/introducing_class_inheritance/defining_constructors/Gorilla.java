package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.defining_constructors;

//La clase Gorilla hereda de Animal
public class Gorilla extends Animal{
    //Se crea un constructor de la clase Gorilla con un parámetro.
    //Luego llama al constructor padre, que recibe dos argumentos: edad y nombre.
    public Gorilla(int age) {
        super(age,"Gorilla");
    }
    //Se crea otro constructor sin ningún parámetro
    //Luego llama  al constructor padre, que recibe un argumento. edad.
    public Gorilla() {
        super(5);
    }
}
