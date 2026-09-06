package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.extending_a_class;

//La palabra extends  indica que la clase Lion hereda de la clase Animal
public class Lion extends Animal {
    //Se puede acceder a los métodos getAge() y setAge() desde la subclase Lion
    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
       // System.out.println("The "+age+" year old lion says: Roar!"); //No compila porque, el atributo age está marcada como private, es decir solo la misma clase Animal puede acceder a él, nadie más.
    }
}