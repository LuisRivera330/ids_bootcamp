package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.calling_inherited_class_members;

//Se crea una clase Shark que hereda de Fish
public class Shark extends Fish {
    //Se crea una variable de acceso private y tipo int
    private int numberOfFins = 8;
    //Se crea un constructor de la clase Shark con un parámetro
    //Se hace el llamado del constructor de la clase padre
    //Se inicializa el atributo con un valor de 4
    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    //Se crea el método displaySharkDetails() no retorna ningún valor
    //Imprime la edad del tiburón. Para ello se usa el método público 'getAge()' de acceso público
    //Imprime el tamaño del tiburón. Se usa el atributo protected size de la clase padre. Para ello se usa this
    //Imprime la cantidad de aletas del tiburón. Utiliza el atributo numberOfFins de la clase Shark
    public void displaySharkDetails() {
        System.out.print("Shark with age: "+getAge());
        System.out.print(" and "+size+" meters long");
        System.out.print(" with "+numberOfFins+" fins");
    }

    //Otra alternativa de escribir los atributos de la clase
    /*public void displaySharkDetails() {
        System.out.print("Shark with age: "+this.getAge());
        System.out.print(" and "+this.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }*/

    //Se puede usar la palabra super para acceder explicitamente a un miembro de la clase padre
    /*public void displaySharkDetails() {
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+this.numberOfFins+" fins");
    }*/

    /*public void displaySharkDetails() {
        System.out.print("Shark with age: "+super.getAge());
        System.out.print(" and "+super.size+" meters long");
        System.out.print(" with "+super.numberOfFins+" fins"); // No compila porque, numberOfFins no es un atributo de la clase padre sino es propia de la clase hija
    }*/

    public static void main(String[] args) {
        Shark babyShark = new Shark(1);

    }
}
