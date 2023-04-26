package src.java_building_blocks.order_of_initialization;
class Motorbike extends Bike{
    {System.out.print("1 ");}
    Motorbike(int num) {super(num);System.out.print("2 ");}
    public static void main(String[] args) {
        System.out.print("3 ");
        new Motorbike(0);
        System.out.print("4 ");
        {System.out.print("5 ");}
    }
    static {System.out.print("6 ");}
}
class Bike{
    {System.out.print("7 ");}
    Bike(){super();System.out.print("8 ");}
    Bike(int num) {this();System.out.print("9 ");}
    static {System.out.print("10 ");    }
}