package org.example.Person;

import org.example.Department.Department;

public class Person {
        public static void main(String[] args) {
                Department person1 = new Department();
                Department person2 = new Department();

                person1.name = "Sedats";
                person1.surname = "Akkok";
                person1.position = "qa engineer";

                person2.name = "Oznur";
                person2.surname = "Akkok";
                person2.position = "Sales support";

                person1.personelekle();
                person1.personellistele();

                person2.personelekle();
                person2.personellistele();

        }




}
