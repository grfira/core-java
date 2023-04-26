package src.java_building_blocks.order_of_initialization.fields;

class InstanceFields {
    private int number0;                //initializing to default value - only instance and class variables
    private int number1=111;            //initializing on declaration
    private int number2=221;
    private int number3=331;

    {                                   //instance initializer
        number2 = 222;
        number3 = 332;
    }

    InstanceFields() {                  //constructor
        number3=333;
    }

    public static void main(String[] args) {
        InstanceFields instanceFields = new InstanceFields();
        System.out.println(instanceFields);
    }

    @Override
    public String toString() {
        return "StaticFields{" +
                "number0=" + number0 +
                ", number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                '}';
    }
}
