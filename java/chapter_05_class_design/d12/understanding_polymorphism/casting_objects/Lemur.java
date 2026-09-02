package ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.casting_objects;

import ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.HasTail;

//Se crea la clase Lemur que hereda de Primate e implementa de HasTail
public class Lemur extends Primate implements ids_bootcamp.java.chapter_05_class_design.d12.understanding_polymorphism.HasTail {
    //Se sobreescribe el método isTailStriped. Se retorna un valor false
    public boolean isTailStriped(){
        return false;
    }

    //Se inicializa una variable de objeto de tipo int, con un valor inicial de 10
    public int age = 10;

    public static void main(String[] args) {
        //Se crea un objeto de la clase Lemur
        Lemur lemur = new Lemur();
        //Se imprime el atributo age del objeto lemur. Resultado:10
        System.out.println(lemur.age);
        //Lemur se pasa como instancia a la interfaz HasTail
        //HasTail hasTail = lemur;
        //Se imprime el valor que devuelve el método isTailStriped(). Resultado: false
        //System.out.println(hasTail.isTailStriped());

        //Lemur pasa como instancia a clase padre Primate
        //Primate primate = lemur;
        //Se imprime el método hasHair() de la clase Primate
        //System.out.println(primate.hasHair());

        HasTail hasTail = lemur;
        //Genera un error de compilación porque,una vez al objeto se le haya asignado una clase o interfaz
        //solo puede hacer uso de variables y métodos para esa referencia
        //System.out.println(hasTail.age);

        //No compila porque, la referencia primate solo tiene acceso a los métodos de su clase.
        //En este caso isTailStriped no se encuentra implementado en Primate
        Primate primate = lemur;
        //System.out.println(primate.isTailStriped());
        //Lemur lemur2 = primate; //No compila porque estamos intentando convertir la referencia Primate nuevamente a Lemur
        //Para solucionar ello, se debe de castear como el caso de abajo,

        //Imprime con normalidad
        Lemur lemur3 = (Lemur)primate;
        System.out.println(lemur3.age);
    }
}
