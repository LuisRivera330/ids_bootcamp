package ids_bootcamp.java.chapter_05_class_design.d11.implementing_interfaces;

//Ambos ejemplos son lo mismo.
//ya que abstract y public  se agrega automáticamente a la definición de la interfaz
public interface CanFly {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}

/*public abstract interface CanFly {
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}*/

