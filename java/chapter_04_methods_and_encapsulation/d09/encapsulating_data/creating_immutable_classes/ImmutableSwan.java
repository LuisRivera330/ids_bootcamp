package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.encapsulating_data.creating_immutable_classes;

public class ImmutableSwan {
    //Se crea una variable de instancia de tipo int. Esta variable es de acceso private. Es decir no puede ser accedido desde otra clase
    private int numberEggs;
    //Se crea un constructor el cual asigna e valor del parámetro numberEggs a la variable de instancia this.numberEggs.
    // This es opcional, se utiliza para especificar a la variable de instancia
    public ImmutableSwan(int numberEggs) {
        this.numberEggs = numberEggs;
    }
    //Se crea el método getNumberEggs el cual es de acceso público, cualquier clase puede acceder a él. Retorna un valor de tipo int
    //el cual es el atributo de instancia numberEggs
    public int getNumberEggs() {
        return numberEggs;
    } }