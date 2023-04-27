package src.class_design.inheritance.package_private_access.b;

import src.class_design.inheritance.package_private_access.a.Vehicle;
class Car extends Vehicle {
    void test() {
        //wheels++;                         //DOES NOT COMPILE
        //print();                          //DOES NOT COMPILE
    }
    public static void main(String[] args) {
        Vehicle car = new Car();
        //car.wheels++;                     //DOES NOT COMPILE
        //car.print();                      //DOES NOT COMPILE
    }
}
