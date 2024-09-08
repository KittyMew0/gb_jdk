package geekbrains_course.jdk.lesson3.seminar;

public class Calculator {
	
	//sum()
    public static <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    //subtract()
    public static <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }

    //multiply()
    public static <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    //divide()
    public static <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a.doubleValue() / b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(5, 3.2));
        System.out.println("Subtract: " + subtract(5.5, 2)); 
        System.out.println("Multiply: " + multiply(4, 2.5)); 
        System.out.println("Divide: " + divide(10, 2));      
    }
}
