package src.java_building_blocks.order_of_initialization.fields;

class FinalInstanceFields {
    private final int number1=11;              //initializing on declaration
    private final int number2;
    private final int number3;

    {                                           //instance initializer
        number2 = 22;
    }

    FinalInstanceFields() {                     //constructor
        number3=33;
    }

    public static void main(String[] args) {
        FinalInstanceFields fif = new FinalInstanceFields();
        System.out.println(fif);
    }

    @Override
    public String toString() {
        return "StaticFields{" +
                ", number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                '}';
    }
}
