package cars;

import persons.CompareObject;

public class Car implements CompareObject, Comparable<Car> {
    private String brand;
    private boolean started;

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start() {
        this.started = true;
    }

    public void stop() {
        this.started = false;
    }

    public boolean isStarted() {
        return started;
    }

    @Override
    public String toString() {
        return brand + " " + (this instanceof PersonalCar ? "personal car " : this instanceof Truck ? "truck " : "") +
                (this instanceof PersonalCar ? ", number of seats: " + ((PersonalCar) this).getNumberOfSeats() + " " : "") +
                '(' +
                (started ? "started" : "stopped") +
                ')';
    }

    @Override
    public int compareTo(CompareObject obj) {
        if (!(obj instanceof Car))
            return -1;

        return this.brand.compareTo(((Car) obj).brand);
    }

    @Override
    public int compareTo(Car o) {
        return this.brand.compareTo(o.brand);
    }
}