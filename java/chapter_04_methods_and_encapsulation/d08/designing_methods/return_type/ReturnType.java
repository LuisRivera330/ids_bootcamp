package ids_bootcamp.java.chapter_04_methods_and_encapsulation.designing_methods.return_type;

public class ReturnType {

    public void walk1() { } // El tipo de retorno es void, por lo tanto la instrucción return es opcional
    public void walk2() { return; } // A diferencia del anterior método, la instrucción es return opcional, es decir no devuelve nada.
    public String walk3() { return ""; }//Es un método válido con un tipo de retorno String y una instrucción return que devuelve un String
    //public String walk4() { } // No compila porque, falta la instrucción return que devuelva un String
    //public walk5() { } // No compila porque, falta el tipo de retorno.
    //String walk6(int a) { if (a == 4) return ""; } // No compila porque si bien hay una instrucción return, no siempre se ejecuta

    //Se ejecuta correctamente porque devuelve un valor esperado, es decir un int
    int integer() {
        return 9;
    }


    /*int long() {]
        return 9L; // No compila porque, el tipo de dato que se está enviando es Long y se espera que sea de tipo int
    }*/

    //La solución para evitar problemas como el anterior ejemplo es añadir una línea con la variable local
    //para que el tipo de variable coincida con el tipo de retorno del método
    int integerExpanded() {
        int temp = 9;
        return temp;
    }

    /*int longExpanded() {
        int temp = 9L; // No compila porque, no se puede devolver un tipo primitivo long en un método que devuelve un int
        return temp;
    }*/

}
