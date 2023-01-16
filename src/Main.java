public class Main {
    public static void main(String[] args) {
        int firstAccoutn = 50;
        int addMoney = 1_100;

        int bonus = addMoney > 1_000 ? addMoney / 100 : 0;

        int finalAccount = firstAccoutn + addMoney + bonus;

        System.out.println("Первоначальный счет: " + firstAccoutn);
        System.out.println("Пополнение: " + addMoney);
        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счет: " + finalAccount);
    }
}
