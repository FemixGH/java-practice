package second_task;

import java.util.ArrayList;

public class testShop {
    public static void main(String[] args) {
        ArrayList computer = new ArrayList<String>(); //Список всех Компьютеров
        Shop.Computers(computer); //Отображает все Компьютеры в списке

        Shop.ComputerAdd(computer, "New"); //Добавление Компьютера в список
        Shop.ComputerAdd(computer, "IBM" );
        Shop.ComputerAdd(computer, "ENIGMA");

        Shop.ComputerDelete(computer, "New"); //Удаление Компьютера из списка

        Shop.ComputerSearchName(computer, "IBM"); //Искать Компьютер по названию

        Shop.ComputerSearchIndex(computer, 1); //Искать Компьютер по номеру в списке

    }
}