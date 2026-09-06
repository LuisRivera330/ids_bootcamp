package ids_bootcamp.java.chapter_02_operators_and_statements.d04.understanding_advanced_flow_control.the_continue_statement;

public class SwitchSample {
    public static void main(String[] args) {

        //Caso 01:
        //Se crea un bucle for simple.
        //La inicialización es de 1
        //El bucle se ejecuta mientras "a" sea menor o igual que 4
        //La iteración sube en una unidad a "a"
        //Se coloca un OPTIONAL_LABEL
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            //Se crea un bucle simple anidado
            //Inicializa el bucle en a
            //La condición se cumple hasta que x sea mayor o igual que 'c'
            //x incrementa en una unidad su valor
            for (char x = 'a'; x <= 'c'; x++) {
                //si a es igual a 2 o x es igual a b salta a la siguiente iteración de FIRST_CHAR_LOOP
                if (a == 2 || x == 'b')
                    continue FIRST_CHAR_LOOP;
                //Imprime: 1a 3a 4a
                System.out.print(" " + a + x);
            }
        }
        System.out.println();

        //CASO 02:
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            //En este caso varia el resultado porque ya no vuelve al FIRST_CHAR_LOOP sino al otro bucle interno
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    continue;
                //Imprime: 1a 3a 4a
                System.out.print(" " + a + x);
            }
        }

        //CASO 03:
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            //En este caso considera todos los valores posibles
            for (char x = 'a'; x <= 'c'; x++) {
                //Imprime: 1a 1b 1c 2a 2b 2c 3a 3b 3c 4a 4b 4c
                System.out.print(" " + a + x);
            }
        }
    }
}
