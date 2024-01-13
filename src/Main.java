public class Main {
    public static void main(String[] args) {
        int balance = 100;                   // баланс
        int replenishmentAmount = 1100;     // сумма пополнения
        if (replenishmentAmount > 1000) {    // в задаче дословно "если клиент пополняет счёт БОЛЕЕ чем на 1000 рублей"
            balance = balance + (replenishmentAmount / 100) + replenishmentAmount;
        } else {
            balance = balance + replenishmentAmount;
        }
        System.out.println("Текущий баланс: " + balance);
    }
}
