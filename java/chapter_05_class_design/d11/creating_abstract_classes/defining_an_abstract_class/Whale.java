package ids_bootcamp.java.chapter_05_class_design.d11.creating_abstract_classes.defining_an_abstract_class;

public abstract class Whale {
    // No se puede realizar la combinación de private con final porque las clases hijas no podran sobreescribir el método
    //private abstract void sing();

    //Se cambia el acceso del método sing() a protected
    protected abstract void sing();
}
