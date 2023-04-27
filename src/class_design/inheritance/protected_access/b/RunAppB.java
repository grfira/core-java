package src.class_design.inheritance.protected_access.b;

import src.class_design.inheritance.protected_access.a.Person;

class RunAppB {
    public static void main(String[] args) {

        Person person = new Person();
        //System.out.println(person.name);      //DOES NOT COMPILE
        //person.protectedMethod();             //DOES NOT COMPILE

        Person personS = new Student();
        //System.out.println(personS.name);     //DOES NOT COMPILE
        //personS.protectedMethod();            //DOES NOT COMPILE

        Student student = new Student();
        //System.out.println(student.name);     //DOES NOT COMPILE
        //student.protectedMethod();            //DOES NOT COMPILE
        student.test();                         //IT WORKS!!!
    }
}
