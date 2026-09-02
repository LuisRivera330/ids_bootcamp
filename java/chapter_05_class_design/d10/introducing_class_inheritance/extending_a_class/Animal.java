package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.extending_a_class;

public class Animal {
    //Se declara una variable de tipo private
    private int age;

    //Se declara dos métodos getAge() y setAge() de tipo público
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}