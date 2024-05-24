package org.example.Odev4.Department;

public class Department {

    public String name;
    public String surname;
    public String position;

    public void  personelekle() {

        this.name = name;
        this.surname = surname;
        this.position = position;
        System.out.println("personel eklendi");
    }

    public void  personellistele() {
        System.out.println("Personel: " + name + " " + surname + ", Pozisyon: " + position);

    }

}
