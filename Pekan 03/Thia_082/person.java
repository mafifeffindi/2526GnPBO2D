package person;

/**
 *
 * @author Noor Fathiatul Alea
 */
public class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void Displayinfo() {
        System.out.println("nama : " + name);
        System.out.println("age : " + age);
        System.out.println("city : " + city);
    }

    public static void main(String[] args) {
        Person p1 = new Person("thia", 19, "Lamongan");
        p1.Displayinfo();
    }
}
