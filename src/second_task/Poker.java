package second_task;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {

        // часть 1 - инициализация переменных
        int cardsPerPlayer = 5;
        int players =0 ;

        String[] suits = {
                "Пик", "Бубен", "Черв", "Треф"
        };

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Королева", "Король", "Туз"
        };

        int n = suits.length * rank.length; // количество карт


        // часть 2 - ввод с консоли
        for(;;){        //бесконечный цикл
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите количество игроков: ");

            if(sc.hasNextInt()){

                players = sc.nextInt();
                if(cardsPerPlayer * players <= n){
                    break;
                } else {
                    if (players ==0){

                        System.out.println("Игра прекращена.");
                        break;

                    } else if (players<0){

                        System.out.println("Число игроков не может быть меньше 0");

                    } else{

                        System.out.println("Слишком много игроков!");
                    }
                }

            } else{
                System.out.println("Вы ввели не число, или Ваше число слишком большое!");

            }
        }


        // часть 3 - инициализация колоды
        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length*i + j] = rank[i] + " " + suits[j];
            }
        }

        // часть 4 - перетасовка колоды
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i)); // случайная карта в колоде
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        // часть 5 - перетасованная колода выводится на экран
        int cardCount = 0; // счетчик карт
        for (int i = 0; i < players * cardsPerPlayer; i++) {
            int playerNumber = i / cardsPerPlayer + 1; // номер игрока
            System.out.println("Игрок " + playerNumber + ": " + deck[i]); // вывод номера игрока и его карты
            cardCount++;
            if (cardCount % cardsPerPlayer == 0) { // добавляем перенос строки после вывода всех карт игрока
                System.out.println();
            }
        }
    }
}