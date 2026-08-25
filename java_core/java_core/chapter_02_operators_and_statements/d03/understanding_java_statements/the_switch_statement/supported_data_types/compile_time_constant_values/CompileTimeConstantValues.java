package java_core.java_core.java_core.chapter_02_operators_and_statements.d03.understanding_java_statements.the_switch_statement.supported_data_types.compile_time_constant_values;

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

        //La condición "firstName" no necesita ser final. Pero el caso de los cases deben ser una constante de compilación valida
        /*private int getSortOrder( String firstName, final String lastName) {
            String middleName = "Patricia";
            final String suffix = "JR";
            int id = 0;
            switch(firstName) {
                case "Test":
                    return 52;
                case middleName: // DOES NOT COMPILE
                    id = 5;
                    break;
                case suffix:
                    id = 0;
                    break;
                case lastName: // DOES NOT COMPILE
                    id = 8;
                    break;
                case 5: // DOES NOT COMPILE
                    id = 7;
                    break;
                case 'J': // DOES NOT COMPILE
                    id = 10;
                    break;
                case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                    id=15;
                    break;
            }
            return id;
        }*/
    }
}
