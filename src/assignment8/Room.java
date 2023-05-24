package assignment8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Room {
    String name;
    String position;
    List<Person> people;

    public Room(String name, String position) {
        this.name = name;
        this.position = position;
        this.people = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public void removePerson(Person person) {
        this.people.remove(person);
    }

    public void printInfo() {
        System.out.println("Tên phòng: " + this.name);
        System.out.println("Vị trí: " + this.position);
        System.out.println("Danh sách user:");
        Iterator var1 = this.people.iterator();

        while(var1.hasNext()) {
            Person person = (Person)var1.next();
            System.out.println("Name: " + person.getName() + " - Age: " + person.getAge() + " - Telephone: " + person.getTelephone() + " - Address: " + person.getAddress());
        }

    }
}