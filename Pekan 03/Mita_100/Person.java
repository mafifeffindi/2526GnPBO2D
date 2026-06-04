NIM    : 250631100100
Nama   : Paramita Ratih  

Tugas pada modul 03 (class dan object) 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author param
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
        Person p1 = new Person("Mita", 19, "Sidoarjo");
        p1.Displayinfo();
        
    }
    
}
