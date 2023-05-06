package src.core_java_api.strings;

class StringPoolTest {
    public static void main(String[] args) {

        String car1 = "car";
        final String car2 = "car";

        System.out.println("fastcar" == "fast" + car1);
        System.out.println("fastcar" == "fast" + car2);
        System.out.println("fastcar" == "fast" + "car");
        System.out.println("fastcar" == ("fast" + car1).intern());

        int one1 = 1;
        final int one2 = 1;
        System.out.println("number1" == "number" + one1);
        System.out.println("number1" == "number" + one2);
        System.out.println("number1" == "number" + 1);
    }
}
