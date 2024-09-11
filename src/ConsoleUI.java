
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ConsoleUI {
    private LaptopService service = new LaptopService();
    private Scanner scanner = new Scanner(System.in);
    private Map<String, String> filters = new HashMap<>();

    public void run() {
        while (true) {
            System.out.println("> Введите параметр поиска:");
            System.out.println("1 - Бренд");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Цвет");
            System.out.println("0 - Завершить выбор");

            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("Бренд?");
                    filters.put("brand", scanner.next());
                    break;

                case 2:
                    System.out.println("Минимальный объем ЖД?");
                    filters.put("hdd", scanner.next());
                    break;

                case 3:
                    System.out.println("Операционная система?");
                    filters.put("os", scanner.next());
                    break;

                case 4:
                    System.out.println("Цвет?");
                    filters.put("color", scanner.next());
                    break;

                default:
                    System.out.println("Попробуйте снова.");
            }
        }
        System.out.println("Искать еще? (y/n)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            findAndPrintLaptops();
        } else {
            System.exit(0);
        }
    }

    private void findAndPrintLaptops() {

        String brand = filters.get("brand");
        int hdd = filters.containsKey("hdd") ? Integer.parseInt(filters.get("hdd").trim()) : 0;
        String os = filters.get("os");
        String color = filters.get("color");

        Set<Laptop> result = service.searchLaptops(brand, hdd, os, color);

        if (result.isEmpty()) {
            System.out.println("Ничего не найдено.");

        } else {
            for (Laptop laptop : result) {
                System.out.println(laptop.getBrand() + " " + laptop.getHdd() + " " + laptop.getOs() + " " + laptop.getColor());
            }
        }
    }


    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI();
        ui.run();

    }

}