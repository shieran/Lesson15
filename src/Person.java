public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.printf("PersonName: %s \n", name);
    }

//    public static void main(String[] args) throws CloneNotSupportedException {
//        Person tom = new Person("Tom", 23);
//        tom.display();
//        Person bob = tom.clone();
//        bob.setName("Bob");
//        bob.display();
//        tom.display();
//    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
