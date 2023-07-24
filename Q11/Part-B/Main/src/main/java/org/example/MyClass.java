package org.example;

public class MyClass implements A, B{

    @Override
    public void method_of_interface_A() {
        System.out.println("Running the method of interface A");
    }

    @Override
    public void method_of_interface_B() {
        System.out.println("Running the method of interface B");
    }
}
