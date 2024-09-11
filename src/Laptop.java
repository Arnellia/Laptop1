import java.util.Objects;

public class Laptop {
    //поля, геттеры конструктор, из класса обжект переопределить методы: toString equals hashCode
String brand;
int hdd;
String os;
String color;
    public Laptop (String brand, int hdd, String os, String color) {
        this.brand = brand;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", hdd=" + hdd +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    public String getBrand() {
        return brand;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }
    @Override

    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        return hdd == laptop.hdd &&

                Objects.equals(brand, laptop.brand) &&
                Objects.equals(os, laptop.os) &&
                Objects.equals(color, laptop.color);

    }


    @Override
    public int hashCode() {
        return Objects.hash(brand, hdd, os, color);

    }
}
