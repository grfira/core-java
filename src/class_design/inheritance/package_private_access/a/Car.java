package src.class_design.inheritance.package_private_access.a;


class Car extends Vehicle{
    void test() {
        wheels++;
        print();
    }
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.wheels++;
        car.print();
    }

}
