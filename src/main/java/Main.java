import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car[] cars = fillCarsArray();
        Race race = new Race();
        String winnerName = race.getWinner(cars).name;
        System.out.println("\nСамая быстрая машина: " + winnerName);
    }

    public static Car[] fillCarsArray () {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3];
        int speed;
        String name;
        for (int i = 0; i < cars.length; i++) {
            while (true) {
                System.out.print("\nВведите название " + (i + 1) + "-го автомобиля: ");
                name = scanner.nextLine();
                name = name.trim();
                if (!name.isEmpty()) {
                    break;
                }
                System.out.print("Вы не ввели название автомобиля. Попробуйте еще раз.");
            }
            while (true) {
                System.out.print("Введите скорость " + (i + 1) + "-го автомобиля: ");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed > 0 && speed <= 250) {
                        scanner.nextLine();
                        break;
                    } else {
                        System.out.print("Скорость автомобиля должна быть в диапозоне (0; 250]. ");
                    }
                    scanner.nextLine();
                } else {
                    scanner.nextLine();
                }
                System.out.println("Вы неправильно ввели скорость " + (i + 1) + "-го автомобиля. Попробуйте еще раз.");
            }
            cars[i] = new Car(name, speed);
        }
        scanner.close();
        return cars;
    }
}