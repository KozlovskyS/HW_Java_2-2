public class Main {
    public static void main(String[] args) {
        int init_amount;
        int amount;
        int tot_amount;
        int bonus = 0;

        init_amount = 100; //начальная сумма счета
        amount = 1100; //ввод суммы пополнения

        if (amount > 1000) {
            bonus = amount / 100;
            System.out.println("Поздравляем! Ваш бонус = " + bonus + " руб.");
        }
        tot_amount = init_amount + amount + bonus;
        System.out.println("Счет пополнен. На Вашем счету " + tot_amount + " руб.");
    }
}