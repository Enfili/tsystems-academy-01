package cars;

public class PersonalCar extends Car{
    private final int numberOfSeats;

    public PersonalCar(String brand, int numberOfSeats) {
        super(brand);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
