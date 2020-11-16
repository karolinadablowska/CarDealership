import java.util.*;

public class Main {


    private static final int STOP_PROGRAM = 0;
    private static final int ADD = 1;
    private static final int SELL = 2;
    private static final int LIQUIDATION = 3;
    private static final int CHECK = 4;
    private static final int BOOK = 5;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
                    do {
                        System.out.println("--------------------------------");
                        System.out.println("0 - stop");
                        System.out.println("1 - add a car");
                        System.out.println("2 - add cars");

                        optionOfCars = sc.nextInt();

                        switch (optionOfCars) {
                            case 1:
                                System.out.println("What car do you need to add?");
                                Car car2 = add(sc);
                                cars.add(car2);
                                System.out.println(cars.toString());
                                break;
                            case 2:
                                System.out.println("Add cars?");
                                cars.addAll(cars);
                                System.out.println(cars.toString());
                                break;
                        }
                    } while (optionOfCars != STOP_PROGRAM);

                    break;
                case SELL:
                    System.out.println("Your'e selling a car........");
                    removeCar(sc, cars);
                    System.out.println(cars.toString());
                    break;
                case LIQUIDATION:
                    System.out.println("Your'e liquiding all cars.......");
                    cars.clear();
                    System.out.println(cars);
                    break;
                case CHECK:
                    System.out.println("Your'e checking a car........");
                    has(sc, cars);
                    break;
                case BOOK:
                    System.out.println("Your'e booking a car........");
                    System.out.println("What car do you want to rent?");
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("Enter an index: ");
                   /* int indextoEnter = sc.nextInt();
                    for (int i = 0; i < cars.size(); i++) {
                        System.out.println(cars.get(indextoEnter));
                    }
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("Enter an index: ");

                    CarDealership carDealership = new CarDealership();
                    System.out.println("Enter old status");
                    int old = sc3.nextInt();
                    System.out.println("Enter neu status");
                    int neu = sc3.nextInt();
                    carDealership.changeCar(old, neu);
                    System.out.println(cars.toString());


                            break;*/

                    }

        }
        while (option != STOP_PROGRAM);
    }




    private static void has (Scanner sc, List < Car > cars){
            System.out.println("Enter a name");
            String name = sc.next();
            boolean check = cars.contains(name);
            if (check == true) {
                System.out.println("is contained in the list");
            } else {
                System.out.println(" is not contained in the list");
            }
        }



        private static void removeCar (Scanner sc, List < Car > cars){
            System.out.println("What index do you want to remove: ");
            int index = sc.nextInt();
            cars.remove(index);
        }


        private static Car add (Scanner sc){
            System.out.println("Enter a name: ");
            String name = sc.next();
            System.out.println("Enter 0 - to rent, or 1 - rent");
            int book = sc.nextInt();
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

