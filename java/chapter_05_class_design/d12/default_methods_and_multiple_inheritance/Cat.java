package ids_bootcamp.java.chapter_05_class_design.d12.default_methods_and_multiple_inheritance;

//La clase Cat implementa las interfaces Walk y Run
//Sin embargo, genera un error de compilación ya que,
//no se sabe que método predeterminado utilizar. Si de la interfaz Walk o Run
public class Cat implements Walk, Run{

    //Para solucionar el problema anterior. Del conflicto entre métodos predeterminados
    //se debe sobreescribir el método getSpeed()
    public int getSpeed(){
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
