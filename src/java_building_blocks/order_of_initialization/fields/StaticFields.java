package src.java_building_blocks.order_of_initialization.fields;

class StaticFields {
    private static int number0;         //initializing to default value - only instance and class variables
    private static int number1=111;     //initializing on declaration
    private static int number2=221;
    private static int number3=331;
    private static int number4=441;

    static {                            //static(class) initialization block
        number2 = 222;
        number3 = 332;
        number4 = 442;
    }

   {                                   //instance initializer
       number3 = 333;
       number4 = 443;
   }

    StaticFields() {                    //constructor
        number4=444;
    }

    public static void main(String[] args) {
        printClassFields();
        StaticFields staticFields= new StaticFields();
        printClassFields();
    }

    private static void printClassFields() {
        System.out.println("{number0=" + number0 +
                ", number1=" + number1 +
                ", number2=" + number2 +
                ", number3=" + number3 +
                ", number4=" + number4 +
                '}');
    }


}
