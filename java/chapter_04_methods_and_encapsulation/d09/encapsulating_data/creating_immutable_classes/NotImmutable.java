package ids_bootcamp.java.chapter_04_methods_and_encapsulation.d09.encapsulating_data.creating_immutable_classes;

//La siguiente clase parece immutable ya que, no tiene un método setter
//Sin embargo, al crear una instancia de la clase le pasamos un atributo de tipo StringBuilder al constructor
//El cual posteriormente puede añadir nueva información al atributo builder
public class NotImmutable {
    private StringBuilder builder;
    public NotImmutable(StringBuilder b) {
        builder = b;
    }
    /*public StringBuilder getBuilder() {
        return builder;
    }*/
    //String es seguro para devolver porque es immutable
    public String getValue() {
        return builder.toString();
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("initial");
        NotImmutable problem = new NotImmutable(sb);
        sb.append(" added");
        //StringBuilder gotBuilder = problem.getBuilder();
        //gotBuilder.append(" more");
        //System.out.println(problem.getBuilder());
    }

    //Lo ideal sería crear una copia del objeto mutable. Esto se conoce como copia defensiva.
    /*public NotImmutable(StringBuilder b) {
        builder = new StringBuilder(b);
    }
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }*/


}
