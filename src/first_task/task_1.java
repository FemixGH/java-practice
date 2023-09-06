package first_task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        task_1 task1 = new task_1();
        while (true)
        {
            int choice = 0;
            System.out.println("Для выбора задания введите число от 1 до 5");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    task1.first();
                    break;
                case 2:
                    task1.second();
                    break;
                case 3:
                    task1.third(args);
                    break;
                case 4:
                    task1.fourth();
                    break;
                case 5:
                    task1.get_factorial();
                    break;
                default:
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
                break;
            }
        }
        System.out.println("Сумма: " + Arrays.stream(arrayOfNumbers).sum() + " ");
        System.out.println("Среднее арифмитическое: " + Arrays.stream(arrayOfNumbers).sum() / count);
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
        int num = 10;
        double result = 0.0;
        System.out.println("Гармонический ряд: ");
        while (num > 0) {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }

    }

    public void get_factorial(){
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int intInputValue, f = 0;
        try {
            intInputValue = Integer.parseInt(input);
            System.out.println("Правильный ввод, продолжаем)");
            f = intInputValue;
            //System.out.print(f+ " " +intInputValue);
        } catch (NumberFormatException ne) {
            System.out.println("Неправильный ввод, повторите попытку!");
        }
        
        int factorial_result = 1;
        for (int i = 1; i <= f; i++) {
            factorial_result *= i;
        }
        System.out.println(factorial_result);
    }

}