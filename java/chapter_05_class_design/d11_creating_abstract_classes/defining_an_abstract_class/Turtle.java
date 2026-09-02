package ids_bootcamp.java.chapter_05_class_design.d11_creating_abstract_classes.defining_an_abstract_class;


/*public final abstract class Tortoise { // No compila porque, una clase abstracta no puede marcarse como final. Ya que, debe ser extendida por otra clase para poder instanciarse
}*/
public abstract class Turtle {
    // No compila porque, se está declarando al método como abstracto. Sin embargo, al colocar el símbolo de llaves {} le indicamos a la función que tiene cuerpo
    //public abstract void swim() {}

    //No compila por la misma razón que el anterior método. Solo que en este es más explícito el cuerpo de la función {}
    /*public abstract int getAge() {
        return 10;
    }*/
}
