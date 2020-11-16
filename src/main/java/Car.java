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
    private int booking;

    public Car(String name, int booking) {
        this.name = name;
        this.booking = booking;
        this.index = id;
        id++;
    }

    public Car(String name) {
        this.name = name;

    }

    public Car() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getBooking() {
        return booking;
    }

    public void setBooking(int booking) {
        this.booking = booking;
    }
}
