package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.inheriting_methods.overriding_a_method;

//La clase Wolf hereda de la clase Canine
public class Wolf extends Canine {
    //Se sobreescribe la clase getAverageWeight añadiendole el valor de 20
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }

    //El compilador no llamaría al método padre de la clase Canine, llamaría al método actual de la clase Wolf
    //Como una función recursiva (se llama asimismo durante la ejecución)
    /*public double getAverageWeight() {
        return getAverageWeight()+20; //Se vuelve funcion recursiva. Y como no tiene condición de terminación se ejecuta infinitamente
        //genera un error de desbordamiento
    }*/

    //Se imprime tanto el método getAverageWeight de la clase Canine (padre)
    // y el método getAverageWeight sobreescrito de la clase hijo (Wolf)
    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
        //Resultado: 50.0
        //70.0
    }
}