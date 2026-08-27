package ids_bootcamp.java.chapter_03_core_java_apis.d06.working_with_dates_and_times.manipulating_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ManipulatingDatesAndTimes {
    public static void main(String[] args) {
        //Se instancia un variable de tipo LocalDate su valor inicial es de 2014/01/20
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); //Resultado: 2014-01-20
        //Sumamos dos días y reasignamos a nuestra variable de referencia, es decir date
        date = date.plusDays(2);
        System.out.println(date); //Resultado: 2014-01-22
        //Sumamos ahora una semana. Es más claro que colocar plusDays(7)
        date = date.plusWeeks(1);
        System.out.println(date); //Resultado: 2014-01-29
        //Sumamos ahora un mes
        //2014 al no ser un año bisiesto se coloca simplemente a 28 días
        date = date.plusMonths(1);
        System.out.println(date); //Resultado: 2014-02-28
        //Sumamos ahora 5 años
        date = date.plusYears(5);
        System.out.println(date); //Resultado: 2019-02-28

        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        //Se instancia una variable de tipo LocalDateTime formado por date2 y time
        LocalDateTime dateTime = LocalDateTime.of(date2, time);
        //Imprime la fecha y hora actual
        System.out.println(dateTime); //Resultado: 2020-01-20T05:15
        //Imprime y resta un día
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); //Resultado: 2020-01-19T05:15
        //Resta 10 horas
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        //Resta 30 segundo. Es importante aclarar que ahora muestra los segundos
        System.out.println(dateTime); // 2020-01-18T19:14:30

        //Una manera más corta de realizar el anterior proceso
        //Resultado llega imprimir lo mismo 2020-01-18T19:14:30
        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time3 = LocalTime.of(5, 15);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time3)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime3);

        //El siguiente objeto no compila porque no se especifica la hora
        LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20);
        //date5 = date5.plusMinutes(1); // No compila
    }

}
