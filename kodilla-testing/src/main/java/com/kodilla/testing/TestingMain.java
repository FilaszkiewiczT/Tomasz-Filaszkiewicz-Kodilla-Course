package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

import java.net.SocketPermission;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("\nTest - pierwszy test jednostkowy:");


        Calculator calculator = new Calculator(8, 10);

        final Integer addResult = calculator.add();
        final Integer subtractResult = calculator.subtract();

        if (addResult instanceof Integer && (addResult == calculator.getA() + calculator.getB())){
            System.out.println("Testing method add(): test OK");
        } else {
            System.out.println("Testing method add(): Error!");
        }

        if (subtractResult instanceof Integer && (subtractResult == calculator.getA() - calculator.getB())){
            System.out.println("Testing method subtract(): test OK");
        } else {
            System.out.println("Testing method subtract(): Error!");
        }
    }
}