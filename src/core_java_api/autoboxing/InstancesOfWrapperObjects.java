package src.core_java_api.autoboxing;

class InstancesOfWrapperObjects {
    public static void main(String[] args) {

        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println("b1==b2: " + (b1==b2));

        Byte bt1 = 127;
        Byte bt2 = 127;
        System.out.println("bt1==bt2: " +(bt1==bt2));

        Character ch1 = 127;
        Character ch2 = 127;
        System.out.println("ch1==ch2: " +(ch1==ch2));

        Character ch3 = 128;
        Character ch4 = 128;
        System.out.println("ch3==ch4: " +(ch3==ch4));

        Short sh1 = 127;
        Short sh2 = 127;
        System.out.println("sh1==sh2: " +(sh1==sh2));

        Short sh3 = 128;
        Short sh4 = 128;
        System.out.println("sh3==sh4: " +(sh3==sh4));

        Integer in1 = 127;
        Integer in2 = 127;
        System.out.println("in1==in2: " +(in1==in2));

        Integer in3 = 128;
        Integer in4 = 128;
        System.out.println("in3==in4: " +(in3==in4));
    }
}
