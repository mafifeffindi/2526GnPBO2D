/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *

 */
public class Person {
    String name;
    int age;
    String city;
    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Kafilatul Hima";
        person1.age = 20;
        person1.city = "Bangkalan";
        person1.displayInfo();
    }
}
