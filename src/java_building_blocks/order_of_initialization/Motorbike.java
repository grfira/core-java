package src.java_building_blocks.order_of_initialization;
class Motorbike extends Bike{
    {print(1);}
    Motorbike(int num) {super(num);print(2);}
    public static void main(String[] args) {
        print(3);
        new Motorbike(0);
        print(4);
        {print(5);}
    }
    static {print(6);}
}
class Bike{
    static void print(int number){System.out.print(number+" ");}
    {print(7);}
    Bike(){super();print(8);}
    Bike(int num) {this();print(9);}
    static {print(10);    }
}