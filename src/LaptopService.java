/* import java.util.HashSet;
import java.util.Set;

public class LaptopService {
    //методы или один метод поиска ноутбуков по заданным параметрам
    private Set<Laptop> laptops = new HashSet<>();

    public LaptopService () {
     laptops.add(new Laptop("Asus", 512, "Windows", "Black"));
     laptops.add(new Laptop("Macbook", 256, "MacOS", "Silver"));
     laptops.add(new Laptop("Lenovo", 512, "Windows", "Black"));
}
    public Set<Laptop> searchLaptops(String brand, int hdd, String os, String color) {

        Set<Laptop> result = new HashSet<>();

        for (Laptop laptop : laptops) {
            if (laptop.getBrand().equals(brand) && laptop.getHdd() == hdd && laptop.getOs().equals(os) && laptop.getColor().equals(color)) {
                result.add(laptop);
            }
        }
        return result;
    }
} */

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class LaptopService {
    private List<Laptop> laptopList = new ArrayList<>();

    public LaptopService() {

        laptopList.add(new Laptop("Apple", 256, "macOS", "Black"));
        laptopList.add(new Laptop("Honor", 512, "Windows", "Black"));
        laptopList.add(new Laptop("HP", 1024, "Linux", "White"));
        laptopList.add(new Laptop("Asus", 512, "Windows", "Silver"));
        laptopList.add(new Laptop("Lenovo", 256, "Linux", "Blue"));

    }

    public Set<Laptop> searchLaptops(String brand, int hdd, String os, String color) {

        Set<Laptop> result = new HashSet<>();
        for (Laptop laptop : laptopList) {
            if ((brand == null || laptop.getBrand().equals(brand)) &&
                    (hdd == 0 || laptop.getHdd() >= hdd) &&
                    (os == null || laptop.getOs().equals(os)) &&
                    (color == null || laptop.getColor().equals(color))) {
                result.add(laptop);
            }
        }
        return result;
    }
}