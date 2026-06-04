class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }
        public static void main(String[] args) {
        Person person1 = new Person("Moh Rama Alan Wijaya", 19, "Sumenep");
        person1.displayInfo();
    }
}
