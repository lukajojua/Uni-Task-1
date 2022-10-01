import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5_6();
        task7();
        task8(10, 6);
        task9();
        task10();
        task11();
        task12();


    }


    public static void task1() {
        String[] languages = {"C++", "C#", "java", "pascal", "php", "JavaScript", "ActionScript" };
        for (String language : languages) {
            System.out.println(language);

        }
    }

    public static void task2() {
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a / b);
        System.out.println(b % a);
    }

    public static void task3() {
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        System.out.println(a + b + c);
        System.out.println(a * b * c);
    }

    public static void task4() {
        int[] arr = new int[3];
        int count = 0;
        var a = scanner.nextInt();
        while (a > 9) {
            arr[count] = a % 10;
            count++;
            a = a / 10;
        }
        arr[count] = a;
        for (int i = count; i >= 0; i--) {
            System.out.println(arr[i]);

        }
    }

    public static void task5_6() {
        var a = scanner.nextInt();
        var sum = 0;
        while (a > 9) {
            sum += a % 10;
            a = a / 10;
        }
        sum += a;
        System.out.println(sum);
    }

    public static void task7() {
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var maximal = 0;
        var minimal = 0;
        minimal = Math.min(a, b);
        maximal = Math.max(a, b);
        var gcd = 1;
        for (int i = 1; i <= minimal; i++) {
            if (minimal % i == 0 && maximal % i == 0) {
                gcd = i;

            }
        }
        System.out.println(gcd);
        var LCM = (maximal * minimal) / gcd;
        System.out.println(LCM);
    }

    public static void task8(int a, int b) {
        var max = Math.max(a, b);
        var min = Math.min(a, b);
        for (int i = min; i < max; i++) {
            System.out.println(i);

        }
    }

    public static void task9() {

        double[] numbers = new double[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
        }
        var max = numbers[0];
        var min = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
            System.out.println(number);
        }

        System.out.println("max=" + max);
        System.out.println("min=" + min);


    }

    public static void task10() {
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void task11() {
        double[] numbers = new double[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble() * 100;
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void task12() {

        Integer[] numbers = new Integer[8];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();

        }
//        method 1
        Integer[] reverseNumbers = new Integer[numbers.length];
        Arrays.sort(numbers);
        var index = numbers.length;
        for (Integer number : numbers) {
            reverseNumbers[index - 1] = number;
            index = index - 1;
        }
        System.out.println(Arrays.toString(reverseNumbers));
        System.out.println(Arrays.toString(numbers));
//        method 2
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));


    }

}
