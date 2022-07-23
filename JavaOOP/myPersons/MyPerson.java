package myPersons;

import cars.Car;
import persons.CompareObject;

import java.io.*;

public class MyPerson implements Comparable<MyPerson>, Serializable {
    public static final String JAHODA = "jahoda";

    private String name;
    private transient int age;
    private Car car;

    public MyPerson(String name) {
        this(name, 0);
        this.name = name;
    }

    public MyPerson(String name, int age) {
        this.name = name;
        if (isValidAge(age))
            this.age = age;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (isValidAge(age))
            this.age = age;
    }

    private boolean isValidAge(int age) {
        return 0 <= age && age <= 150;
    }

    public void save() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
        oos.writeObject(this);
    }

    public static void load() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
        System.out.println((MyPerson) ois.readObject());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                (car != null ? ", " + car.toString() + " " : "");
    }

    @Override
    public int compareTo(MyPerson o) {
        int res = name.compareTo(o.name);
        if(res != 0)
            return res;

        if (age - o.age != 0)
            return age - o.age;

        if (this.car != null && o.car != null)
            return this.car.getBrand().compareTo(o.car.getBrand());
        else if (this.car != null && o.car == null)
            return -1;
        else if (this.car == null && o.car != null)
            return 1;
        else
            return 0;
    }
}
