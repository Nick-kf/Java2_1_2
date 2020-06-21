public class Main {
    public static void main(String[] args) {
        /*     Входные данные:
        текущий баланс счёта клиента - переменная типа int, значение - 2_000_000_000 (два миллиарда рублей)*
        сумма перевода - переменная типа int, значение - 500_000_000 (пятьсот миллионов рублей)
        переменная для хранения итогового значения - тип int
        */

        int currentBalance = 2_000_000_000;
        int transferAmount = 500_000_000;
        int totalAmount = currentBalance+transferAmount;
        System.out.println(totalAmount);
    }
}