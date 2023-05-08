package src.core_java_api.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Bike {
    String name;
    Bike(String name) {this.name = name;}
    @Override
    public String toString() {return "Bike{" + "name='" + name + '\'' +'}';}
}

class Car {
    String name;
    Car(String name) {this.name = name;}
    @Override
    public String toString() {return "Car{" + "name='" + name + '\'' +'}';}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name);    }

}
public class ArrayListRemovedObjects {
    public static void main(String[] args) {

        List<Bike> bikeList = new ArrayList<>();
        bikeList.add(new Bike("city_bike"));
        bikeList.add(new Bike("trekking_bike"));
        bikeList.add(new Bike("city_bike"));
        bikeList.remove(new Bike("city_bike"));
        System.out.println(bikeList);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("compact_car"));
        carList.add(new Car("kei_car"));
        carList.add(new Car("compact_car"));
        carList.remove(new Car("compact_car"));
        System.out.println(carList);


    }
}

