package ids_bootcamp.java.chapter_03_core_java_apis.d06.working_with_dates_and_times.working_with_periods;

import java.time.*;

public class WorkingWithPeriods {
    /*public static void main(String[] args) {
        //Se define la fecha incial y final
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        //Se invoca a la función
        performAnimalEnrichment(start, end);
    }
    //La siguiente función añade un mes a la fecha. No se puede reutilizar porque se quiere probar otros horarios
    //Se crea una función con dos parámetros. Ambos de tipo LocalDate
    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
        //Se asigna la variable start a upTo
        LocalDate upTo = start;
        //Se crea un bucle while. Se ejecuta mientras upTo sea mejor a la variable end
        while (upTo.isBefore(end)) {
            //Se imprime la fecha que se dará nuevos juguetes a los animales
            System.out.println("give new toy: " + upTo);
            //Se suma un mes a la fecha actual
            upTo = upTo.plusMonths(1);
        }
    }*/

    //Realiza lo mismo que el ejemplo anterior.
    //En este caso se está utilizando la clase Period que se puede utilizar como parámetro
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // crea el periodo
        //Se define la fecha inicial, final y el periodo
        performAnimalEnrichment(start, end, period);

        //Se instancia variables de tipo date y time
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        //Estas dos últimas variables se juntan en una variable LocalDateTime
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        //Se crea un periodo que aumenta de 1 mes a 1 mes
        Period period2 = Period.ofMonths(1);
        //Los dos primeros prints no genera problemas porque se conoce la fecha
        System.out.println(date.plus(period2)); // 2015-02-20
        System.out.println(dateTime.plus(period2)); // 2015-02-20T06:15
        //Lanza una excepción que indica que se está intentando usar unidades no compatibles
        //System.out.println(time.plus(period2)); // UnsupportedTemporalTypeException
    }
    //Se crea nuevamente la función, pero esta vez considerando como parámetro period
    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
                                                Period period) { //
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // Se suma el valor de periodo. Es decir 1 mes
        }}

    //5 maneras de crear un periodo
    Period annually = Period.ofYears(1); // Cada año
    Period quarterly = Period.ofMonths(3); // Cada 3 meses
    Period everyThreeWeeks = Period.ofWeeks(3); // Cada 3 semanas
    Period everyOtherDay = Period.ofDays(2); // Cada 2 días
    Period everyYearAndAWeek = Period.of(1, 0, 7); //Cada año y siete días

    //La siguiente línea de código está mal porque no se puede encadenar los métodos de periodo
    //Period wrong = Period.ofYears(1).ofWeeks(1); // every week

    //Se escribe de la siguiente manera pero no llega a ser lo mismo
    //Por eso period nos da el método of()
    //Period wrong = Period.ofYears(1);
    //wrong = Period.ofWeeks(7);


}
