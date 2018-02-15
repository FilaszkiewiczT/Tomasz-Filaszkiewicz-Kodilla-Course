package com.kodilla.stream;

import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        //Zadanie 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("tekst nr 1", text -> "Tekst Nr 1"));
        System.out.println(poemBeautifier.beautify("X", text -> text.replace("X", "New text")));
        System.out.println(poemBeautifier.beautify("a,b,c,d,e", text -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("TOMEK", text -> text.toLowerCase()));
        System.out.println(poemBeautifier.beautify("    Tekst     ", text -> text.trim()));
        System.out.println(poemBeautifier.beautify("123X ", (text) -> text.substring(0).replace("X", "456789")));
    }
}