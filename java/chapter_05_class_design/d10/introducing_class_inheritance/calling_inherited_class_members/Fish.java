package ids_bootcamp.java.chapter_05_class_design.d10.introducing_class_inheritance.calling_inherited_class_members;

class Fish {
    //Se crea un atributo de acceso protected (size)
    //Se crea un atributo de acceso private (age)
    protected int size;
    private int age;
    //Se crea un constructor con un parámetro de tipo int
    public Fish(int age) {
        this.age = age;
    }
    //Se crea el método getAge() de acceso público
    public int getAge() {
        return age;
    }
}
