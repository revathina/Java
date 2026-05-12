package com.java17.examples.java17.patternmatching;

public class JavaDemo {

    public static void main(String[] args) {
        final Object obj = "foo";

        if (obj instanceof String s) { // declares pattern variable 's', in scope within the if block
            final var anotherString = s.toUpperCase();
            System.out.println(anotherString);
        } else {
            System.out.println("Expected obj to be of type string");
        }
    }
}
