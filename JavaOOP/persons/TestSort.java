package persons;

import cars.Car;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestSort {
    public static void main(String[] args){
        //Array of person
        Person[] persons = new Person[5];
        persons[0] = new Person("Jano","Modry");
        persons[1] = new Person("Fero","Zeleny");
        persons[2] = new Person("Zuza","Modra");
        persons[3] = new Person("Jano","Zeleny");
        persons[4] = new Person("Anna","Modra");

        Car[] cars = {
                new Car("Trabant"),
                new Car("Citroen"),
                new Car("Toyota"),
                new Car("BMW"),
                new Car("Audi"),
        };

        //Sorting through default Comparable interface
//        Arrays.sort(persons, Comparator.reverseOrder());

        //Sorting
//        ArraySort as = new ArraySort();
//        as.sort(persons);
//        as.sort(cars);
        
        //Printing sorted array
//        for(Person p : persons) {
//            System.out.println(p);
//        }

        Arrays.sort(cars, Comparator.reverseOrder());
        for (Car c: cars)
            System.out.println(c);
    }
}
