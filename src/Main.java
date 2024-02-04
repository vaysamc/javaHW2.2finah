public class Main {
    public static void main(String[] args) {
        int basemoney = 100;//старый балик
        int plusmoney = 300;// пополнил на сколько
        int ifbomus = 1000; // если пополнение >=1000
        int tobonus = 100; // шаг бонуслв
        int plusbonus = 1; // сколько бонусов за шаг
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        // если plusmoney => ifbonus, то plusmoney +(plusmoney / tobonus * plusbonus)+ basemoney
        if (plusmoney >= ifbomus) {
            int endbonus = plusmoney / tobonus * plusbonus;//сколько всего бонусов
            int endmoney = basemoney + plusmoney + endbonus; //итоговый балик с бонусов

            System.out.println("Клиент пополнил счет на " + plusmoney + " рублей - бонус равен " + endbonus + " рублями, итоговая сумма на счету - " + endmoney + " рублей.");
        } else {
            int endnomoney = basemoney + plusmoney; // итоговый балик без бонуса
            System.out.println("Клиент пополнил счёт на " + plusmoney + " рублей — бонусов нет, итоговая сумма на счету клиента — " + endnomoney + " рублей.");
        }
        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}