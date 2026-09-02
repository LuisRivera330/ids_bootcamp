package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.duck;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
        //goose.floatInWater(); // No compila porque,no estamos en la clase Goose
        //GooseWatcher no está en el mismo paquete que Bird, ni hereda de Bird
        //Ojo: Goose hereda de Bird. Esto solo permite que Goose haga referencia a floatInWater() y no a las funciones que llaman a Goose.
    } }