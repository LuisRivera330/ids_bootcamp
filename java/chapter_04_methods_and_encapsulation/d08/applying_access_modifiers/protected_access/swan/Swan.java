package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.swan;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore.Bird;

//Swan no está en el mismo paquete que Bird, pero sí lo extiende,
// lo que implica que tiene acceso a los miembros protegidos de Bird, ya que es una subclase.
public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    //El siguiente ejemplo también utilizan correctamente miembros protegidos de Bird.
    // Esto está permitido porque estas líneas hacen referencia a un objeto Swan
    // y Swan hereda de Bird, así que no hay problema.
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }


    public void helpOtherBirdSwim() {
        Bird other = new Bird();
        // No compila porque, esta vez se usa una referencia a Bird. Y Bird está en un paquete diferente.
        //por lo que no puede usar miembros protegidos
        //other.floatInWater();
        //System.out.println(other.text);
    }
}
