package java_core.java_core.java_core.chapter_02_operators_and_statements.d04.understanding_java_statements.the_while_statement;

public class TheWhileStatement {
    public static void main(String[] args) {
        TheWhileStatement theWhileStatement = new TheWhileStatement();
        //Se coloco como Ejemplo que hay 8 pedazos de queso. El ratón tiene un espacio de 5, por lo tanto quedan 3
        theWhileStatement.eatCheese(8);

        //Se va generar un bucle infinito porque siempre 10 va ser mayor que x
        // ya que este último no aumenta su valor. Tener mucho cuidado
        int x = 2;
        int y = 5;
        while(x < 10)
            y++;
    }
    //Declara una variable de tipo int. Su valor inicial es de 5. Representa el espacio en el estomago que tiene el ratón
    int roomInBelly = 5;

    //Se crea una variable de tipo pública. No retorna un valor (void). Pero si tiene un parámetro de entrada de tipo int
    //Dentro de la función se crea una estructura de tipo while
    //Dentro de la función de tipo while se evaluan dos condiciones
    //1. Si hay bocados de queso
    //2. Si el ratón tiene aún espacio en el estómago
    //Si se cumple ambas condiciones se resta en una unidad en bocados de queso y espacio en el estómago del ratón
    //Al final del bucle se imprime cuantos pedazos de queso aún sobra
    public void eatCheese(int bitesOfCheese) {
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese+" pieces of cheese left");
    }


}
