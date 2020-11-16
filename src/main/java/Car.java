import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public class Car {
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Car.id = id;
    }

    static int id = 0;
    private String name;
    private int index;
    private boolean booked;

    public Car(String name, boolean booked) {
        this.name = name;
        this.booked = booked;
        this.index = id;
        id++;
    }

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
