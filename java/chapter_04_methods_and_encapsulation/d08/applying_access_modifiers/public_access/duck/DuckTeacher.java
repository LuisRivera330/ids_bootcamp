package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.public_access.duck;

//público significa que cualquiera puede acceder al miembro desde cualquier lugar.
public class DuckTeacher {
    public String name = "helpful"; //Se declara el atributo name de acceso 'public'
    public void swim() { // Se declara el método swim de acesso público
        System.out.println("swim");
    }
}
