import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        Car[] carslist = car();
        System.out.println("Вивести список автомобілей заданої марки.");
        System.out.print("Введіть марку автомобіля: ");
        checkmark(carslist, scanner.next());

        System.out.println("Введіть список автомобілів заданої моделі, які експлуатуються більше n років.");
        System.out.print("Введіть модель автомобіля: ");
        String model = scanner.next();
        System.out.print("Введіть кількість років експлуатації: ");
        checkmodel(carslist, model, scanner.nextInt());

        System.out.println("Вивести список автомобілів заданого року випуску, ціна яких більша вказаної.");
        System.out.print("Введіть рік випуску: ");
        int year = scanner.nextInt();
        System.out.print("Введіть ціну: ");
        checkyear(carslist, year, scanner.nextInt());

    }


    static Car[] carslist() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введіть кількість автомобілів: ");
        Car[] cars = new Car[scanner1.nextInt()];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println();
            System.out.print("Введіть id: ");
            cars[i].setId(scanner1.nextInt());
            System.out.print("Введіть марку: ");
            cars[i].setMarka(scanner1.next());
            System.out.print("Введіть модель: ");
            cars[i].setModel(scanner1.next());
            System.out.print("Введіть рік випуску: ");
            cars[i].setYear(scanner1.nextInt());
            System.out.print("Введіть ціну: ");
            cars[i].setPrice(scanner1.nextInt());
            System.out.print("Введіть реєстраційний номер: ");
            cars[i].setRegistrnumber(scanner1.nextInt());
        }

        return cars;
    }

    static Car[] car() {
        Car[] cars = new Car[7];
        cars[0] = new Car(0, "BMV", "X5", 2015, 32000, 2134);
        cars[1] = new Car(1, "Mazda", "6", 2008, 15000, 1649);
        cars[2] = new Car(2, "Toyota", "Prius", 2012, 29900, 3452);
        cars[3] = new Car(2, "Toyota", "Prius", 2008, 9200, 3561);
        cars[4] = new Car(3, "Peugeot", "508", 2014, 8000, 3214);
        cars[5] = new Car(4, "Peugeot", "4008", 2010, 11000, 7213);
        cars[6] = new Car(2, "Volkswagen", "Passat B7", 2014, 8500, 9825);

        return cars;
    }

    static void checkmark(Car[] cars, String marka) {
        for (Car car : cars) {
            if (car.getMarka().equals(marka))
                System.out.println(car.toString());
        }
        System.out.println();
    }

    static void checkmodel(Car[] cars, String model, int n) {
        for (Car car : cars) {
            if (car.getModel().equals(model) && (2022 - car.getYear()) > n) {
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    static void checkyear(Car[] cars, int year, int price) {
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price)
                System.out.println(car.toString());
        }
    }
}