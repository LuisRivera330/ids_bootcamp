package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.overloading_vs_overriding;

public class OverloadingvsOverriding {
    //Diferencia: Método sobrecargado utiliza una firma distinta a la de un método sobreescrito

    //Se cre la clase padre Bird
    public class Bird {
        public void fly(int hola) {
            System.out.println("Bird is flying");
        }
        public void eat(int food) {
            System.out.println("Bird is eating "+food+" units of food");
        }
    }
    //Se crea una clase hija que hereda de Eagle
    public class Eagle extends Bird {
        //El método fly() está sobrecargado en la subclase Eagle. Ya que su firma cambia de no tener parámetros a tener uno
        //En este caso el tipo de retorno puede cambiar de void a int
        public void fly(int height) {
            System.out.println("Bird is flying at "+height+" meters");

        }
        //El método eat() está sobrescrito en la subclase Eagle ya que su firma es la misma que en la clase padre Bird
        //Genera un error de compilación ya que, necesita devolver lo mismo que el método de la clase padre. void
        /*public int eat(int food) {
            System.out.println("Bird is eating "+food+" units of food");
            return food;
        }*/
    }
}
