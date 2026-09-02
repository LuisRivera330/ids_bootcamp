package ids_bootcamp.java.chapter_02_operators_and_statements.d03.understanding_java_statements.the_switch_statement.supported_data_types.compile_time_constant_values;

public class CompileTimeConstantValues {
    public static void main(String[] args) {
        //En la estructura switch no es necesario que se siga un orden de sentencias al 100%
        // Resultado: Weekday
        /*int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }*/

        //Se debe colocar siempre la instrucción de break después de cada case
        //Sino continuará con el siguiente case, es decir seguirá en evaluación
        //Resultado: Weekday y Saturday
        /*int dayOfWeek = 5;
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }*/

        //Los valores en cada instrucción case deben ser constantes en tiempo de compilación
        // del mismo tipo de datos que el valor de switch
        //La condición "firstName" no necesita ser final. Pero el caso de los cases deben ser una constante de compilación valida
        /*private int getSortOrder( String firstName, final String lastName) {
            String middleName = "Patricia";
            final String suffix = "JR";
            int id = 0;
            switch(firstName) {
                case "Test": //Compila sin problemas utiliza una cadena fija. Return también lo podemos uitlizar para salir de la instrucción
                    return 52;
                case middleName: // No compila porque no es una variable final
                    id = 5;
                    break;
                case suffix: //Compila con normalidad porque es una variable con la instrucción final
                    id = 0;
                    break;
                case lastName: // No compila ya que a pesar de ser final no se define su valor
                    id = 8;
                    break;
                case 5: // No compila porque no es dato de tipo String
                    id = 7;
                    break;
                case 'J': // No compila porque no es dato de tipo String
                    id = 10;
                    break;
                case java.time.DayOfWeek.SUNDAY: // No compila porque no es dato de tipo String
                    id=15;
                    break;
            }
            return id;
        }*/
    }
}
