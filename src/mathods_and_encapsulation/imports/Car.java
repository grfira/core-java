package src.mathods_and_encapsulation.imports;
import src.mathods_and_encapsulation.imports.engine.Engine;
import static src.mathods_and_encapsulation.imports.engine.Engine.*;


class Car {
    public static void main(String[] args) {
        start();                            //static import
        System.out.println(power);          //static import

        Engine.start();                     //"regular" import
        new Engine().start();               //"regular" import
        System.out.println(Engine.power);   //"regular" import
    }
}
