package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.public_access.goose;

import ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.public_access.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        //El objeto teacher de la clase DuckTeacher puede acceder al método swim y al atributo name porque ambos son de acceso public.
        //a pesar de estar en otro paquete
        teacher.swim();
        System.out.println("Thanks" + teacher.name); // allowed
    } }