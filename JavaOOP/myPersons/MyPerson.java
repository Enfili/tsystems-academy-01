package myPersons;

import cars.Car;

public class MyPerson {
    public static final String JAHODA = "jahoda";

    private String name;
    private int age;
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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                (car != null ? ", " + car.toString() + " " : "");
    }
}
