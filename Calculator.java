public class Calculator {
    int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    int add(int add) {
        int sum += add;
        return sum;
    }

    int subtract(int x, int y) {
        return x - y;
    }

    int divide(int x, int y) {
        return x / y;
    }

    int multiply(int x, int y) {
        return x * y;
    }

    int power(int x, int y) {
        int result = x;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        return result;
    }

}