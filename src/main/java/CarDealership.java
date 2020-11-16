public class CarDealership {

    private Car[] cars;


    public CarDealership(Car[] cars) {
        this.cars = cars;
    }

    public CarDealership() {
        this.cars = cars;
    }
    public void changeCar(int old, int neu) {
        Car car = lookForCar(old);
        car.setBooking(neu);
    }


    public Car lookForCar(int booking) {
        {
            for (int i = 0; i < cars.length && cars[i] != null; i++) {
                if (cars[i].getName().equals(booking)) {
                    return cars[i];
                }
            }
            return null;
        }
    }
}