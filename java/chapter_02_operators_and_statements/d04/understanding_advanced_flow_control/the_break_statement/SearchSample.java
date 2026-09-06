package ids_bootcamp.java.chapter_02_operators_and_statements.d04.understanding_advanced_flow_control.the_break_statement;

import java.sql.SQLOutput;

public class SearchSample {
    public static void main(String[] args) {
        //Se inicializa una variable bidimensional de 3x3
        int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
        //Se asigna a la variable searchValue el valor a buscar
        int searchValue = 2;
        // Se declara la posición en X. Búsqueda horizontal. El valor es -1 haciendo referencia a que todavía no comenzó
        int positionX = -1;
        // Se declara la posición en Y. Búsqueda vertical. El valor es -1 haciendo referencia a que todavía no comenzó
        int positionY = -1;
        //Se crea un bucle for simple
        //El inicializador empieza desde 0
        //La condición se cumple mientras la longitud del array bidimensional sea mayor a i
        //Incrementa el valor de i en una unidad en cada instancia
        //CON EL PARENT_LOOP
        /*PARENT_LOOP: for(int i=0; i<list.length; i++) {
            //Se crea un bucle anidado
            //Recorre las columnas de la fila actual
            //La variable j inicia con un valor de 0 e incrementa su valor en 1
            for(int j=0; j<list[i].length; j++) {
                //Se evalua si la posición actual de la matriz es igual al valor buscado
                if(list[i][j]==searchValue) {
                    //Se asigna los valores de la posición exacta donde se encontró el elemento buscado
                    positionX = i;
                    positionY = j;
                    //Se sale del bucle
                    break PARENT_LOOP;
                }
            }
        } */

        //Sin el PARENT_LOOP
        //Genera un resultado diferente por qué solo se rompe el bucle interno mas no el bucle PARENT_LOOP
        PARENT_LOOP: for(int i=0; i<list.length; i++) {
            //Se crea un bucle anidado
            //Recorre las columnas de la fila actual
            //La variable j inicia con un valor de 0 e incrementa su valor en 1
            for(int j=0; j<list[i].length; j++) {
                //Se evalua si la posición actual de la matriz es igual al valor buscado
                if(list[i][j]==searchValue) {
                    positionX = i;
                    positionY = j;
                    break;
                }
            }
        }
        //En caso no se haya encontrado el elemento aparece el mensaje "not found"
        if(positionX==-1 || positionY==-1) {
            System.out.println("Value "+searchValue+" not found");
        } else {
            //Caso Contrario se imprime el valor a buscar y las coordenadas
            System.out.println("Value "+searchValue+" found at: " +
                    "("+positionX+","+positionY+")");
        }
        //Finalmente se imprime Value 2 found at: (1,1)
    }
}
