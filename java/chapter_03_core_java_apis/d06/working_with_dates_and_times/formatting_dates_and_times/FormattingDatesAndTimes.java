package ids_bootcamp.java.chapter_03_core_java_apis.d06.working_with_dates_and_times.formatting_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDatesAndTimes {
    public static void main(String[] args) {
        //Las clases de fecha y hora admiten muchos métodos para obtener datos de ellas
        //Se declara un objeto de tipo LocalDate
        LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
        //Obtiene el día de la fecha indicada
        System.out.println(date2.getDayOfWeek()); // MONDAY
        //Obtiene el mes de la fecha indicada
        System.out.println(date2.getMonth()); // JANUARY
        //Obtiene el año de la fecha indicada
        System.out.println(date2.getYear()); // 2020
        //Obtiene el día del año. Si fuera FEBRUARY. Sería 51 días
        System.out.println(date2.getDayOfYear()); // 20

        //Se crea dos variables una de tipo LocalDate y otra de LocalTime
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        //Ambas variables se instancian en una nueva LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        //Se imprime la fecha de la variable
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        //Se imprime la hora de la variable 11:12:34
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        //Se imprime la fecha y la hora 2020-01-20T11:12:34
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        //Se brinda un formato más sencillo para la fecha. SHORT
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        //Imprime la fecha con normalidad en dateTime y date
        System.out.println(shortDateTime.format(dateTime)); //Resultado 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
        //El último print no se imprime porque no tiene fecha. Genera un error
        //System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        //Es igual que el anterior ejemplo. Solo que en este caso en vez de
        //pasar el formato a cada variable como LocalDateTime, LocalDate y LocalTime a shortDateTime
        //se indica que formato debe tomar cada variable
        DateTimeFormatter shortDateTime2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime2));
        System.out.println(date.format(shortDateTime2));
        //El último print no se imprime porque no tiene fecha. Genera un error
        //System.out.println(time.format(shortDateTime2));

        LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time3 = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime3 = LocalDateTime.of(date3, time3);

        //Existen dos formatos predefinidos SHORT and MEDIUM
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime3)); //Resultado: 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime3)); //Resultado: Jan 20, 2020 11:12:34 AM

        //El siguiente ejemplo es un formato personalizado
        //MMMM produce el mes completo
        //dd días del mes
        //yyyy representa el año
        //hh:mm hora y minutos
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime3.format(f)); // January 20, 2020, 11:12

        //El error entre las tres opciones es el segundo porque no tiene hora
        //Recordemos que hh:mm significa hora y minutos
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
        f1.format(dateTime);
        //f1.format(date);
        f1.format(time);
        System.out.println(f1.format(dateTime));
        //System.out.println(f1.format(date)); //Genera un error
        System.out.println(f1.format(time));


    }
}
