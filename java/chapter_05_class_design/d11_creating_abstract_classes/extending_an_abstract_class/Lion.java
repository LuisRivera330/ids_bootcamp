package ids_bootcamp.java.chapter_05_class_design.d11_creating_abstract_classes.extending_an_abstract_class;

//La clase concreta Lion hereda de BigCat
public class Lion extends BigCat {
    //En este caso se debe implementar los dos métodos abstractos
    //getName() de la clase abstracta Animal
    /*public String getName() {
        return "Lion";
    }*/
    //y roar() de la clase abstracta BigCat
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

    //La clase hereda solo un método abstracto.
    //No está obligado a proporcionar una implementación para el método getName()
    /*public String getName() {
        return "Lion";
    }*/
}
