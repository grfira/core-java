package src.java_building_blocks.order_of_initialization;

class InitializationOrder {
    static { print(2); }
    static void print(int number) { System.out.print(number + " "); }
    InitializationOrder() { this(1);print(5); }
    InitializationOrder(int a) { super();print(7); }
    static { print(4); }

    { print(6); }
    static { new InitializationOrder(); }
    { print(8); }
    public static void main(String[] args) {new InitializationOrder(3);  }
}
