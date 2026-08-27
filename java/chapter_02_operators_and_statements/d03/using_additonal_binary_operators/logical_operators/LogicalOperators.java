package ids_bootcamp.java.chapter_02_operators_and_statements.d03.using_additonal_binary_operators.logical_operators;

public class LogicalOperators {
    //AND solo es verdadero si ambos operadores son verdaderos
    //OR solo es falso si ambos operadores son falsos
    public static void main(String[] args) {
        /*boolean x = true || (y < 4);
        System.out.println(x);

        if(x != null && x.getValue() < 5) { //Lanza una excepción si x es igual a nulo. No se evalua la siguiente condición
            // Do something
        }*/

        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        System.out.println(x); //El resultado es 6. La siguiente condición ya no se evalua porque x >= 6
        System.out.println(y); //Y toma el valor de true porque se cumple la condición, a pesar de no haber pasado por el
    }
}
