public class Main {
    public static void main(String[] args) {
        int baseMoney = 348;//старый балик
        int plusMoney = 1500;// пополнил на сколько
        int ifBonus = 1000; // если пополнение >=1000
        int toBonus = 100; // шаг бонуслв
        int plusBonus = 1; // сколько бонусов за шаг
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        // если plusmoney => ifbonus, то plusmoney +(plusmoney / tobonus * plusbonus)+ basemoney
        if (plusMoney >= ifBonus) {
            int endBonus = plusMoney / toBonus * plusBonus;//сколько всего бонусов
            int endMoney = baseMoney + plusMoney + endBonus; //итоговый балик с бонусов

            System.out.println("Клиент пополнил счет на " + plusMoney + " рублей - бонус равен " + endBonus + " рублями, итоговая сумма на счету - " + endMoney + " рублей.");
        } else {
            int endNoMoney = baseMoney + plusMoney; // итоговый балик без бонуса
            System.out.println("Клиент пополнил счёт на " + plusMoney + " рублей — бонусов нет, итоговая сумма на счету клиента — " + endNoMoney + " рублей.");
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}