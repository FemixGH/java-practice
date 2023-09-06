import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // System.out.println("Для выбора задания введите цифру от 1 до 5");
        Scanner sc = new Scanner(System.in);
        int[] arrayOfNumbers = new int[100];
        int count = 0;
        for (int i = 0; i <= 9999; i++) {
            System.out.println("Введите не число, чтобы прекратить ввод.");
            count++;
            String input = sc.next();
            int intInputValue = 0;
            try {
                intInputValue = Integer.parseInt(input);
                System.out.println("Правильный ввод, продолжаем");
                arrayOfNumbers[i] = intInputValue;
            } catch (NumberFormatException ne) {
                System.out.print(Arrays.stream(arrayOfNumbers).sum() + " ");
                System.out.println(Arrays.stream(arrayOfNumbers).sum() / count);
                break;
            }
        }
    }

    public void first() {
        Scanner sc = new Scanner(System.in);
        int[] arrayOfNumbers = new int[100];
        int count = 0;
        for (int i = 0; i <= 9999; i++) {
            System.out.println("Введите не число, чтобы прекратить ввод.");
            count++;
            String input = sc.next();
            int intInputValue = 0;
            try {
                intInputValue = Integer.parseInt(input);
                System.out.println("Правильный ввод, продолжаем");
                arrayOfNumbers[i] = intInputValue;
            } catch (NumberFormatException ne) {
                System.out.print("Сумма: " + Arrays.stream(arrayOfNumbers).sum() + " ");
                System.out.println("Среднее арифмитическое: " + Arrays.stream(arrayOfNumbers).sum() / count);
                break;
            }
        }
    }

    public void second() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        while (true) {
            System.out.println("Введите не число, чтобы прекратить ввод.");
            String input = sc.next();
            int intInputValue = 0;
            try {
                intInputValue = Integer.parseInt(input);
                System.out.println("Правильный ввод, продолжаем");
                arrayList.add(String.valueOf(intInputValue));
            } catch (NumberFormatException ne) {
                break;
            }
            int k = arrayList.size();
            int[] array = new int[k];
            for (int i = 0; i <= k; i++) {
                array[i] = Integer.parseInt(arrayList.get(i));
            }
            System.out.println("Минимум: " + Arrays.stream(array).min());
            System.out.println(" Максимум: " + Arrays.stream(array).max());
        }
    }
    public void third(String[] args){
        int i = 1;
        for (String arg : args) {
            System.out.println("Аргумент " + i + ": " + arg);
            i++;
        }
    }

    public void fourth()
    {
        int num = 10; // number of values we want in a series
        double result = 0.0;
        System.out.print("3) The harmonic series is: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }

    }

    public static int get_factorial(int f){
        int factorial_result = 1;
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        return factorial_result;
    }

}