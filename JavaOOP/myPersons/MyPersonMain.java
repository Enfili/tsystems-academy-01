package myPersons;

import cars.PersonalCar;
import cars.Truck;
import persons.Person;

public class MyPersonMain {
    public static void main(String[] args) {
        MyPerson[] persons = {
          new MyPerson("Janko"),
          new MyPerson("Peter", 20),
          new Student("Zuzka", 22, "153484614364SK"),
          new Employee("Anka", 19, "Everything"),
        };

        PersonalCar Mercedes = new PersonalCar("Mercedes", 4);
        Truck Chevrolet = new Truck("Chevrolet", "coal");

        persons[0].setCar(Mercedes);
        persons[2].setCar(Chevrolet);

        for (MyPerson person: persons) {
            if (person.getCar() != null)
                person.getCar().start();
            System.out.println(person);
        }

//        System.out.println(MyPerson.JAHODA);
//
//        MyPerson person1 = new MyPerson("Janko", 20);
//        MyPerson person2 = person1;
//        person1.setName("Jurko");
//        System.out.println(person2);
//        System.out.println(person1);
    }
}
