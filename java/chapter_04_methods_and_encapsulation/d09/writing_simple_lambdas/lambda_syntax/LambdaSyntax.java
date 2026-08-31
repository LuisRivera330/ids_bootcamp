package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.writing_simple_lambdas.lambda_syntax;

public class LambdaSyntax {
    //Las siguientes expresiones indican lo mismo
    //a -> a.canHop()
    //(Animal a) -> { return a.canHop(); }

    //Estructura 01:
    //a -> a.canHop()
    //a: Representa el nombre del parámetro
    //->: Separa el nombre del cuerpo de la expresión lambda
    //a.canHop(): Llama a un método y devuelve el resultado de dicho método

    //Estructura 02:
    //(Animal a) -> { return a.canHop(); }
    //a: Representa el nombre del parámetro. E indica que su tipo es Animal
    //->: Separa el parámetro del cuerpo de la expresión lambda
    //return a.canHop();: Un cuerpo que contiene una o más líneas de código

    //print(() -> true); //0 parámetros. No toma parámetros y siempre devuelve el valor booleano verdadero
    //print(a -> a.startsWith("test")); //1 parámetro. Toma un parámetro y llama a un método sobre él startsWith
    //print((String a) -> a.startsWith("test")); //1 parámetro. Realiza lo mismo que la anterior línea de código, pero define explícitamente el tipo de la variable
    //Las siguientes dos líneas toman dos parámetros pero ignoran uno de ellos
    //Ojo: No existe ninguna regla que exija usar todos los parámetros definidos
    //print((a, b) -> a.startsWith("test")); //2 parámetros.
    //print((String a, String b) -> a.startsWith("test")); //2 parámetros

    //print(a, b -> a.startsWith("test")); // No compila porque necesita paréntesis alrededor de la lista de parámetros
    //print(a -> { a.startsWith("test"); }); // No compila porque le falta la palabra return
    //print(a -> { return a.startsWith("test") }); // No compila porque le falta punto y coma

    //No se pueden acceder a todas las variables. Solo las variables de instancia y estáticas sí pueden.
    //boolean wantWhetherCanHop = true;
    //print(animals, a -> a.canHop() == wantWhetherCanHop);//

    //(a, b) -> { int a = 0; return 5;} // No compila porque se está intentado declarar una variabe "a" que ya existe como parámetro
    //(a, b) -> { int c = 0; return 5;} //La siguiente línea de código está correcta ya que, se usan diferentes tipos de variable tanto en contenido de lambda como en el nombre

}
