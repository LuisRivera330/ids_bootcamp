package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.redeclaring_private_methods;

public class BactrianCamel extends Camel{
    //El método getNumberOfHumps() es complemente diferente al método getNumberOfHumps() de la clase padre Camel,
    //ya que este último es de tipo privado. No afecta en lo absoluto
    private int getNumberOfHumps() {
        return 2;
    }
}
