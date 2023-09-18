package second_task;

import java.util.ArrayList;

public class Shop {
    public static ArrayList Computers(ArrayList PC) { //Отобразить все имеющийся Компьютеры
        int SizeP = PC.size(); // Размер списка
        for (int i = 0; i < SizeP; i++) { // Весь список
            System.out.println(PC.get(i)); // Вывод всех элементов списка
        }
        return null; //Чтобы ошибки не было
    }

    public static ArrayList ComputerAdd(ArrayList PC, String computer) { //Добавить в список Компьютер
        PC.add(computer); //Добавить в список
        System.out.println("Добавлен компьютер: " + computer);
        return PC; //Вернуть список
    }

    public static ArrayList ComputerDelete(ArrayList PC, String computer) { //Удалить из списка Компьютер
        PC.remove(computer); //Удалить из списка
        System.out.println("Удалён компьютер: " + computer);
        return PC; //Вернуть список
    }

    public static String ComputerSearchName(ArrayList PC, String Search) { //Искать в списке Компьютер по его названию
        int Index = PC.indexOf(Search) + 1; //Получение индекса списка искаемого значения
        String result = (String) PC.get(Index); //Значение списка от индекса
        System.out.println(result); //Отображение выбранного Компьютера
        return result; //Возвращение искаемого Компьютера
    }

    public static String ComputerSearchIndex(ArrayList PC, int Index) { //Искать в списке Компьютер по номеру в списке
        String result = (String) PC.get(Index); //Значение списка от индекса
        System.out.println(result); //Отобразить выбранный компьютер
        return result; //Вернуть искомый Компьютер
    }
}