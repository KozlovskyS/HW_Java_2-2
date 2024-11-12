public class Main {
    public static void main(String[] args) {
        int init_amount; //начальная сумма счета
        int amount;      //сумма пополнения
        int tot_amount;  //сумма счета
        int bonus = 0;   //бонусы
/*ввод данных*/
        init_amount = 100;
        amount = 1100;

        if (amount > 1000) {             //проверка бонусных условий
            bonus = amount / 100;
            System.out.println("Поздравляем! Ваш бонус = " + bonus + " руб.");
        }
        tot_amount = init_amount + amount + bonus;
        System.out.println("Счет пополнен. На Вашем счету " + tot_amount + " руб.");
    }
}