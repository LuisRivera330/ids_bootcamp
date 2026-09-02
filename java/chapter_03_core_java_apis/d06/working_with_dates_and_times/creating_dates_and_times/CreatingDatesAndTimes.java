package ids_bootcamp.java.chapter_03_core_java_apis.d06.working_with_dates_and_times.creating_dates_and_times;

//Importaciones necesarias para poder trabajar con Dates
//import java.time.*; Otra alternativa
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDatesAndTimes {
    public static void main(String[] args) {
        //Imprime la fecha actual
        System.out.println(LocalDate.now());
        //Imprime la hora actual. Se muestra desde hora hasta nanosegundos
        System.out.println(LocalTime.now());
        //Imprime la fecha y hora actual.
        System.out.println(LocalDateTime.now());

        //Firma de los métodos
        //public static LocalDate of(int year, int month, int dayOfMonth)
        //public static LocalDate of(int year, Month month, int dayOfMonth)

        //Ambas fechas son iguales. La diferencia está en la escritura. Para uno se coloca el mes en letras
        //Para el otro se utiliza números
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
        System.out.println(date1);
        System.out.println(date2);

        //Se especifica la hora según la necesidad
        //Firma de métodos
        //public static LocalTime of(int hour, int minute)
        //public static LocalTime of(int hour, int minute, int second)
        //public static LocalTime of(int hour, int minute, int second, int nanos)
        LocalTime time1 = LocalTime.of(6, 15); // Se precisa hora y minuto
        LocalTime time2 = LocalTime.of(6, 15, 30); // Se precisa hora, minuto y segundo
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // Se precisa precisa hora, minuto y milisegundo

        //Se puede combinar fecha y hora
        //Se especifica cada valor manualmente
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        //Se extrae el valor de otras varaibles
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1);
        System.out.println(dateTime2);

        //Firmas de métodos válidos
        /*public static LocalDateTime of(int year, int month,
        int dayOfMonth, int hour, int minute)
        public static LocalDateTime of(int year, int month,
        int dayOfMonth, int hour, int minute, int second)
        public static LocalDateTime of(int year, int month,
        int dayOfMonth, int hour, int minute, int second, int nanos)
        public static LocalDateTime of(int year, Month month,
        int dayOfMonth, int hour, int minute)
        public static LocalDateTime of(int year, Month month,
        int dayOfMonth, int hour, int minute, int second)
        public static LocalDateTime of(int year, Month month,
        int dayOfMonth, int hour, int minute, int second, int nanos)
        public static LocalDateTime of(LocalDate date, LocalTime)*/

        //LocalDate d = new LocalDate(); // No compila porque para las clases de fecha y hora hay constructores privados

        //LocalDate.of(2015, Month.JANUARY, 32); // Lanza un error porque 32 no es día válido
    }
}
