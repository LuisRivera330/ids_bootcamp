package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.creating_constructors.default_constructor;

public class Rabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(); //Llama al constructor por defecto. A pesar de no estar explicitamente escrito en la clase
    }
    //public Rabbit() {} Es equivalente a está línea de código

    //Rabbit1 es el único que tiene onstructor predeterminado sin argumentos.
    class Rabbit1 {
    }
    //Rabbit2 y Rabbit3 tienen constructores púbicos
    class Rabbit2 {
        public Rabbit2() { }
    }
    class Rabbit3 {
        public Rabbit3(boolean b) { }
    }
    //Rabbit4 tiene un constructor privado.
    class Rabbit4 {
        private Rabbit4() { }
    }
}
