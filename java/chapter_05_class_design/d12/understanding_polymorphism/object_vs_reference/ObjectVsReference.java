package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.object_vs_reference;

import ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.Lemur;

public class ObjectVsReference {
    //Cualquier objeto creado puede hacer referencia a la clase Object
    //A pesar que lemur se haya asignado como referencia a Object. No ha cambiado sigue existiendo como objeto Lemur
    //lo que si ha variado es el acceso a sus métodos y atributos
    Lemur lemur = new Lemur();

    Object LemurAsObject = lemur;

}
