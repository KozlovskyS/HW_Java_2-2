public class Main {
    public static void main(String[] args) {
        int initAmount;  //начальная сумма счета
        int amount;      //сумма пополнения
        int totAmount;   //сумма счета
        int bonus = 0;   //бонусы

        /*ввод данных*/
        initAmount = 100;
        amount = 1100;

        if (amount > 1000) {             //проверка бонусных условий
            bonus = amount / 100;
            System.out.println("Поздравляем! Ваш бонус = " + bonus + " руб.");
        }
        totAmount = initAmount + amount + bonus;
        System.out.println("Счет пополнен. На Вашем счету " + totAmount + " руб.");
    }
}