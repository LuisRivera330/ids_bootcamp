package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.inland;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatInWater(); // No compila el método porque, la clase  BirdWatcherFromAfar no hereda ni está en el mismo paquete que Bird
        //System.out.println(bird.text); // De la misma manera con el atributo text porque, este último es de tipo 'protected'
    }
}
