package ids_bootcamp.java.chapter_05_class_design.d11_creating_abstract_classes.extending_an_abstract_class;

//Se crea la clase abstracta BigCat que extiende de la clase abstracta Animal
public abstract class BigCat extends Animal {
    public abstract void roar();

    //La implementación de método getName() se realiza en la clase abstracta BigCat
    public String getName() {
        return "BigCat";
    }
}
