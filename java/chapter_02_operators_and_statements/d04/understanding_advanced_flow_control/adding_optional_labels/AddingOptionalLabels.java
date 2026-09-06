package ids_bootcamp.java.chapter_02_operators_and_statements.d04.understanding_advanced_flow_control.adding_optional_labels;

public class AddingOptionalLabels {
    public static void main(String[] args) {

        //En el siguiente ejemplo se está añdiendo etiquetas opcionales.
        //Si bien en el siguiente ejemplo no genera un cambio
        //Son bastante útiles en bucles anidados
        //Su formato es escribirlo en mayáscula con guiones abajo
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }
}
