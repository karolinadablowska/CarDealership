import java.util.*;

public class Main {


    private static final int STOP_PROGRAM = 0;
    private static final int ADD = 1;
    private static final int SELL = 2;
    private static final int LIQUIDATION = 3;
    private static final int CHECK = 4;
    private static final int BOOK = 5;


    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();


        int option;
        do {
            System.out.println("--------------------------------");
            System.out.println("1 - add car");
            System.out.println("2 - sell car");
            System.out.println("3 - liquidate car");
            System.out.println("4 - check car");
            System.out.println("5 - book car");

            option = sc.nextInt();

            switch (option) {
                case ADD:
                    System.out.println("Your'e adding a car........");

                    int optionOfCars;
                    Car car;
                    do {
                        System.out.println("--------------------------------");
                        System.out.println("0 - stop");
                        System.out.println("1 - add a car");
                        System.out.println("2 - add cars");

                        optionOfCars = sc.nextInt();

                        switch (optionOfCars) {
                            case 1:
                                System.out.println("What car do you need to add?");
                                car = add();
                                cars.add(car);
                                System.out.println(cars.toString());
                                break;
                            case 2:
                                System.out.println("Add cars.");
                                System.out.println("How many?");
                                int number = sc.nextInt();
                                for (int i = 0; i < number; i++) {
                                    car = add();
                                    cars.add(car);
                                }
                                System.out.println(cars.toString());
                                break;
                        }
                    } while (optionOfCars != STOP_PROGRAM);

                    break;
                case SELL:
                    System.out.println("Your'e selling a car........");
                    removeCar(cars);
                    System.out.println(cars.toString());
                    break;
                case LIQUIDATION:
                    System.out.println("Your'e liquiding all cars.......");
                    cars.clear();
                    System.out.println(cars);
                    break;
                case CHECK:
                    System.out.println("Your'e checking a car........");
                    has(cars);
                    break;
                case BOOK:
                    System.out.println("Your'e booking a car........");
                    System.out.println("What car do you want to rent?");

                    System.out.println("Enter an index: ");
                    int indextoEnter = sc.nextInt();

                    Car carFinded = cars.get(indextoEnter);
                    if(carFinded.isBooked()){
                        System.out.println("Is booked.");
                    } else {
                        carFinded.setBooked(true);
                    }
                    break;

            }

        }
        while (option != STOP_PROGRAM);
    }


    private static void has(List<Car> cars) {
        System.out.println("Enter a name");
        String name = sc.next();
        Car carToFind = new Car(name);
        boolean check = cars.contains(carToFind);
        if (check == true) {
            System.out.println("is contained in the list");
        } else {
            System.out.println(" is not contained in the list");
        }
    }


    private static void removeCar(List<Car> cars) {
        System.out.println("What index do you want to remove: ");
        int index = sc.nextInt();
        cars.remove(index);
    }


    private static Car add() {
        System.out.println("Enter a name: ");
        String name = sc.next();
        System.out.println("Enter 0 - to rent, or 1 - rent");
        boolean book = sc.nextInt() == 0 ? false : true;
        Car car = new Car(name, book);
        return car;
    }


}

    /*

    Stwórz aplikację umożliwiającą przechowywanie pojazdów w salonie samochodowym.

możliwość dodania aut pojedynczo oraz grupowo
możliwość sprzedania auta, czyli usunięcia z salonu
możliwość sprawdzenia czy auto istnieje, sprawdzamy po nazwa/modelu
likwidacja salonu (usunięcie wszystkich aut)
rezerwacja auta, (auto ma status - zarezerwowane).
     */

