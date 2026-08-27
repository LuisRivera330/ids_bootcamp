package ids_bootcamp.java.chapter_03_core_java_apis.d06.working_with_dates_and_times.parsing_dates_and_times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ParsingDatesAndTimes {
    public static void main(String[] args) {
        //Es bastante similar a format.
        //Igual utilizamos un formato
        //Si no se especifica uno. Utilizamos el valor predeterminado
        DateTimeFormatter ff = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", ff);
        LocalTime time = LocalTime.parse("11:22");
        //El resultado muestra el formato que tiene LocalDate no con el formato. No es mutable
        System.out.println(date); //Resultado: 2015-01-02
        System.out.println(time); //Resultado: 11:22

    }
}
