package oop;


class Person {
    String name;
    String email;
    String phone;
    
    void walk() {
        System.out.println(name + " is walking.");
    }
    
    void eat() {
        System.out.println(email);
    }
    
    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

public class Demo {

    public static void main(String[] args){
        
        // Instantiating an object - tworzenie instancji obiektu
        Person person1 = new Person();
        
        // Define some properties - zdefiniowanie paru właściwości
        person1.name = "Joe";
        person1.email = "joe@mamma.com";
        person1.phone = "123321123";
        
        // Abstraction - wywołanie KONKRETNYCH/pożądanych informacji/czynności od obiektu
        person1.walk();
        person1.sleep();
        person1.eat();
        
        Person person2 = new Person();
        person2.name = "Ligma";
        person2.sleep();
        
        /*
        // Osoba
        
        // Attributes, variables, adjectives - descriptors // atrybuty, zmienne i przymiotniki - deskryptory
        String name = "Joe";
        String email = "joe@mamma.com";
        String phone = "123321123";
        
        // Action, activity, behavior // akcja, aktywność i zachowanie
        //System.out.println(name + " is walking.");
        walking(name);
        System.out.println(name + " is eating.");
        
        // Co jeśli chcemy opisać drugą osobę?
        String name2 = "Ligma";
        String email2 = "ligma@ballz.com";
        String phone2 = "321123321";
        
        //System.out.println(name2 + " is walking.");
        walking(name2);
        System.out.println(name2 + " is eating.");
        
        // What about binding attributes and properties together? - A co jeśli byśmy złączyli atrybuty z własnościami?
        */

    }
    
    // Enhance by adding functions to minimize code - Ulepsz, poprzez dodanie linijek minimalizujących kod
    
//    static void walking(String name) {
//        System.out.println(name + " is walking.");
//    }

}
