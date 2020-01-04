package test;

public class Test {
    public static void main(String[] args) {
        doSomething();
//        Detective detective = new Detective("Mac");
    }

    private static void doSomething() {
        int c = 5;
        double b;
        {
            int x = 3;
            b = add(c, x);
        }
        for (int i = 0; i < 5; i++) {
            b += i / 2;
        }
        System.out.println(b);
    }

    private static double add(double a, double b) {
        return a + b;
    }

    public Test() {
    }
}
