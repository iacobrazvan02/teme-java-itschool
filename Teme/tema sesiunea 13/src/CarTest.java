import java.util.HashSet;
import java.util.Objects;

class Car {
    String brand;
    String model;
    int year;
    double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, year);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ") - $" + price;
    }
}

public class CarTest {
    public static void main(String[] args) {
        HashSet<Car> carSet = new HashSet<>();

        carSet.add(new Car("Toyota", "Corolla", 2020, 20000));
        carSet.add(new Car("Honda", "Civic", 2020, 21000));
        carSet.add(new Car("Toyota", "Corolla", 2020, 22000)); // Duplicate based on brand, model, and year

        for (Car car : carSet) {
            System.out.println(car);
        }
    }
}
