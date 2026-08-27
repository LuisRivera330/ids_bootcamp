package ids_bootcamp.java.chapter_01_java_building_blocks.d01.understanding_java_class_structure.fields_and_methods;

//Se crea la clase Animal. Esta es de tipo pública
//Es decir otras clases pueden acceder a ella
public class Animal {
    //Se crea el atributo name es de tipo String
    String name;

    //Se crea el método getname().
    //Retorna un tipo de dato String
    public String getName() {
        return name;
    }

    //Se crea el método setName()
    //Tiene como parámetro de entrada una variable de tipo String
    //Al ser void no retorna nada
    public void setName(String name) {
        this.name = name;
    }

    //Se crea el método numberVisitors tiene como parámetro de entrada un tipo de dato month
    //Devuelve un tipo de dato int
    //Suma la variable month en una unidad
    public int numberVisitors(int month) {
        return month + 1;
    }
}