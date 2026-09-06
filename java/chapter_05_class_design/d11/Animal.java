package ids_bootcamp.java.chapter_05_class_design.d11;

//Se declara una clase abstracta para ello se utiliza la palabra reservada 'abstract'
public abstract class Animal {
    //Se declara una variable de tipo int y de acceso protected
    protected int age;

    //Se crea el método eat(). No tiene retorno es de acceso público y tiene cuerpo
    public void eat() {
        System.out.println("Animal is eating");
    }
    //Se crea el método abstracto getName() para ello se usa la palabra reservada 'abstract'
    //Retorna un String
    public abstract String getName();
}