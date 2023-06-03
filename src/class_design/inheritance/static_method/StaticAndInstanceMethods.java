package src.class_design.inheritance.static_method;

interface A {
    public static void methodA1() {}
    public default void methodA2() {}
}

class B implements A {
    public void methodA1() {}                   // IT WORKS!
    // public static void methodA2(){}          // static method cannot override instance method
}

class X {
    void methodX1() {}
    static void methodX2() {}
}

class Y extends X {
    // static void methodX1(){}                 // static method cannot override instance method
    // void methodX2(){}                        // instance method cannot override static method
}
