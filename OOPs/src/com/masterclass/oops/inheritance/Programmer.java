package com.masterclass.oops.inheritance;

public class Programmer extends Employee{
    private String[] programmingLanguages;

    public Programmer(String name,
                      int age,
                      String address,
                      String experience) {
        super(name, age, address, experience);
    }

    public Programmer(String name,
                      int age,
                      String address,
                      String experience,
                      String[] programmingLanguages) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public void writeCode() {
        super.sayHello(); //without super keyword will also work, but if programmer also have same method it will call from programmer
        System.out.println(this.name + ": Writing some code");
    }

    @Override
    public void sayHello() {
        String msg = String.format("Hello my name is %s I'm a programmer", this.name);
        System.out.println(msg);
    }
}
