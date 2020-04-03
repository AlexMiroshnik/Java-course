package com.company;

import com.company.Person;

public class People {
    public static void main(String[] args) {
        Person person1 = new Person("Galina", "Myroshnyk",1998);
        Person person2 = new Person("Boghena", "Chagir",1990);
        Person person3 = new Person("Svyat", "Norokov",1989);
        Person person4 = new Person("Nastya", "Grisiuk",1925);
        Person person5 = new Person("Katya", "Svyatolina",2004);


        person1.changeName("Sonya");
        System.out.println(person1);
        person2.changeName("Dasha");
        System.out.println(person2);
        person3.changeName("Marina");
        System.out.println(person3);
        person4.changeName("Mariya");
        System.out.println(person4);
        person5.changeName("Valentina");
        System.out.println(person5);




        System.out.println("firstName=" + person1.getFirstName() + "," +
                "lastName=" + person1.getLastName() + "," +
                "birthYear=" + person1.getAge());
        System.out.println("firstName=" + person2.getFirstName() + "," +
                "lastName=" + person2.getLastName() + "," +
                "birthYear=" + person2.getAge());
        System.out.println("firstName=" + person3.getFirstName() + "," +
                "lastName=" + person3.getLastName() + "," +
                "birthYear=" + person3.getAge());
        System.out.println("firstName=" + person4.getFirstName() + "," +
                "lastName=" + person4.getLastName() + "," +
                "birthYear=" + person4.getAge());
        System.out.println("firstName=" + person5.getFirstName() + "," +
                "lastName=" + person5.getLastName() + "," +
                "birthYear=" + person5.getAge());
    }
}

