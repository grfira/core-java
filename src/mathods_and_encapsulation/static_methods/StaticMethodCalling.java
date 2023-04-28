package src.mathods_and_encapsulation.static_methods;

class StaticMethodCalling {
    static void test() {
    }


    public static void main(String[] args) {

        test();

        StaticMethodCalling.test();        //recommended - access via class name

        new StaticMethodCalling().test();      //not recommended - access via instance reference
        StaticMethodCalling smc = new StaticMethodCalling();
        smc.test();
        smc = null;
        smc.test();
        ((StaticMethodCalling) null).test();
    }
}
