package Typecast;

class InconvertibleExample {
    public static void main(String[] args) {
        String text = "123";
        // Attempting to convert a String to an integer directly, which is inconvertible
        // This will result in a compilation error
        int number = Integer.parseInt(text);
        System.out.println(number);
    }}


class ImplicitCastingExample {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue; // Implicit casting (compiler and JVM handle it)

        System.out.println("int value: " + intValue);
        System.out.println("long value: " + longValue);
    }}

 class ExplicitCastingExample {
    public static void main(String[] args) {
        double doubleValue = 123.456;
        int intValue = (int) doubleValue; // Explicit casting (requires type cast operator)

        System.out.println("double value: " + doubleValue);
        System.out.println("int value: " + intValue);
    }
}

class IncompatibleExample {
    public static void main(String[] args) {
        int intValue = 42;
        // Attempting to assign an int value to a variable of type String
        // This will result in a compilation error due to incompatible types
       // String stringValue = intValue;
    }
}


class TypecastExample {
    public static void main(String[] args) {
        double doubleValue = 123.456;
        // Explicitly casting a double to an int
        int intValue = (int) doubleValue;

        System.out.println("double value: " + doubleValue);
        System.out.println("int value: " + intValue);
    }}

 class ClassCastExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to cast a String object to an Integer, which will result in a ClassCastException
            Object obj = "Hello, World!";
            Integer intValue = (Integer) obj; // This line will throw ClassCastException
            System.out.println("Integer value: " + intValue);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException: " + e.getMessage());
        }}}

