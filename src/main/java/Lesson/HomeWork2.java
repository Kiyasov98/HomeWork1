package Lesson;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(exercise1(1, 9));
        exercise2(10);
        System.out.println(exercise3(-25));
        exercise4("Alim", 5);
    }

    public static boolean exercise1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void exercise2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean exercise3(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void exercise4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
}
