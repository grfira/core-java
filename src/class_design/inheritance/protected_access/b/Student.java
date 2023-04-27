package src.class_design.inheritance.protected_access.b;

import src.class_design.inheritance.protected_access.a.Person;

public class Student extends Person {
    private void privateMethod(){}
    protected void test(){
        protectedMethod();
    }

    public static void main(String[] args) {

        Student student = new Student();
        student.protectedMethod();
        System.out.println(student.name);

        student.privateMethod();    //a class always has access to methods and fields of another instance of the same class
        student.test();

        Person personS = new Student();
        // System.out.println(personS.name);   //DOES NOT COMPILE
        // personS.printProtected();           //DOES NOT COMPILE

        Person person = new Person();
        //person.protectedMethod();             //DOES NOT COMPILE
        //System.out.println(person.name);      //DOES NOT COMPILE
    }

}
