package src.java_building_blocks.order_of_initialization.fields;

class FinalStaticFields {
    private final static int number1 = 1;       //initializing on declaration
    private final static int number2;

    static {                                    //static(class) initialization block
        number2 = 2;
    }

    public static void main(String[] args) {
        System.out.println("{number1=" + number1 + ", number2=" + number2 +'}');
    }
}
