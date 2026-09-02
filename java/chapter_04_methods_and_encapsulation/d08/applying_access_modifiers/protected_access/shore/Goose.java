package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d08.applying_access_modifiers.protected_access.shore;

public class Goose extends Bird {

    //El primer método es correcto. Ya que, Goose hereda de Bird.
    //Por lo que puede llamar tanto a sus métodos como atributos de Bird
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        //No compila ambas líneas de abajo porque, si bien el objeto es de tipo Goose, se almacena en una referencia de Bird
        //No podemos referirnos a los miembros de la clase Bird, ya que no estamos en el mismo paquete
        //other.floatInWater();
        //System.out.println(other.text);
    } }
