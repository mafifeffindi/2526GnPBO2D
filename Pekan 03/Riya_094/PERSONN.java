/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *

 */
public class PERSONN {

    
    String name;
    int age;
    String city;

    
    void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }

   
    public static void main(String[] args) {

        
        PERSONN person1 = new PERSONN();

       
        person1.name = "Nurul Qomariyah";
        person1.age = 19;
        person1.city = "madura";

       
        person1.displayInfo();
    }
}