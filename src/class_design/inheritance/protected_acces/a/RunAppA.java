package src.class_design.inheritance.protected_acces.a;

import src.class_design.inheritance.protected_acces.b.Student;

class RunAppA {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);
        person.protectedMethod();

        Person personS = new Student();
        System.out.println(personS.name);
        personS.protectedMethod();

        Student student = new Student();
        System.out.println(student.name);
        student.protectedMethod();
        //student.test();                   //DOES NOT COMPILE
    }
}
